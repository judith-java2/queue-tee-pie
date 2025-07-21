package org.example;

public class PygmyMarmoset implements Cutie {
    @Override
    public String description() {
        return "A tiny monkey with curious eyes";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }

    @Override
    public String toString() {
        return "PygmyMarmoset: " + description() + " (Cuteness: " + cutenessRating() + ")";
    }
}
