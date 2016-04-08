package com.family.model;

import java.sql.Timestamp;

/**
 * AbstractCircle entity provides the base persistence definition of the Circle
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCircle implements java.io.Serializable {

	// Fields

	private Integer circleid;
	private Integer author;
	private Timestamp date;
	private String message;

	// Constructors

	/** default constructor */
	public AbstractCircle() {
	}

	/** full constructor */
	public AbstractCircle(Integer author, Timestamp date, String message) {
		this.author = author;
		this.date = date;
		this.message = message;
	}

	// Property accessors

	public Integer getCircleid() {
		return this.circleid;
	}

	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}

	public Integer getAuthor() {
		return this.author;
	}

	public void setAuthor(Integer author) {
		this.author = author;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}