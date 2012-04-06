/*
 * An XML document type.
 * Localname: ListAttachmentsPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ListAttachmentsPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ListAttachmentsPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument
{
    
    public ListAttachmentsPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTACHMENTSPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ListAttachmentsPolicyNumberResponse");
    
    
    /**
     * Gets the "ListAttachmentsPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse getListAttachmentsPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse)get_store().find_element_user(LISTATTACHMENTSPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttachmentsPolicyNumberResponse" element
     */
    public void setListAttachmentsPolicyNumberResponse(com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse listAttachmentsPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse)get_store().find_element_user(LISTATTACHMENTSPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse)get_store().add_element_user(LISTATTACHMENTSPOLICYNUMBERRESPONSE$0);
            }
            target.set(listAttachmentsPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttachmentsPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse addNewListAttachmentsPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse target = null;
            target = (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse)get_store().add_element_user(LISTATTACHMENTSPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListAttachmentsPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ListAttachmentsPolicyNumberResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse
    {
        
        public ListAttachmentsPolicyNumberResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
