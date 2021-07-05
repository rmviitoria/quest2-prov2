/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quastao2prov2;

/**
 *
 * @author Usuario
 */
public class Quastao2prov2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont=0, par=0;
        for(num=100; num>=1;){
            System.out.println(num);
            cont+=num; 
            num--;
            if(num%2==0){
                par+=1
            }
        }
        System.out.println("Houve "+par+" pares nesta sequência. \nA soma dos números é "+cont);
    }
    
}
