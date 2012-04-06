/*
 * An XML document type.
 * Localname: GetValuationHistoryPolicyNumber
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetValuationHistoryPolicyNumberDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetValuationHistoryPolicyNumber(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetValuationHistoryPolicyNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetValuationHistoryPolicyNumberDocument
{
    
    public GetValuationHistoryPolicyNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALUATIONHISTORYPOLICYNUMBER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetValuationHistoryPolicyNumber");
    
    
    /**
     * Gets the "GetValuationHistoryPolicyNumber" element
     */
    public java.lang.String getGetValuationHistoryPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GetValuationHistoryPolicyNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetGetValuationHistoryPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GetValuationHistoryPolicyNumber" element
     */
    public void setGetValuationHistoryPolicyNumber(java.lang.String getValuationHistoryPolicyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0);
            }
            target.setStringValue(getValuationHistoryPolicyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "GetValuationHistoryPolicyNumber" element
     */
    public void xsetGetValuationHistoryPolicyNumber(org.apache.xmlbeans.XmlString getValuationHistoryPolicyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETVALUATIONHISTORYPOLICYNUMBER$0);
            }
            target.set(getValuationHistoryPolicyNumber);
        }
    }
}
