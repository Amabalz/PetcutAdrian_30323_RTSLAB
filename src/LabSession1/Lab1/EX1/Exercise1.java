package LabSession1.Lab1.EX1;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String args[]){
        System.out.println("Hello!");
        System.out.println("Choose between: 1. Addition, 2. Subtraction, 3. Multiplication of 2 complex numbers:");

        Scanner s = new Scanner(System.in);
        int optionNo = s.nextInt();

        System.out.println("Read the first complex number");
        System.out.println("The real part:");
        int realPartComplex1 = s.nextInt();

        System.out.println("The imaginary part:");
        int imgPartComplex1 = s.nextInt();

        System.out.println("Read the second complex number");
        System.out.println("The real part:");
        int realPartComplex2 = s.nextInt();

        System.out.println("The imaginary part:");
        int imgPartComplex2 = s.nextInt();

        switch (optionNo){
            case 1:
                int additionRealPart = realPartComplex1 + realPartComplex2;
                int additionComplexPart = imgPartComplex1 + imgPartComplex2;

                if (additionComplexPart < 0) System.out.println("The addition of the 2 no results in: " + additionRealPart + additionComplexPart + "i");
                else System.out.println("The addition of the 2 no results in: " + additionRealPart + "+" + additionComplexPart + "i");

                break;
            case 2:
                int substractRealPart = realPartComplex1 - realPartComplex2;
                int substractImgPart = imgPartComplex1 - imgPartComplex2;

                if (substractImgPart < 0) System.out.println("The addition of the 2 no results in: " + substractRealPart + substractImgPart + "i");
                else System.out.println("The addition of the 2 no results in: " + substractRealPart + "+" + substractImgPart + "i");

                break;
            case 3:
                int multiplyRealPart = realPartComplex1*realPartComplex2 - imgPartComplex1*imgPartComplex2;
                int multiplyComplexPart = realPartComplex1*imgPartComplex2 + imgPartComplex1*realPartComplex2;

                if (multiplyComplexPart < 0) System.out.println("The addition of the 2 no results in: " + multiplyRealPart + multiplyComplexPart + "i");
                else System.out.println("The addition of the 2 no results in: " + multiplyRealPart + "+" + multiplyComplexPart + "i");

                break;
        }


    }
}
