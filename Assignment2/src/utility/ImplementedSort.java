package utility;

import polygons.Polygon;

/**
 * Class to perform a sort based on specific type
 * @author 758243
 *
 */
public class ImplementedSort
{
	private Polygon[] list;
	/**
	 * Method to call other methods to do the sort
	 * @param list The list to sort
	 */
	public ImplementedSort(Polygon[] list)
	{
		this.list = list;
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Heap Sort\n", list[0].getCompareType());
		doImplementedSort();
	}
	
	/**
	 * Method to do the sort and return values to a list
	 * @param list The list to sort
	 */
	private void doImplementedSort()
	{
		//Chosen Sort: Heap Sort
		Long startTime = System.currentTimeMillis();
		
		int listSize = list.length;
		
		for(int i = listSize/2-1; i>=0;i--)
		{
			heapList(listSize, i);
		}
		
		for(int i=listSize-1; i>=0; i--)
		{
			Polygon temp = list[0];
			list[0] = list[i];
			list[i] = temp;
			heapList(i, 0);
		}
		
		Long stopTime = System.currentTimeMillis();
		printList();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
	}
	
	/**
	 * Method to sort the list using heap algorithm
	 * @param list The list to sort
	 * @param n The size of the list
	 * @param i The specific value to compare
	 */
	private void heapList(int n, int i)
	{
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left < n && list[left].compareTo(list[largest]) == 1)
		{
			largest = left;
		}
		
		if(right < n && list[right].compareTo(list[largest]) == 1)
		{
			largest = right;
		}
		
		if(largest != i)
		{
			Polygon temp = list[i];
			list[i] = list[largest];
			list[largest] = temp;
			heapList(n, largest);
		}
	}
	
	/**
	 * Method to print the values of the list in specified format.
	 * @param list The list to print values from
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
