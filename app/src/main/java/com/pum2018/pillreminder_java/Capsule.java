package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.\
 * Capsule (Kapsułki) - jednostka : sztuka
 */

public class Capsule extends Medicine{
    private int quantityOfCapsules;
    private String nameOfCapsules;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfCapsules = quantity;
        this.nameOfCapsules = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
