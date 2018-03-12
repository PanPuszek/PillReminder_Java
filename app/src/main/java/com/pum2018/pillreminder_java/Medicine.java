package com.pum2018.pillreminder_java;

/**
 * Created by robertmikolajczyk on 05/03/2018.
 * Klasa Medicine jest klasą bazową (super klsaą) dla wszystkich klas opisujących różne rodzaje leków
 */

public abstract class Medicine {
    abstract void addMedicine(int quantity, String name);
    abstract void checkMedicine();
    abstract void deleteMedicine();
}
