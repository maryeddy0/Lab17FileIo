import java.util.LinkedList;

public class Country {

	private String name;
	private double population;

	
	public Country(String name, double population) {
		super();
		this.name = name;
		this.population = population;
	}

	
	public Country() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return getName() + ", " + getPopulation()+ " million";
	}

	
	
	
}
