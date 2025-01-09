package com.example.dinopopulationmanagement;

public class Velociraptor extends Dinosaur {

    public Velociraptor(DinosaurDetectionMethod method)
    {
        super(DinosaurSpecies.VELOCIRAPTOR, method);

    }
    public void detect()
    {
        System.out.println("Detecting Velociraptor using method:");
    }
}
