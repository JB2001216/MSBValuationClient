/*
 * An XML document type.
 * Localname: ValuationOut
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationOutDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ValuationOut(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationOutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationOutDocument
{
    
    public ValuationOutDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONOUT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationOut");
    
    
    /**
     * Gets the "ValuationOut" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValuationOut" element
     */
    public void setValuationOut(com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationOut)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONOUT$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONOUT$0);
            }
            target.set(valuationOut);
        }
    }
    
    /**
     * Appends and returns a new empty "ValuationOut" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONOUT$0);
            return target;
        }
    }
}
