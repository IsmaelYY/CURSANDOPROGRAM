/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveis;

/**
 *
 * @author Ismael
 */
public class Variaveis {
     int a = 6;
     int b = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Variaveis Val = new Variaveis();
        String strl = "Ola mundo    ";
        String str2 = "Ola mundo  \n";
        int[] ListNum = {1, 2, 3, 4, 6, 8, 10};
        int resp = 11;
        
        
        System.out.print(strl);
        System.out.println(str2);
        System.out.printf("Soma da variaveis a e b = %d \n", (Val.a + Val.b));
         if(ListNum[0] +ListNum[6] == resp){
             System.out.print("resposta correta " + (ListNum[6] - ListNum[0]));
         }
         else{
             System.out.print("resposta incorreta");
         }
       
        
    }
    
}
