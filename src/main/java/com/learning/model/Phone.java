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
public class Phone {
    @XmlElement(name = "no")
    private PhoneNumber phoneNumber;

    @XmlElement(name = "land_code")
    private String landCode;
}
