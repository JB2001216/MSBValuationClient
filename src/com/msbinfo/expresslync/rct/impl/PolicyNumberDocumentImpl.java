/*
 * An XML document type.
 * Localname: PolicyNumber
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.PolicyNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one PolicyNumber(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class PolicyNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.PolicyNumberDocument
{
    
    public PolicyNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLICYNUMBER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PolicyNumber");
    
    
    /**
     * Gets the "PolicyNumber" element
     */
    public java.lang.String getPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PolicyNumber" element
     */
    public void setPolicyNumber(java.lang.String policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYNUMBER$0);
            }
            target.setStringValue(policyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyNumber" element
     */
    public void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLICYNUMBER$0);
            }
            target.set(policyNumber);
        }
    }
}
