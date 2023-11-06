package ie.atu;

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

    }
}
