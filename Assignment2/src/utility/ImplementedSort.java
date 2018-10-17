package utility;

import java.util.ArrayList;

import polygons.Polygon;

/**
 * Class to perform a sort based on specific type
 * @author 758243
 *
 */
public class ImplementedSort
{
	/**
	 * Method to call other methods to do the sort
	 * @param list The list to sort
	 */
	public ImplementedSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Heap Sort\n", list.get(0).getCompareType());
		doImplementedSort(list);
	}
	
	/**
	 * Method to do the sort and return values to a list
	 * @param list The list to sort
	 */
	private void doImplementedSort(ArrayList<Polygon> list)
	{
		//Chosen Sort: Heap Sort
		Long startTime = System.currentTimeMillis();
		
		int listSize = list.size();
		
		for(int i = listSize/2-1; i>=0;i--)
		{
			heapList(list, listSize-1, i);
		}
		
		for(int i=listSize-1; i>=0; i--)
		{
			Polygon temp = list.get(0);
			list.set(0, list.get(i));
			list.set(i, temp);
			heapList(list, i, 0);
		}
		
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(list);
	}
	
	/**
	 * Method to sort the list using heap algorithm
	 * @param list The list to sort
	 * @param n The size of the list
	 * @param i The specific value to compare
	 */
	private void heapList(ArrayList<Polygon> list, int n, int i)
	{
		Polygon largest = list.get(i);
		Polygon left = list.get(2*i+1);
		Polygon right = list.get(2*i+2);
		
		System.out.println("Number: " + i + "\nLeft: " + left + "\nRight: " + right);
		
		if(left.compareTo(list.get(n)) == -1 && left.compareTo(largest) == 1)
		{
			largest = left;
		}
		
		if(right.compareTo(list.get(n)) == -1 && right.compareTo(largest) == 1)
		{
			largest = right;
		}
		
		if(largest != list.get(i))
		{
			Polygon temp = list.get(i);
			int oVal = 0;
			list.set(i, largest);
			for(int j=0;j<list.size();j++)
			{
				if(list.get(j) == largest)
				{
					oVal = j;
				}
			}
			list.set(oVal, temp);
			
			heapList(list, n, oVal);
		}
	}
	
	/**
	 * Method to print the values of the list in specified format.
	 * @param list The list to print values from
	 */
	private void printList(ArrayList<Polygon> list)
	{
		System.out.printf("%6s\t Value\n","Index");
		for(int i=0;i<=list.size();i+=1000)
		{
			if(i==0)
			{
				System.out.printf("%5d:\t %s\n",i+1,list.get(i));
			}
			else if(i+1000 > list.size())
			{
				System.out.printf("%5d:\t %s\n",i,list.get(i));
				System.out.printf("%5d:\t %s\n",list.size(),list.get(list.size()-1));
			}
			else
			{
				System.out.printf("%5d:\t %s\n",i,list.get(i));
			}
		}
	}
}
