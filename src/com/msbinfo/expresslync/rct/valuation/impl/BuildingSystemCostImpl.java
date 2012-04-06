/*
 * XML Type:  BuildingSystemCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.BuildingSystemCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML BuildingSystemCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class BuildingSystemCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.BreakdownCostIntImpl implements com.msbinfo.expresslync.rct.valuation.BuildingSystemCost
{
    
    public BuildingSystemCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "System");
    
    
    /**
     * Gets the "System" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "System" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystem xgetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().find_element_user(SYSTEM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "System" element
     */
    public void setSystem(com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum system)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEM$0);
            }
            target.setEnumValue(system);
        }
    }
    
    /**
     * Sets (as xml) the "System" element
     */
    public void xsetSystem(com.msbinfo.expresslync.rct.valuation.BuildingSystem system)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().add_element_user(SYSTEM$0);
            }
            target.set(system);
        }
    }
}
