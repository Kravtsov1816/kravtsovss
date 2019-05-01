/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl9;

import java.util.Scanner;

/**
 *
 * @author lowar
 */
public class DL9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
            System.out.println("n: ");    
        int n;
        Scanner l = new Scanner(System.in);
        n = l.nextInt();  
    int arr [] = new int[n];
    for(int i =0;i<arr.length;i++)
    {
        arr[i]= i;
        System.out.print(arr[i]+" ");

    }
    System.out.println();
    System.out.println("k: ");
    int k=l.nextInt();
    moveRight(arr, k);
     for(int i =0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");

    }
	}
	
	public static void moveRight(int[] array, int positions) {
	    int size = array.length;
	    for (int i = 0; i < positions; i++) {
	        int temp = array[size - 1];
	        for (int j = size - 1; j > 0; j--) {
	            array[j] = array[j-1];
	        }
	        array[0] = temp;
	    }
	}
    
}
