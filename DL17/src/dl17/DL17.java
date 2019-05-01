/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl17;

import java.util.Scanner;

/**
 *
 * @author lowar
 */
public class DL17 {

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
        arr[i]= (int)((Math.random()*99)+1);
        System.out.print(arr[i]+" ");

    }
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
    if (arr[i]<min){
    min =arr[i];
    }
    }
    System.out.println("min="+min);
    for (int i=1;i<min;i++){
    if (i!=min){
    System.out.println("Минимальное натуральное число которого нету:"+i);
    break;
    }
    }
    }
    
}
