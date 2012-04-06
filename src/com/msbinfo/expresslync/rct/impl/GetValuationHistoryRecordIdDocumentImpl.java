/*
 * An XML document type.
 * Localname: GetValuationHistoryRecordId
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetValuationHistoryRecordIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetValuationHistoryRecordId(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetValuationHistoryRecordIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetValuationHistoryRecordIdDocument
{
    
    public GetValuationHistoryRecordIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVALUATIONHISTORYRECORDID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetValuationHistoryRecordId");
    
    
    /**
     * Gets the "GetValuationHistoryRecordId" element
     */
    public int getGetValuationHistoryRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETVALUATIONHISTORYRECORDID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GetValuationHistoryRecordId" element
     */
    public org.apache.xmlbeans.XmlInt xgetGetValuationHistoryRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GETVALUATIONHISTORYRECORDID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GetValuationHistoryRecordId" element
     */
    public void setGetValuationHistoryRecordId(int getValuationHistoryRecordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETVALUATIONHISTORYRECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETVALUATIONHISTORYRECORDID$0);
            }
            target.setIntValue(getValuationHistoryRecordId);
        }
    }
    
    /**
     * Sets (as xml) the "GetValuationHistoryRecordId" element
     */
    public void xsetGetValuationHistoryRecordId(org.apache.xmlbeans.XmlInt getValuationHistoryRecordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GETVALUATIONHISTORYRECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GETVALUATIONHISTORYRECORDID$0);
            }
            target.set(getValuationHistoryRecordId);
        }
    }
}
