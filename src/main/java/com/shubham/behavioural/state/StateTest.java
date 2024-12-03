package com.shubham.behavioural.state;

public class StateTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.selectItem("Coffee");
        vendingMachine.dispenseItem();
        vendingMachine.insertCoin();
        vendingMachine.selectItem("Chips");
        vendingMachine.dispenseItem();
    }

}
