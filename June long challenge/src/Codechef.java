/* package codechef; // don't place package name! */
/* Link of the problem statement: https://www.codechef.com/JUNE20B/problems/PRICECON/ */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		
		int t = Integer.parseInt(r.readLine());
		while(t> 0){
		  String [] s= r.readLine().split(" ");
		  
		  int n = Integer.parseInt(s[0]);
		  int k = Integer.parseInt(s[1]);
		  
		  
		  int initRev = 0;
		  int aftRev = 0;
		  
		  s=r.readLine().split(" ");
		  
		  for(int i=0;i<n;i++){
		  int temp=Integer.parseInt(s[i]);
		     if(temp > k ){
		         initRev += temp;
		         aftRev += k;
		     }
		     else{
		         initRev += temp;
		         aftRev += temp;
		     }
		  }
		  
		  System.out.println(Math.abs(initRev-aftRev));
		  t--;  
		}
	}
}
