package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentHibAnno")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="ROLL")
	Integer roll;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="AGE")
	Integer age;
	
	@Column(name="ADDRESS")
	String address;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(Integer roll, String name, Integer age, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	
	
}
