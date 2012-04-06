/*
 * XML Type:  HighValueCustomItem
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueCustomItem
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueCustomItem(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueCustomItemImpl extends com.msbinfo.expresslync.rct.valuation.impl.CustomItemImpl implements com.msbinfo.expresslync.rct.valuation.HighValueCustomItem
{
    
    public HighValueCustomItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "UnitCost");
    private static final javax.xml.namespace.QName BREAKDOWNCOST$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BreakdownCost");
    private static final javax.xml.namespace.QName COVERAGETYPE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CoverageType");
    
    
    /**
     * Gets the "UnitCost" element
     */
    public java.math.BigDecimal getUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITCOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitCost" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITCOST$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnitCost" element
     */
    public boolean isSetUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITCOST$0) != 0;
        }
    }
    
    /**
     * Sets the "UnitCost" element
     */
    public void setUnitCost(java.math.BigDecimal unitCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITCOST$0);
            }
            target.setBigDecimalValue(unitCost);
        }
    }
    
    /**
     * Sets (as xml) the "UnitCost" element
     */
    public void xsetUnitCost(org.apache.xmlbeans.XmlDecimal unitCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITCOST$0);
            }
            target.set(unitCost);
        }
    }
    
    /**
     * Unsets the "UnitCost" element
     */
    public void unsetUnitCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITCOST$0, 0);
        }
    }
    
    /**
     * Gets the "BreakdownCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BreakdownCost getBreakdownCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BreakdownCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().find_element_user(BREAKDOWNCOST$2, 0);
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
            return get_store().count_elements(BREAKDOWNCOST$2) != 0;
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
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().find_element_user(BREAKDOWNCOST$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().add_element_user(BREAKDOWNCOST$2);
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
            target = (com.msbinfo.expresslync.rct.valuation.BreakdownCost)get_store().add_element_user(BREAKDOWNCOST$2);
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
            get_store().remove_element(BREAKDOWNCOST$2, 0);
        }
    }
    
    /**
     * Gets the "CoverageType" element
     */
    public com.msbinfo.expresslync.rct.valuation.CoverageType.Enum getCoverageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.CoverageType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CoverageType" element
     */
    public com.msbinfo.expresslync.rct.valuation.CoverageType xgetCoverageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CoverageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().find_element_user(COVERAGETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CoverageType" element
     */
    public void setCoverageType(com.msbinfo.expresslync.rct.valuation.CoverageType.Enum coverageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVERAGETYPE$4);
            }
            target.setEnumValue(coverageType);
        }
    }
    
    /**
     * Sets (as xml) the "CoverageType" element
     */
    public void xsetCoverageType(com.msbinfo.expresslync.rct.valuation.CoverageType coverageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CoverageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().find_element_user(COVERAGETYPE$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().add_element_user(COVERAGETYPE$4);
            }
            target.set(coverageType);
        }
    }
}
