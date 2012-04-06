/*
 * An XML document type.
 * Localname: NewPolicyNumber
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.NewPolicyNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one NewPolicyNumber(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class NewPolicyNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.NewPolicyNumberDocument
{
    
    public NewPolicyNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWPOLICYNUMBER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "NewPolicyNumber");
    
    
    /**
     * Gets the "NewPolicyNumber" element
     */
    public java.lang.String getNewPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWPOLICYNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewPolicyNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetNewPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWPOLICYNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NewPolicyNumber" element
     */
    public void setNewPolicyNumber(java.lang.String newPolicyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWPOLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWPOLICYNUMBER$0);
            }
            target.setStringValue(newPolicyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "NewPolicyNumber" element
     */
    public void xsetNewPolicyNumber(org.apache.xmlbeans.XmlString newPolicyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWPOLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWPOLICYNUMBER$0);
            }
            target.set(newPolicyNumber);
        }
    }
}
