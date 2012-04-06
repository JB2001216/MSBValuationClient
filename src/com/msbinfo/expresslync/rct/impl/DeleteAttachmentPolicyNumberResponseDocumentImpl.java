/*
 * An XML document type.
 * Localname: DeleteAttachmentPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one DeleteAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument
{
    
    public DeleteAttachmentPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENTPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "DeleteAttachmentPolicyNumberResponse");
    
    
    /**
     * Gets the "DeleteAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse getDeleteAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse)get_store().find_element_user(DELETEATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAttachmentPolicyNumberResponse" element
     */
    public void setDeleteAttachmentPolicyNumberResponse(com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse deleteAttachmentPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse)get_store().find_element_user(DELETEATTACHMENTPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse)get_store().add_element_user(DELETEATTACHMENTPOLICYNUMBERRESPONSE$0);
            }
            target.set(deleteAttachmentPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteAttachmentPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse addNewDeleteAttachmentPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse)get_store().add_element_user(DELETEATTACHMENTPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteAttachmentPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentPolicyNumberResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentPolicyNumberResponseDocument.DeleteAttachmentPolicyNumberResponse
    {
        
        public DeleteAttachmentPolicyNumberResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OK$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "OK");
        
        
        /**
         * Gets the "OK" element
         */
        public boolean getOK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OK$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "OK" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetOK()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OK$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OK" element
         */
        public void setOK(boolean ok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OK$0);
                }
                target.setBooleanValue(ok);
            }
        }
        
        /**
         * Sets (as xml) the "OK" element
         */
        public void xsetOK(org.apache.xmlbeans.XmlBoolean ok)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OK$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OK$0);
                }
                target.set(ok);
            }
        }
    }
}
