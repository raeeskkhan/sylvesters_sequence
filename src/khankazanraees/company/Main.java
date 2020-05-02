package khankazanraees.company;

public class Main {

    public static void main(String[] args) {

        //Enter in the number of terms here
        int n = 7;

        //Initializing Variables
        long[] arr = new long[n];
        long x = 0;
        long temp = 0;
        arr[0] = 2;

        //Calculation Loop
        for (int i = 1; i < n; i++) {
            x = arr[i - 1] - 1;
            temp = arr[i - 1] * x;
            arr[i] = temp + 1;
        }

        //Loop to Print
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}