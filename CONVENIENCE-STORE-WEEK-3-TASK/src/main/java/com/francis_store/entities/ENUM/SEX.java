package com.francis_store.entities.ENUM;

public enum SEX {
    MALE("Male"),
    FEMALE("female");
    private final String sex;

    SEX(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "sex{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
