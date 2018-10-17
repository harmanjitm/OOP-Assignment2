package polygons;

/**
 * Class to create and manage new SquarePrism objects
 * @author 758243
 *
 */
public class SquarePrism extends Prism {
	
	private double height;
	private double length;
	
	/**
	 * Method to create a new SquarePrism object based on given input
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param length The length to set
	 */
	public SquarePrism(double height, char compareType, double length)
	{
		super(height, compareType, length);
		this.height = height;
		this.length = length;
	}

	/**
	 * Method to calculate the baseArea based on given input
	 */
	@Override
	public double calcBaseArea()
	{
		return Math.pow(length, 2);
	}

	/**
	 * Method to calculate the volume based on given input
	 */
	@Override
	public double calcVolume()
	{
		return Math.pow(length, 2)*height;
	}
	
}
