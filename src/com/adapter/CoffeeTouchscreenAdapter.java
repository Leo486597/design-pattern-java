package com.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine OldVendingMachine;
    
    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine){
        // Constructor Injection
        OldVendingMachine = oldCoffeeMachine;
    }


    @Override
    public void chooseFirstSelection() {
        System.out.println("Adapter: Making coffee using oldCoffeeMachine");
        OldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        System.out.println("Adapter: Making coffee using oldCoffeeMachine");
        OldVendingMachine.selectB();
    }
}
