package polygons;

public class Cone extends Polygon{
	
	private double radius;
	private double height;
	
	public Cone(double height, char compareType, double radius) {
		super(height, compareType);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public double calcVolume() {
		return (1/2) * Math.PI * (Math.pow(radius, 2)) * height;
	}

}
