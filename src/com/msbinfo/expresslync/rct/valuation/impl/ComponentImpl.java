/*
 * XML Type:  Component
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Component
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Component(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Component
{
    
    public ComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIAL$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Material");
    private static final javax.xml.namespace.QName AMOUNT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Amount");
    
    
    /**
     * Gets the "Material" element
     */
    public java.math.BigInteger getMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Material" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MATERIAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Material" element
     */
    public boolean isSetMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIAL$0) != 0;
        }
    }
    
    /**
     * Sets the "Material" element
     */
    public void setMaterial(java.math.BigInteger material)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATERIAL$0);
            }
            target.setBigIntegerValue(material);
        }
    }
    
    /**
     * Sets (as xml) the "Material" element
     */
    public void xsetMaterial(org.apache.xmlbeans.XmlNonNegativeInteger material)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MATERIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MATERIAL$0);
            }
            target.set(material);
        }
    }
    
    /**
     * Unsets the "Material" element
     */
    public void unsetMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIAL$0, 0);
        }
    }
    
    /**
     * Gets the "Amount" element
     */
    public java.math.BigDecimal getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Amount" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Amount" element
     */
    public void setAmount(java.math.BigDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$2);
            }
            target.setBigDecimalValue(amount);
        }
    }
    
    /**
     * Sets (as xml) the "Amount" element
     */
    public void xsetAmount(org.apache.xmlbeans.XmlDecimal amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(AMOUNT$2);
            }
            target.set(amount);
        }
    }
}
