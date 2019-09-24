/**
 * Bubble sort Program
 * Created on 24 September 2019
 * 
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. 
 * 
 * Bubble sort has a worst-case and average complexity of O(n2)
*/

package Sorting.java;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		bubbleSort();
	}

	private static void bubbleSort()
	{
		int inList [] = {6,2,7,9,1,5,0,4,8,3};
		int outList[] = new int[inList.length];

		/* Assinging the array into new list */
		for (int k=0; k<inList.length; k++) 
			outList[k] = inList[k]; 

		int  temp;
		int i = outList.length -1;

		/*Swapping Logic*/
		while  ( i > 0)
		{
			for (int j = 0; j < i ; j++ )
			{
				if (outList[j] > outList[j+1])
				{
					temp = outList[j];
					outList[j] = outList[j+1];
					outList[j+1] = temp;
				}
			}
			i-- ; 
		}

		/*Printing the Incoming list*/
		System.out.print("Orginal List is : " );
		for (int j = 	0 ; i < inList.length ; i++ )
		{
			System.out.print(inList[i] +" ");
		}

		System.out.println();
		
		/*Printing the Sorted list*/
		System.out.print("Sorted List is : " );
		for (int j =0 ; j < outList.length ; j++ )
		{
			System.out.print(outList[j] +" ");
		}
	}
}
