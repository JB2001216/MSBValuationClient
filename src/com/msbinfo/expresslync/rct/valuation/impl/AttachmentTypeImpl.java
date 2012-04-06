/*
 * XML Type:  AttachmentType
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AttachmentType
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML AttachmentType(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class AttachmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AttachmentType
{
    
    public AttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Data");
    private static final javax.xml.namespace.QName INFO$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Info");
    
    
    /**
     * Gets the "Data" element
     */
    public byte[] getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$0) != 0;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(byte[] data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$0);
            }
            target.setByteArrayValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlBase64Binary data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "Data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$0, 0);
        }
    }
    
    /**
     * Gets the "Info" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(INFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Info" element
     */
    public boolean isSetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFO$2) != 0;
        }
    }
    
    /**
     * Sets the "Info" element
     */
    public void setInfo(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType info)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().find_element_user(INFO$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(INFO$2);
            }
            target.set(info);
        }
    }
    
    /**
     * Appends and returns a new empty "Info" element
     */
    public com.msbinfo.expresslync.rct.valuation.AttachmentInfoType addNewInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AttachmentInfoType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AttachmentInfoType)get_store().add_element_user(INFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Info" element
     */
    public void unsetInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFO$2, 0);
        }
    }
}
