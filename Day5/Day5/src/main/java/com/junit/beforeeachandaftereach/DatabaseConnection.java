package com.junit.beforeeachandaftereach;

public class DatabaseConnection {
    boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        System.out.println("Initial Connection Status: " + dbConnection.isConnected());

        dbConnection.connect();
        System.out.println("Connection Status after connect(): " + dbConnection.isConnected());

        dbConnection.disconnect();
        System.out.println("Connection Status after disconnect(): " + dbConnection.isConnected());
    }
}
