package com.family.model;

/**
 * AbstractFamily entity provides the base persistence definition of the Family
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamily implements java.io.Serializable {

	// Fields

	private Integer familyid;
	private String familyname;
	private String address;
	private String familyphone;

	// Constructors

	/** default constructor */
	public AbstractFamily() {
	}

	/** full constructor */
	public AbstractFamily(String familyname, String address, String familyphone) {
		this.familyname = familyname;
		this.address = address;
		this.familyphone = familyphone;
	}

	// Property accessors

	public Integer getFamilyid() {
		return this.familyid;
	}

	public void setFamilyid(Integer familyid) {
		this.familyid = familyid;
	}

	public String getFamilyname() {
		return this.familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFamilyphone() {
		return this.familyphone;
	}

	public void setFamilyphone(String familyphone) {
		this.familyphone = familyphone;
	}

}