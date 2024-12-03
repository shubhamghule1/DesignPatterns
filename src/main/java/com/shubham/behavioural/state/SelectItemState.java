package com.shubham.behavioural.state;

public class SelectItemState implements VendingMachineState {
    private VendingMachine vendingMachine;
    public SelectItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin is already inserted!");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("You selected " + item);

        if(vendingMachine.isItemAvailable(item))
        {
            vendingMachine.setSelectedItem(item);
            vendingMachine.setState(vendingMachine.getDispenseState());
        }
        else {
            System.out.println(item + " is out of stock");
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Select the item first!");
    }
}
