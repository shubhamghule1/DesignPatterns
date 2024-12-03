package com.shubham.behavioural.state;

public class IdleState implements VendingMachineState {
    private VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        vendingMachine.setState(vendingMachine.getSelectItemState());
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Insert the coin first!");
    }

    @Override
    public void dispense() {
        System.out.println("Insert the coin and select the item first!");
    }
}
