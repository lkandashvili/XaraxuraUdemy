package org.example.collections_9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex5_6 {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "e30", 1990);
        Car car2 = new Car("BMW", "e36", 1992);
        Car car3 = new Car("BMW", "e34", 1993);
        Car car4 = new Car("BMW", "e39", 1994);
        Car car5 = new Car("BMW", "e46", 1999);


        List<Car> carList = new ArrayList<>();
        carList.add(car5);
        carList.add(car4);
        carList.add(car3);
        carList.add(car2);
        carList.add(car1);


        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c2.model.compareTo(c1.model);
            }
        });

        String modelToDelete = "e30";
        Car dummyCar = new Car("BMW",modelToDelete, 193);

        for (int i=0 ; i < carList.size(); i++) {
            if (carList.get(i).equals(dummyCar)) {
                carList.remove(i);
                if (i == carList.size()){continue;}
            }
            System.out.println(carList.get(i));
        }

    }
}
