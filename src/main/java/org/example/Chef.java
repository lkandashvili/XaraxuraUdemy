package org.example;

public interface Chef {

    String favouriteFood = "Khinkali";

    default void cook(String food) {
        System.out.println("LET HIM COOK! " + food);
    }

    default String cleanUp() {
        return "I'm done cleaning up";
    }

    String yellAtPeople();

    default String getFavouriteFood() {
        return favouriteFood;
    }
}
