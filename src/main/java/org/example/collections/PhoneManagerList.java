package org.example.collections;

import java.util.*;

public class PhoneManagerList {

    private List<Phone> li = new LinkedList<>();

    public void addPhone(Phone phone) {
        li.add(phone);
    }

    public void removeById(int id) {
        Iterator<Phone> it = li.iterator();
        while (it.hasNext()) {
            Phone p = it.next();
            if (p.getId() == id) {
                it.remove();
            }
        }
    }

    public List<Phone> filterByBrand(String brand) {

        List<Phone> result = new ArrayList<>();

        for (Phone p : li) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                result.add(p);
            }
        }

        return result;
    }

    public void sortByName() {
        Collections.sort(li, new NameComparator());
    }

    public void sortByNameDescending() {
        Collections.sort(li, Comparator.comparing(Phone::getName).reversed());
    }

    public void sortByCost() {
        Collections.sort(li, new CostComparator());
    }

    public void sortByCostDescending() {
        Collections.sort(li, Comparator.comparing(Phone::getCost).reversed());
    }

    public void displayAll() {
        for (Phone p : li) {
            System.out.println(p);
        }
    }

    public void sortByDate() {

        li.sort((p1, p2) -> {

            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);


            if (year1 != year2) {
                return year1 - year2;
            }

            if (month1 != month2) {
                return month1 - month2;
            }

            return day1 - day2;
        });
    }

    public void sortByDateDescending() {

        li.sort((p1, p2) -> {

            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);

            if (year1 != year2) {
                return year2 - year1;
            }

            if (month1 != month2) {
                return month2 - month1;
            }

            return day2 - day1;
        });
    }
    public void display() {
        if (li.isEmpty()) {
            System.out.println("No phones available.");
            return;
        }

        for (Phone p : li) {
            System.out.println(p);
        }
    }

}
