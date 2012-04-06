/*
 * An XML document type.
 * Localname: DeleteAttachmentRecordIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one DeleteAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentRecordIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument
{
    
    public DeleteAttachmentRecordIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENTRECORDIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "DeleteAttachmentRecordIdRequest");
    
    
    /**
     * Gets the "DeleteAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest getDeleteAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest)get_store().find_element_user(DELETEATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAttachmentRecordIdRequest" element
     */
    public void setDeleteAttachmentRecordIdRequest(com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest deleteAttachmentRecordIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest)get_store().find_element_user(DELETEATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest)get_store().add_element_user(DELETEATTACHMENTRECORDIDREQUEST$0);
            }
            target.set(deleteAttachmentRecordIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest addNewDeleteAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest)get_store().add_element_user(DELETEATTACHMENTRECORDIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML DeleteAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentRecordIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdRequestDocument.DeleteAttachmentRecordIdRequest
    {
        
        public DeleteAttachmentRecordIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RecordId");
        private static final javax.xml.namespace.QName FILEID$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "FileId");
        
        
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
        
        /**
         * Gets the "FileId" element
         */
        public int getFileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "FileId" element
         */
        public org.apache.xmlbeans.XmlInt xgetFileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FileId" element
         */
        public void setFileId(int fileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEID$2);
                }
                target.setIntValue(fileId);
            }
        }
        
        /**
         * Sets (as xml) the "FileId" element
         */
        public void xsetFileId(org.apache.xmlbeans.XmlInt fileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILEID$2);
                }
                target.set(fileId);
            }
        }
    }
}
