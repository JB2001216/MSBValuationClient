/*
 * An XML document type.
 * Localname: ListAttachmentsVersionIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ListAttachmentsVersionIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ListAttachmentsVersionIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument
{
    
    public ListAttachmentsVersionIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTACHMENTSVERSIONIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ListAttachmentsVersionIdResponse");
    
    
    /**
     * Gets the "ListAttachmentsVersionIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse getListAttachmentsVersionIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse)get_store().find_element_user(LISTATTACHMENTSVERSIONIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttachmentsVersionIdResponse" element
     */
    public void setListAttachmentsVersionIdResponse(com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse listAttachmentsVersionIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse)get_store().find_element_user(LISTATTACHMENTSVERSIONIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse)get_store().add_element_user(LISTATTACHMENTSVERSIONIDRESPONSE$0);
            }
            target.set(listAttachmentsVersionIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttachmentsVersionIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse addNewListAttachmentsVersionIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse)get_store().add_element_user(LISTATTACHMENTSVERSIONIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListAttachmentsVersionIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ListAttachmentsVersionIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsVersionIdResponseDocument.ListAttachmentsVersionIdResponse
    {
        
        public ListAttachmentsVersionIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ATTACHMENTINFO$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "AttachmentInfo");
        
        
        /**
         * Gets array of all "AttachmentInfo" elements
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] getAttachmentInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ATTACHMENTINFO$0, targetList);
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] result = new com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AttachmentInfo" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AttachmentInfo" element
         */
        public int sizeOfAttachmentInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTACHMENTINFO$0);
            }
        }
        
        /**
         * Sets array of all "AttachmentInfo" element
         */
        public void setAttachmentInfoArray(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] attachmentInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attachmentInfoArray, ATTACHMENTINFO$0);
            }
        }
        
        /**
         * Sets ith "AttachmentInfo" element
         */
        public void setAttachmentInfoArray(int i, com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attachmentInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AttachmentInfo" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType insertNewAttachmentInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().insert_element_user(ATTACHMENTINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AttachmentInfo" element
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
         * Removes the ith "AttachmentInfo" element
         */
        public void removeAttachmentInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTACHMENTINFO$0, i);
            }
        }
    }
}
