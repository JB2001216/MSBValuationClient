/*
 * An XML document type.
 * Localname: DeleteAttachmentRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one DeleteAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class DeleteAttachmentRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument
{
    
    public DeleteAttachmentRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEATTACHMENTRECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "DeleteAttachmentRecordIdResponse");
    
    
    /**
     * Gets the "DeleteAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse getDeleteAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse)get_store().find_element_user(DELETEATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAttachmentRecordIdResponse" element
     */
    public void setDeleteAttachmentRecordIdResponse(com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse deleteAttachmentRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse)get_store().find_element_user(DELETEATTACHMENTRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse)get_store().add_element_user(DELETEATTACHMENTRECORDIDRESPONSE$0);
            }
            target.set(deleteAttachmentRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteAttachmentRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse addNewDeleteAttachmentRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse)get_store().add_element_user(DELETEATTACHMENTRECORDIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteAttachmentRecordIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class DeleteAttachmentRecordIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.DeleteAttachmentRecordIdResponseDocument.DeleteAttachmentRecordIdResponse
    {
        
        public DeleteAttachmentRecordIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
