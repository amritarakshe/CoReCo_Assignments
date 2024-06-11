package task.com;

public class RadiactiveMaterial {

	public static void main(String[] args) {
		double mass = 200;
		double year = 5.0;
		double halflive = 3;
		
		RemainingMass(mass, halflive);
		TotalYear(year, halflive);

	}
	
	public static void RemainingMass(double m, double hf)
	{
		double reMass = m * Math.pow(0.5, hf);
		System.out.println("Remaining Mass " + reMass + "grams");
	}
	
	public static void TotalYear(double y, double hf)
	{
		double totalYear = hf * y;
		System.out.println("Number of Years Required to Devay Material " + totalYear + "years");
	}

}
