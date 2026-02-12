package org.example.collections;

import java.util.*;

class Phone{
    private int id;
    private String name;
    private String brand;
    private double cost;
    private int cameraPx;
    private String dateOfManufacture;



    Phone(int id, String name, String brand, double cost, int cameraPx, String dateOfManufacture) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.cameraPx = cameraPx;
        this.dateOfManufacture=dateOfManufacture;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCameraPx() {
        return cameraPx;
    }

    public void setCameraPx(int cameraPx) {
        this.cameraPx = cameraPx;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{id=" + id + ", name='" + name + "', brand='" + brand + "', cost=" + cost + ", cameraPx=" + cameraPx + ", dateOfManufacture='" + dateOfManufacture + "'"+ '}';
    }
}

public class PhoneManager {
    List<Phone> li = new LinkedList<>();

    public void addPhone(Phone phone) {
        li.add(phone);
    }

    public void removeById(int id) {
//        for(Phone p:li){
//            if(p.getId()==id){
//                li.remove(p);
//                break;
//            }
//        }
        Iterator<Phone> it = li.iterator();
        while (it.hasNext()) {
            Phone p = it.next();
            if (p.getId() == id) {
                it.remove();
            }
        }
    }

    public void filterByBrand(String brand){
        for(Phone p:li) {
            if(p.getBrand().equalsIgnoreCase(brand)){
                System.out.println(p);
            }
        }
    }


    public void sortByName(){
        Collections.sort(li, new NameComparator());
    }

    public void sortByNameDescending(){
        Collections.sort(li, Comparator.comparing(Phone::getName).reversed());
    }

    public void sortByCost(){
        Collections.sort(li, new CostComparator());
    }


    public void sortByCostDescending(){
        Collections.sort(li,Comparator.comparing(Phone::getCost).reversed());
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


    public static void main(String[] args){
        PhoneManager pm = new PhoneManager();
        pm.addPhone(new Phone(1, "iPhone 13", "Apple", 999.99, 12,"24-09-2021"));
        pm.addPhone(new Phone(2, "Galaxy S21", "Samsung", 799.99, 64, "29-01-2021"));
        pm.addPhone(new Phone(3, "Pixel 6", "Google", 599.99, 50,"13-10-2023"));
        pm.addPhone(new Phone(4, "OnePlus 9", "OnePlus", 699.99, 48, "23-03-2011"));
        pm.addPhone(new Phone(5, "Xiaomi Mi 11", "Xiaomi", 499.99, 108, "25-03-2011"));

        System.out.println("Phones in the manager:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }


        System.out.println("\n--------------------------------------------------------");




        pm.removeById(1);
        System.out.println("\nAfter removing phone with id 1:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }


        System.out.println("\n--------------------------------------------------------------");


        System.out.println("\nPhones with brand Apple:\n");
        pm.filterByBrand("Google");


        System.out.println("\n----------------------------------------------------------------------");


        pm.sortByName();
        System.out.println("\nAfter sorting by Name:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }

        System.out.println("\n----------------------------------------------------------");


        pm.sortByNameDescending();
        System.out.println("\nAfter sorting by Name in Descending order:\n");
        for(Phone p:pm.li){
            System.out.println(p);
        }

        System.out.println("\n---------------------------------------------------------------------");


        pm.sortByCost();
        System.out.println("\nAfter sorting by Cost:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }


        System.out.println("\n----------------------------------------------------------");

        pm.sortByCostDescending();
        System.out.println("\nAfter sorting by Cost in Descending order:\n");
        for(Phone p:pm.li){
            System.out.println(p);
        }

        System.out.println("\n----------------------------------------------------------");


        pm.sortByDate();
        System.out.println("\nAfter sorting by Date of Manufacture:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }

        System.out.println("\n----------------------------------------------------------");
        pm.sortByDateDescending();
        System.out.println("\nAfter sorting by Date of Manufacture in Descending order:\n");
        for(Phone p:pm.li) {
            System.out.println(p);
        }


    }
}
