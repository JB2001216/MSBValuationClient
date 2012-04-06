/*
 * An XML document type.
 * Localname: ValuationIdentifier
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ValuationIdentifier(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationIdentifierDocument
{
    
    public ValuationIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationIdentifier");
    
    
    /**
     * Gets the "ValuationIdentifier" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationIdentifier getValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().find_element_user(VALUATIONIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValuationIdentifier" element
     */
    public void setValuationIdentifier(com.msbinfo.expresslync.rct.valuation.ValuationIdentifier valuationIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().find_element_user(VALUATIONIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().add_element_user(VALUATIONIDENTIFIER$0);
            }
            target.set(valuationIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "ValuationIdentifier" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationIdentifier addNewValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().add_element_user(VALUATIONIDENTIFIER$0);
            return target;
        }
    }
}
