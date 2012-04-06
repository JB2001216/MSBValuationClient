/*
 * An XML document type.
 * Localname: ValuationIn
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationInDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ValuationIn(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationInDocument
{
    
    public ValuationInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONIN$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationIn");
    
    
    /**
     * Gets the "ValuationIn" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValuationIn" element
     */
    public void setValuationIn(com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONIN$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONIN$0);
            }
            target.set(valuationIn);
        }
    }
    
    /**
     * Appends and returns a new empty "ValuationIn" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONIN$0);
            return target;
        }
    }
}
