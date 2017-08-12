package com.learning.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by arif on 8/11/2017.
 */
@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {
    @XmlElement(name = "phone")
    List<Phone> phoneList;
}
