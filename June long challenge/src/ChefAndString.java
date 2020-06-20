/* package codechef; // don't place package name! */
/* Link of the problem statement: https://www.codechef.com/JUNE20B/problems/XYSTR/ */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndString
{
   	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		
		int t = Integer.parseInt(r.readLine());
		while(t> 0){ 
		int count = 0;
        String ip = r.readLine();
        char[] text = ip.toCharArray();
	    for(int i=0;i< text.length-1;i++){
	        
	        if(text[i]=='x' && text[i+1]=='y'){
	            count++;
	            i++;
	        }
	        else if(text[i]=='y' && text[i+1]=='x'){
	            count++;
	            i++;
	        }
	            
	       
	    }

		System.out.println(count);
		  
		  
		  
		  t--;  
		}
	}
}
