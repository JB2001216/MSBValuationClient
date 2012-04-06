/*
 * An XML document type.
 * Localname: RenewalDate
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.RenewalDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one RenewalDate(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class RenewalDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.RenewalDateDocument
{
    
    public RenewalDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEWALDATE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RenewalDate");
    
    
    /**
     * Gets the "RenewalDate" element
     */
    public java.util.Calendar getRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenewalDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RENEWALDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenewalDate" element
     */
    public void setRenewalDate(java.util.Calendar renewalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENEWALDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENEWALDATE$0);
            }
            target.setCalendarValue(renewalDate);
        }
    }
    
    /**
     * Sets (as xml) the "RenewalDate" element
     */
    public void xsetRenewalDate(org.apache.xmlbeans.XmlDate renewalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RENEWALDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(RENEWALDATE$0);
            }
            target.set(renewalDate);
        }
    }
}
