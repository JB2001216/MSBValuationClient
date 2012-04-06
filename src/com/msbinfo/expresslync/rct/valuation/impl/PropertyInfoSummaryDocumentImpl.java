/*
 * An XML document type.
 * Localname: PropertyInfoSummary
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PropertyInfoSummaryDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * A document containing one PropertyInfoSummary(@http://msbinfo.com/expresslync/rct/valuation) element.
 *
 * This is a complex type.
 */
public class PropertyInfoSummaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.PropertyInfoSummaryDocument
{
    
    public PropertyInfoSummaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYINFOSUMMARY$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyInfoSummary");
    
    
    /**
     * Gets the "PropertyInfoSummary" element
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary getPropertyInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PropertyInfoSummary" element
     */
    public void setPropertyInfoSummary(com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary propertyInfoSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().add_element_user(PROPERTYINFOSUMMARY$0);
            }
            target.set(propertyInfoSummary);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertyInfoSummary" element
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary addNewPropertyInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().add_element_user(PROPERTYINFOSUMMARY$0);
            return target;
        }
    }
}
