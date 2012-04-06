/*
 * An XML document type.
 * Localname: ListAttachmentsRecordIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ListAttachmentsRecordIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ListAttachmentsRecordIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument
{
    
    public ListAttachmentsRecordIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTACHMENTSRECORDIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ListAttachmentsRecordIdRequest");
    
    
    /**
     * Gets the "ListAttachmentsRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest getListAttachmentsRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest)get_store().find_element_user(LISTATTACHMENTSRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttachmentsRecordIdRequest" element
     */
    public void setListAttachmentsRecordIdRequest(com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest listAttachmentsRecordIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest)get_store().find_element_user(LISTATTACHMENTSRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest)get_store().add_element_user(LISTATTACHMENTSRECORDIDREQUEST$0);
            }
            target.set(listAttachmentsRecordIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttachmentsRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest addNewListAttachmentsRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest)get_store().add_element_user(LISTATTACHMENTSRECORDIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListAttachmentsRecordIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ListAttachmentsRecordIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsRecordIdRequestDocument.ListAttachmentsRecordIdRequest
    {
        
        public ListAttachmentsRecordIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
