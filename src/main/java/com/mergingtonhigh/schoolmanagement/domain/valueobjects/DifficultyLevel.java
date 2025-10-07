package com.mergingtonhigh.schoolmanagement.domain.valueobjects;

/**
 * Enum representing difficulty levels for activities.
 */
public enum DifficultyLevel {
    BEGINNER("Iniciante"),
    INTERMEDIATE("Intermediário"),
    ADVANCED("Avançado");

    private final String label;

    DifficultyLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
