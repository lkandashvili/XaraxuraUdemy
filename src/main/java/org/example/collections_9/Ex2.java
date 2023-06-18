package org.example.collections_9;

import java.util.*;

public class Ex2 {

    public static void main(String[] args) {

        Car car1 = new Car("BMW","e30", 1990);
        Car car2 = new Car("BMW","e36", 1992);
        Car car3 = new Car("BMW","e34", 1993);
        Car car4 = new Car("BMW","e39", 1994);
        Car car5 = new Car("BMW","e46", 1999);
        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car2);

        for (Car car : carSet) {
            System.out.println(car);
        }



    }
}
