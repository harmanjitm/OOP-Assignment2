package polygons;

/**
 * Class to create a new OctagonalPrism
 * @author 758243
 *
 */
public class OctagonalPrism extends Prism{
	
	private double height;
	private double length;
	
	/**
	 * Method to create a new OctagonalPrism object using specified values
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param length The length to set
	 */
	public OctagonalPrism(double height, char compareType, double length)
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
		return 2*(1+Math.sqrt(2) * (Math.pow(length, 2)));
	}
	
	/**
	 * Method to calculate the volume based on given inputs
	 */
	@Override
	public double calcVolume()
	{
		return calcBaseArea()*height;
	}

}
