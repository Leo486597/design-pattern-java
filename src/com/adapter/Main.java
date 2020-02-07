package com.adapter;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Starting");

        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
        coffeeTouchscreenAdapter.chooseFirstSelection();
        coffeeTouchscreenAdapter.chooseSecondSelection();
    }
}
