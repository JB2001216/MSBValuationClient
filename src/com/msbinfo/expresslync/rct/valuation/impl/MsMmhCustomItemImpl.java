/*
 * XML Type:  MsMmhCustomItem
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MsMmhCustomItem
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MsMmhCustomItem(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MsMmhCustomItemImpl extends com.msbinfo.expresslync.rct.valuation.impl.CustomItemImpl implements com.msbinfo.expresslync.rct.valuation.MsMmhCustomItem
{
    
    public MsMmhCustomItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BREAKDOWNCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BreakdownCost");
    
    
    /**
     * Gets the "BreakdownCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BreakdownCost getBreakdownCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BreakdownCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().find_element_user(BREAKDOWNCOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BreakdownCost" element
     */
    public boolean isSetBreakdownCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREAKDOWNCOST$0) != 0;
        }
    }
    
    /**
     * Sets the "BreakdownCost" element
     */
    public void setBreakdownCost(com.msbinfo.expresslync.rct.valuation.BreakdownCost breakdownCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BreakdownCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().find_element_user(BREAKDOWNCOST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().add_element_user(BREAKDOWNCOST$0);
            }
            target.set(breakdownCost);
        }
    }
    
    /**
     * Appends and returns a new empty "BreakdownCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BreakdownCost addNewBreakdownCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BreakdownCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().add_element_user(BREAKDOWNCOST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BreakdownCost" element
     */
    public void unsetBreakdownCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREAKDOWNCOST$0, 0);
        }
    }
}
