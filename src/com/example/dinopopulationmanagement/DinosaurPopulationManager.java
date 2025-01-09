package com.example.dinopopulationmanagement;
import java.util.*;
public class DinosaurPopulationManager {

    private List<Dinosaur> dinosaurs;

    public DinosaurPopulationManager()
    {
        dinosaurs = new ArrayList<>();
    }

    public void addDinosaur(Dinosaur dinosaur)
    {
        dinosaurs.add(dinosaur);
    }

    public void displayPopulation()
    {
        System.out.println("Dinosaur Population Count:");
        int tRexCount = 0, velociraptorCount = 0, triceratopsCount = 0, brachiosaurusCount = 0;
        for (Dinosaur dinosaur : dinosaurs)
        {
            switch(dinosaur.species)
            {
                case T_REX:
                    tRexCount++;
                    break;
                case BRACHIOSAURUS:
                    brachiosaurusCount++;
                    break;
                case VELOCIRAPTOR:
                    velociraptorCount++;
                    break;
                case TRICERATOPS:
                    triceratopsCount++;
                    break;


            }
        }

        System.out.println("T-Rex: " + tRexCount);
        System.out.println("Velociraptor: " + velociraptorCount);
        System.out.println("Triceratops: " + triceratopsCount);
        System.out.println("Brachiosaurus: " + brachiosaurusCount);


    }
}
