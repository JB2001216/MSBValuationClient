/*
 * An XML document type.
 * Localname: ExportAttachmentPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ExportAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ExportAttachmentPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument
{
    
    public ExportAttachmentPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPORTATTACHMENTPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ExportAttachmentPolicyNumberResponse");
    
    
    /**
     * Gets the "ExportAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse getExportAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse)get_store().find_element_user(EXPORTATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExportAttachmentPolicyNumberResponse" element
     */
    public void setExportAttachmentPolicyNumberResponse(com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse exportAttachmentPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse)get_store().find_element_user(EXPORTATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse)get_store().add_element_user(EXPORTATTACHMENTPOLICYNUMBERRESPONSE$0);
            }
            target.set(exportAttachmentPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ExportAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse addNewExportAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse)get_store().add_element_user(EXPORTATTACHMENTPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ExportAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ExportAttachmentPolicyNumberResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ExportAttachmentPolicyNumberResponseDocument.ExportAttachmentPolicyNumberResponse
    {
        
        public ExportAttachmentPolicyNumberResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
