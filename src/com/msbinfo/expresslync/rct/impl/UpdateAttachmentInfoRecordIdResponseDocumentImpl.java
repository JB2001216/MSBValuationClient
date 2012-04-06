/*
 * An XML document type.
 * Localname: UpdateAttachmentInfoRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one UpdateAttachmentInfoRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class UpdateAttachmentInfoRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument
{
    
    public UpdateAttachmentInfoRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEATTACHMENTINFORECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "UpdateAttachmentInfoRecordIdResponse");
    
    
    /**
     * Gets the "UpdateAttachmentInfoRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse getUpdateAttachmentInfoRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse)get_store().find_element_user(UPDATEATTACHMENTINFORECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAttachmentInfoRecordIdResponse" element
     */
    public void setUpdateAttachmentInfoRecordIdResponse(com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse updateAttachmentInfoRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse)get_store().find_element_user(UPDATEATTACHMENTINFORECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse)get_store().add_element_user(UPDATEATTACHMENTINFORECORDIDRESPONSE$0);
            }
            target.set(updateAttachmentInfoRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAttachmentInfoRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse addNewUpdateAttachmentInfoRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse)get_store().add_element_user(UPDATEATTACHMENTINFORECORDIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateAttachmentInfoRecordIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class UpdateAttachmentInfoRecordIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoRecordIdResponseDocument.UpdateAttachmentInfoRecordIdResponse
    {
        
        public UpdateAttachmentInfoRecordIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
