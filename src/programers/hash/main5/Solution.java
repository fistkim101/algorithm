package programers.hash.main5;

import java.util.*;
import java.util.stream.Collectors;

class Music implements Comparable<Music> {

    int index;
    int length;

    public Music(int index, int length) {
        this.index = index;
        this.length = length;
    }

    @Override
    public int compareTo(Music o) {
        if (o.length == this.length) {
            return this.index - o.index;
        }

        return o.length - this.length;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();
        Map<String, PriorityQueue<Music>> musics = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int length = plays[i];
            Music music = new Music(i, length);

            genreMap.put(genre, genreMap.getOrDefault(genre, 0) + length);
            if (!musics.containsKey(genre)) {
                musics.put(genre, new PriorityQueue<>());
            }
            musics.get(genre).offer(music);
        }

        List<String> sortedGenre = genreMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<Integer> answer = new ArrayList<>();
        for (String genre : sortedGenre) {
            int count = 0;
            while (!musics.isEmpty() && (!musics.get(genre).isEmpty()) && count < 2) {
                answer.add(musics.get(genre).poll().index);
                count++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Main {
    public static void main(String[] args) {
        Solution T = new Solution();
        int[] answer = T.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}