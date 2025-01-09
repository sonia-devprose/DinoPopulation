package com.example.dinopopulationmanagement;

public class RfidDetection implements DinosaurDetectionMethod{
    @Override
    public void detectDinosaur(Dinosaur dinosaur)
    {
        System.out.println("Using RFID to detect " + dinosaur.species);
    }
}
