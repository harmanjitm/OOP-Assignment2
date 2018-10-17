package utility;

import java.util.ArrayList;

import polygons.Polygon;

/**
 * Class to perform the MergeSort on a specified list
 * @author 758243
 *
 */
public class MergeSort
{
	private ArrayList<Polygon> sortedList;
	
	/**
	 * Method to call other methods to perform the MergeSort
	 * @param list The list to sort
	 */
	public MergeSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Merge Sort\n", list.get(0).getCompareType());
		doMergeSort(list);
	}
	
	/**
	 * Method to perform the Merge Sort on a specified list
	 * @param list The list to sort
	 */
	private void doMergeSort(ArrayList<Polygon> list)
	{
		System.out.println("List size: " + list.size());
		Long startTime = System.currentTimeMillis();
		sort(list, 0, list.size());
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(sortedList);
	}
	
	/**
	 * The method to split the List into multiple arrays
	 * @param list The list to split
	 * @param l The beginning of the list
	 * @param r The end of the list
	 */
	private void sort(ArrayList<Polygon> list, int l, int r)
	{
		if(l==0)
		{
			
		}
		else
		{
			if(l<r)
			{
				int middle = (l+r)/2;
				System.out.println("Middle: " + middle);
				sort(list, l, middle);
				sort(list, middle+1, r);
				mergeArray(list, l, middle, r);
			}
		}
		this.sortedList = list;
	}
	
	/**
	 * Method to merge the array in sorted order
	 * @param list The list to merge
	 * @param left The left value of the list
	 * @param middle The middle value of the list
	 * @param right The right value of the list
	 * @return The sorted list to return
	 */
	private ArrayList<Polygon> mergeArray(ArrayList<Polygon> list, int left, int middle, int right)
	{
		ArrayList<Polygon> lList = new ArrayList<>();
		ArrayList<Polygon> rList = new ArrayList<>();
		
		int lSize = middle - left;
		int rSize = right - middle;
		
		for(int i=0;i<lSize;++i)
		{
			lList.add(list.get(left + i));
		}
		for(int i=0;i<rSize;++i)
		{
			rList.add(list.get(middle + 1 + i));
		}
		
		System.out.println("rSize: " + rSize + "\nlSize: " + lSize);
		int i = 0;
		int j = 0;
		
		int k = left;
		while(i < lSize && j < rSize)
		{
			if(lList.get(i).compareTo(rList.get(j)) == -1 || lList.get(i).compareTo(rList.get(j)) == 0)
			{
				list.set(k, lList.get(i));
				i++;
			}
			else
			{
				list.set(k, rList.get(j));
				j++;
			}
			k++;
		}
		System.out.println("i: " + i + "\nj: " + j + "\nk: " + k);
		while(i<lSize)
		{
			list.set(k, lList.get(i));
			i++;
			k++;
		}
		
		while(j<rSize)
		{
			list.set(k, rList.get(i));//TODO fix this
			i++;
			k++;
		}
		return list;
	}
	
	/**
	 * Method to print the list in specified format
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
