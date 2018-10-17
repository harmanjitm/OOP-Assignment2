package polygons;

/**
 * Class to create and manage new PentagonalPrism objects
 * @author 758243
 *
 */
public class PentagonalPrism extends Prism{
	
	private double height;
	private double length;
	
	/**
	 * Method to create a new PentagonalPrism object based on specified values
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param length The length to set
	 */
	public PentagonalPrism(double height, char compareType, double length)
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
		return (5*Math.pow(length, 2)*Math.tan(54))/4;
	}

	/**
	 * Method to calculate the Volume based on given input
	 */
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * height;
	}
}
