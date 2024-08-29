/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phillipesguerra;
import java.util.Scanner;
/**
 *
 * @author CL3-PC21
 */
public class Phillipesguerra {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
        
        System.out.println("Enter your choice:");
        int ch1 = input.nextInt();
        
            //1st if condition snacks
            
            if(ch1==1)
            
            {
            System.out.println("Snacks");
            System.out.println("[1] - Piatos");
            System.out.println("[2] - Nova");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
                
                    if(ch2==1)
                    {
                    System.out.println("you choose piatos 20 pesos");
                    int piatos , nova;
                    piatos = 20;
                    nova = 22;
                    
                    System.out.println("Gusto mo Drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                            if(ch3==1)
                            {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke");
                            System.out.println("[2] - Water");
                            int coke , water;
                            coke = 21;
                            water = 27;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = piatos + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = piatos + water;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
                    
                    //nova + coke , nova + water snacks 2nd main
                    if(ch2==2)
                    {
                    System.out.println("you choose nova 22 pesos");
                    int piatos , nova;
                    piatos = 20;
                    nova = 22;
                    
                    System.out.println("Gusto mo Drinks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                            if(ch3==1)
                            {
                            System.out.println("Drinks");
                            System.out.println("[1] - Coke");
                            System.out.println("[2] - Water");
                            int coke , wat;
                            coke = 21;
                            wat = 27;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = nova + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = nova + wat;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
            }
            
            // Drinks 2ndmain
            
            else if(ch1==2)
            {
            System.out.println("Drinks");
            System.out.println("[1] - coke");
            System.out.println("[2] - water");
            
                System.out.println("Enter your choice:");
                int ch2 = input.nextInt();
                
                    if(ch2==1)
                    {
                    System.out.println("you choose coke 21 pesos");
                    int coke , water;
                   coke = 21;
                   water = 27;
                    
                    System.out.println("Gusto mo snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                            if(ch3==1)
                            {
                            System.out.println("snacks");
                            System.out.println("[1] - piatos");
                            System.out.println("[2] - nova");
                            int piatos , nova;
                            piatos = 20;
                            nova = 22;
                            
                                System.out.println("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = piatos + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //coke +  piatos
                                    
                                    if(ch4==1)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = piatos + water;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
                    
                    //nova + coke , nova + water snacks 2nd main
                    if(ch2==2)
                    {
                    System.out.println("you choose water 27 pesos");
                    int coke , water;
                     coke = 21;
                     water = 27;
                    
                    System.out.println("Gusto mo snacks? [1] yes [2] no:");
                    int ch3 = input.nextInt();
                    
                            if(ch3==2)
                            {
                            System.out.println("snack");
                            System.out.println("[1] - piatos");
                            System.out.println("[2] - nova");
                            int piatos , nova;
                             piatos = 20;
                             nova = 22;
                             
                                System.out.println          ("Enter your choice:");
                                int ch4 = input.nextInt();
                                
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose coke 21 pesos");
                                    
                                    int tot;
                                    tot = nova + coke;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                                    
                                    //piatos + water
                                    
                                    if(ch4==2)
                                    {
                                    System.out.println("you choose water 27 pesos");
                                    
                                    int tot;
                                    tot = nova + water;
                                    System.out.println("Total is :"+tot);
                                    System.out.println("Enter your cash:");
                                    int chs = input.nextInt();
                                    
                                        while(chs<tot)
                                        {
                                        System.out.println("Invalid Amount");
                                        System.out.println("Enter your cash:");
                                        chs = input.nextInt();
                                        }
                                        
                                        int chng;
                                        chng = chs - tot;
                                        System.out.println("Change is :"+chng);
                                   
                                        
                                    
                                    }
                            }
                    
                    }
            }
    }
}
