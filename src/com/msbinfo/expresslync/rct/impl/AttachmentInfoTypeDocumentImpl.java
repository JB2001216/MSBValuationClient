/*
 * An XML document type.
 * Localname: AttachmentInfoType
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AttachmentInfoTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one AttachmentInfoType(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class AttachmentInfoTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.AttachmentInfoTypeDocument
{
    
    public AttachmentInfoTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTINFOTYPE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AttachmentInfoType");
    
    
    /**
     * Gets the "AttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AttachmentInfoType" element
     */
    public boolean isNilAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttachmentInfoType" element
     */
    public void setAttachmentInfoType(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(ATTACHMENTINFOTYPE$0);
            }
            target.set(attachmentInfoType);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType addNewAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(ATTACHMENTINFOTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AttachmentInfoType" element
     */
    public void setNilAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(ATTACHMENTINFOTYPE$0);
            }
            target.setNil();
        }
    }
}
