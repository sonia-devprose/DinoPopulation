package com.example.dinopopulationmanagement;

public class CameraDetection implements DinosaurDetectionMethod{

    @Override
    public void detectDinosaur(Dinosaur dinosaur)
    {
        System.out.println("Using cameras to detect " + dinosaur.species);
    }
}
