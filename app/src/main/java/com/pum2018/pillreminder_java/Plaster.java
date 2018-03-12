package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Plaster (Plaster) - jednostka : sztuka
 */

public class Plaster extends  Medicine{
    private int quantityOfPlasters;
    private String nameOfPlasters;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfPlasters = quantity;
        this.nameOfPlasters = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
