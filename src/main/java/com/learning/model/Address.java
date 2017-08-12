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
public class Address {
    @XmlElement(name = "house_no")
    private int houseNo;

    @XmlElement(name = "road_no")
    private int roadNo;

    @XmlElement(name = "city")
    private String city;

    @XmlElement(name = "postcode")
    private int postCode;

    @XmlElement(name = "country")
    private String country;

    @XmlElement(name = "country_code")
    private String countryCode;
}
