/*
 * An XML document type.
 * Localname: AttachmentType
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AttachmentTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AttachmentType(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AttachmentTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AttachmentTypeDocument
{
    
    public AttachmentTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTTYPE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AttachmentType");
    
    
    /**
     * Gets the "AttachmentType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttachmentType" element
     */
    public boolean isNilAttachmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENTTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttachmentType" element
     */
    public void setAttachmentType(com.msbinfo.expresslync.rct.valuation.AttachmentType attachmentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENTTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENTTYPE$0);
            }
            target.set(attachmentType);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentType addNewAttachmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENTTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttachmentType" element
     */
    public void setNilAttachmentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENTTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENTTYPE$0);
            }
            target.setNil();
        }
    }
}
