/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeanumber;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TakeaNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader =new Scanner(System.in);
        int number = reader.nextInt();
        int take = 0;
        int serve = 0;
        String word;
        do{
            word = reader.next();
            if (word.equals("TAKE")) {
                number = (number+1)%999;
                take++;
            } else if (word.equals("SERVE")) {
                serve++;
            } else if (word.equals("CLOSE")) {
                System.out.println(take+" "+(take-serve)+" "+number);
                take = 0;
                serve = 0;
            }
        }while(!word.equals("EOF"));
    }
    
}
