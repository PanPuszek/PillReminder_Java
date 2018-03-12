package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Tablet (Tabletki) - jednostka : sztuka
 */

public class Tablet extends Medicine{
    private int quantityOfTablets;
    private String nameOfTablets;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfTablets = quantity;
        this.nameOfTablets = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
