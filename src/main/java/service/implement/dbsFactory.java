package main.java.service.implement;

import main.java.service.database;

/**
 * Tovaren na vytvorenie konkretnej instancie databazy
 */
public class dbsFactory {
    /**
     * Vytvori instanciu konkretnej databazy.
     * V pripade, ze chceme zmenit databazu za inu, staci zmenit tento riadok
     *
     * @return konkretna databaza
     */
    public static database getInstance() {
        return db.getInstance();
    }
}