package org.example.collections;

import java.util.*;

public class PhoneManagerMap {

    private Map<Integer, Phone> phoneMap = new HashMap<>();

    public void addPhone(Phone phone) {
        phoneMap.put(phone.getId(), phone);
    }

    public void removeById(int id) {
        phoneMap.remove(id);
    }

    public List<Phone> filterByBrand(String brand) {
        List<Phone> result = new ArrayList<>();
        for (Phone p : phoneMap.values()) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Phone> sortByName() {
        List<Phone> list = new ArrayList<>(phoneMap.values());
        Collections.sort(list, new NameComparator());
        return list;
    }

    public List<Phone> sortByNameDescending() {
        List<Phone> list = new ArrayList<>(phoneMap.values());
        Collections.sort(list, Comparator.comparing(Phone::getName).reversed());
        return list;
    }

    public List<Phone> sortByCost() {
        List<Phone> list = new ArrayList<>(phoneMap.values());
        Collections.sort(list, new CostComparator());
        return list;
    }

    public List<Phone> sortByCostDescending() {
        List<Phone> list = new ArrayList<>(phoneMap.values());
        Collections.sort(list, Comparator.comparing(Phone::getCost).reversed());
        return list;
    }

    public List<Phone> sortByDate() {
        List<Phone> list = new ArrayList<>(phoneMap.values());

        list.sort((p1, p2) -> {
            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);

            if (year1 != year2)
                return Integer.compare(year1, year2);
            if (month1 != month2)
                return Integer.compare(month1, month2);
            return Integer.compare(day1, day2);
        });

        return list;
    }

    public List<Phone> sortByDateDescending() {
        List<Phone> list = new ArrayList<>(phoneMap.values());

        list.sort((p1, p2) -> {
            String[] d1 = p1.getDateOfManufacture().split("-");
            String[] d2 = p2.getDateOfManufacture().split("-");

            int day1 = Integer.parseInt(d1[0]);
            int month1 = Integer.parseInt(d1[1]);
            int year1 = Integer.parseInt(d1[2]);

            int day2 = Integer.parseInt(d2[0]);
            int month2 = Integer.parseInt(d2[1]);
            int year2 = Integer.parseInt(d2[2]);

            if (year1 != year2)
                return Integer.compare(year2, year1);
            if (month1 != month2)
                return Integer.compare(month2, month1);
            return Integer.compare(day2, day1);
        });

        return list;
    }

    public void displayAll() {
        if (phoneMap.isEmpty()) {
            System.out.println("No phones available.");
            return;
        }

        for (Phone p : phoneMap.values()) {
            System.out.println(p);
        }
    }

}
