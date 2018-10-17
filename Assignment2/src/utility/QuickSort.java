package utility;

import java.util.ArrayList;

import polygons.Polygon;

/**
 * Class to perform the QuickSort on a specified list
 * @author 758243
 *
 */
public class QuickSort
{
	/**
	 * Method to call other methods to perform QuickSort on a specified list
	 * @param list The list to sort
	 */
	public QuickSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Quick Sort\n", list.get(0).getCompareType());
		doQuickSort(list);
	}
	
	/**
	 * Method to do the Quick Sort on a list and print out the total time taken.
	 * @param list The list to sort
	 */
	private void doQuickSort(ArrayList<Polygon> list)
	{
		Long startTime = System.currentTimeMillis();
		
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(list);
	}
	
	/**
	 * Method to print out the given list in a specified format
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
