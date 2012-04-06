/*
 * An XML document type.
 * Localname: ExportAttachmentRecordIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ExportAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ExportAttachmentRecordIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument
{
    
    public ExportAttachmentRecordIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPORTATTACHMENTRECORDIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ExportAttachmentRecordIdRequest");
    
    
    /**
     * Gets the "ExportAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest getExportAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest)get_store().find_element_user(EXPORTATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExportAttachmentRecordIdRequest" element
     */
    public void setExportAttachmentRecordIdRequest(com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest exportAttachmentRecordIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest)get_store().find_element_user(EXPORTATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest)get_store().add_element_user(EXPORTATTACHMENTRECORDIDREQUEST$0);
            }
            target.set(exportAttachmentRecordIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ExportAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest addNewExportAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest)get_store().add_element_user(EXPORTATTACHMENTRECORDIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ExportAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ExportAttachmentRecordIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentRecordIdRequestDocument.ExportAttachmentRecordIdRequest
    {
        
        public ExportAttachmentRecordIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
