package arraysPrograms;

import java.util.HashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	int a[]= {5,6,7,3,3,7,5};
	
	HashSet<Integer> hs=new HashSet<>();
	
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
	}
	
	for(int no:hs)
	{
		System.out.print(no+" ");
	}
}
}
