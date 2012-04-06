/*
 * An XML document type.
 * Localname: ApplyPropertyInfoRecordIdResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ApplyPropertyInfoRecordIdResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ApplyPropertyInfoRecordIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument
{
    
    public ApplyPropertyInfoRecordIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYPROPERTYINFORECORDIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ApplyPropertyInfoRecordIdResponse");
    
    
    /**
     * Gets the "ApplyPropertyInfoRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse getApplyPropertyInfoRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse)get_store().find_element_user(APPLYPROPERTYINFORECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyPropertyInfoRecordIdResponse" element
     */
    public void setApplyPropertyInfoRecordIdResponse(com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse applyPropertyInfoRecordIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse)get_store().find_element_user(APPLYPROPERTYINFORECORDIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse)get_store().add_element_user(APPLYPROPERTYINFORECORDIDRESPONSE$0);
            }
            target.set(applyPropertyInfoRecordIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoRecordIdResponse" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse addNewApplyPropertyInfoRecordIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse)get_store().add_element_user(APPLYPROPERTYINFORECORDIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ApplyPropertyInfoRecordIdResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ApplyPropertyInfoRecordIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdResponseDocument.ApplyPropertyInfoRecordIdResponse
    {
        
        public ApplyPropertyInfoRecordIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUATIONAGGREGATE$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ValuationAggregate");
        
        
        /**
         * Gets the "ValuationAggregate" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ValuationAggregate" element
         */
        public boolean isSetValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUATIONAGGREGATE$0) != 0;
            }
        }
        
        /**
         * Sets the "ValuationAggregate" element
         */
        public void setValuationAggregate(com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationAggregate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONAGGREGATE$0);
                }
                target.set(valuationAggregate);
            }
        }
        
        /**
         * Appends and returns a new empty "ValuationAggregate" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONAGGREGATE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "ValuationAggregate" element
         */
        public void unsetValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUATIONAGGREGATE$0, 0);
            }
        }
    }
}
