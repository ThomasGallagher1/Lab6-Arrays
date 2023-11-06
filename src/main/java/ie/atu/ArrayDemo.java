package ie.atu;

import java.util.Scanner;

public class ArrayDemo {

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayDemo temp = new ArrayDemo();

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

        System.out.println("Please enter a new value: ");
        newArray[10]= scanner.nextInt();

        for(int i = 0; i <= 9; i++)
        {
            System.out.println("Element at index "+ i +":" + newArray[i]);
        }

    }
}
