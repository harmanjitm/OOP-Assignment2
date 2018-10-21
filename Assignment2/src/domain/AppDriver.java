package domain;

import polygons.Polygon;
import utility.LoadDataFile;

/**
 * Method to launch the Sorting application
 * @author 758243
 *
 */
public class AppDriver
{
	public static Polygon[] SortingList;
	
	public static void main(String[] args)
	{	
		if(args.length == 3)
		{
			String arg1 = args[0].toLowerCase();
			String arg2 = args[1].toLowerCase();
			String arg3 = args[2].toLowerCase();
			
			if(arg1.startsWith("-f") && arg2.startsWith("-t") && arg3.startsWith("-s"))
			{
				new LoadDataFile(args[0].substring(2, args[0].length()), arg2.charAt(2) ,arg3.charAt(2));
			}
			else if(arg1.startsWith("-f") && arg2.startsWith("-s") && arg3.startsWith("-t"))
			{
				new LoadDataFile(args[0].substring(2, args[0].length()), arg3.charAt(2) ,arg2.charAt(2));
			}
			else if(arg1.startsWith("-t") && arg2.startsWith("-f") && arg3.startsWith("-s"))
			{
				new LoadDataFile(args[1].substring(2, args[1].length()), arg1.charAt(2) ,arg3.charAt(2));
			}
			else if(arg1.startsWith("-t") && arg2.startsWith("-s") && arg3.startsWith("-f"))
			{
				new LoadDataFile(args[2].substring(2, args[2].length()), arg1.charAt(2) ,arg2.charAt(2));
			}
			else if(arg1.startsWith("-s") && arg2.startsWith("-f") && arg3.startsWith("-t"))
			{
				new LoadDataFile(args[1].substring(2, args[1].length()), arg3.charAt(2) ,arg1.charAt(2));
			}
			else if(arg1.startsWith("-s") && arg2.startsWith("-t") && arg3.startsWith("-f"))
			{
				new LoadDataFile(args[2].substring(2, args[2].length()), arg2.charAt(2) ,arg1.charAt(2));
			}
			else
			{
				System.out.println("Invalid Arguments.");
			}
		}
		else
		{
			System.out.println("Invalid Argument Length.");
		}
	}
}
