/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl5;
import java.util.Scanner;
/**
 *
 * @author lowar
 */
public class DL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Введите количество чисел: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int k=0,j=0;
        int [] myArray = new int[n];
        StringBuilder s = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");

        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt(); 
        }

        for (int i=0; i<n-1; i++){

            if (myArray[i+1]%myArray[i]==0) {

                s.append(myArray[i+1]+ " ");
                k++;

                if (myArray[i+1]==myArray[myArray.length-1]){
                    if(k>j) {
                        s2.delete(0, s2.length());
                        s2.append(s);
                    }
                }
            }

            else {
                if(k>j){
                    s2.delete(0, s2.length());
                    s2.append(s);
                    j=k;
                    k=0;
                     s.delete(0, s.length()-1);

                }
                else {

                    k=0;
                    s.delete(0, s.length()-1);

                }

            }

        }
        System.out.println("Самая длинная подпоследовательность последовательности :");
        System.out.println(s2);
    }
    
}
