package stack.main;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat() {
        System.out.println("I live in " + habitat);
    }

    @Override
    public void showName() {
        System.out.println("override showName");
    }

    public void showName(String fakeName) {
        System.out.println("my name is " + fakeName);
    }
}
