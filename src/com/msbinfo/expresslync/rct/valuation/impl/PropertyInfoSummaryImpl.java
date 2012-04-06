/*
 * XML Type:  PropertyInfoSummary
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML PropertyInfoSummary(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class PropertyInfoSummaryImpl extends com.msbinfo.expresslync.rct.valuation.impl.AddressImpl implements com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary
{
    
    public PropertyInfoSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyId");
    
    
    /**
     * Gets the "PropertyId" element
     */
    public int getPropertyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropertyId" element
     */
    public org.apache.xmlbeans.XmlInt xgetPropertyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropertyId" element
     */
    public void setPropertyId(int propertyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYID$0);
            }
            target.setIntValue(propertyId);
        }
    }
    
    /**
     * Sets (as xml) the "PropertyId" element
     */
    public void xsetPropertyId(org.apache.xmlbeans.XmlInt propertyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROPERTYID$0);
            }
            target.set(propertyId);
        }
    }
}
