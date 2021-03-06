/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.03.04 at 01:18:28 PM CST
//

package com.dell.isg.smi.commons.elm.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Pages complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Pages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previous" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="next" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pages", propOrder = { "current", "previous", "next", "total" })
public class Pages {

    protected long current;
    protected long previous;
    protected long next;
    protected long total;


    /**
     * Gets the value of the current property.
     *
     */
    public long getCurrent() {
        return current;
    }


    /**
     * Sets the value of the current property.
     *
     */
    public void setCurrent(long value) {
        this.current = value;
    }


    /**
     * Gets the value of the previous property.
     *
     */
    public long getPrevious() {
        return previous;
    }


    /**
     * Sets the value of the previous property.
     *
     */
    public void setPrevious(long value) {
        this.previous = value;
    }


    /**
     * Gets the value of the next property.
     *
     */
    public long getNext() {
        return next;
    }


    /**
     * Sets the value of the next property.
     *
     */
    public void setNext(long value) {
        this.next = value;
    }


    /**
     * Gets the value of the total property.
     *
     */
    public long getTotal() {
        return total;
    }


    /**
     * Sets the value of the total property.
     *
     */
    public void setTotal(long value) {
        this.total = value;
    }

}
