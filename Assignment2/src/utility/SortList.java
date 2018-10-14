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
			new BubbleSort(list, compareType);
			break;
		case 's':
			//TODO
			break;
		case 'i':
			//TODO
			break;
		case 'm':
			//TODO
			break;
		case 'q':
			//TODO
			break;
		case 'z':
			//TODO
			break;
		}
	}
	
}
