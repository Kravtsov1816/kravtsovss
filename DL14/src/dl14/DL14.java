/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl14;

/**
 *
 * @author lowar
 */
public class DL14 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int arr [] = new int[10];

    for(int i =0;i<10;i++)
    {
        arr[i]= (int)((Math.random()*11));
        System.out.print(arr[i]+" ");
    }
int max=arr[0];
    int maxIndex=0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            maxIndex = i;
            max = arr[i];
        }
    }
    //Находим индекс максимального элемента
    //Находим индекс максимального элемента
    System.out.println("maxI:"+maxIndex);
    for (int i=0;i<arr.length;i++){              

        for(int j=i+1; j<arr.length;j++){        

            if (arr[i]<arr[j]){
                arr[i]=arr[j];
                    break;
    }
   }
    }            
      arr[maxIndex]=0;

    for(int i=maxIndex+1;i<arr.length;i++){
        for (int j = i+1; j < arr.length; j++) {
            
        }
    }

        
    
   
    

    System.out.println();

        for(int i =0;i<10;i++)
    {
        System.out.print(arr[i]+" ");
    }
    

    }

}
