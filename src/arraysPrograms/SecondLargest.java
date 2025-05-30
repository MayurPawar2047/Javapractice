package arraysPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		int temp,size;
		int a[]= {10,20,30,40,50};
		size=a.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		for (int i = 0; i < size; i++)   
		{       
		System.out.print(" "+a[i]);   
		}   
		
		
	}

}
