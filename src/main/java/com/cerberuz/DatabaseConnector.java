package com.cerberuz;

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector() {
        System.out.println("Creating object");
    }

    public static synchronized DatabaseConnector getInstance() {
        if (databaseConnector == null) {
            databaseConnector = new DatabaseConnector();
        }

        return databaseConnector;
    }
}
