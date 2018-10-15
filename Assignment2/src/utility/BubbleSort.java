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
	
	@SuppressWarnings("resource")
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
		Long totalTime = stopTime-startTime;
		System.out.println("Time: " + totalTime);
		for(int i=list.size()-20;i<list.size();i++)
		{
			System.out.println(list.get(i).calcBaseArea());
		}
		return list;
	}
	
	public ArrayList<Polygon> getSortedList()
	{
		return sortedList;
	}
}
