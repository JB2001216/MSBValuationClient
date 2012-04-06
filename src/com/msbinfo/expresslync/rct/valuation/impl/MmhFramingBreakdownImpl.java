/*
 * XML Type:  MmhFramingBreakdown
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MmhFramingBreakdown(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MmhFramingBreakdownImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown
{
    
    public MmhFramingBreakdownImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName PERCENT$2 = 
        new javax.xml.namespace.QName("", "Percent");
    
    
    /**
     * Gets the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.MmhFramingType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.msbinfo.expresslync.rct.valuation.MmhFramingType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(com.msbinfo.expresslync.rct.valuation.MmhFramingType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MmhFramingType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "Percent" attribute
     */
    public short getPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Percent" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetPercent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PERCENT$2);
            return target;
        }
    }
    
    /**
     * Sets the "Percent" attribute
     */
    public void setPercent(short percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERCENT$2);
            }
            target.setShortValue(percent);
        }
    }
    
    /**
     * Sets (as xml) the "Percent" attribute
     */
    public void xsetPercent(org.apache.xmlbeans.XmlUnsignedByte percent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PERCENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PERCENT$2);
            }
            target.set(percent);
        }
    }
}
