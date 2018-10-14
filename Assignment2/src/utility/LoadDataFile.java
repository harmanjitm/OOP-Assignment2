package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.AppDriver;
import polygons.Cone;
import polygons.Cylinder;
import polygons.OctagonalPrism;
import polygons.PentagonalPrism;
import polygons.Pyramid;
import polygons.SquarePrism;
import polygons.TriangularPrism;

public class LoadDataFile
{
	public LoadDataFile()
	{
		
	}
	
	public LoadDataFile(String file, char compareType, char sortType)
	{
		if(checkCompareType(compareType) == true && checkSortType(sortType) == true)
		{
			System.out.println("Error: Invalid compare or sort type.");
		}
		else
		{
			System.out.printf("\nFile: %s\nCompare Type: %c\nSort Type: %c\n\n", file, compareType, sortType);
			createObjects(file, compareType);
			new SortList(AppDriver.list, sortType, compareType);
		}
	}
	
	public boolean checkCompareType(char compareType)
	{
		boolean returnVal = true;
		if(compareType != 'v' || compareType != 'h' || compareType != 'a')
		{
			returnVal = false;
		}
		return returnVal;
	}
	
	public boolean checkSortType(char sortType)
	{
		boolean returnVal = true;
		if(sortType != 'b' || sortType != 's' || sortType != 'i' || sortType != 'm' || sortType != 'q' || sortType != 'z')
		{
			returnVal = false;
		}
		return returnVal;
	}
	
	public void createObjects(String file, char compareType)
	{
		try
		{
			Scanner inFile = new Scanner(new File(file));
			String[] fields = inFile.nextLine().split(" ");
			Long totalObjects = Long.parseLong(fields[0]);
			
			System.out.println("Total Objects: " + totalObjects);
			
			for(int i=0; i<fields.length;i+=3)
			{
				if(i!=0)
				{
					switch (fields[i-2])
					{
					case "Cylinder":
						Cylinder cyl = new Cylinder(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(cyl);
						break;
					case "Cone":
						Cone cone = new Cone(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(cone);
						break;
					case "Pyramid":
						Pyramid pyr = new Pyramid(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(pyr);
						break;
					case "PentagonalPrism":
						PentagonalPrism penPrism = new PentagonalPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(penPrism);
						break;
					case "OctagonalPrism":
						OctagonalPrism octPrism = new OctagonalPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(octPrism);
						break;
					case "TriangularPrism":
						TriangularPrism triPrism = new TriangularPrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(triPrism);
						break;
					case "SquarePrism":
						SquarePrism squarePrism = new SquarePrism(Double.parseDouble(fields[i-1]), compareType, Double.parseDouble(fields[i]));
						AppDriver.list.add(squarePrism);
						break;
					default:
						System.out.println("Error: " + fields[i-2] + " shape not found.");
						break;
					}
				}
			}
			System.out.println(AppDriver.list.size() + " Objects Created.");
			inFile.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found");
		}
	}
}
