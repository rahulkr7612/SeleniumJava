package Practise;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a={1,3,3,4,5,6,6,7,8,9,9};

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;

        for(int i=0;i<a.length;i++)
        {
            if(n==a[i])
            {
                System.out.println("Indices= "+i);
                s++;
            }

        }
        if(s==0)
        {
            System.out.println("Element Not Found");
        }
    }
}
