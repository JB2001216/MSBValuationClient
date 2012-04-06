/*
 * An XML document type.
 * Localname: AddAttachmentPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AddAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AddAttachmentPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument
{
    
    public AddAttachmentPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AddAttachmentPolicyNumberResponse");
    
    
    /**
     * Gets the "AddAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse getAddAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse)get_store().find_element_user(ADDATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachmentPolicyNumberResponse" element
     */
    public void setAddAttachmentPolicyNumberResponse(com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse addAttachmentPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse)get_store().find_element_user(ADDATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse)get_store().add_element_user(ADDATTACHMENTPOLICYNUMBERRESPONSE$0);
            }
            target.set(addAttachmentPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AddAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse addNewAddAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse)get_store().add_element_user(ADDATTACHMENTPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class AddAttachmentPolicyNumberResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberResponseDocument.AddAttachmentPolicyNumberResponse
    {
        
        public AddAttachmentPolicyNumberResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
