package org.example.collections;

import java.util.Comparator;

public class CostComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone p1,Phone p2){
        return Double.compare(p1.getCost(),p2.getCost());
    }
}