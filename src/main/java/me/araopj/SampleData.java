package me.araopj;

import java.time.LocalDateTime;

public class SampleData {
    private final LocalDateTime createdAt;
    private final double nitrogen;
    private final double phosphorus;
    private final double potassium;
    private final double pH;

    // Constructor, getters and setters
    public SampleData(LocalDateTime createdAt, double nitrogen, double phosphorus, double potassium, double pH) {
        this.createdAt = createdAt;
        this.nitrogen = nitrogen;
        this.phosphorus = phosphorus;
        this.potassium = potassium;
        this.pH = pH;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public double getNitrogen() {
        return nitrogen;
    }

    public double getPhosphorus() {
        return phosphorus;
    }

    public double getPotassium() {
        return potassium;
    }

    public double getPh() {
        return pH;
    }

    @Override
    public String toString() {
        return "SampleData{" +
                "createdAt=" + createdAt +
                ", nitrogen=" + nitrogen +
                ", phosphorus=" + phosphorus +
                ", potassium=" + potassium +
                ", pH=" + pH +
                '}';
    }
}
