/*
 * An XML document type.
 * Localname: UpdateAttachmentInfoPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one UpdateAttachmentInfoPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class UpdateAttachmentInfoPolicyNumberRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument
{
    
    public UpdateAttachmentInfoPolicyNumberRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEATTACHMENTINFOPOLICYNUMBERREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "UpdateAttachmentInfoPolicyNumberRequest");
    
    
    /**
     * Gets the "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest getUpdateAttachmentInfoPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest)get_store().find_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    public void setUpdateAttachmentInfoPolicyNumberRequest(com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest updateAttachmentInfoPolicyNumberRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest)get_store().find_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest)get_store().add_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERREQUEST$0);
            }
            target.set(updateAttachmentInfoPolicyNumberRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest addNewUpdateAttachmentInfoPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest)get_store().add_element_user(UPDATEATTACHMENTINFOPOLICYNUMBERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateAttachmentInfoPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class UpdateAttachmentInfoPolicyNumberRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest
    {
        
        public UpdateAttachmentInfoPolicyNumberRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POLICYNUMBER$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PolicyNumber");
        private static final javax.xml.namespace.QName FILEID$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "FileId");
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "Title");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "Description");
        
        
        /**
         * Gets the "PolicyNumber" element
         */
        public java.lang.String getPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PolicyNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "PolicyNumber" element
         */
        public boolean isSetPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLICYNUMBER$0) != 0;
            }
        }
        
        /**
         * Sets the "PolicyNumber" element
         */
        public void setPolicyNumber(java.lang.String policyNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYNUMBER$0);
                }
                target.setStringValue(policyNumber);
            }
        }
        
        /**
         * Sets (as xml) the "PolicyNumber" element
         */
        public void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLICYNUMBER$0);
                }
                target.set(policyNumber);
            }
        }
        
        /**
         * Unsets the "PolicyNumber" element
         */
        public void unsetPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLICYNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "FileId" element
         */
        public int getFileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "FileId" element
         */
        public org.apache.xmlbeans.XmlInt xgetFileId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FileId" element
         */
        public void setFileId(int fileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEID$2);
                }
                target.setIntValue(fileId);
            }
        }
        
        /**
         * Sets (as xml) the "FileId" element
         */
        public void xsetFileId(org.apache.xmlbeans.XmlInt fileId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILEID$2);
                }
                target.set(fileId);
            }
        }
        
        /**
         * Gets the "Title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "Title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$4) != 0;
            }
        }
        
        /**
         * Sets the "Title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$4);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "Title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$4);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "Title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$4, 0);
            }
        }
        
        /**
         * Gets the "Description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "Description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$6) != 0;
            }
        }
        
        /**
         * Sets the "Description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "Description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "Description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$6, 0);
            }
        }
    }
}
