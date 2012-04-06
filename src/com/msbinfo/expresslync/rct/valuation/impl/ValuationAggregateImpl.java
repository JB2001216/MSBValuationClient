/*
 * XML Type:  ValuationAggregate
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ValuationAggregate
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML ValuationAggregate(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ValuationAggregateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.ValuationAggregate
{
    
    public ValuationAggregateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HAZARDVALUATION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HazardValuation");
    private static final javax.xml.namespace.QName MMHVALUATION$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MMHValuation");
    private static final javax.xml.namespace.QName MAINSTREETVALUATION$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MainStreetValuation");
    private static final javax.xml.namespace.QName HVSTANDARDVALUATION$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HVStandardValuation");
    private static final javax.xml.namespace.QName HVADVANCEDVALUATION$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HVAdvancedValuation");
    
    
    /**
     * Gets the "HazardValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardValuation getHazardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardValuation)get_store().find_element_user(HAZARDVALUATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HazardValuation" element
     */
    public boolean isSetHazardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HAZARDVALUATION$0) != 0;
        }
    }
    
    /**
     * Sets the "HazardValuation" element
     */
    public void setHazardValuation(com.msbinfo.expresslync.rct.valuation.HazardValuation hazardValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardValuation)get_store().find_element_user(HAZARDVALUATION$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HazardValuation)get_store().add_element_user(HAZARDVALUATION$0);
            }
            target.set(hazardValuation);
        }
    }
    
    /**
     * Appends and returns a new empty "HazardValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardValuation addNewHazardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardValuation)get_store().add_element_user(HAZARDVALUATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "HazardValuation" element
     */
    public void unsetHazardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HAZARDVALUATION$0, 0);
        }
    }
    
    /**
     * Gets the "MMHValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.MMHValuation getMMHValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MMHValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MMHValuation)get_store().find_element_user(MMHVALUATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MMHValuation" element
     */
    public boolean isSetMMHValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MMHVALUATION$2) != 0;
        }
    }
    
    /**
     * Sets the "MMHValuation" element
     */
    public void setMMHValuation(com.msbinfo.expresslync.rct.valuation.MMHValuation mmhValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MMHValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MMHValuation)get_store().find_element_user(MMHVALUATION$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MMHValuation)get_store().add_element_user(MMHVALUATION$2);
            }
            target.set(mmhValuation);
        }
    }
    
    /**
     * Appends and returns a new empty "MMHValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.MMHValuation addNewMMHValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MMHValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MMHValuation)get_store().add_element_user(MMHVALUATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MMHValuation" element
     */
    public void unsetMMHValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MMHVALUATION$2, 0);
        }
    }
    
    /**
     * Gets the "MainStreetValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.MainStreetValuation getMainStreetValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainStreetValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainStreetValuation)get_store().find_element_user(MAINSTREETVALUATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MainStreetValuation" element
     */
    public boolean isSetMainStreetValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAINSTREETVALUATION$4) != 0;
        }
    }
    
    /**
     * Sets the "MainStreetValuation" element
     */
    public void setMainStreetValuation(com.msbinfo.expresslync.rct.valuation.MainStreetValuation mainStreetValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainStreetValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainStreetValuation)get_store().find_element_user(MAINSTREETVALUATION$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MainStreetValuation)get_store().add_element_user(MAINSTREETVALUATION$4);
            }
            target.set(mainStreetValuation);
        }
    }
    
    /**
     * Appends and returns a new empty "MainStreetValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.MainStreetValuation addNewMainStreetValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainStreetValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainStreetValuation)get_store().add_element_user(MAINSTREETVALUATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MainStreetValuation" element
     */
    public void unsetMainStreetValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAINSTREETVALUATION$4, 0);
        }
    }
    
    /**
     * Gets the "HVStandardValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation getHVStandardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation)get_store().find_element_user(HVSTANDARDVALUATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HVStandardValuation" element
     */
    public boolean isSetHVStandardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HVSTANDARDVALUATION$6) != 0;
        }
    }
    
    /**
     * Sets the "HVStandardValuation" element
     */
    public void setHVStandardValuation(com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation hvStandardValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation)get_store().find_element_user(HVSTANDARDVALUATION$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation)get_store().add_element_user(HVSTANDARDVALUATION$6);
            }
            target.set(hvStandardValuation);
        }
    }
    
    /**
     * Appends and returns a new empty "HVStandardValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation addNewHVStandardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation)get_store().add_element_user(HVSTANDARDVALUATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "HVStandardValuation" element
     */
    public void unsetHVStandardValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HVSTANDARDVALUATION$6, 0);
        }
    }
    
    /**
     * Gets the "HVAdvancedValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation getHVAdvancedValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation)get_store().find_element_user(HVADVANCEDVALUATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HVAdvancedValuation" element
     */
    public boolean isSetHVAdvancedValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HVADVANCEDVALUATION$8) != 0;
        }
    }
    
    /**
     * Sets the "HVAdvancedValuation" element
     */
    public void setHVAdvancedValuation(com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation hvAdvancedValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation)get_store().find_element_user(HVADVANCEDVALUATION$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation)get_store().add_element_user(HVADVANCEDVALUATION$8);
            }
            target.set(hvAdvancedValuation);
        }
    }
    
    /**
     * Appends and returns a new empty "HVAdvancedValuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation addNewHVAdvancedValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation)get_store().add_element_user(HVADVANCEDVALUATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "HVAdvancedValuation" element
     */
    public void unsetHVAdvancedValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HVADVANCEDVALUATION$8, 0);
        }
    }
}
