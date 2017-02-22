package com.tp.ds.TP_DS;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[])
    {
        int binnum, rem;
        String hexdecnum="";
        
        // digits in hexadecimal number system
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Binary Number : ");
        binnum = scan.nextInt();
		
        // converting the number in hexadecimal format
        while(binnum>0)
        {
            rem = binnum%16;
            hexdecnum = hex[rem] + hexdecnum;
            binnum = binnum/16;
        }
		
        System.out.print("Equivalent Hexadecimal Value of " +binnum+ " is :\n");
        System.out.print(hexdecnum);
            
    }
	
public int getDecimalFromBinary(int binary){
		
		int decimal = 0;
		int power = 0;
		while(true){
			if(binary == 0){
				break;
			} else {
				int tmp = binary%10;
				decimal += tmp*Math.pow(2, power);
				binary = binary/10;
				power++;
				
				
			}
		}
		return decimal;
	}

	 public  void prime(){  
	  int i,m=0,flag=0;    
	  int n=17;//it is the number to be checked  
	  m=n/2;    
	  for(i=2;i<=m;i++){    
	   if(n%i==0){    
	   System.out.println("Number is not prime");    
	   flag=1;    
	   break;    
	   }    
	  }    
	  if(flag==0)    
	  System.out.println("Number is prime");    
	}  
	

public void printBinaryFormat(int number){
    int binary[] = new int[25];
    int index = 0;
    while(number > 0){
        binary[index++] = number%2;
        number = number/2;
    }
    for(int i = index-1;i >= 0;i--){
        System.out.print(binary[i]);
    }
}
}
