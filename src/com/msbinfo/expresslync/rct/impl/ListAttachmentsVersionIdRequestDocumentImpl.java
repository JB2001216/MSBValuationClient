/*
 * An XML document type.
 * Localname: ListAttachmentsVersionIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ListAttachmentsVersionIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ListAttachmentsVersionIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument
{
    
    public ListAttachmentsVersionIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTACHMENTSVERSIONIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ListAttachmentsVersionIdRequest");
    
    
    /**
     * Gets the "ListAttachmentsVersionIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest getListAttachmentsVersionIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest)get_store().find_element_user(LISTATTACHMENTSVERSIONIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttachmentsVersionIdRequest" element
     */
    public void setListAttachmentsVersionIdRequest(com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest listAttachmentsVersionIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest)get_store().find_element_user(LISTATTACHMENTSVERSIONIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest)get_store().add_element_user(LISTATTACHMENTSVERSIONIDREQUEST$0);
            }
            target.set(listAttachmentsVersionIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttachmentsVersionIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest addNewListAttachmentsVersionIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest)get_store().add_element_user(LISTATTACHMENTSVERSIONIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListAttachmentsVersionIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ListAttachmentsVersionIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsVersionIdRequestDocument.ListAttachmentsVersionIdRequest
    {
        
        public ListAttachmentsVersionIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VERSIONID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "VersionId");
        
        
        /**
         * Gets the "VersionId" element
         */
        public int getVersionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "VersionId" element
         */
        public org.apache.xmlbeans.XmlInt xgetVersionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "VersionId" element
         */
        public void setVersionId(int versionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONID$0);
                }
                target.setIntValue(versionId);
            }
        }
        
        /**
         * Sets (as xml) the "VersionId" element
         */
        public void xsetVersionId(org.apache.xmlbeans.XmlInt versionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERSIONID$0);
                }
                target.set(versionId);
            }
        }
    }
}
