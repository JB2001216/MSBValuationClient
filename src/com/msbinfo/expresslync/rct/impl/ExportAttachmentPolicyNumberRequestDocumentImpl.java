/*
 * An XML document type.
 * Localname: ExportAttachmentPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ExportAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ExportAttachmentPolicyNumberRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument
{
    
    public ExportAttachmentPolicyNumberRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPORTATTACHMENTPOLICYNUMBERREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ExportAttachmentPolicyNumberRequest");
    
    
    /**
     * Gets the "ExportAttachmentPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest getExportAttachmentPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest)get_store().find_element_user(EXPORTATTACHMENTPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExportAttachmentPolicyNumberRequest" element
     */
    public void setExportAttachmentPolicyNumberRequest(com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest exportAttachmentPolicyNumberRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest)get_store().find_element_user(EXPORTATTACHMENTPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest)get_store().add_element_user(EXPORTATTACHMENTPOLICYNUMBERREQUEST$0);
            }
            target.set(exportAttachmentPolicyNumberRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ExportAttachmentPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest addNewExportAttachmentPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest)get_store().add_element_user(EXPORTATTACHMENTPOLICYNUMBERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ExportAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ExportAttachmentPolicyNumberRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberRequestDocument.ExportAttachmentPolicyNumberRequest
    {
        
        public ExportAttachmentPolicyNumberRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POLICYNUMBER$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PolicyNumber");
        private static final javax.xml.namespace.QName FILEID$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "FileId");
        
        
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
