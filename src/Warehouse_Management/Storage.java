package Warehouse_Management;

import java.util.ArrayList;

class Storage<T extends WarehouseItem> {

    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

