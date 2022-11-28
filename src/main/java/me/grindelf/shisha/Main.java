package me.grindelf.shisha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oh shit! Here we go again.");
        Pine pine = new Pine();
        System.out.println(pine.getNumberOfNeedle());
        pine.attack();
        System.out.println(pine.getNumberOfNeedle());
    }
}