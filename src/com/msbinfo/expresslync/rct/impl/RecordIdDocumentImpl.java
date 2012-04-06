/*
 * An XML document type.
 * Localname: RecordId
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.RecordIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one RecordId(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class RecordIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.RecordIdDocument
{
    
    public RecordIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RecordId");
    
    
    /**
     * Gets the "RecordId" element
     */
    public int getRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecordId" element
     */
    public void setRecordId(int recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDID$0);
            }
            target.setIntValue(recordId);
        }
    }
    
    /**
     * Sets (as xml) the "RecordId" element
     */
    public void xsetRecordId(org.apache.xmlbeans.XmlInt recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECORDID$0);
            }
            target.set(recordId);
        }
    }
}
