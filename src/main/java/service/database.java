package main.java.service;

import java.sql.Connection;

/**
 * Rozhranie pre databazu. Skryva detaily o tom aka databaza bude pouzita
 */
public interface database {
	
    /**
     * Otvori databazovu konekciu
     * @return databazova konekcia
     */
    public Connection openConnection();

    /**
     * Zatvori databazovu konekciu
     * @param connection databazova konekcia
     */
    public void closeConnection(Connection connection);
}