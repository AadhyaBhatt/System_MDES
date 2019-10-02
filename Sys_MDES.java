/**
 * 
 */

/*
File Name: Sys_MDES.java
Author: Aadhya Bhatt
Date: 11-Feb-2019 11:23:17 AM
Description:
*/


public class Sys_MDES
{
	// DEFININING THE STRING ARRAY "ELEM" AND THE CHARACTER ARRAY "ALPHA" 
	
	public static String elem[]  = {"00000", "00001", "00010", "00011", "00100", "00101","00110", "00111", "01000", "01001", "01010","01011","01100","01101","01110","01111", "10000", "10001", "10010", "10011", "10100", "10101","10110", "10111", "11000", "11001","11010","11011","11100","11101","11111"};
  
	public static char alpha[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' ,' ','.',',','?','(',')'};
    
	
	// CONVERTING THE STRING FROM CHARACTER TO BINARY 
	
	public static char[] Conver(String[] binary) 
	

   {
       char a[] = new char[(binary.length)];
       
       for (int m = 0; m < binary.length; m++)
       {
      	 
      	 // N=32, SINCE ALPHA ARRAY IS  SIZE 32
          
      	 for (int n = 0; n < 32; n++)
           {
          
          	 // VALIDATING IF ELEM LENGTH IS EQULA TO BINARY LENGTH
              
          	 if (elem[n] == binary[m]) 
               {
                   a[m] = alpha[n];
                   break;
               }
           }
       }
       return (a);
   } 
	
	
	// CONVERTING  STRING ARRAY INTO CHARACTER FOR " ORIGINAL PLAIN TEXT"
	
	public static String[] Conver(char[] orig_text)
    {
        String g[] = new String[(orig_text.length)];
        
        for (int k = 0; k < orig_text.length; k++)
        {
       
        	// l=32, SINCE ALPHA ARRAY IS  SIZE 32
            
        	for (int l = 0; l < 32; l++)
            {
        		// VALIDATING THAT THE ALPHA IS EQUAL TO THE ORIGINAL PLAIN TEXT
        		
                if (alpha[l] == orig_text[k]) 
                {
                    g[k] = elem[l];
                    break;
                }
            }
        }
        return (g);
    }
   
    public static void main(String args[])
    {
    	// ORIGINAL PLAIN TEXT 
      	System.out.println("------ THE OUTPUT OF THIS PROGRAM IS------\n\n");
        String orig_text="how do you like computer science";
        char[] orig_text_char = orig_text.toLowerCase().toCharArray();
        System.out.println("THE ORIGINAL PLAIN TEXT IS : \n" + orig_text);
        System.out.println();
       
        // CONVERTING THE BINARY STRING ARRAY TO ORIGINAL PLAIN TEXT 
        
        String[] binary = Conver(orig_text_char);
        System.out.println("AFTER TEXT TO BINARY CONVERSION, THE BINARY IS:\n");
       
        // INITIALIZING THE LENGTH OF THE BINARY
        for(int i=0;i<binary.length;i++)
        System.out.print("" + binary[i]);
      
        // CONVERTING THE CHARACTER ARRAY "TEXT" TO BINARY"
        
        char[] original_text = Conver(binary);
        System.out.println();
        System.out.println("\nAFTER BINARY STRING TO ORIGNIAL TEXT CONVERSION, THE MESSAGE IS:"  );
        
        // INITIALIZING THE TEXT
        
        for(int i=0;i<original_text.length;i++)
        System.out.print(original_text[i]);
    
}
  
}