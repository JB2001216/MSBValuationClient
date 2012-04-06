/*
 * XML Type:  BasementInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.BasementInfo
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML BasementInfo(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class BasementInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.BasementInfo
{
    
    public BasementInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName PERCENTFINISHED$2 = 
        new javax.xml.namespace.QName("", "PercentFinished");
    private static final javax.xml.namespace.QName FINISHTYPE$4 = 
        new javax.xml.namespace.QName("", "FinishType");
    
    
    /**
     * Gets the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.BasementType.Enum getType()
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
            return (com.msbinfo.expresslync.rct.valuation.BasementType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.BasementType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.msbinfo.expresslync.rct.valuation.BasementType.Enum type)
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
    public void xsetType(com.msbinfo.expresslync.rct.valuation.BasementType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BasementType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "PercentFinished" attribute
     */
    public short getPercentFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENTFINISHED$2);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "PercentFinished" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetPercentFinished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PERCENTFINISHED$2);
            return target;
        }
    }
    
    /**
     * Sets the "PercentFinished" attribute
     */
    public void setPercentFinished(short percentFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERCENTFINISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERCENTFINISHED$2);
            }
            target.setShortValue(percentFinished);
        }
    }
    
    /**
     * Sets (as xml) the "PercentFinished" attribute
     */
    public void xsetPercentFinished(org.apache.xmlbeans.XmlUnsignedByte percentFinished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(PERCENTFINISHED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(PERCENTFINISHED$2);
            }
            target.set(percentFinished);
        }
    }
    
    /**
     * Gets the "FinishType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.BasementFinishType.Enum getFinishType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINISHTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.BasementFinishType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FinishType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.BasementFinishType xgetFinishType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementFinishType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementFinishType)get_store().find_attribute_user(FINISHTYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "FinishType" attribute
     */
    public void setFinishType(com.msbinfo.expresslync.rct.valuation.BasementFinishType.Enum finishType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINISHTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINISHTYPE$4);
            }
            target.setEnumValue(finishType);
        }
    }
    
    /**
     * Sets (as xml) the "FinishType" attribute
     */
    public void xsetFinishType(com.msbinfo.expresslync.rct.valuation.BasementFinishType finishType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementFinishType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementFinishType)get_store().find_attribute_user(FINISHTYPE$4);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BasementFinishType)get_store().add_attribute_user(FINISHTYPE$4);
            }
            target.set(finishType);
        }
    }
}
