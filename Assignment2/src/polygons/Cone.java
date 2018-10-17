package polygons;

/**
 * Class to create and manage new Cone objects
 * @author 758243
 *
 */
public class Cone extends Polygon{
	
	private double radius;
	private double height;
	
	/**
	 * Method to create a new Cone object based on the given input
	 * @param height
	 * @param compareType
	 * @param radius
	 */
	public Cone(double height, char compareType, double radius) {
		super(height, compareType);
		this.radius = radius;
		this.height = height;
	}
	
	/**
	 * Method to calculate the baseArea based on given input
	 */
	@Override
	public double calcBaseArea() {
		return Math.PI * (Math.pow(radius, 2));
	}
	
	/**
	 * Method to calculate the volume based on given input
	 */
	@Override
	public double calcVolume() {
		return (1/2) * Math.PI * (Math.pow(radius, 2)) * height;
	}

}
