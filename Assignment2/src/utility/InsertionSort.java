package utility;

import java.util.ArrayList;

import polygons.Polygon;

public class InsertionSort
{
	public InsertionSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Insertion Sort\n", list.get(0).getCompareType());
		doInsertionSort(list);
	}
	
	private void doInsertionSort(ArrayList<Polygon> list)
	{	
		Long startTime = System.currentTimeMillis();
		for(int i=1;i<list.size();i++)
		{
			Polygon p = list.get(i);
			int j = i-1;
			while(j>=0 && list.get(j).compareTo(p) == 1)
			{
				list.set(j+1, list.get(j));
				j = j-1;
			}
			list.set(j+1, p);
		}
		Long stopTime = System.currentTimeMillis();
		Long totalTime = stopTime-startTime;
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
		printList(list);
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
