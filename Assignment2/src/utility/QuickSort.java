package utility;

import polygons.Polygon;

/**
 * Class to perform the QuickSort on a specified list
 * @author 758243
 *
 */
public class QuickSort
{
	private Polygon[] list;
	
	/**
	 * Method to call other methods to perform QuickSort on a specified list
	 * @param list The list to sort
	 */
	public QuickSort(Polygon[] list)
	{
		this.list = list;
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Quick Sort\n", list[0].getCompareType());
		doQuickSort();
	}
	
	/**
	 * Method to do the Quick Sort on a list and print out the total time taken.
	 * @param list The list to sort
	 */
	private void doQuickSort()
	{
		Long startTime = System.currentTimeMillis();
		sort(0, list.length-1);
		Long stopTime = System.currentTimeMillis();
		printList();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
	}
	
	/**
	 * Method to perform the quickSort recursively by using the pivot point and sorting out the left side of the array and right side
	 * @param low The lowest value of the list
	 * @param high The highest value of the list
	 */
	private void sort(int low, int high)
	{
		if(low >= high)
		{
			return;
		}
		 int pivot = partition(low, high);
		 sort(low, pivot-1);
		 sort(pivot+1, high);
	}
	
	/**
	 * Method to partition the given list and find the pivot point
	 * @param low The lowest value of the list
	 * @param high The highest value of the list
	 * @return Returns the pivot point
	 */
	private int partition(int low, int high)
	{
		int pivot = (low+high)/2;
		int i = low;
		
		swap(pivot, high);
		
		for(int j = low;j<high; j++)
		{
			if(list[j].compareTo(list[high]) == -1 || list[j].compareTo(list[high]) == 0)
			{
				swap(i, j);
				i++;
			}
		}
		swap(i, high);
		return i;
	}
	
	/**
	 * Method to swap the specified values in a list
	 * @param i The initial value to swap with
	 * @param j The value being swapped
	 */
	private void swap(int i, int j)
	{
		Polygon temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	/**
	 * Method to print the list in specified format
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
