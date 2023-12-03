package programers.ftest.solution2;

import java.util.*;

class Person {
    String name;
    Set<Person> friends = new HashSet<>();
    Map<Person, Integer> friendsCandidates = new HashMap<>();

    public Person(String name) {
        this.name = name;
    }
}

public class Solution {
    final Map<String, Person> persons = new HashMap<>();

    public String[] solution(String[][] friends, String user_id) {
        for (String[] friend : friends) {
            if (!persons.containsKey(friend[0])) {
                persons.put(friend[0], new Person(friend[0]));
            }

            if (!persons.containsKey(friend[1])) {
                persons.put(friend[1], new Person(friend[1]));
            }

            this.persons.get(friend[0]).friends.add(this.persons.get(friend[1]));
            this.persons.get(friend[1]).friends.add(this.persons.get(friend[0]));
        }

        final Person targetPerson = persons.get(user_id);
        for (Person friend : targetPerson.friends) {
            for (Person friendOfFriend : friend.friends) {
                if (friendOfFriend.equals(targetPerson)) {
                    continue;
                }

                if (targetPerson.friends.contains(friendOfFriend)) {
                    continue;
                }

                if (targetPerson.friendsCandidates.containsKey(friendOfFriend)) {
                    targetPerson.friendsCandidates.put(friendOfFriend, targetPerson.friendsCandidates.get(friendOfFriend) + 1);
                } else {
                    targetPerson.friendsCandidates.put(friendOfFriend, 1);
                }
            }
        }

        int mutualFriendsMaxCount = 0;
        for (Person s : targetPerson.friendsCandidates.keySet()) {
            if (targetPerson.friendsCandidates.get(s) > mutualFriendsMaxCount) {
                mutualFriendsMaxCount = targetPerson.friendsCandidates.get(s);
            }
        }

        final List<String> answers = new ArrayList<>();
        for (Person s : targetPerson.friendsCandidates.keySet()) {
            if (targetPerson.friendsCandidates.get(s) == mutualFriendsMaxCount) {
                answers.add(s.name);
            }
        }

        return answers.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        String[] answer = T.solution(new String[][]{{"david", "frank"}, {"demi", "david"}, {"frank", "james"}, {"demi", "james"}, {"claire", "frank"}}, "david");
        for (String str : answer) {
            System.out.println(str);
        }
    }
}
