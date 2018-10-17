package utility;

import java.util.ArrayList;

import polygons.Polygon;

public class SortList
{
	public SortList()
	{
		
	}
	
	public SortList(ArrayList<Polygon> list, char sortType, char compareType)
	{
		switch(sortType)
		{
		case 'b':
			new BubbleSort(list);
			break;
		case 's':
			new SelectionSort(list);
			break;
		case 'i':
			new InsertionSort(list);
			break;
		case 'm':
			new MergeSort(list);
			break;
		case 'q':
			new QuickSort(list);
			break;
		case 'z':
			new ImplementedSort(list);
			break;
		}
	}
	
}
