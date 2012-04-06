/*
 * An XML document type.
 * Localname: Valuation
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ValuationDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one Valuation(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ValuationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ValuationDocument
{
    
    public ValuationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "Valuation");
    
    
    /**
     * Gets the "Valuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.Valuation getValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Valuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Valuation" element
     */
    public boolean isNilValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Valuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Valuation" element
     */
    public void setValuation(com.msbinfo.expresslync.rct.valuation.Valuation valuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Valuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().add_element_user(VALUATION$0);
            }
            target.set(valuation);
        }
    }
    
    /**
     * Appends and returns a new empty "Valuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.Valuation addNewValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Valuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().add_element_user(VALUATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "Valuation" element
     */
    public void setNilValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Valuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().add_element_user(VALUATION$0);
            }
            target.setNil();
        }
    }
}
