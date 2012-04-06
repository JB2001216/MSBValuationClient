/*
 * XML Type:  CalculatableValuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.CalculatableValuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML CalculatableValuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class CalculatableValuationImpl extends com.msbinfo.expresslync.rct.valuation.impl.ValuationImpl implements com.msbinfo.expresslync.rct.valuation.CalculatableValuation
{
    
    public CalculatableValuationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CalculationResult");
    private static final javax.xml.namespace.QName PREFERENCES$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Preferences");
    private static final javax.xml.namespace.QName ADJUSTMENT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Adjustment");
    private static final javax.xml.namespace.QName NONSTANDARDIZEDCOSTADJUSTMENT$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "NonStandardizedCostAdjustment");
    
    
    /**
     * Gets the "CalculationResult" element
     */
    public com.msbinfo.expresslync.rct.valuation.CalculationResult getCalculationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CalculationResult target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CalculationResult)get_store().find_element_user(CALCULATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CalculationResult" element
     */
    public boolean isSetCalculationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCULATIONRESULT$0) != 0;
        }
    }
    
    /**
     * Sets the "CalculationResult" element
     */
    public void setCalculationResult(com.msbinfo.expresslync.rct.valuation.CalculationResult calculationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CalculationResult target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CalculationResult)get_store().find_element_user(CALCULATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.CalculationResult)get_store().add_element_user(CALCULATIONRESULT$0);
            }
            target.set(calculationResult);
        }
    }
    
    /**
     * Appends and returns a new empty "CalculationResult" element
     */
    public com.msbinfo.expresslync.rct.valuation.CalculationResult addNewCalculationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CalculationResult target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CalculationResult)get_store().add_element_user(CALCULATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CalculationResult" element
     */
    public void unsetCalculationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCULATIONRESULT$0, 0);
        }
    }
    
    /**
     * Gets the "Preferences" element
     */
    public com.msbinfo.expresslync.rct.valuation.Preferences getPreferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Preferences target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Preferences)get_store().find_element_user(PREFERENCES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Preferences" element
     */
    public boolean isSetPreferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERENCES$2) != 0;
        }
    }
    
    /**
     * Sets the "Preferences" element
     */
    public void setPreferences(com.msbinfo.expresslync.rct.valuation.Preferences preferences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Preferences target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Preferences)get_store().find_element_user(PREFERENCES$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Preferences)get_store().add_element_user(PREFERENCES$2);
            }
            target.set(preferences);
        }
    }
    
    /**
     * Appends and returns a new empty "Preferences" element
     */
    public com.msbinfo.expresslync.rct.valuation.Preferences addNewPreferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Preferences target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Preferences)get_store().add_element_user(PREFERENCES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Preferences" element
     */
    public void unsetPreferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERENCES$2, 0);
        }
    }
    
    /**
     * Gets the "Adjustment" element
     */
    public com.msbinfo.expresslync.rct.valuation.Adjustment getAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Adjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Adjustment)get_store().find_element_user(ADJUSTMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Adjustment" element
     */
    public boolean isSetAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADJUSTMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "Adjustment" element
     */
    public void setAdjustment(com.msbinfo.expresslync.rct.valuation.Adjustment adjustment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Adjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Adjustment)get_store().find_element_user(ADJUSTMENT$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Adjustment)get_store().add_element_user(ADJUSTMENT$4);
            }
            target.set(adjustment);
        }
    }
    
    /**
     * Appends and returns a new empty "Adjustment" element
     */
    public com.msbinfo.expresslync.rct.valuation.Adjustment addNewAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Adjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Adjustment)get_store().add_element_user(ADJUSTMENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Adjustment" element
     */
    public void unsetAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADJUSTMENT$4, 0);
        }
    }
    
    /**
     * Gets the "NonStandardizedCostAdjustment" element
     */
    public com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment getNonStandardizedCostAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment)get_store().find_element_user(NONSTANDARDIZEDCOSTADJUSTMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NonStandardizedCostAdjustment" element
     */
    public boolean isSetNonStandardizedCostAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONSTANDARDIZEDCOSTADJUSTMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "NonStandardizedCostAdjustment" element
     */
    public void setNonStandardizedCostAdjustment(com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment nonStandardizedCostAdjustment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment)get_store().find_element_user(NONSTANDARDIZEDCOSTADJUSTMENT$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment)get_store().add_element_user(NONSTANDARDIZEDCOSTADJUSTMENT$6);
            }
            target.set(nonStandardizedCostAdjustment);
        }
    }
    
    /**
     * Appends and returns a new empty "NonStandardizedCostAdjustment" element
     */
    public com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment addNewNonStandardizedCostAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment)get_store().add_element_user(NONSTANDARDIZEDCOSTADJUSTMENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "NonStandardizedCostAdjustment" element
     */
    public void unsetNonStandardizedCostAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONSTANDARDIZEDCOSTADJUSTMENT$6, 0);
        }
    }
}
