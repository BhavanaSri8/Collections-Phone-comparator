package org.example.collections;

import java.util.List;

public class main {

    public static void main(String[] args) {

        // ====================================================

        PhoneManagerList listManager = new PhoneManagerList();

        listManager.addPhone(new Phone(1, "iPhone 13", "Apple", 999.99, 12, "24-09-2021"));
        listManager.addPhone(new Phone(2, "Galaxy S21", "Samsung", 799.99, 64, "29-01-2021"));
        listManager.addPhone(new Phone(3, "Pixel 6", "Google", 599.99, 50, "13-10-2023"));
        listManager.addPhone(new Phone(4, "OnePlus 9", "OnePlus", 699.99, 48, "23-03-2011"));
        listManager.addPhone(new Phone(5, "Xiaomi Mi 11", "Xiaomi", 499.99, 108, "25-03-2011"));

        System.out.println("=========== USING LIST ===========");

        System.out.println("\nAll Phones:");
        listManager.displayAll();

        listManager.removeById(1);
        System.out.println("\nAfter Removing ID 1:");
        listManager.displayAll();

        System.out.println("\nFilter By Brand (Google):");
        List<Phone> filteredList = listManager.filterByBrand("Google");
        for (Phone p : filteredList) {
            System.out.println(p);
        }

        listManager.sortByName();
        System.out.println("\nSorted By Name (Ascending):");
        listManager.display();

        listManager.sortByNameDescending();
        System.out.println("\nSorted By Name (Descending):");
        listManager.display();

        listManager.sortByCost();
        System.out.println("\nSorted By Cost (Ascending):");
        listManager.display();

        listManager.sortByCostDescending();
        System.out.println("\nSorted By Cost (Descending):");
        listManager.display();

        listManager.sortByDate();
        System.out.println("\nSorted By Date (Ascending):");
        listManager.display();

        listManager.sortByDateDescending();
        System.out.println("\nSorted By Date (Descending):");
        listManager.display();



        // =========================
        // USING MAP
        // =========================

        PhoneManagerMap mapManager = new PhoneManagerMap();

        mapManager.addPhone(new Phone(1, "iPhone 13", "Apple", 999.99, 12, "24-09-2021"));
        mapManager.addPhone(new Phone(2, "Galaxy S21", "Samsung", 799.99, 64, "29-01-2021"));
        mapManager.addPhone(new Phone(3, "Pixel 6", "Google", 599.99, 50, "13-10-2023"));
        mapManager.addPhone(new Phone(4, "OnePlus 9", "OnePlus", 699.99, 48, "23-03-2011"));
        mapManager.addPhone(new Phone(5, "Xiaomi Mi 11", "Xiaomi", 499.99, 108, "25-03-2011"));

        System.out.println("\n\n=========== USING MAP ===========");

        System.out.println("\nAll Phones:");
        mapManager.displayAll();

        mapManager.removeById(2);
        System.out.println("\nAfter Removing ID 2:");
        mapManager.displayAll();

        System.out.println("\nFilter By Brand (Apple):");
        List<Phone> filteredMap = mapManager.filterByBrand("Apple");
        for (Phone p : filteredMap) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Name (Ascending):");
        List<Phone> sortedByName = mapManager.sortByName();
        for (Phone p : sortedByName) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Name (Descending):");
        List<Phone> sortedByNameDesc = mapManager.sortByNameDescending();
        for (Phone p : sortedByNameDesc) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Cost (Ascending):");
        List<Phone> sortedByCost = mapManager.sortByCost();
        for (Phone p : sortedByCost) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Cost (Descending):");
        List<Phone> sortedByCostDesc = mapManager.sortByCostDescending();
        for (Phone p : sortedByCostDesc) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Date (Ascending):");
        List<Phone> sortedByDate = mapManager.sortByDate();
        for (Phone p : sortedByDate) {
            System.out.println(p);
        }

        System.out.println("\nSorted By Date (Descending):");
        List<Phone> sortedByDateDesc = mapManager.sortByDateDescending();
        for (Phone p : sortedByDateDesc) {
            System.out.println(p);
        }
    }
}
