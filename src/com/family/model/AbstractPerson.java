package com.family.model;

/**
 * AbstractPerson entity provides the base persistence definition of the Person
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private Integer personid;
	private String name;
	private String age;
	private String nature;
	private String password;
	private String phone;
	private Integer family;

	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** full constructor */
	public AbstractPerson(String name, String age, String nature,
			String password, String phone, Integer family) {
		this.name = name;
		this.age = age;
		this.nature = nature;
		this.password = password;
		this.phone = phone;
		this.family = family;
	}

	// Property accessors

	public Integer getPersonid() {
		return this.personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getFamily() {
		return this.family;
	}

	public void setFamily(Integer family) {
		this.family = family;
	}

}