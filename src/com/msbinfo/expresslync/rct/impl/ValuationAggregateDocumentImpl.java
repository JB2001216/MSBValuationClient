/*
 * An XML document type.
 * Localname: ValuationAggregate
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationAggregateDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ValuationAggregate(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationAggregateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationAggregateDocument
{
    
    public ValuationAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationAggregate");
    
    
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
     * Tests for nil "ValuationAggregate" element
     */
    public boolean isNilValuationAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "ValuationAggregate" element
     */
    public void setNilValuationAggregate()
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
            target.setNil();
        }
    }
}
