package co.edureka.modelNew;

public class Address {

	Integer aid;
	public Integer getAid() {
		return aid;
	}

	public Address() {
		
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	String Adrsline;
	String city;
	String state;
	Integer zipcode;
	
	User user; // Has - a relationship :  one to one

	@Override
	public String toString() {
		return "Address [Adrsline=" + Adrsline + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", user=" + user + "]";
	}

	public String getAdrsline() {
		return Adrsline;
	}

	public void setAdrsline(String adrsline) {
		Adrsline = adrsline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address(Integer aid,String adrsline, String city, String state, Integer zipcode, User user) {
		super();
		this.aid=aid;
		Adrsline = adrsline;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.user = user;
	}
}
