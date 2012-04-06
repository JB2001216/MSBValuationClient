/*
 * XML Type:  FloorToFloorHeight
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML FloorToFloorHeight(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class FloorToFloorHeightImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight
{
    
    public FloorToFloorHeightImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERCENTAGE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Percentage");
    private static final javax.xml.namespace.QName HEIGHT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Height");
    
    
    /**
     * Gets the "Percentage" element
     */
    public int getPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Percentage" element
     */
    public org.apache.xmlbeans.XmlInt xgetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERCENTAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Percentage" element
     */
    public void setPercentage(int percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTAGE$0);
            }
            target.setIntValue(percentage);
        }
    }
    
    /**
     * Sets (as xml) the "Percentage" element
     */
    public void xsetPercentage(org.apache.xmlbeans.XmlInt percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PERCENTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PERCENTAGE$0);
            }
            target.set(percentage);
        }
    }
    
    /**
     * Gets the "Height" element
     */
    public java.math.BigDecimal getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Height" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(HEIGHT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Height" element
     */
    public void setHeight(java.math.BigDecimal height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEIGHT$2);
            }
            target.setBigDecimalValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "Height" element
     */
    public void xsetHeight(org.apache.xmlbeans.XmlDecimal height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(HEIGHT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(HEIGHT$2);
            }
            target.set(height);
        }
    }
}
