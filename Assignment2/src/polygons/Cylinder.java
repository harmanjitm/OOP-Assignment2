package polygons;

/**
 * Class to create and manage new Cylinder objects
 * @author 758243
 *
 */
public class Cylinder extends Polygon {
	
	private double radius;
	private double height;

	/**
	 * Method to create a new Cylinder object based on given values
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param radius The radius to set
	 */
	public Cylinder(double height, char compareType, double radius) {
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
		return Math.PI * (Math.pow(radius, 2)) * height;
	}
	
}
