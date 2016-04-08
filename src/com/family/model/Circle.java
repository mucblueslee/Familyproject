package com.family.model;

import java.sql.Timestamp;

/**
 * Circle entity. @author MyEclipse Persistence Tools
 */
public class Circle extends AbstractCircle implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Circle() {
	}

	/** full constructor */
	public Circle(Integer author, Timestamp date, String message) {
		super(author, date, message);
	}

}
