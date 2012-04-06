/*
 * An XML document type.
 * Localname: RenewValuationRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.RenewValuationRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one RenewValuationRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class RenewValuationRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.RenewValuationRecordIdResponseDocument
{
    
    public RenewValuationRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEWVALUATIONRECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RenewValuationRecordIdResponse");
    
    
    /**
     * Gets the "RenewValuationRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate getRenewValuationRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().find_element_user(RENEWVALUATIONRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenewValuationRecordIdResponse" element
     */
    public void setRenewValuationRecordIdResponse(com.msbinfo.expresslync.rct.ArrayOfValuationAggregate renewValuationRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().find_element_user(RENEWVALUATIONRECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().add_element_user(RENEWVALUATIONRECORDIDRESPONSE$0);
            }
            target.set(renewValuationRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RenewValuationRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate addNewRenewValuationRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().add_element_user(RENEWVALUATIONRECORDIDRESPONSE$0);
            return target;
        }
    }
}
