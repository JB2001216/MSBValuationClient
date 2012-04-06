/*
 * XML Type:  DetachedStructureStandardizedCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML DetachedStructureStandardizedCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class DetachedStructureStandardizedCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.DetachedStructureCostImpl implements com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost
{
    
    public DetachedStructureStandardizedCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBRISREMOVAL$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DebrisRemoval");
    private static final javax.xml.namespace.QName SUBTOTALAFTERDEBRISREMOVAL$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SubtotalAfterDebrisRemoval");
    
    
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
}
