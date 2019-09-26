/**
 * Selection sort Program
 * Created on 26 September 2019
 * 
 * The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list.
 * 
 * It has average complexity of O(n2)
*/

package Sorting.java;

public class SelectionSort 
{

	public static void main(String[] args) 
	{
		selectionSort();

	}

	public static void selectionSort()
	{

		int inList [] = {6,2,7,9,1,5,0,4,8,3};
		int outList[] = new int[inList.length];

		int count = 0;
		int  temp = inList[0];
		int i = 0;

		/* Assinging the array into new list */
		for (int k=0; k<inList.length; k++) 
			outList[k] = inList[k]; 
		
		do
		{
			count++;
			temp = outList[i] ;

			for ( int j = i + 1; j < outList.length ; j++)
			{
				count++;
				if (temp > outList[j])
				{
					temp = outList[j];
					outList[j] = outList[i];
					outList[i] = temp;
					
				}
			}
			
			i++;
			
		} while (i < outList.length -1);
		
		/*Printing the Incoming list*/
		System.out.print("Orginal List is : " );
		for (int k = 	0 ; k < inList.length ; k++ )
		{
			System.out.print(inList[k] +" ");
		}

		System.out.println();

		/*Printing the Sorted list*/
		System.out.print("Sorted List is : " );
		for (int k =0 ; k < outList.length ; k++ )
		{
			System.out.print(outList[k] +" ");
		}
		
		System.out.println();
		System.out.print("Cost : " + count);
	}

}
