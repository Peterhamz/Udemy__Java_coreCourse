package org.example.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getConnectionSupplier.get());

    }

    static Supplier<String> getConnectionSupplier = ()->"jdbc://localhost:5432/users";
    static String getDBConnectionUrl(){

        return "jdbc://localhost:5432/users";
    }
}
