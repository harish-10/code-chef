/* package codechef; // don't place package name! */
/* Link to the problem statement : https://www.codechef.com/JUNE20B/problems/CHFICRM/ */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndIceCream
{
	public static void main (String[] args) throws java.lang.Exception
	{
		java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int[] valid={5,10,15};
		int t = Integer.parseInt(r.readLine());
		while(t> 0){
		    int n = Integer.parseInt(r.readLine());
		    String [] s= r.readLine().split(" ");
		    int chefMoney=0;
		    boolean flag=false;
		    for(int i=0;i<n;i++){
		        int temp=Integer.parseInt(s[i]);
		        
		        if(java.util.Arrays.binarySearch(valid,temp) >= 0 ){
		            if(temp==5){
		                 chefMoney+=temp;
		                 flag=true;
		            }
		            else{
		                    if(chefMoney>= (temp-5)){
                                 flag=true;
		                         chefMoney=chefMoney-(temp-5);
		                     }
		                    else{
		                        flag=false;
		                        break;
		                     }
		             }
		            
		        }
		        
		  
		    }
		    
		    if(flag){
		        System.out.println("YES");
		    }
		    else{
		         System.out.println("NO");
		    }
		 
		 
		  t--;  
		}
	}
}
