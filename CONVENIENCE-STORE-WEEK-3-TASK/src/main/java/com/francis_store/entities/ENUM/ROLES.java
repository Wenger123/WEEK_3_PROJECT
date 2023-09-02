package com.francis_store.entities.ENUM;

public enum ROLES {
    MANAGER("Manager"),
    CASHIER("Cashier");
    private final String role;

    ROLES(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "role{" +
                "role='" + role + '\'' +
                '}';
    }
}

