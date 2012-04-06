/*
 * XML Type:  DetachedStructureCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.DetachedStructureCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML DetachedStructureCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class DetachedStructureCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.CostImpl implements com.msbinfo.expresslync.rct.valuation.DetachedStructureCost
{
    
    public DetachedStructureCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERCENTOFPRIMARYSTRUCTUREIRC$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PercentOfPrimaryStructureIRC");
    
    
    /**
     * Gets the "PercentOfPrimaryStructureIRC" element
     */
    public java.math.BigDecimal getPercentOfPrimaryStructureIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PercentOfPrimaryStructureIRC" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPercentOfPrimaryStructureIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PercentOfPrimaryStructureIRC" element
     */
    public boolean isSetPercentOfPrimaryStructureIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERCENTOFPRIMARYSTRUCTUREIRC$0) != 0;
        }
    }
    
    /**
     * Sets the "PercentOfPrimaryStructureIRC" element
     */
    public void setPercentOfPrimaryStructureIRC(java.math.BigDecimal percentOfPrimaryStructureIRC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0);
            }
            target.setBigDecimalValue(percentOfPrimaryStructureIRC);
        }
    }
    
    /**
     * Sets (as xml) the "PercentOfPrimaryStructureIRC" element
     */
    public void xsetPercentOfPrimaryStructureIRC(org.apache.xmlbeans.XmlDecimal percentOfPrimaryStructureIRC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PERCENTOFPRIMARYSTRUCTUREIRC$0);
            }
            target.set(percentOfPrimaryStructureIRC);
        }
    }
    
    /**
     * Unsets the "PercentOfPrimaryStructureIRC" element
     */
    public void unsetPercentOfPrimaryStructureIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERCENTOFPRIMARYSTRUCTUREIRC$0, 0);
        }
    }
}
