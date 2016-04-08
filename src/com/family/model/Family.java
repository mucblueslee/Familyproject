package com.family.model;

/**
 * Family entity. @author MyEclipse Persistence Tools
 */
public class Family extends AbstractFamily implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Family() {
	}

	/** full constructor */
	public Family(String familyname, String address, String familyphone) {
		super(familyname, address, familyphone);
	}

}
