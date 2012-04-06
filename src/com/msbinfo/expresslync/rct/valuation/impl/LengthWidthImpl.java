/*
 * XML Type:  LengthWidth
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.LengthWidth
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML LengthWidth(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class LengthWidthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.LengthWidth
{
    
    public LengthWidthImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTH$0 = 
        new javax.xml.namespace.QName("", "Length");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("", "Width");
    
    
    /**
     * Gets the "Length" attribute
     */
    public java.math.BigDecimal getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Length" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LENGTH$0);
            return target;
        }
    }
    
    /**
     * Sets the "Length" attribute
     */
    public void setLength(java.math.BigDecimal length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$0);
            }
            target.setBigDecimalValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "Length" attribute
     */
    public void xsetLength(org.apache.xmlbeans.XmlDecimal length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(LENGTH$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(LENGTH$0);
            }
            target.set(length);
        }
    }
    
    /**
     * Gets the "Width" attribute
     */
    public java.math.BigDecimal getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Width" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * Sets the "Width" attribute
     */
    public void setWidth(java.math.BigDecimal width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$2);
            }
            target.setBigDecimalValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "Width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlDecimal width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(WIDTH$2);
            }
            target.set(width);
        }
    }
}
