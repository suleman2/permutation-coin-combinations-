package com.company;
import java.util.*;
import java.lang.reflect.Array;
/*
      *java program to find all the permutation of a given string using ...
      * Concepts of threads is also includes
      *for example: given a string "XYZ".... this program will calculate all the combinations like combination of "XYZ" is ...
      *XYZ, XZY, XZY, YXZ, YZX, ZXY, XYX.
@author M.Suleman Saboor
*/
//making this class for threads
class Thread1 extends Thread
{
    public void run()
//this run method run the start command in main
    {
        for(int i = 1 ; i<=2; i ++)
        {
            try {Thread.sleep(2000);}   catch (Exception e){}
                System.out.println(" thread1 result");// this loop shows the result 5 time
        }
    }
}
//this class shows the results of thread2
class Thread2 extends Thread
{
    public void run()
    {
        for(int j = 0; j<= 2; j++)
        {
            try {Thread.sleep(2000);}catch (Exception e){}            }
            System.out.println(" thread2 result");// this loop shows the result 2 time
        }
    }
public class Main {
    static void Print(int arr[], int n, int  i)
    {
        int MAX_POINT = 3;
        if(n == 0)
            {
                printArray(arr, i);
            }
        else if(n >0)
            {
                for(int k =1 ; k <  MAX_POINT; k++)
                    {
                       arr [i] = k;
                       Print(arr, n-k, i+1);
                    }
            }
    }//end of print class
    static void printArray(int arr[], int m)
    {
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");
            System.out.println("\n");
    }
    public static void main(String[] args)
    {
        //for test cases
        int n = 1;
        if(args[0].contains("test1")) {
            n = 5;
        }
            int size = 100;
            int[] array = new int[size];
             Print(array, n, 0);
            Thread1 obj1 = new Thread1();//Thread1 class objects
            Thread2 obj2 = new Thread2();//Thread2 class objects
            obj1.start();//this start method belongs to the Thread1 class
            try {Thread.sleep(10);}catch (Exception e){} //this try catch is used for delay between the threads
            obj2.start();// this method belongs to the thread2 class
//          obj1.show(); //this method shows the threads1
//          obj2.show2();//this method shows the thread2
     }//end of main
}//end of Main clas

