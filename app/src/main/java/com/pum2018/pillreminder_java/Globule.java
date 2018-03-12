package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Globule (Globulki) - jednostka : sztuka
 */

public class Globule extends Medicine {
    private int quantityOfGlobules;
    private String nameOfGlobules;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfGlobules = quantity;
        this.nameOfGlobules = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
