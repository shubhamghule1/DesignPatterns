package com.shubham.behavioural.state;

public class OutOfStockState implements VendingMachineState {
    private VendingMachine vendingMachine;
    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Item Out of Stock! Coin is returned");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item out of stock!");
    }

    @Override
    public void dispense() {
        System.out.println("Item out of stock!");
    }

    public void home()
    {
        System.out.println("Taking you to home page!");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
