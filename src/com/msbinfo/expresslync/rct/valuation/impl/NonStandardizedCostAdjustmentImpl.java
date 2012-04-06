/*
 * XML Type:  NonStandardizedCostAdjustment
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML NonStandardizedCostAdjustment(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class NonStandardizedCostAdjustmentImpl extends com.msbinfo.expresslync.rct.valuation.impl.AdjustmentImpl implements com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment
{
    
    public NonStandardizedCostAdjustmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHITECTFEE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ArchitectFee");
    private static final javax.xml.namespace.QName GENERALCONTRACTOROVERHEAD$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "GeneralContractorOverhead");
    private static final javax.xml.namespace.QName GENERALCONTRACTORPROFIT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "GeneralContractorProfit");
    private static final javax.xml.namespace.QName DEBRISREMOVAL$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DebrisRemoval");
    
    
    /**
     * Gets the "ArchitectFee" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(ARCHITECTFEE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ArchitectFee" element
     */
    public boolean isSetArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCHITECTFEE$0) != 0;
        }
    }
    
    /**
     * Sets the "ArchitectFee" element
     */
    public void setArchitectFee(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters architectFee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(ARCHITECTFEE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(ARCHITECTFEE$0);
            }
            target.set(architectFee);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchitectFee" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(ARCHITECTFEE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ArchitectFee" element
     */
    public void unsetArchitectFee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCHITECTFEE$0, 0);
        }
    }
    
    /**
     * Gets the "GeneralContractorOverhead" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GeneralContractorOverhead" element
     */
    public boolean isSetGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERALCONTRACTOROVERHEAD$2) != 0;
        }
    }
    
    /**
     * Sets the "GeneralContractorOverhead" element
     */
    public void setGeneralContractorOverhead(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters generalContractorOverhead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(GENERALCONTRACTOROVERHEAD$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(GENERALCONTRACTOROVERHEAD$2);
            }
            target.set(generalContractorOverhead);
        }
    }
    
    /**
     * Appends and returns a new empty "GeneralContractorOverhead" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(GENERALCONTRACTOROVERHEAD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "GeneralContractorOverhead" element
     */
    public void unsetGeneralContractorOverhead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERALCONTRACTOROVERHEAD$2, 0);
        }
    }
    
    /**
     * Gets the "GeneralContractorProfit" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(GENERALCONTRACTORPROFIT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GeneralContractorProfit" element
     */
    public boolean isSetGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERALCONTRACTORPROFIT$4) != 0;
        }
    }
    
    /**
     * Sets the "GeneralContractorProfit" element
     */
    public void setGeneralContractorProfit(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters generalContractorProfit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(GENERALCONTRACTORPROFIT$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(GENERALCONTRACTORPROFIT$4);
            }
            target.set(generalContractorProfit);
        }
    }
    
    /**
     * Appends and returns a new empty "GeneralContractorProfit" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(GENERALCONTRACTORPROFIT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GeneralContractorProfit" element
     */
    public void unsetGeneralContractorProfit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERALCONTRACTORPROFIT$4, 0);
        }
    }
    
    /**
     * Gets the "DebrisRemoval" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(DEBRISREMOVAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DebrisRemoval" element
     */
    public boolean isSetDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEBRISREMOVAL$6) != 0;
        }
    }
    
    /**
     * Sets the "DebrisRemoval" element
     */
    public void setDebrisRemoval(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters debrisRemoval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().find_element_user(DEBRISREMOVAL$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(DEBRISREMOVAL$6);
            }
            target.set(debrisRemoval);
        }
    }
    
    /**
     * Appends and returns a new empty "DebrisRemoval" element
     */
    public com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.AdjustmentParameters target = null;
            target = (com.msbinfo.expresslync.rct.valuation.AdjustmentParameters)get_store().add_element_user(DEBRISREMOVAL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DebrisRemoval" element
     */
    public void unsetDebrisRemoval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEBRISREMOVAL$6, 0);
        }
    }
}
