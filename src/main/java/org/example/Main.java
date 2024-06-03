package org.example;
import org.example.models.Cannotdividebyzero;
import org.example.models.InvalidExe;
import org.example.models.MaxInputExe;
import org.example.models.MultiplierLimiter;


import java.util.*;

public class Main {
    public static void main(String[] args) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        float a = 0;
        float b = 0;
        while (run) {
            try {
                System.out.println("Enter a number:");
                a = sc.nextFloat();
                System.out.println("Enter another number:");
                b = sc.nextInt();

                if (a > 100000 || b > 100000) {
                    try {
                        throw new MaxInputExe();
                    } catch (MaxInputExe e) {
                        System.out.println("Exception occurred" +
                                "\nReason: " + e);
                        System.exit(0);
                    }
                }
            }catch (InputMismatchException e){
                        System.out.println("Reason" + e);
                        System.exit(0);
            }
            run = false;
        }

        System.out.println("Chose the operation you want to perform: ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division  ");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                float result = a + b;
                System.out.println("The sum is :" + result);
                break;
            case 2:
                float re = a - b;
                System.out.println("The difference is:" + re);
                break;
            case 3:
                try {
                    float mu = a * b;
                    if (b >= 7000 || a >= 7000) {
                        throw new MultiplierLimiter();
                    }
                    System.out.println("The multiplication is :" + mu);


                } catch (MultiplierLimiter e) {
                    System.out.println("Reason:" + e);
                    System.exit(0);
                }
                break;

            case 4:
                try {
                    float  div = a/b;
                    if (b == 0) {
                        throw new Cannotdividebyzero();
                    }
                    System.out.println("The value obtained is " + div);
                } catch (Cannotdividebyzero e) {
                    System.out.println("Reason"+e);
                    System.exit(0);

                }
                break;

            default:
                try{
                    throw new InvalidExe();
                }catch(InvalidExe e){
                    System.out.println("Reason: " + e);
                }
                break;
        }

        }
    }




