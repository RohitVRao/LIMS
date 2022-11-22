
public class example {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		int[] y = {2,3,4};
		
		int len = x.length + y.length;
		int[] res= new int[len];
		
		for(int i=0, j=0; i<len; i++)
		{
			if(i<x.length)
			{
				res[i] = x[i];
				
			}
			else
			{
				res[i] = y[j];
				j++;
				System.out.println(x[j]);
			}
		}

	}

}
