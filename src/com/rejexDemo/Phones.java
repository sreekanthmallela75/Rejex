package com.rejexDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phones {
    int id;
    float price;
    String brand;

    @Override
    public String toString() {
        return "Phones{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Phones(int id, float price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public static void main(String[] args) {
        List<Phones> phonesList = new ArrayList<Phones>();
        phonesList.add(new Phones(1, 10000f, "SAMSUNG"));
        phonesList.add(new Phones(2, 15000f, "LENOVO"));
        phonesList.add(new Phones(3, 20000f, "NOKIA"));


        List<Phones> list1 = phonesList.stream().filter(p -> p.price > 5000).collect(Collectors.toList());
        System.out.println(list1);

    }

}