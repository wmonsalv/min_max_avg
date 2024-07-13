package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[] arr = arrayMaker(5);
        System.out.print("This is the original array: ");
        printR(arr);
        System.out.println("\n" + "This is my min: " + min(arr));
        System.out.println("This is my max: " + max(arr));
        System.out.println("This is my avg: " + avg(arr));


    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] arrayMaker(int size){
        Random r = new Random();
       int[] arr = new int[size];
       for(int i = 0; i < arr.length; i++){
           int ran = r.nextInt(50)-20;
           arr[i] = ran;
       }
       return arr;
    }

    public static double avg(int[] arr){
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        return avg/arr.length;
    }

    public static void printR(int[] arr){
        for(int i=0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}

