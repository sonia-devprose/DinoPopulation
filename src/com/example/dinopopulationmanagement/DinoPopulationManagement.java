package com.example.dinopopulationmanagement;

public class DinoPopulationManagement {

    public static void main (String [] args)
    {
        DinosaurDetectionMethod detectionMethod1 = new CameraDetection();
        DinosaurDetectionMethod detectionMethod2 = new RfidDetection();
        
        DinosaurPopulationManager populationManager = new DinosaurPopulationManager();
        Dinosaur trex = new T_REX(detectionMethod1);
        Dinosaur velociraptor = new Velociraptor(detectionMethod2);
        trex.detect();;
        velociraptor.detect();
        populationManager.addDinosaur(trex);
        populationManager.addDinosaur(velociraptor);
        populationManager.displayPopulation();
    }
}
