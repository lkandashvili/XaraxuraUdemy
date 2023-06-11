package org.example.collections_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args) {

        Car car1 = new Car("BMW","e30", 1990);
        Car car2 = new Car("BMW","e36", 1992);
        Car car3 = new Car("BMW","e34", 1993);
        Car car4 = new Car("BMW","e39", 1994);
        Car car5 = new Car("BMW","e46", 1999);
        Set<Car> carList = new HashSet<>();
        carList.add(car1);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car2);




//            if(i != carList.size()-1) {
//                if (!carList.equals(carList.get(i+1))) {
//                    System.out.println(carList.get(i));
//                }
//            }else System.out.println(carList.get(i));


    }
}
