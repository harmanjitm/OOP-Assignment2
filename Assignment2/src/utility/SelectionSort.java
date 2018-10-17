package utility;

import java.util.ArrayList;

import polygons.Polygon;

public class SelectionSort
{
	
	public SelectionSort(ArrayList<Polygon> list)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Selection Sort\n", list.get(0).getCompareType());
		doSelectionSort(list);
	}
	
	private void doSelectionSort(ArrayList<Polygon> list)
	{
		Long startTime = System.currentTimeMillis();
		for(int i = 0;i<list.size();i++)
		{
			Polygon temp = list.get(i);
			int index = i;
			for(int j = i;j < list.size();j++)
			{
				if(list.get(j).compareTo(temp) == -1)
				{
					temp = list.get(j);
					index = j;
				}
			}
			list.set(index, list.get(i));
			list.set(i, temp);
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
