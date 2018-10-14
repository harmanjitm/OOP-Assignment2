package polygons;

public class PentagonalPrism extends Prism{
	
	private double height;
	private double length;
	
	public PentagonalPrism(double height, char compareType, double length)
	{
		super(height, compareType, length);
		this.height = height;
		this.length = length;
	}

	@Override
	public double calcBaseArea()
	{
		return (5*Math.pow(length, 2)*Math.tan(54))/4;
	}

	@Override
	public double calcVolume()
	{
		return calcBaseArea() * height;
	}
}
