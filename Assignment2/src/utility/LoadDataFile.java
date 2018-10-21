package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.AppDriver;
import polygons.Cone;
import polygons.Cylinder;
import polygons.OctagonalPrism;
import polygons.PentagonalPrism;
import polygons.Polygon;
import polygons.Pyramid;
import polygons.SquarePrism;
import polygons.TriangularPrism;

/**
 * Class to create a new list and read data from file and assign to new objects
 * @author 758243
 *
 */
public class LoadDataFile
{
	/**
	 * Null constructor for loading a file.
	 */
	public LoadDataFile()
	{
		
	}
	
	/**
	 * Constructor to load a file based on specified values
	 * @param file The file to open
	 * @param compareType The compareType to assign to objects
	 * @param sortType The type of sort to perform on the file
	 */
	public LoadDataFile(String file, char compareType, char sortType)
	{
		if(checkCompareType(compareType) == true && checkSortType(sortType) == true)
		{
			System.out.println("Error: Invalid compare or sort type.");
		}
		else
		{
			System.out.println("File: " + file + "\n");
			try
			{
				createObjects(file, compareType);
				new SortList(AppDriver.SortingList, sortType, compareType);
			} catch (FileNotFoundException e)
			{
				System.out.println("Error: File not found");
			}
		}
	}
	
	/**
	 * Method to check the compareType to see if its valid
	 * @param compareType The compareType to check against
	 * @return Return true if compareType is valid and false if its not
	 */
	public boolean checkCompareType(char compareType)
	{
		boolean returnVal = true;
		if(compareType != 'v' || compareType != 'h' || compareType != 'a')
		{
			returnVal = false;
		}
		return returnVal;
	}
	
	/**
	 * Method to check the sortType to see if its valid
	 * @param sortType The sortType to check against
	 * @return Return true if the sortType is valud, false if its not
	 */
	public boolean checkSortType(char sortType)
	{
		boolean returnVal = true;
		if(sortType != 'b' || sortType != 's' || sortType != 'i' || sortType != 'm' || sortType != 'q' || sortType != 'z')
		{
			returnVal = false;
		}
		return returnVal;
	}
	
	/**
	 * Method to open the file and create objects and assign values based on file text
	 * @param file The file to open
	 * @param compareType The compareType to assign to objects
	 * @throws FileNotFoundException Throws a FileNotFoundException if the file type is invalid
	 */
	public void createObjects(String file, char compareType) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new File(file));
		String[] fields = inFile.nextLine().split(" ");
		Long totalObjects = Long.parseLong(fields[0]);
		AppDriver.SortingList = new Polygon[Integer.parseInt(fields[0])];
		
		System.out.println("Total Objects: " + totalObjects);
		int counter = 0;
		for(int i=0; i<fields.length;i+=3)
		{
			if(i!=0)
			{
				switch (fields[i-2])
				{
				case "Cylinder":
					Cylinder cyl = new Cylinder(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = cyl;
					counter++;
					break;
				case "Cone":
					Cone cone = new Cone(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = cone;
					counter++;
					break;
				case "Pyramid":
					Pyramid pyr = new Pyramid(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = pyr;
					counter++;
					break;
				case "PentagonalPrism":
					PentagonalPrism penPrism = new PentagonalPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = penPrism;
					counter++;
					break;
				case "OctagonalPrism":
					OctagonalPrism octPrism = new OctagonalPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = octPrism;
					counter++;
					break;
				case "TriangularPrism":
					TriangularPrism triPrism = new TriangularPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = triPrism;
					counter++;
					break;
				case "SquarePrism":
					SquarePrism squarePrism = new SquarePrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
					AppDriver.SortingList[counter] = squarePrism;
					counter++;
					break;
				default:
					System.out.println("Error: " + fields[i-2] + " shape not found.");
					break;
				}
			}
		}
		System.out.println("Objects Created: " + AppDriver.SortingList.length + "\n");
		inFile.close();
	}
}
