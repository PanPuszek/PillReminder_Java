package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Insulin (Insulina) - jednostka : jednostka
 */

public class Insulin extends Medicine {
    private int quantityOfInsulines;
    private String nameOfInsulines;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfInsulines = quantity;
        this.nameOfInsulines = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
