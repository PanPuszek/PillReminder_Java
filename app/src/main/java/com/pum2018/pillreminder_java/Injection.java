package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Injection (Zastrzyki) - jednostka : sztuka
 */

public class Injection extends Medicine {
    private int quantityOfInjections;
    private String nameOfInjections;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfInjections = quantity;
        this.nameOfInjections = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
