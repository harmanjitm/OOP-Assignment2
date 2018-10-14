package polygons;

public class TriangularPrism extends Prism {
	
	private double height;
	private double length;

	public TriangularPrism(double height, char compareType, double length)
	{
		super(height, compareType, length);
		this.height = height;
		this.length = length;
	}

	@Override
	public double calcBaseArea()
	{
		return ((Math.pow(length, 2)) * (Math.sqrt(3)))/4;
	}

	@Override
	public double calcVolume()
	{
		return calcBaseArea() * height;
	}

}
