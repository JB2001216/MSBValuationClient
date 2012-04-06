/*
 * An XML document type.
 * Localname: ListAttachmentsPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ListAttachmentsPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ListAttachmentsPolicyNumberRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument
{
    
    public ListAttachmentsPolicyNumberRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTACHMENTSPOLICYNUMBERREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ListAttachmentsPolicyNumberRequest");
    
    
    /**
     * Gets the "ListAttachmentsPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest getListAttachmentsPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest)get_store().find_element_user(LISTATTACHMENTSPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttachmentsPolicyNumberRequest" element
     */
    public void setListAttachmentsPolicyNumberRequest(com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest listAttachmentsPolicyNumberRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest)get_store().find_element_user(LISTATTACHMENTSPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest)get_store().add_element_user(LISTATTACHMENTSPOLICYNUMBERREQUEST$0);
            }
            target.set(listAttachmentsPolicyNumberRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttachmentsPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest addNewListAttachmentsPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest)get_store().add_element_user(LISTATTACHMENTSPOLICYNUMBERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListAttachmentsPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ListAttachmentsPolicyNumberRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberRequestDocument.ListAttachmentsPolicyNumberRequest
    {
        
        public ListAttachmentsPolicyNumberRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
