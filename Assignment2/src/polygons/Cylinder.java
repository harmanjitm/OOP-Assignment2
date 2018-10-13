package polygons;

public class Cylinder extends Polygon {
	
	private double radius;
	private double height;

	public Cylinder(double height, char compareType, double radius) {
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
		return Math.PI * (Math.pow(radius, 2)) * height;
	}
	
}
