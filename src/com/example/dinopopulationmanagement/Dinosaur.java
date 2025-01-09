package com.example.dinopopulationmanagement;

public abstract class Dinosaur {
    protected DinosaurSpecies species;
    protected DinosaurDetectionMethod method;
    public Dinosaur(DinosaurSpecies species, DinosaurDetectionMethod method)
    {
        this.species = species;
        this.method = method;
    }
    public abstract void detect();
}
