/*
 * XML Type:  ArrayOfAttachmentInfoType
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * An XML ArrayOfAttachmentInfoType(@http://msbinfo.com/expresslync/rct).
 *
 * This is a complex type.
 */
public class ArrayOfAttachmentInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfAttachmentInfoType
{
    
    public ArrayOfAttachmentInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTINFOTYPE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "AttachmentInfoType");
    
    
    /**
     * Gets array of all "AttachmentInfoType" elements
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] getAttachmentInfoTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTINFOTYPE$0, targetList);
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] result = new com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfoTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AttachmentInfoType" element
     */
    public boolean isNilAttachmentInfoTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AttachmentInfoType" element
     */
    public int sizeOfAttachmentInfoTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTINFOTYPE$0);
        }
    }
    
    /**
     * Sets array of all "AttachmentInfoType" element
     */
    public void setAttachmentInfoTypeArray(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] attachmentInfoTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentInfoTypeArray, ATTACHMENTINFOTYPE$0);
        }
    }
    
    /**
     * Sets ith "AttachmentInfoType" element
     */
    public void setAttachmentInfoTypeArray(int i, com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfoType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentInfoType);
        }
    }
    
    /**
     * Nils the ith "AttachmentInfoType" element
     */
    public void setNilAttachmentInfoTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(ATTACHMENTINFOTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentInfoType" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType insertNewAttachmentInfoType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().insert_element_user(ATTACHMENTINFOTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentInfoType" element
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
     * Removes the ith "AttachmentInfoType" element
     */
    public void removeAttachmentInfoType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTINFOTYPE$0, i);
        }
    }
}
