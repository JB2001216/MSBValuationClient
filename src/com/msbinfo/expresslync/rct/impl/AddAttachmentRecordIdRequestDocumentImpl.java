/*
 * An XML document type.
 * Localname: AddAttachmentRecordIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AddAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AddAttachmentRecordIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument
{
    
    public AddAttachmentRecordIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTRECORDIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AddAttachmentRecordIdRequest");
    
    
    /**
     * Gets the "AddAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest getAddAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest)get_store().find_element_user(ADDATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachmentRecordIdRequest" element
     */
    public void setAddAttachmentRecordIdRequest(com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest addAttachmentRecordIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest)get_store().find_element_user(ADDATTACHMENTRECORDIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest)get_store().add_element_user(ADDATTACHMENTRECORDIDREQUEST$0);
            }
            target.set(addAttachmentRecordIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AddAttachmentRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest addNewAddAttachmentRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest)get_store().add_element_user(ADDATTACHMENTRECORDIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AddAttachmentRecordIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class AddAttachmentRecordIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentRecordIdRequestDocument.AddAttachmentRecordIdRequest
    {
        
        public AddAttachmentRecordIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RecordId");
        private static final javax.xml.namespace.QName ATTACHMENT$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Attachment");
        
        
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
         * Gets the "Attachment" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Attachment" element
         */
        public boolean isSetAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "Attachment" element
         */
        public void setAttachment(com.msbinfo.expresslync.rct.valuation.AttachmentType attachment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$2, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$2);
                }
                target.set(attachment);
            }
        }
        
        /**
         * Appends and returns a new empty "Attachment" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentType addNewAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Attachment" element
         */
        public void unsetAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENT$2, 0);
            }
        }
    }
}
