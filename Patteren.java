/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

/**
 *
 * @author Akhtar
 */
public class Patteren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
            for(int i=1;i<=4;i++)
        {
          for(int j=1;j<=i;j++)
          {
              System.out.print(j);
          }
          for(int k=i-1;k>=1;k--)
          {
              System.out.print(k);
          }
          System.out.println();
        }
    }
}
