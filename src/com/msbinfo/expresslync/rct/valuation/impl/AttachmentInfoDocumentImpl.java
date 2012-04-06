/*
 * An XML document type.
 * Localname: AttachmentInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AttachmentInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * A document containing one AttachmentInfo(@http://msbinfo.com/expresslync/rct/valuation) element.
 *
 * This is a complex type.
 */
public class AttachmentInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AttachmentInfoDocument
{
    
    public AttachmentInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
