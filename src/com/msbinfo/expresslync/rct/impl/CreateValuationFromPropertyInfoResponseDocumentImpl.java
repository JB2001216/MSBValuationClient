/*
 * An XML document type.
 * Localname: CreateValuationFromPropertyInfoResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one CreateValuationFromPropertyInfoResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class CreateValuationFromPropertyInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument
{
    
    public CreateValuationFromPropertyInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEVALUATIONFROMPROPERTYINFORESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "CreateValuationFromPropertyInfoResponse");
    
    
    /**
     * Gets the "CreateValuationFromPropertyInfoResponse" element
     */
    public com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse getCreateValuationFromPropertyInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse)get_store().find_element_user(CREATEVALUATIONFROMPROPERTYINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateValuationFromPropertyInfoResponse" element
     */
    public void setCreateValuationFromPropertyInfoResponse(com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse createValuationFromPropertyInfoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse)get_store().find_element_user(CREATEVALUATIONFROMPROPERTYINFORESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse)get_store().add_element_user(CREATEVALUATIONFROMPROPERTYINFORESPONSE$0);
            }
            target.set(createValuationFromPropertyInfoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateValuationFromPropertyInfoResponse" element
     */
    public com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse addNewCreateValuationFromPropertyInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse)get_store().add_element_user(CREATEVALUATIONFROMPROPERTYINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateValuationFromPropertyInfoResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class CreateValuationFromPropertyInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoResponseDocument.CreateValuationFromPropertyInfoResponse
    {
        
        public CreateValuationFromPropertyInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
