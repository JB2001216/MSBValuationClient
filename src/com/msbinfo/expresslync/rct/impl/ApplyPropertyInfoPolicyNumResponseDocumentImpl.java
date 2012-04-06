/*
 * An XML document type.
 * Localname: ApplyPropertyInfoPolicyNumResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ApplyPropertyInfoPolicyNumResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ApplyPropertyInfoPolicyNumResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument
{
    
    public ApplyPropertyInfoPolicyNumResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYPROPERTYINFOPOLICYNUMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ApplyPropertyInfoPolicyNumResponse");
    
    
    /**
     * Gets the "ApplyPropertyInfoPolicyNumResponse" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse getApplyPropertyInfoPolicyNumResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse)get_store().find_element_user(APPLYPROPERTYINFOPOLICYNUMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyPropertyInfoPolicyNumResponse" element
     */
    public void setApplyPropertyInfoPolicyNumResponse(com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse applyPropertyInfoPolicyNumResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse)get_store().find_element_user(APPLYPROPERTYINFOPOLICYNUMRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse)get_store().add_element_user(APPLYPROPERTYINFOPOLICYNUMRESPONSE$0);
            }
            target.set(applyPropertyInfoPolicyNumResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoPolicyNumResponse" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse addNewApplyPropertyInfoPolicyNumResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse)get_store().add_element_user(APPLYPROPERTYINFOPOLICYNUMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ApplyPropertyInfoPolicyNumResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ApplyPropertyInfoPolicyNumResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse
    {
        
        public ApplyPropertyInfoPolicyNumResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
