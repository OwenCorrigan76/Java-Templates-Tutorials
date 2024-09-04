package funtionalInterface;

public class Main {
    public static void main(String[] args) {
        GreetingInterface gm = new GreetingInterface() {
            @Override
            public void greetingMessage(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greetingMessage("Owen");

        
        GreetingInterface gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greetingMessage("Gayle");
    }
}
