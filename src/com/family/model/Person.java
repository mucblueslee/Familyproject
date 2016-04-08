package com.family.model;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */
public class Person extends AbstractPerson implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** full constructor */
	public Person(String name, String age, String nature, String password,
			String phone, Integer family) {
		super(name, age, nature, password, phone, family);
	}

}
