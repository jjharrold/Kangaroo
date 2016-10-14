package kangaroo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Read in inputs
        int x1 = in.nextInt(); // first
        int v1 = in.nextInt(); // second
        int x2 = in.nextInt(); // third
        int v2 = in.nextInt(); // fourth
        in.close(); // Close the scanner
        
        
        if(x1 >= 0 && x1 < x2 && x2 <= 10000 && 1 <= v1 && v1 <= 10000 && 1 <= v2 && v2 <= 10000){ //Restraints
		
            int v = v1+x1; // starting point plus jump meters
            int x = v2+x2;
            
            if(v > x){ // Is location after first jump of kangaroo 1 grearter than kangaroo 2? 
                if(v2 > v1){ // Is jump distance of 2nd kangaroo greater than the first?
                    while(v != x){
                        if(x > v){ // If kangaroo 2 passes kangaroo 1, print NO
                            System.out.println("NO");
                            break;
                        }
                        else{
                            v = v + v1; // add a jump to kangaroo 1
                            x = x + v2; // add a jump to kangaroo 2
                        }
                    }
                    if(v == x){ // If they meet, print YES
                        System.out.println("YES");
                    } 
                }
                else{ // If they never meet print "NO"
                    System.out.println("NO");
                }
            }
            
            else if(x > v){ // Is location after first jump of kangaroo 2 greater than kangaroo 1?
                if(v1 > v2){ // Is the jump distance of 1st kangaroo greater than that of the 2nd?
                    while(v != x){
                        if(v > x){ // If kangaroo 1 passes kangaroo 2, print NO
                            System.out.println("NO");
                            break;  
                        }
                        else{
                            v = v + v1; // add a jump to kanagroo 1
                            x = x + v2; // add a jump to kangaroo 2
                        }
                    }
                    if(v == x){ // If they meet, print YES
                        System.out.println("YES");
                    }
                }
                else{ // If the jump distance of 1st kangaroo is not greater than the 2nd, print NO
                    System.out.println("NO");
                }
            }
           else{ // If the location of both kangaroos after the first jump is equal, print YES
               System.out.println("YES");
           }
        }
        else{ // If the restraints are not met, print NO
            System.out.println("NO");
        }
	}	
}


