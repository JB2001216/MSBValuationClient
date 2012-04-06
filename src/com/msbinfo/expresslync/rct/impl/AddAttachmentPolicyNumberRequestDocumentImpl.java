/*
 * An XML document type.
 * Localname: AddAttachmentPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AddAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AddAttachmentPolicyNumberRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument
{
    
    public AddAttachmentPolicyNumberRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDATTACHMENTPOLICYNUMBERREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AddAttachmentPolicyNumberRequest");
    
    
    /**
     * Gets the "AddAttachmentPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest getAddAttachmentPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest)get_store().find_element_user(ADDATTACHMENTPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddAttachmentPolicyNumberRequest" element
     */
    public void setAddAttachmentPolicyNumberRequest(com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest addAttachmentPolicyNumberRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest)get_store().find_element_user(ADDATTACHMENTPOLICYNUMBERREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest)get_store().add_element_user(ADDATTACHMENTPOLICYNUMBERREQUEST$0);
            }
            target.set(addAttachmentPolicyNumberRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AddAttachmentPolicyNumberRequest" element
     */
    public com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest addNewAddAttachmentPolicyNumberRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest target = null;
            target = (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest)get_store().add_element_user(ADDATTACHMENTPOLICYNUMBERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AddAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class AddAttachmentPolicyNumberRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest
    {
        
        public AddAttachmentPolicyNumberRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POLICYNUMBER$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PolicyNumber");
        private static final javax.xml.namespace.QName ATTACHMENT$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Attachment");
        
        
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
         * Gets the "Attachment" element
         */
        public com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$2, 0);
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
                return get_store().count_elements(ATTACHMENT$2) != 0;
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
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$2, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$2);
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
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$2);
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
                get_store().remove_element(ATTACHMENT$2, 0);
            }
        }
    }
}
