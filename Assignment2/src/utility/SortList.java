package utility;

import polygons.Polygon;

/**
 * Class used to manage different Sorting types and calls appropriate other Classes depending on user compareType
 * @author 758243
 *
 */
public class SortList
{
	/**
	 * Method to decide which sort to occur based on user input
	 * @param list The list to sort
	 * @param sortType The sortType to perform
	 * @param compareType The compareType to compare against
	 */
	public SortList(Polygon[] list, char sortType, char compareType)
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
