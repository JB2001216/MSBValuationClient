/*
 * An XML document type.
 * Localname: ArrayOfAttachmentInfoType
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ArrayOfAttachmentInfoType(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ArrayOfAttachmentInfoTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoTypeDocument
{
    
    public ArrayOfAttachmentInfoTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFATTACHMENTINFOTYPE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ArrayOfAttachmentInfoType");
    
    
    /**
     * Gets the "ArrayOfAttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType getArrayOfAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().find_element_user(ARRAYOFATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfAttachmentInfoType" element
     */
    public boolean isNilArrayOfAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().find_element_user(ARRAYOFATTACHMENTINFOTYPE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfAttachmentInfoType" element
     */
    public void setArrayOfAttachmentInfoType(com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType arrayOfAttachmentInfoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().find_element_user(ARRAYOFATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().add_element_user(ARRAYOFATTACHMENTINFOTYPE$0);
            }
            target.set(arrayOfAttachmentInfoType);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfAttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType addNewArrayOfAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().add_element_user(ARRAYOFATTACHMENTINFOTYPE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfAttachmentInfoType" element
     */
    public void setNilArrayOfAttachmentInfoType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().find_element_user(ARRAYOFATTACHMENTINFOTYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType)get_store().add_element_user(ARRAYOFATTACHMENTINFOTYPE$0);
            }
            target.setNil();
        }
    }
}
