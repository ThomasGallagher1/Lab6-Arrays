package ie.atu;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main (String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);

        System.out.println("Please enter a new value: ");
        int x = scanner.nextInt();

        arrayList.add(x);

        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Element at index "+ i +":" + arrayList.get(i));
        }

    }
}
