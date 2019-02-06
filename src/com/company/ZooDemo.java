package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Zoo myPens = new Zoo();
        Pen myAnimals = new Pen();
        String animalSpecies;
        String animalGender;
        int babyAnimalAge;
        String animalSize;
        int userNumChoiceInput;
        String userChoice;
        boolean again = false;
        boolean playAgain = false;

        do {
            System.out.println("Welcome To Big Jamie's Zoo\n\n" +
                    "What would you like to do \n\n" +
                    "Press [1] Set Up New Pen \n\n" +
                    "Press [2] Remove Pens \n\n" +
                    "Press [3] Animal to Pen \n\n" +
                    "Press [4] Remove animals from Pen\n\n" +
                    "Press [5] Display Animals\n");

            userNumChoiceInput = scan1.nextInt();


            switch (userNumChoiceInput) {

                case 1:
//                    do {
//                        System.out.println("Hi There What new Animal Pens woud you like to " +
//                                "add to Big Jamie's Zoo\n Please type just the animal name.");
//
//                        userChoice = scan2.nextLine();
//
//                        System.out.println("\n You added a " + userChoice + "\n\n");
//
//                        List pen1 = new ArrayList(myPens.listOfPens);
//
//
//                        System.out.println("Would you like to add another Pen\n Press [1] Yes\n\n" +
//                                "Press [2] No");
//                        userNumChoiceInput = scan1.nextInt();
//                        if (userNumChoiceInput == 1) {
//                            again = true;
//                        } else if (userNumChoiceInput == 2) {
//                            again = false;
//                        }
//                    } while (again == true);

                case 2:
                    for (int i = 0; i < myPens.listOfPens.size(); i++) {
                        System.out.println(myPens.listOfPens.get(i));
                    }
                    break;

                case 3:
                    System.out.println("What animal would you like to add\n\n" +
                            "Press [1] Baby Animal \n\n" +
                            "Press [2] Animal \n ");
                    userNumChoiceInput = scan1.nextInt();

                    if(userNumChoiceInput == 1){
                        System.out.println("What species of Baby Animal Would You Like to Add \n");
                        animalSpecies = scan2.nextLine();
                        System.out.println("What is the Gender Of your Animal");
                        animalGender = scan1.nextLine();
                        System.out.println("What is the size of your animal");
                        animalSize = scan2.nextLine();
                        System.out.println("What is you baby animals Age");
                        babyAnimalAge = scan1.nextInt();

                        BabyAnimal newBaby = new BabyAnimal(animalSize, animalGender, animalSpecies, babyAnimalAge);
                        myAnimals.newBabyAnimal.add(newBaby);

                    }else if(userNumChoiceInput == 2){
                        System.out.println("What species of Animal Would You Like to Add \n");
                        animalSpecies = scan2.nextLine();
                        System.out.println("What is the Gender Of your Adult Animal");
                        animalGender = scan2.nextLine();
                        System.out.println("What is the size of your Adult animal");
                        animalSize = scan2.nextLine();
                        System.out.println("What is you Adult animals Age");
                        babyAnimalAge = scan1.nextInt();

                        Animal newAdultAnimal = new Animal(animalSpecies, animalSize, animalGender);
                        myAnimals.newAnimals.add(newAdultAnimal);
                    }

                    break;

                case 4:

                case 5:
                    myAnimals.printAnimals();

            }
            System.out.println("Back to Main Menu? \n\n" +
                    "Press [1] Yes \n\n" +
                    "Press [2] No/n");
            userNumChoiceInput = scan1.nextInt();
            if(userNumChoiceInput == 1){
                playAgain = true;
            }else if(userNumChoiceInput == 2){
                playAgain = false;
            }
        }while(playAgain == true);

	// write your code here
    }
}
