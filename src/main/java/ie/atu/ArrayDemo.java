package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {

    public static void main (String[] args)
    {


        int[] newArray;

        newArray = new int[10];


        newArray[0] =  100;
        newArray[1] =  200;
        newArray[2] =  300;
        newArray[3] =  400;
        newArray[4] =  500;
        newArray[5] =  600;
        newArray[6] =  700;
        newArray[7] =  800;
        newArray[8] =  900;
        newArray[9] =  1000;



        for(int i = 0; i <= 9; i++)
        {
            System.out.println("Element at index "+ i +":" + newArray[i]);
        }

        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a new value: ");
            newArray[10]= scanner.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("newArray[10] was undefined");
        }

    }
}
