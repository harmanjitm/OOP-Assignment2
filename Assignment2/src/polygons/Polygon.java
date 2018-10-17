package polygons;

/**
 * Class to create and manage new Polygon objects and allow comparison with other objects of the same type for sorting.
 * @author 758243
 *
 */
public abstract class Polygon implements Comparable<Polygon>
{
	
	private double	height;
	private char 	compareType;
	
	/**
	 * Method to create a new Polygon object based on the given values
	 * @param height The height to set
	 * @param compareType The compareType to set
	 */
	public Polygon(double height, char compareType)
	{
		this.height 		= height;
		this.compareType 	= compareType;
	}
	
	/**
	 * Method to get the height of the Polygon
	 * @return The Height of the Polygon
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Method to set the Height of the Polygon
	 * @param height The height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Method to get the compareType of the Polygon
	 * @return The compareType of the Polygon
	 */
	public char getCompareType() {
		return compareType;
	}
	
	/**
	 * Method to set the compareType of the Polygon
	 * @param compareType The compareType to set
	 */
	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}
	
	/**
	 * Method to calculate the baseArea based on given input
	 * @return The calculated baseArea
	 */
	public abstract double calcBaseArea();
	
	/**
	 * Method to calculate the volume based on given input
	 * @return The calculated volume
	 */
	public abstract double calcVolume();
	
	/**
	 * Method to compare one Polygon to another and return a integer value based on compareType
	 */
	@Override
	public int compareTo(Polygon p)
	{
		int returnValue = 0;
		if(p.getCompareType() == 'h')
		{
			if(this.height < p.height)
			{
				returnValue = -1;
			}
			if(this.height == p.height)
			{
				returnValue = 0;
			}
			if(this.height > p.height)
			{
				returnValue = 1;
			}
		}
		else if(p.getCompareType() == 'v')
		{
			if(this.calcVolume() < p.calcVolume())
			{
				returnValue = -1;
			}
			if(this.calcVolume() == p.calcVolume())
			{
				returnValue = 0;
			}
			if(this.calcVolume() > p.calcVolume())
			{
				returnValue = 1;
			}
		}
		else if(p.getCompareType() == 'a')
		{
			if(this.calcBaseArea() < p.calcBaseArea())
			{
				returnValue = -1;
			}
			if(this.calcBaseArea() == p.calcBaseArea())
			{
				returnValue = 0;
			}
			if(this.calcBaseArea() > p.calcBaseArea())
			{
				returnValue = 1;
			}
		}
		return returnValue;
	}
	
	/**
	 * Method to return the value of a specific Polygon object in a specific format.
	 */
	@Override
	public String toString() {
		String returnVal = "";
		if(this.compareType == 'h')
		{
			returnVal = String.valueOf(getHeight());
		}
		if(this.compareType == 'v')
		{
			returnVal = String.valueOf(calcVolume());
		}
		if(this.compareType == 'a')
		{
			returnVal = String.valueOf(calcBaseArea());
		}
		return returnVal;
	}
}
