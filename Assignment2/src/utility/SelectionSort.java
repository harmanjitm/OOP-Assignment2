package utility;

import polygons.Polygon;

/**
 * Class to perform SelectionSort based on an input List
 * @author 758243
 *
 */
public class SelectionSort
{
	private Polygon[] list;
	
	/**
	 * Method to call other methods to perform the SelectionSort
	 * @param list The list to sort
	 */
	public SelectionSort(Polygon[] list)
	{
		this.list = list;
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Selection Sort\n", list[0].getCompareType());
		doSelectionSort();
	}
	
	/**
	 * Method to do the SelectionSort and print out the total time taken
	 * @param list The list to sort
	 */
	private void doSelectionSort()
	{
		Long startTime = System.currentTimeMillis();
		for(int i = 0;i<list.length;i++)
		{
			Polygon temp = list[i];
			int index = i;
			for(int j = i;j < list.length;j++)
			{
				if(list[j].compareTo(temp) == -1)
				{
					temp = list[j];
					index = j;
				}
			}
			list[index] = list[i];
			list[i] = temp;
		}
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList();
	}
	
	/**
	 * Method to print the list in specified order
	 * @param list The list to sort
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
