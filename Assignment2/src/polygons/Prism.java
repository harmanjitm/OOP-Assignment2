package polygons;

/**
 * Class to create and manage new Prism objects that are of type Polygon
 * @author 758243
 *
 */
public abstract class Prism extends Polygon{
	
	private double length;
	
	/**
	 * Method to create new Prism objects based on specified values
	 * @param height
	 * @param compareType
	 * @param length
	 */
	public Prism(double height, char compareType, double length)
	{
		super(height, compareType);
		this.length = length;
	}

	/**
	 * Method to get the length of the Prism
	 * @return The length of the prism
	 */
	public double getLength()
	{
		return length;
	}

	/**
	 * Method to set the length of the Prism
	 * @param length The length to set
	 */
	public void setLength(double length)
	{
		this.length = length;
	}
}
