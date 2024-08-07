package com.cerberuz;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();

        System.out.println("databaseconnector: " + databaseConnector);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();

        System.out.println("databaseconnector2: " + databaseConnector2);
    }
}