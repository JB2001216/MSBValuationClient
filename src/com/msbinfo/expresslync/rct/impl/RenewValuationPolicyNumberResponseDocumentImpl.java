/*
 * An XML document type.
 * Localname: RenewValuationPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.RenewValuationPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one RenewValuationPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class RenewValuationPolicyNumberResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.RenewValuationPolicyNumberResponseDocument
{
    
    public RenewValuationPolicyNumberResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEWVALUATIONPOLICYNUMBERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RenewValuationPolicyNumberResponse");
    
    
    /**
     * Gets the "RenewValuationPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate getRenewValuationPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().find_element_user(RENEWVALUATIONPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenewValuationPolicyNumberResponse" element
     */
    public void setRenewValuationPolicyNumberResponse(com.msbinfo.expresslync.rct.ArrayOfValuationAggregate renewValuationPolicyNumberResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().find_element_user(RENEWVALUATIONPOLICYNUMBERRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().add_element_user(RENEWVALUATIONPOLICYNUMBERRESPONSE$0);
            }
            target.set(renewValuationPolicyNumberResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RenewValuationPolicyNumberResponse" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate addNewRenewValuationPolicyNumberResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate)get_store().add_element_user(RENEWVALUATIONPOLICYNUMBERRESPONSE$0);
            return target;
        }
    }
}
