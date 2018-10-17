package utility;

import java.util.ArrayList;

import polygons.Polygon;

/**
 * Class to perform bubble sort algorithm on a specified list
 * @author 758243
 *
 */
public class BubbleSort
{
	/**
	 * Method to call other methods to perform a bubble sort operation
	 * @param list The list to sort
	 */
	public BubbleSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Bubble Sort\n", list.get(0).getCompareType());
		doBubbleSort(list);
	}
	
	/**
	 * Method to sort and return the list using Bubble Sort Algorithm
	 * @param list The list to sort
	 */
	private void doBubbleSort(ArrayList<Polygon> list)
	{
		Polygon temp;
		Long startTime = System.currentTimeMillis();
		
		for(int i = 0; i<list.size() - 1;i++)
		{
			for(int x = 0;x<list.size() - 1 - i;x++)
			{
				if(list.get(x).compareTo(list.get(x+1)) == 1)
				{
					temp = list.get(x);
					list.set(x, list.get(x+1));
					list.set(x+1, temp);
				}
			}
		}
		
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(list);
	}
	
	/**
	 * Method to print the specified list in a specified format
	 * @param list The list to print
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
