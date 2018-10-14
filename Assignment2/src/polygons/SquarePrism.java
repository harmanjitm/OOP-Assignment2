package polygons;

public class SquarePrism extends Prism {
	
	private double height;
	private double length;
	
	public SquarePrism(double height, char compareType, double length)
	{
		super(height, compareType, length);
		this.height = height;
		this.length = length;
	}

	@Override
	public double calcBaseArea()
	{
		return Math.pow(length, 2);
	}

	@Override
	public double calcVolume()
	{
		return Math.pow(length, 2)*height;
	}
	
}
