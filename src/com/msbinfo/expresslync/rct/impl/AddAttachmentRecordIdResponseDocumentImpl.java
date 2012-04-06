/*
 * An XML document type.
 * Localname: AddAttachmentRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AddAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AddAttachmentRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument
{
    
    public AddAttachmentRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTRECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AddAttachmentRecordIdResponse");
    
    
    /**
     * Gets the "AddAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse getAddAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse)get_store().find_element_user(ADDATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachmentRecordIdResponse" element
     */
    public void setAddAttachmentRecordIdResponse(com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse addAttachmentRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse)get_store().find_element_user(ADDATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse)get_store().add_element_user(ADDATTACHMENTRECORDIDRESPONSE$0);
            }
            target.set(addAttachmentRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AddAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse addNewAddAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse)get_store().add_element_user(ADDATTACHMENTRECORDIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class AddAttachmentRecordIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentRecordIdResponseDocument.AddAttachmentRecordIdResponse
    {
        
        public AddAttachmentRecordIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENTINFO$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "AttachmentInfo");
        
        
        /**
         * Gets the "AttachmentInfo" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AttachmentInfo" element
         */
        public boolean isSetAttachmentInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENTINFO$0) != 0;
            }
        }
        
        /**
         * Sets the "AttachmentInfo" element
         */
        public void setAttachmentInfo(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFO$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(ATTACHMENTINFO$0);
                }
                target.set(attachmentInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "AttachmentInfo" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType addNewAttachmentInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(ATTACHMENTINFO$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AttachmentInfo" element
         */
        public void unsetAttachmentInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENTINFO$0, 0);
            }
        }
    }
}
