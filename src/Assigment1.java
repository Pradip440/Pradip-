// WAP to find second max value in an array
public class Assigment1 {
	  
		public static int secondMax(int[] a, int total)
		{  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
		public static void main(String args[])
		{  
		int a[]={20,0,31,45,100,1,105,90};    
		System.out.println("Second Max is  : "+secondMax(a,8) ); //secondMax(a,8) 
		}  
}
