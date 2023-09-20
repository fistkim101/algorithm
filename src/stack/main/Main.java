package stack.main;

public class Main {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(System.identityHashCode(a));
        a = "b";
        System.out.println(System.identityHashCode(a));
    }
}
