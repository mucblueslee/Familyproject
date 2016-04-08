package com.baby.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Dingdan entity. @author MyEclipse Persistence Tools
 */

public class Dingdan  implements java.io.Serializable {


    // Fields    

     private Integer dingdanId;
     private Integer person;
     private Set persons = new HashSet(0);


    // Constructors

    /** default constructor */
    public Dingdan() {
    }

	/** minimal constructor */
    public Dingdan(Integer person) {
        this.person = person;
    }
    
    /** full constructor */
    public Dingdan(Integer person, Set persons) {
        this.person = person;
        this.persons = persons;
    }

   
    // Property accessors

    public Integer getDingdanId() {
        return this.dingdanId;
    }
    
    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }

    public Integer getPerson() {
        return this.person;
    }
    
    public void setPerson(Integer person) {
        this.person = person;
    }

    public Set getPersons() {
        return this.persons;
    }
    
    public void setPersons(Set persons) {
        this.persons = persons;
    }
   








}