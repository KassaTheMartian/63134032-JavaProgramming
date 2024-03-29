package qlsv.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)

public class Student implements Serializable{
	public static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private byte age;
	private String address;
	private float GPA;
	
	public Student() {
	}

	public Student(int id, String name, byte age, String address, float GPA) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.GPA = GPA;
	}

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

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	};
	
	
	
}
