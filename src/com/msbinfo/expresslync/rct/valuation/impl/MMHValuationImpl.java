/*
 * XML Type:  MMHValuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MMHValuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MMHValuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MMHValuationImpl extends com.msbinfo.expresslync.rct.valuation.impl.MsMmhValuationImpl implements com.msbinfo.expresslync.rct.valuation.MMHValuation
{
    
    public MMHValuationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDING$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Building");
    
    
    /**
     * Gets the "Building" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhBuilding getBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhBuilding target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhBuilding)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Building" element
     */
    public boolean isSetBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILDING$0) != 0;
        }
    }
    
    /**
     * Sets the "Building" element
     */
    public void setBuilding(com.msbinfo.expresslync.rct.valuation.MmhBuilding building)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhBuilding target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhBuilding)get_store().find_element_user(BUILDING$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MmhBuilding)get_store().add_element_user(BUILDING$0);
            }
            target.set(building);
        }
    }
    
    /**
     * Appends and returns a new empty "Building" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhBuilding addNewBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhBuilding target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhBuilding)get_store().add_element_user(BUILDING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Building" element
     */
    public void unsetBuilding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILDING$0, 0);
        }
    }
}
