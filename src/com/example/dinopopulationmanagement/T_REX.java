package com.example.dinopopulationmanagement;

public class T_REX extends Dinosaur{

    public T_REX(DinosaurDetectionMethod method)
    {
        super(DinosaurSpecies.T_REX, method);

    }
    public void detect()
    {
        System.out.println("Detecting T-Rex using method:");
    }
}
