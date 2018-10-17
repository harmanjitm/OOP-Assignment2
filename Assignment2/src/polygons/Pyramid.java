package polygons;

/**
 * Class to create and manage new Pyramid objects
 * @author 758243
 *
 */
public class Pyramid extends Polygon {
	
	private double side;
	private double height;
	
	/**
	 * Method to create a new Pyramid object based on given input
	 * @param height The height to set
	 * @param compareType The compareType to set
	 * @param side The side to set
	 */
	public Pyramid(double height, char compareType, double side) {
		super(height, compareType);
		this.side = side;
		this.height = height;
	}
	
	/**
	 * Method to calculate the baseArea based on given input
	 */
	@Override
	public double calcBaseArea() {
		return Math.pow(side, 2);
	}
	
	/**
	 * Method to calculate the volume based on given input
	 */
	@Override
	public double calcVolume() {
		return (1/2) * Math.pow(side, 2) * height;
	}	
}
