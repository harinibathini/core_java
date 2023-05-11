package collection.listpractice;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Deer");
        animals.push("Tiger");
        animals.push("Zebra");
        System.out.println("animals: "+animals);
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
