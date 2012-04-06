/*
 * An XML document type.
 * Localname: UpdateAttachmentInfoPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one UpdateAttachmentInfoPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class UpdateAttachmentInfoPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument
{
    
    public UpdateAttachmentInfoPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEATTACHMENTINFOPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "UpdateAttachmentInfoPolicyNumberResponse");
    
    
    /**
     * Gets the "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse getUpdateAttachmentInfoPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse)get_store().find_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    public void setUpdateAttachmentInfoPolicyNumberResponse(com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse updateAttachmentInfoPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse)get_store().find_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse)get_store().add_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERRESPONSE$0);
            }
            target.set(updateAttachmentInfoPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse addNewUpdateAttachmentInfoPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse)get_store().add_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateAttachmentInfoPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class UpdateAttachmentInfoPolicyNumberResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse
    {
        
        public UpdateAttachmentInfoPolicyNumberResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
