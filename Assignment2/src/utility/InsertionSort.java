package utility;

import polygons.Polygon;

/**
 * Class to sort a specific list using Insertion Sort algoritem.
 * @author 758243
 *
 */
public class InsertionSort
{
	private Polygon[] list;
	
	/**
	 * Method to call other methods to do the Insertion Sort
	 * @param list The list to sort
	 */
	public InsertionSort(Polygon[] list)
	{
		this.list = list;
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Insertion Sort\n", list[0].getCompareType());
		doInsertionSort();
	}
	
	/**
	 * Method to perform the Insertion Sort on a specified list
	 * @param list The list to sort
	 */
	private void doInsertionSort()
	{	
		Long startTime = System.currentTimeMillis();
		for(int i=1;i<list.length;i++)
		{
			Polygon p = list[i];
			int j = i-1;
			while(j>=0 && list[j].compareTo(p) == 1)
			{
				list[j+1] = list[j];
				j = j-1;
			}
			list[j+1] = p;
		}
		Long stopTime = System.currentTimeMillis();
		printList();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
	}
	
	/**
	 * Method to print values of a specified list
	 * @param list The list to print
	 */
	private void printList()
	{
		System.out.printf("%6s\t Value\n","Index");
		for(int i=0;i<=list.length;i+=1000)
		{
			if(i==0)
			{
				System.out.printf("%5d:\t %s\n",i,list[i]);
			}
			else if(i+1000 > list.length)
			{
				System.out.printf("%5d:\t %s\n",i,list[i]);
				System.out.printf("%5d:\t %s\n",list.length,list[list.length-1]);
			}
			else
			{
				System.out.printf("%5d:\t %s\n",i,list[i]);
			}
		}
	}
}
