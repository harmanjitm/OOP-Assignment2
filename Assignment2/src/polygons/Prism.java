package polygons;

public abstract class Prism extends Polygon{
	
	private double length;
	
	public Prism(double height, char compareType, double length)
	{
		super(height, compareType);
		this.length = length;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}
}
