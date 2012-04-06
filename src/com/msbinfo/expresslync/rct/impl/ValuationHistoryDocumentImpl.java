/*
 * An XML document type.
 * Localname: ValuationHistory
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ValuationHistory(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationHistoryDocument
{
    
    public ValuationHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONHISTORY$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationHistory");
    
    
    /**
     * Gets the "ValuationHistory" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationHistory getValuationHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationHistory target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationHistory)get_store().find_element_user(VALUATIONHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValuationHistory" element
     */
    public void setValuationHistory(com.msbinfo.expresslync.rct.valuation.ValuationHistory valuationHistory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationHistory target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationHistory)get_store().find_element_user(VALUATIONHISTORY$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationHistory)get_store().add_element_user(VALUATIONHISTORY$0);
            }
            target.set(valuationHistory);
        }
    }
    
    /**
     * Appends and returns a new empty "ValuationHistory" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationHistory addNewValuationHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationHistory target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationHistory)get_store().add_element_user(VALUATIONHISTORY$0);
            return target;
        }
    }
}
