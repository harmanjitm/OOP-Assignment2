package polygons;

/**
 * Class to create and manage new TriangularPrism Objects
 * @author 758243
 *
 */
public class TriangularPrism extends Prism {
	
	private double height;
	private double length;
	
	/**
	 * Method to create a new TriangularPrism object based on given input
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param length the length to set
	 */
	public TriangularPrism(double height, char compareType, double length)
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
		return ((Math.pow(length, 2)) * (Math.sqrt(3)))/4;
	}

	/**
	 * Method to calculate the volume based on given input
	 */
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * height;
	}

}
