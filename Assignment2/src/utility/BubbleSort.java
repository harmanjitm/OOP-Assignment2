package utility;

import polygons.Polygon;

/**
 * Class to perform bubble sort algorithm on a specified list
 * @author 758243
 *
 */
public class BubbleSort
{
	private Polygon[] list;
	
	/**
	 * Method to call other methods to perform a bubble sort operation
	 * @param list The list to sort
	 */
	public BubbleSort(Polygon[] list)
	{
		this.list = list;
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Bubble Sort\n", list[0].getCompareType());
		doBubbleSort();
	}
	
	/**
	 * Method to sort and return the list using Bubble Sort Algorithm
	 * @param list The list to sort
	 */
	private void doBubbleSort()
	{
		Polygon temp;
		Long startTime = System.currentTimeMillis();
		
		for(int i = 0; i<list.length - 1;i++)
		{
			for(int x = 0;x<list.length - 1 - i;x++)
			{
				if(list[x].compareTo(list[x+1]) == 1)
				{
					temp = list[x];
					list[x] = list[x+1];
					list[x+1] = temp;
				}
			}
		}
		
		Long stopTime = System.currentTimeMillis();
		printList();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
	}
	
	/**
	 * Method to print the specified list in a specified format
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
