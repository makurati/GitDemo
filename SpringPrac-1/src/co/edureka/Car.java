package co.edureka;

public class Car {

	@Override
	public String toString() {
		return "Car [name=" + name + ", cost=" + cost + "]";
	}
	
	public Car(){}
	
	public Car(String name, Integer cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	String name;
	Integer cost;
	
	
}
