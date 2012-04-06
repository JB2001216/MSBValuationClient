/*
 * An XML document type.
 * Localname: GetPropertyInfoSourceRecordRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetPropertyInfoSourceRecordRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetPropertyInfoSourceRecordRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument
{
    
    public GetPropertyInfoSourceRecordRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROPERTYINFOSOURCERECORDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetPropertyInfoSourceRecordRequest");
    
    
    /**
     * Gets the "GetPropertyInfoSourceRecordRequest" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest getGetPropertyInfoSourceRecordRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPropertyInfoSourceRecordRequest" element
     */
    public void setGetPropertyInfoSourceRecordRequest(com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest getPropertyInfoSourceRecordRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDREQUEST$0);
            }
            target.set(getPropertyInfoSourceRecordRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPropertyInfoSourceRecordRequest" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest addNewGetPropertyInfoSourceRecordRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetPropertyInfoSourceRecordRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class GetPropertyInfoSourceRecordRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordRequestDocument.GetPropertyInfoSourceRecordRequest
    {
        
        public GetPropertyInfoSourceRecordRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RecordId");
        
        
        /**
         * Gets the "RecordId" element
         */
        public int getRecordId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordId" element
         */
        public org.apache.xmlbeans.XmlInt xgetRecordId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RecordId" element
         */
        public void setRecordId(int recordId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDID$0);
                }
                target.setIntValue(recordId);
            }
        }
        
        /**
         * Sets (as xml) the "RecordId" element
         */
        public void xsetRecordId(org.apache.xmlbeans.XmlInt recordId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECORDID$0);
                }
                target.set(recordId);
            }
        }
    }
}
