/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dl19;

/**
 *
 * @author lowar
 */
public class DL19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int q, w, e, r, t, y;
        int number =0;
        for (q=0;q<10;q++){
            for(w=0;w<10;w++){
                for(e=0;e<10;e++){
                    for(r=0;r<10;r++){
                        for(t=0;t<10;t++){
                            for(y=0;y<10;y++){
                            if (q+w+e==r+t+y){
                                number+=1;
                                }
                            }
                        }
                    }
                }
            
            }
        
        }
        System.out.println(number);
    }
    
}
