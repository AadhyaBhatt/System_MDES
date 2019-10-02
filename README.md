# System_MDES

Let Z32 corresponding to 26 English characters, space, dot (.), comma (,), question mark (?) and two brackets (left bracket and right bracket). So the following correspondence are used. . , ? ( ) 26 27 28 29 30 31 Each element in Z32 can be expressed as a 5-bit string. Write a program to translate English text to binary strings according to the above correspondence. Write a program to do the inverse. 

Solution Description:  
For the program  jdk complier is used for compiling the substitution cipher and have executed the Substitution cipher using java programing language, in eclipse IDE. 
STEP 1: We have defined the array of string elements as well as the alphabets. 
STEP 2: We have converted these string from character to binary value. 
 	public static char[] Conver(String[] binary) 
STEP 3: Using for loop, we have initialized the size of the alphabet array. 
STEP 4: Validation of element length equal to the binary length. 
if (elem[n] == binary[m])  
STEP 5: Converting binary array to character to get the original plain text. 
public static String[] Conver(char[] orig_text) 
STEP 6: Sizing the bock of alphabet array to 32, since the number of arrays alphabets are 32. 
for (int l = 0; l < 32; l++)  
STEP 7:  Initializing the length of original array. 
 if (alpha[l] == orig_text[k])  
 
FUNCTIONS USED:   
There are two main functions used while computing this code. 
1.	Convert String to Binary – This function is used in order to convert the string array value to binary value. The length of the string is changed to binary value. We validate if the binary value is equal to the number of elements in the array. public static char[] Conver(String[] binary) 
2.	Convert String to Character  - This function will convert the string array into character.  Here, we will validate if the alphabet is equal to the original plain text. 
public static String[] Conver(char[] orig_text) 
