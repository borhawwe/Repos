
public class Property{

	
	private String PropertyName;
	private String City;
	private double RentalAmount;
	private String Owner;
	private Plot plot;  
	
	
	public Property()
	{
		PropertyName="No property name";
		City="No City";
		RentalAmount=0.00;
		Owner= "No owner name";
		plot=new Plot();
	}
	
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		PropertyName=propertyName;
		City=city;
		RentalAmount=rentAmount;
		Owner=owner;
		plot=new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		PropertyName=propertyName;
		City=city;
		RentalAmount=rentAmount;
		Owner=owner;
		plot=new Plot(x,y,width,depth);
	}
	
	public Property(Property otherProperty)
	{
		PropertyName=otherProperty.PropertyName;
		City=otherProperty.City;
		RentalAmount=otherProperty.RentalAmount;
		Owner=otherProperty.Owner;
		plot=new Plot(otherProperty.plot);

	}
	
	public String getPropertyName()
	{
		return PropertyName;
		 
	}
	
	public String getCity()
	{
		return City;
		 
	}
	
	public double getRentAmount()
	{
		return RentalAmount;
		 
	}
	
	public String getOwner()
	{
		return Owner;
		 
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	//Mutator
	
//	public void setPropertyName(String pn)
//	{		
//		PropertyName=pn;
//	}
//	
//
//	public void setCity(String c)
//	{		
//		City=c;
//	}
//	
//	public void setRentalAmount(double r)
//	{		
//		RentalAmount=r;
//	}
//
//	public void setOwner(String o)
//	{		
//		Owner=o;
//	}
//	
//	public void setPlot(Plot p)
//	{
//		plot=p;
//	}
	
	
	@Override
	public String toString()
	{
		return PropertyName + "," + City + "," + Owner + "," + RentalAmount;
	}
}
