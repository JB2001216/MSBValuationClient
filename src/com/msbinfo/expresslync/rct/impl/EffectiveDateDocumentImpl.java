/*
 * An XML document type.
 * Localname: EffectiveDate
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.EffectiveDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one EffectiveDate(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class EffectiveDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.EffectiveDateDocument
{
    
    public EffectiveDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EFFECTIVEDATE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "EffectiveDate");
    
    
    /**
     * Gets the "EffectiveDate" element
     */
    public java.util.Calendar getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EffectiveDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EffectiveDate" element
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$0);
            }
            target.setCalendarValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "EffectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlDate effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(EFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(EFFECTIVEDATE$0);
            }
            target.set(effectiveDate);
        }
    }
}
