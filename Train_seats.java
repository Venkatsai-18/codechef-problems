/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Train_seats
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int n=sc.nextInt();
		int result=0;
		for(int k=0;k<n;k++)
		{
		    String s=sc.next();
		    char a[]=s.toCharArray();
		    int j=a.length;
		    for(int i=0;i<j;i=i+4)
		    {
		    int count=0;		        
		        //System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]+" "+a[i+3]+" "+a[j-1]+" "+a[j-2]);
		        if(a[i]=='0')
		            count++;
		        if(a[i+1]=='0')
		            count++;
		        if(a[i+2]=='0')
		            count++;
		        if(a[i+3]=='0')
		            count++;
		        if(a[j-1]=='0')
		            count++;
		        if(a[j-2]=='0')
		            count++;
    		      if(count>=c)
    		      {
    		          result+=(int)fact(count)/(fact(count-c)*fact(c));
    		      }
		      j=j-2;
		    }
		      //System.out.println(result);
		}
			System.out.println(result);
	}
	static int fact(int n)
	{
	    if(n<=1)
	        return 1;
	    else
	        return n*fact(n-1);
	}
}
