package utility;

import polygons.Polygon;

/**
 * Class to perform the MergeSort on a specified list
 * @author 758243
 *
 */
public class MergeSort
{
	private Polygon[] list;
	private Polygon[] temp;
	
	/**
	 * Method to call other methods to perform the MergeSort
	 * @param list The list to sort
	 */
	public MergeSort(Polygon[] list)
	{
		this.list = list;
		temp = new Polygon[list.length];
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Merge Sort\n", list[0].getCompareType());
		doMergeSort();
	}
	
	/**
	 * Method to perform the Merge Sort on a specified list
	 * @param list The list to sort
	 */
	private void doMergeSort()
	{
		System.out.println("List size: " + list.length);
		Long startTime = System.currentTimeMillis();
		sort(0, list.length-1);
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList();
	}
	
	/**
	 * The method to split the List into multiple arrays
	 * @param list The list to split
	 * @param l The beginning of the list
	 * @param r The end of the list
	 */
	private void sort(int l, int r)
	{
		if(l>=r)
		{
			return;
		}
		
		int middle = (l+r)/2;
		sort(l, middle);
		sort(middle+1, r);
		mergeArray(l, middle, r);
	}
	
	/**
	 * Method to merge the array in sorted order
	 * @param list The list to merge
	 * @param left The left value of the list
	 * @param middle The middle value of the list
	 * @param right The right value of the list
	 * @return The sorted list to return
	 */
	private void mergeArray(int left, int middle, int right)
	{
		for(int i=left;i<=right;i++)
		{
			temp[i] = list[i];
		}
		
		int i = left;
		int j = middle + 1;
		int k = left;
		
		while((i<=middle) && (j<=right))
		{
			if(temp[i].compareTo(temp[j]) == -1 || temp[i].compareTo(temp[j]) == 0)
			{
				list[k] = temp[i];
				i++;
			}
			else
			{
				list[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle)
		{
			list[k] = temp[i];
			i++;
			k++;
		}
		
		while(j <= right)
		{
			list[k] = temp[j];
			j++;
			k++;
		}
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
