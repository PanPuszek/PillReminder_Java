package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 06/03/2018.
 * Capsule (Kapsułki) - jednostka : wziew
 */

public class Aerosol extends Medicine {
    private int quantityOfAerosols;
    private String nameOfAerosols;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfAerosols = quantity;
        this.nameOfAerosols = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }

}
