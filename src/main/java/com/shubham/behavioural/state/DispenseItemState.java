package com.shubham.behavioural.state;

public class DispenseItemState implements VendingMachineState {
    private VendingMachine vendingMachine;
    public DispenseItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted");
        System.out.println("Dispensing");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("You have already selected an item!");
        System.out.println("Dispensing");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing item "+ vendingMachine.getSelectedItem());
        vendingMachine.decreaseItemStock(vendingMachine.getSelectedItem());
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
