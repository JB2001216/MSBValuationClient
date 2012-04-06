/*
 * XML Type:  PrimaryStructureStandardizedCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML PrimaryStructureStandardizedCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class PrimaryStructureStandardizedCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.PrimaryStructureCostImpl implements com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost
{
    
    public PrimaryStructureStandardizedCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBRISREMOVAL$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DebrisRemoval");
    private static final javax.xml.namespace.QName SUBTOTALAFTERDEBRISREMOVAL$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SubtotalAfterDebrisRemoval");
    private static final javax.xml.namespace.QName FINISHEDFLOORAREA$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FinishedFloorArea");
    private static final javax.xml.namespace.QName TOTALFLOORAREA$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "TotalFloorArea");
    
    
    /**
     * Gets the "DebrisRemoval" element
     */
    public int getDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBRISREMOVAL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DebrisRemoval" element
     */
    public org.apache.xmlbeans.XmlInt xgetDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEBRISREMOVAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DebrisRemoval" element
     */
    public void setDebrisRemoval(int debrisRemoval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBRISREMOVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBRISREMOVAL$0);
            }
            target.setIntValue(debrisRemoval);
        }
    }
    
    /**
     * Sets (as xml) the "DebrisRemoval" element
     */
    public void xsetDebrisRemoval(org.apache.xmlbeans.XmlInt debrisRemoval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEBRISREMOVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEBRISREMOVAL$0);
            }
            target.set(debrisRemoval);
        }
    }
    
    /**
     * Gets the "SubtotalAfterDebrisRemoval" element
     */
    public int getSubtotalAfterDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTALAFTERDEBRISREMOVAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubtotalAfterDebrisRemoval" element
     */
    public org.apache.xmlbeans.XmlInt xgetSubtotalAfterDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBTOTALAFTERDEBRISREMOVAL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubtotalAfterDebrisRemoval" element
     */
    public void setSubtotalAfterDebrisRemoval(int subtotalAfterDebrisRemoval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTALAFTERDEBRISREMOVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTALAFTERDEBRISREMOVAL$2);
            }
            target.setIntValue(subtotalAfterDebrisRemoval);
        }
    }
    
    /**
     * Sets (as xml) the "SubtotalAfterDebrisRemoval" element
     */
    public void xsetSubtotalAfterDebrisRemoval(org.apache.xmlbeans.XmlInt subtotalAfterDebrisRemoval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBTOTALAFTERDEBRISREMOVAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUBTOTALAFTERDEBRISREMOVAL$2);
            }
            target.set(subtotalAfterDebrisRemoval);
        }
    }
    
    /**
     * Gets the "FinishedFloorArea" element
     */
    public int getFinishedFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISHEDFLOORAREA$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FinishedFloorArea" element
     */
    public org.apache.xmlbeans.XmlInt xgetFinishedFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FINISHEDFLOORAREA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FinishedFloorArea" element
     */
    public boolean isSetFinishedFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FINISHEDFLOORAREA$4) != 0;
        }
    }
    
    /**
     * Sets the "FinishedFloorArea" element
     */
    public void setFinishedFloorArea(int finishedFloorArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISHEDFLOORAREA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISHEDFLOORAREA$4);
            }
            target.setIntValue(finishedFloorArea);
        }
    }
    
    /**
     * Sets (as xml) the "FinishedFloorArea" element
     */
    public void xsetFinishedFloorArea(org.apache.xmlbeans.XmlInt finishedFloorArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FINISHEDFLOORAREA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FINISHEDFLOORAREA$4);
            }
            target.set(finishedFloorArea);
        }
    }
    
    /**
     * Unsets the "FinishedFloorArea" element
     */
    public void unsetFinishedFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FINISHEDFLOORAREA$4, 0);
        }
    }
    
    /**
     * Gets the "TotalFloorArea" element
     */
    public int getTotalFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALFLOORAREA$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalFloorArea" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALFLOORAREA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalFloorArea" element
     */
    public boolean isSetTotalFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALFLOORAREA$6) != 0;
        }
    }
    
    /**
     * Sets the "TotalFloorArea" element
     */
    public void setTotalFloorArea(int totalFloorArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALFLOORAREA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALFLOORAREA$6);
            }
            target.setIntValue(totalFloorArea);
        }
    }
    
    /**
     * Sets (as xml) the "TotalFloorArea" element
     */
    public void xsetTotalFloorArea(org.apache.xmlbeans.XmlInt totalFloorArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALFLOORAREA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALFLOORAREA$6);
            }
            target.set(totalFloorArea);
        }
    }
    
    /**
     * Unsets the "TotalFloorArea" element
     */
    public void unsetTotalFloorArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALFLOORAREA$6, 0);
        }
    }
}
