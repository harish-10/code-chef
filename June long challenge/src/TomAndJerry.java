/* package codechef; // don't place package name! */
/* Link to the problem statement : https://www.codechef.com/JUNE20B/problems/EOEO/ */ 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TomAndJerry
{
    public static boolean strengthGame(int ts,int js){
              if(ts<=0 || js<=0)
                return false;
            
              if((ts%2==0)&&(js%2==0))
		        return strengthGame(ts/2,js/2);
		      
		      if((ts%2!=0)&&(js%2!=0))
		          return false;
		      
		      if((ts%2!=0) && (js%2==0))
                    return true;
            
        return false;
		      
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		
		int t = Integer.parseInt(r.readLine());
		while(t> 0){
		  int ts = Integer.parseInt(r.readLine());
		  int count=0;
		  
		  for(int i=1;i<=ts;i++){
		      if(strengthGame(ts,i))
		        count++;
		  }
		  
		  System.out.println(count);
		  
		  t--;  
		}
	}
}
