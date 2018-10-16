package utility;

import java.util.ArrayList;

import polygons.Polygon;

public class BubbleSort
{
	
	ArrayList<Polygon> sortedList;
	
	public BubbleSort(ArrayList<Polygon> list, char compareType)
	{
		System.out.printf("Sorting Started\nCompare Type: %c\nSort Type: Bubble Sort\n", list.get(0).getCompareType());
		this.sortedList = doBubbleSort(list);
	}
	
	private ArrayList<Polygon> doBubbleSort(ArrayList<Polygon> list)
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
		Long totalTime = (stopTime-startTime);
		System.out.println("\nTime: " + totalTime + " milliseconds.\n");
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
		return list;
	}
	
	public ArrayList<Polygon> getSortedList()
	{
		return sortedList;
	}
}
