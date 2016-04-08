package com.baby.model;



/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Dingdan dingdan;
     private String password;


    // Constructors

    /** default constructor */
    public Person() {
    }

    
    /** full constructor */
    public Person(Dingdan dingdan, String password) {
        this.dingdan = dingdan;
        this.password = password;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Dingdan getDingdan() {
        return this.dingdan;
    }
    
    public void setDingdan(Dingdan dingdan) {
        this.dingdan = dingdan;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   








}