package com.learning.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by arif on 8/11/2017.
 */
@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "designation")
    private String designation;

    @XmlElement(name = "contact")
    private Contact contact;

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "personal")
    private Personal personal;

    @XmlElement(name = "joining_date")
    private String joiningDate;

    @XmlElement(name = "salary")
    private int salary;
}
