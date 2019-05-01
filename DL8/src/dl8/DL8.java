/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl8;
import java.util.Scanner;


/**
 *
 * @author lowar
 */
public class DL8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество посетителей: ");
        int m = in.nextInt(); // 10
        int people [][] = new int[m][2];
        int time [] = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        int count [] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Музей работает с 10 до 18 часов. Время вводится целыми числами.");
        for (int i=0; i<m; i++){
            System.out.println("Введите время прихода и ухода "+(i+1)+"-го посетителя:");
            people[i][0]=in.nextInt();
            people[i][1]=in.nextInt();

        }

        for (int i=0; i<m; i++){
            for (int l=people[i][0]; l<=people[i][1]; l++){
                for(int r=0; r<time.length; r++){
                    if (l==time[r]){
                        count[r]+=1;
                    }
                }
            }
        }


        for(int i = count.length-1 ; i > 0 ; i--){
            for(int y = 0 ; y < i ; y++){
            if( count[y] < count[y+1] ){

                int tmp2 = time[y];
                time[y] = time[y+1];
                time[y+1] = tmp2;

                int tmp = count[y];
                count[y] = count[y+1];
                count[y+1] = tmp;
            }
        }
    }

        System.out.println("Самое большое количество посетителей находилось в музее в "+time[0]+" часов - "+count[0]+" человек(-а).");


        for (int i=1; i<time.length; i++){
            System.out.println("В "+time[i]+" часов в музее находилось "+count[i]+" человек(-а).");
        }
    }
    
}
