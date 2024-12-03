package com.shubham.behavioural.state;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState selectItemState;
    private VendingMachineState dispenseItemState;
    private VendingMachineState outOfStockState;

    private VendingMachineState currentState;

    private Map<String, Integer> inventory;
    private String selectedItem;


    public VendingMachine()
    {
        idleState = new IdleState(this);
        selectItemState = new SelectItemState(this);
        dispenseItemState = new DispenseItemState(this);
        outOfStockState = new OutOfStockState(this);


        currentState = idleState;
        inventory = new HashMap<>();
        inventory.put("Coffee", 5);
        inventory.put("Water", 10);
        inventory.put("Chips", 0);

    }

    public boolean isItemAvailable(String item)
    {
        if(inventory.getOrDefault(item,0) > 0)
        {
            return true;
        }
        return false;
    }

    public void decreaseItemStock(String item)
    {
        inventory.put(item, inventory.get(item) - 1);
    }

    public void setState(VendingMachineState nextState) {
        this.currentState = nextState;

    }

    public VendingMachineState getSelectItemState() {
        return selectItemState;
    }

    public VendingMachineState getOutOfStockState() {
        return outOfStockState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseItemState;
    }
    public VendingMachineState getIdleState() {
        return idleState;
    }

    public String getSelectedItem() {
        return selectedItem;
    }
    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }


    public void insertCoin()
    {
        currentState.insertCoin();
    }

    public void selectItem(String item)
    {
        currentState.selectItem(item);
    }

    public void dispenseItem()
    {
        currentState.dispense();
    }

}
