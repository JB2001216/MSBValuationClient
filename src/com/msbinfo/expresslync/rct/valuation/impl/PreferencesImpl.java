/*
 * XML Type:  Preferences
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Preferences
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Preferences(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class PreferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Preferences
{
    
    public PreferencesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCAVATIONFLAG$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ExcavationFlag");
    
    
    /**
     * Gets the "ExcavationFlag" element
     */
    public boolean getExcavationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExcavationFlag" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExcavationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ExcavationFlag" element
     */
    public boolean isNilExcavationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ExcavationFlag" element
     */
    public void setExcavationFlag(boolean excavationFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCAVATIONFLAG$0);
            }
            target.setBooleanValue(excavationFlag);
        }
    }
    
    /**
     * Sets (as xml) the "ExcavationFlag" element
     */
    public void xsetExcavationFlag(org.apache.xmlbeans.XmlBoolean excavationFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXCAVATIONFLAG$0);
            }
            target.set(excavationFlag);
        }
    }
    
    /**
     * Nils the "ExcavationFlag" element
     */
    public void setNilExcavationFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXCAVATIONFLAG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXCAVATIONFLAG$0);
            }
            target.setNil();
        }
    }
}
