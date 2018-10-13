package polygons;

public class Pyramid extends Polygon {
	
	private double side;
	private double height;

	public Pyramid(double height, char compareType, double side) {
		super(height, compareType);
		this.side = side;
		this.height = height;
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double calcVolume() {
		return (1/2) * Math.pow(side, 2) * height;
	}	
}
