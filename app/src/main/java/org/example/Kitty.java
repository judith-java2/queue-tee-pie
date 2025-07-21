package org.example;

public class Kitty implements Cutie {
    @Override
    public String description() {
        return "A fluffy kitty with bright green eyes";
    }

    @Override
    public Integer cutenessRating() {
        return 9;
    }

    @Override
    public String toString() {
        return "Kitty: " + description() + " (Cuteness: " + cutenessRating() + ")";
    }
}
