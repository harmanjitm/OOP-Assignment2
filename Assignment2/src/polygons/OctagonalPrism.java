package polygons;

public class OctagonalPrism extends Prism{
	
	private double height;
	private double length;
	
	public OctagonalPrism(double height, char compareType, double length)
	{
		super(height, compareType, length);
		this.height = height;
		this.length = length;
	}

	@Override
	public double calcBaseArea()
	{
		return 2*(1+Math.sqrt(2) * (Math.pow(length, 2)));
	}

	@Override
	public double calcVolume()
	{
		return calcBaseArea()*height;
	}

}
