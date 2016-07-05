package world.domain;

public class City
{
	private int id;
	private String name;
	private String district;
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", district=" + district + ", population=" + population
				+ ", countrycode=" + countrycode + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDistrict()=" + getDistrict() + ", getPopulation()=" + getPopulation() + ", getCountrycode()="
				+ getCountrycode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	private int population;
	private String countrycode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	
	public City() {
		super();
	}

	
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

}
