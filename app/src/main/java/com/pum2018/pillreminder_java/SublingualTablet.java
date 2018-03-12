package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 *  SublingualTablet (Lingwetki - Tabletki do ssania) - jednostka : sztuka
 *
 */

public class SublingualTablet extends Medicine{
    private int quantityOfSublingualTablets;
    private String nameOfSublingualTablets;

    /**
     *
     * @param quantity
     * @param name
     */
    @Override
    void addMedicine(int quantity, String name) {
        this.quantityOfSublingualTablets = quantity;
        this.nameOfSublingualTablets = name;
    }

    @Override
    void deleteMedicine() {

    }

    @Override
    void checkMedicine() {

    }
}
