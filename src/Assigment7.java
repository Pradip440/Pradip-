
public class Assigment7 
{
	public static void main(String[] args)
	{
	    int[] temp = { 1, 2, 3,4,5,6};


	    for (int i = 0; i < temp.length; i++)
	    {
	        temp[i] = (int) Math.pow(temp[i], 2);//pow() is used to calculate a number raised to power of sum other number
	     //temp[i] = (int) Math.pow(temp[i],3 ); //we can use 3 to cube and4,5,6,as we want power 
	    }
	    for (int value : temp)
	    {
	        System.out.println(value);
	    }
	}
}
