import java.util.Arrays;
import java.util.Scanner; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Anthony Moore
 * 
 */

public class GradeCalculator { 
     
            public static float calcAvg() { 
                
             float[] arrGrades = new float[9]; 
             Scanner scanner = new Scanner(System.in); 
              for(int i = 0; i < arrGrades.length; i++) { 
              arrGrades[i] = scanner.nextInt(); 
              float theTotal = 0;
             theTotal = theTotal + arrGrades[i]/100;
          System.out.println("Your getting: "+theTotal);
             return theTotal;       
              }
                return 0;
            }
            
    public static void main(String[]args) {
        
        
        float[] arrGrades = new float[9];
        
        float input = 0; 
      
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter the 10 grades of your final mark in percentage: Example: (100%)"); 
        
        for(int j = 0; j < arrGrades.length; j++) { 
            
       input = scanner.nextFloat(); 
       
    
        }
            
       calcAvg(); 
  
        }

 

    }
   
            

        

       
        
        
  
 
            
            
   
    



