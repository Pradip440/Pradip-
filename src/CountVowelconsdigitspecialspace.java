import java.util.Scanner;
public class CountVowelconsdigitspecialspace{
	public static void main(String args[]){
 
    String str;
    int vCount=0,cCount=0,digits=0,spaces=0,spe_Char=0;
    Scanner sc=new Scanner(System.in);    
    System.out.println("Enter the String  ");
    str=sc.nextLine();
    for(int i=0; i<=str.length()-1; i++){
    	char ch=str.charAt(i);
    	if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' // check vowels
    			||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
    		vCount++;
    	}
    	else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){  //check consonants
    		cCount++;
    	}
    	else if(ch>='0' && ch<='9') // check digits
    	{
    		digits++;
    	}
    	else if(ch==' '){ // check spaces
    		spaces++;
    	}
    	else{
    		spe_Char++;
    	}
    }
    	System.out.println("\nTotal Vowels: "+vCount);//display total number of vowels
    	System.out.println("Total consonants: "+cCount);// display total number of consoanats
    	System.out.println("\nTotal digits: "+digits);// display total number of digits
    	System.out.println("Total white space : "+spaces); // display total number of spaces
    	System.out.println("Total special characters: "+(spe_Char));// display total number of special characters
    	sc.close();
    }
	
}

