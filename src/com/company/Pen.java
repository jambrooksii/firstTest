package com.company;

import java.util.ArrayList;

public class Pen {

    ArrayList<Animal> newAnimals = new ArrayList<Animal>();
    ArrayList<BabyAnimal> newBabyAnimal = new ArrayList<BabyAnimal>();

    public void printAnimals(){
        for (int i = 0; i <newBabyAnimal.size() ; i++) {
            System.out.println(newAnimals);
        }
    }
}
