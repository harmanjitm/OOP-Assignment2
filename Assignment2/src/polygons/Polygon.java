package polygons;

public abstract class Polygon implements Comparable<Polygon>
{
	
	private double	height;
	private char 	compareType;
	
	
	public Polygon(double height, char compareType)
	{
		this.height 		= height;
		this.compareType 	= compareType;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public char getCompareType() {
		return compareType;
	}
	
	public void setCompareType(char compareType) {
		this.compareType = compareType;
	}
	
	public abstract double calcBaseArea();
	
	public abstract double calcVolume();
	
	@Override
	public int compareTo(Polygon p)
	{
		int returnValue = 0;
		if(p.getCompareType() == 'h')
		{
			if(this.height < p.height)
			{
				returnValue = -1;
			}
			if(this.height == p.height)
			{
				returnValue = 0;
			}
			if(this.height > p.height)
			{
				returnValue = 1;
			}
		}
		else if(p.getCompareType() == 'v')
		{
			if(this.calcVolume() < p.calcVolume())
			{
				returnValue = -1;
			}
			if(this.calcVolume() == p.calcVolume())
			{
				returnValue = 0;
			}
			if(this.calcVolume() > p.calcVolume())
			{
				returnValue = 1;
			}
		}
		else if(p.getCompareType() == 'a')
		{
			if(this.calcBaseArea() < p.calcBaseArea())
			{
				returnValue = -1;
			}
			if(this.calcBaseArea() == p.calcBaseArea())
			{
				returnValue = 0;
			}
			if(this.calcBaseArea() > p.calcBaseArea())
			{
				returnValue = 1;
			}
		}
		return returnValue;
	}
	
	@Override
	public String toString() {
		String returnVal = "";
		if(this.compareType == 'h')
		{
			returnVal = String.valueOf(getHeight());
		}
		if(this.compareType == 'v')
		{
			returnVal = String.valueOf(calcVolume());
		}
		if(this.compareType == 'a')
		{
			returnVal = String.valueOf(calcBaseArea());
		}
		return returnVal;
	}
}
