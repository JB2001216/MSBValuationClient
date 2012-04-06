/*
 * XML Type:  PrimaryStructureNonStandardizedCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML PrimaryStructureNonStandardizedCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class PrimaryStructureNonStandardizedCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.PrimaryStructureCostImpl implements com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost
{
    
    public PrimaryStructureNonStandardizedCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALCONTRACTOROVERHEAD$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "GeneralContractorOverhead");
    private static final javax.xml.namespace.QName GENERALCONTRACTORPROFIT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "GeneralContractorProfit");
    private static final javax.xml.namespace.QName ARCHITECTFEE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ArchitectFee");
    private static final javax.xml.namespace.QName DEBRISREMOVAL$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DebrisRemoval");
    
    
    /**
     * Gets the "GeneralContractorOverhead" element
     */
    public int getGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GeneralContractorOverhead" element
     */
    public org.apache.xmlbeans.XmlInt xgetGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GeneralContractorOverhead" element
     */
    public void setGeneralContractorOverhead(int generalContractorOverhead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALCONTRACTOROVERHEAD$0);
            }
            target.setIntValue(generalContractorOverhead);
        }
    }
    
    /**
     * Sets (as xml) the "GeneralContractorOverhead" element
     */
    public void xsetGeneralContractorOverhead(org.apache.xmlbeans.XmlInt generalContractorOverhead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GENERALCONTRACTOROVERHEAD$0);
            }
            target.set(generalContractorOverhead);
        }
    }
    
    /**
     * Gets the "GeneralContractorProfit" element
     */
    public int getGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALCONTRACTORPROFIT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GeneralContractorProfit" element
     */
    public org.apache.xmlbeans.XmlInt xgetGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GENERALCONTRACTORPROFIT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GeneralContractorProfit" element
     */
    public void setGeneralContractorProfit(int generalContractorProfit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALCONTRACTORPROFIT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALCONTRACTORPROFIT$2);
            }
            target.setIntValue(generalContractorProfit);
        }
    }
    
    /**
     * Sets (as xml) the "GeneralContractorProfit" element
     */
    public void xsetGeneralContractorProfit(org.apache.xmlbeans.XmlInt generalContractorProfit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GENERALCONTRACTORPROFIT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GENERALCONTRACTORPROFIT$2);
            }
            target.set(generalContractorProfit);
        }
    }
    
    /**
     * Gets the "ArchitectFee" element
     */
    public int getArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTFEE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArchitectFee" element
     */
    public org.apache.xmlbeans.XmlInt xgetArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARCHITECTFEE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ArchitectFee" element
     */
    public void setArchitectFee(int architectFee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCHITECTFEE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCHITECTFEE$4);
            }
            target.setIntValue(architectFee);
        }
    }
    
    /**
     * Sets (as xml) the "ArchitectFee" element
     */
    public void xsetArchitectFee(org.apache.xmlbeans.XmlInt architectFee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARCHITECTFEE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ARCHITECTFEE$4);
            }
            target.set(architectFee);
        }
    }
    
    /**
     * Gets the "DebrisRemoval" element
     */
    public int getDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBRISREMOVAL$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEBRISREMOVAL$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEBRISREMOVAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEBRISREMOVAL$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEBRISREMOVAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEBRISREMOVAL$6);
            }
            target.set(debrisRemoval);
        }
    }
}
