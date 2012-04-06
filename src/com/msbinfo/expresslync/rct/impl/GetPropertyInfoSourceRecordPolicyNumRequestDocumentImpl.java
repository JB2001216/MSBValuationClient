/*
 * An XML document type.
 * Localname: GetPropertyInfoSourceRecordPolicyNumRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetPropertyInfoSourceRecordPolicyNumRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetPropertyInfoSourceRecordPolicyNumRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument
{
    
    public GetPropertyInfoSourceRecordPolicyNumRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROPERTYINFOSOURCERECORDPOLICYNUMREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetPropertyInfoSourceRecordPolicyNumRequest");
    
    
    /**
     * Gets the "GetPropertyInfoSourceRecordPolicyNumRequest" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest getGetPropertyInfoSourceRecordPolicyNumRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPropertyInfoSourceRecordPolicyNumRequest" element
     */
    public void setGetPropertyInfoSourceRecordPolicyNumRequest(com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest getPropertyInfoSourceRecordPolicyNumRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMREQUEST$0);
            }
            target.set(getPropertyInfoSourceRecordPolicyNumRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPropertyInfoSourceRecordPolicyNumRequest" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest addNewGetPropertyInfoSourceRecordPolicyNumRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetPropertyInfoSourceRecordPolicyNumRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class GetPropertyInfoSourceRecordPolicyNumRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumRequestDocument.GetPropertyInfoSourceRecordPolicyNumRequest
    {
        
        public GetPropertyInfoSourceRecordPolicyNumRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "PolicyNumber" element
         */
        public boolean isSetPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLICYNUMBER$0) != 0;
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
        
        /**
         * Unsets the "PolicyNumber" element
         */
        public void unsetPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLICYNUMBER$0, 0);
            }
        }
    }
}
