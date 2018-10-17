package utility;

import java.util.ArrayList;

import polygons.Polygon;

public class MergeSort
{
	private ArrayList<Polygon> sortedList;
	
	public MergeSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Merge Sort\n", list.get(0).getCompareType());
		doMergeSort(list);
	}
	
	private void doMergeSort(ArrayList<Polygon> list)
	{
		Long startTime = System.currentTimeMillis();
		sort(list, 0, list.size()-1);
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(sortedList);
	}
	
	private void sort(ArrayList<Polygon> list, int l, int r)
	{
		if(l<r)
		{
			int middle = (l+r)/2;
			sort(list, l, middle);
			sort(list, middle+1, r);
			mergeArray(list, l, middle, r);
		}
		this.sortedList = list;
	}
	
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
