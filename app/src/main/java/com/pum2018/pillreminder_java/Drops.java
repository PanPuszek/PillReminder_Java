package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Drops (Krople) - jednostka : sztuka
 */

public class Drops extends Medicine{
    private int quantityOfDrops;
    private String nameOfDrops;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfDrops = quantity;
        this.nameOfDrops = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
