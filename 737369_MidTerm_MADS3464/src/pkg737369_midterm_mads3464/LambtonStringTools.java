/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg737369_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools {

    static boolean reverseString;
    static public String reverseString(String str)
 {
     String reverseStringVal = "";
     for(int i = str.length()-1; i>=0;i--)
     {
         reverseStringVal = reverseStringVal + str.charAt(i);
         
     }
     return reverseStringVal;
 }
    public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;   
}
    public static String mostFrequent(String input) {
        char[] array = input.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
 
          for(int i = 0, j = 0; i < input.length() - 1; i = j){
               int count = 1;
           while (++j < input.length() && array[i] == array[j]) {
                  count++;
                }
         
          if (count >= maxCount) {
             maxCount = count;
             maxChar = array[i];
         }
         
        }
 
    return (maxChar + " = " + maxCount);
    }
    public static String replaceSubString(String s1, String s2, String s3) {
        
        s1 = s1.replaceAll(s2,s3);
        return s1;
    }
    }


   
