package kangaroo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        
        
        if(x1 >= 0 && x1 < x2 && x2 <= 10000 && 1 <= v1 && v1 <= 10000 && 1 <= v2 && v2 <= 10000){ //Restraints
		
            int v = v1+x1;
            int x = v2+x2;
            
            if(v > x){
                if(v2 > v1){
                    while(v != x){
                        if(x > v){
                            System.out.println("NO");
                            break;
                        }
                        else{
                            v = v + v1;
                            x = x + v2;
                        }
                    }
                    if(v == x){
                        System.out.println("YES");
                    } 
                }
                else{
                    System.out.println("NO");
                }
            }
            
            else if(x > v){
                if(v1 > v2){
                    while(v != x){
                        if(v > x){
                            System.out.println("NO");
                            break;  
                        }
                        else{
                            v = v + v1;
                            x = x + v2;
                        }
                    }
                    if(v == x){
                        System.out.println("YES");
                    }
                }
                else{
                    System.out.println("NO");
                }
            }
           else{
               System.out.println("YES");
           }
        }
        else{
            System.out.println("NO");
        }
	}	
}


