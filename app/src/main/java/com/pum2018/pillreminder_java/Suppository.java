package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Suppository (Czopki) - jednostka : sztuka
 */

public class Suppository extends Medicine{
    private int quantityOfSuppository;
    private String nameOfSuppository;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfSuppository = quantity;
        this.nameOfSuppository = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
