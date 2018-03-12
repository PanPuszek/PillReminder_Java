package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Syrup (Syrop) - jednostka : mililitry
 */

public class Syrup extends Medicine{
    private int quantityOfSyrup;
    private String nameOfSyrup;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfSyrup = quantity;
        this.nameOfSyrup = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
