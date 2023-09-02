package com.francis_store.entities.ENUM;

public enum QUALIFICATION {
    BSC("Bsc"),
    HND("Hnd"),
    OND("Ond"),
    SSCE("Ssce");
     private final String qualification;

    QUALIFICATION(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    @Override
    public String toString() {
        return "QUALIFICATION{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}

