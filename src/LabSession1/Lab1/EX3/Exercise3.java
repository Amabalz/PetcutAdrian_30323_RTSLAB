package LabSession1.Lab1.EX3;

import java.util.Random;

public class Exercise3 {
    public static void main(String args[]){

        Random rand = new Random();
        int lowerBound = -100;
        int upperBound = 100;
        int[] randomVector = new int[10];

        for (int i = 0; i < 10; i++){
            int randomNo = rand.nextInt(upperBound-lowerBound) + lowerBound;
            randomVector[i] = randomNo;
        }

        for (int i = 0; i < randomVector.length; i++){
            for (int j = i+1; j < randomVector.length; j++){
                if(randomVector[i] > randomVector[j]){
                    int aux = randomVector[i];
                    randomVector[i] = randomVector[j];
                    randomVector[j] = aux;
                }
            }
        }

        System.out.println("The vector with random no sorted is:");
        for (int i = 0; i < randomVector.length; i++){
            System.out.print(randomVector[i] + " ");
        }
    }
}
