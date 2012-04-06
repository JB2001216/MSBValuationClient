/*
 * An XML document type.
 * Localname: Attachment
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * A document containing one Attachment(@http://msbinfo.com/expresslync/rct/valuation) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AttachmentDocument
{
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Attachment");
    
    
    /**
     * Gets the "Attachment" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
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
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
}
