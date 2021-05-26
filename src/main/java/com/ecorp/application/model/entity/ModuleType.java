package com.ecorp.application.model.entity;

public enum ModuleType {

    MAPPING("Сопоставление"), SINGLE("Одиночный"), MULTIPLE("Множественный"), GRAPHICAL("Графический");

    ModuleType(String rus) {
        this.russian = rus;
    }

    private String russian;

    public String toRus() {
        return russian;
    }
}
