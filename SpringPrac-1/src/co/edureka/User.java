package co.edureka;

public class User {
	
	public Car car;
	
	public User(Car car) {
		super();
		this.car = car;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
