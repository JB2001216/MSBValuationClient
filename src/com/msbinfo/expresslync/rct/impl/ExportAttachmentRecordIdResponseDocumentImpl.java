/*
 * An XML document type.
 * Localname: ExportAttachmentRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ExportAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ExportAttachmentRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument
{
    
    public ExportAttachmentRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPORTATTACHMENTRECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ExportAttachmentRecordIdResponse");
    
    
    /**
     * Gets the "ExportAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse getExportAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse)get_store().find_element_user(EXPORTATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExportAttachmentRecordIdResponse" element
     */
    public void setExportAttachmentRecordIdResponse(com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse exportAttachmentRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse)get_store().find_element_user(EXPORTATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse)get_store().add_element_user(EXPORTATTACHMENTRECORDIDRESPONSE$0);
            }
            target.set(exportAttachmentRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ExportAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse addNewExportAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse)get_store().add_element_user(EXPORTATTACHMENTRECORDIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ExportAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ExportAttachmentRecordIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentRecordIdResponseDocument.ExportAttachmentRecordIdResponse
    {
        
        public ExportAttachmentRecordIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENT$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Attachment");
        
        
        /**
         * Gets the "Attachment" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
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
                return get_store().count_elements(ATTACHMENT$0) != 0;
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
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
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
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
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
                get_store().remove_element(ATTACHMENT$0, 0);
            }
        }
    }
}
