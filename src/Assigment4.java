//write a program to reverse the array itself, don’t print array in reverse 
public class Assigment4 {
	static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) 
        {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) 
        {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {3,90,45,29,37,78};
        reverse(arr, arr.length);
    }
}
