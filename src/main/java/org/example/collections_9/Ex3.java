package org.example.collections_9;


import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {

        Map<String, Car> cars = new HashMap<>();

        cars.put("Lasha", new Car("BMW","e30", 1990));
        cars.put("Gela", new Car("BMW","e36", 1992));
        cars.put("Gocha", new Car("BMW","e34", 1993));
        cars.put("Nugzari", new Car("BMW","e39", 1994));
        cars.put("Murtazi", new Car("BMW","e46", 1999));

        System.out.println(cars);
    }





}
