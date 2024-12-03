package com.shubham.behavioural.state;

public interface VendingMachineState {
    void insertCoin();
    void selectItem(String item);
    void dispense();
}
