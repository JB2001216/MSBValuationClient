/*
 * XML Type:  Cost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Cost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Cost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class CostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Cost
{
    
    public CostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSURABLEREPLACEMENTCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "InsurableReplacementCost");
    private static final javax.xml.namespace.QName INSUREDVALUE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "InsuredValue");
    private static final javax.xml.namespace.QName DEPRECIATION$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Depreciation");
    private static final javax.xml.namespace.QName SUBTOTAL$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Subtotal");
    private static final javax.xml.namespace.QName ADJUSTMENT$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Adjustment");
    private static final javax.xml.namespace.QName ACTUALCASHVALUE$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ActualCashValue");
    
    
    /**
     * Gets the "InsurableReplacementCost" element
     */
    public int getInsurableReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InsurableReplacementCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetInsurableReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InsurableReplacementCost" element
     */
    public void setInsurableReplacementCost(int insurableReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSURABLEREPLACEMENTCOST$0);
            }
            target.setIntValue(insurableReplacementCost);
        }
    }
    
    /**
     * Sets (as xml) the "InsurableReplacementCost" element
     */
    public void xsetInsurableReplacementCost(org.apache.xmlbeans.XmlInt insurableReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INSURABLEREPLACEMENTCOST$0);
            }
            target.set(insurableReplacementCost);
        }
    }
    
    /**
     * Gets the "InsuredValue" element
     */
    public int getInsuredValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InsuredValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetInsuredValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSUREDVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InsuredValue" element
     */
    public void setInsuredValue(int insuredValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSUREDVALUE$2);
            }
            target.setIntValue(insuredValue);
        }
    }
    
    /**
     * Sets (as xml) the "InsuredValue" element
     */
    public void xsetInsuredValue(org.apache.xmlbeans.XmlInt insuredValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INSUREDVALUE$2);
            }
            target.set(insuredValue);
        }
    }
    
    /**
     * Gets the "Depreciation" element
     */
    public int getDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATION$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Depreciation" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPRECIATION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Depreciation" element
     */
    public void setDepreciation(int depreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECIATION$4);
            }
            target.setIntValue(depreciation);
        }
    }
    
    /**
     * Sets (as xml) the "Depreciation" element
     */
    public void xsetDepreciation(org.apache.xmlbeans.XmlInt depreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPRECIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPRECIATION$4);
            }
            target.set(depreciation);
        }
    }
    
    /**
     * Gets the "Subtotal" element
     */
    public int getSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTAL$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Subtotal" element
     */
    public org.apache.xmlbeans.XmlInt xgetSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBTOTAL$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Subtotal" element
     */
    public void setSubtotal(int subtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTOTAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTOTAL$6);
            }
            target.setIntValue(subtotal);
        }
    }
    
    /**
     * Sets (as xml) the "Subtotal" element
     */
    public void xsetSubtotal(org.apache.xmlbeans.XmlInt subtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBTOTAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUBTOTAL$6);
            }
            target.set(subtotal);
        }
    }
    
    /**
     * Gets the "Adjustment" element
     */
    public int getAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADJUSTMENT$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Adjustment" element
     */
    public org.apache.xmlbeans.XmlInt xgetAdjustment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADJUSTMENT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Adjustment" element
     */
    public void setAdjustment(int adjustment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADJUSTMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADJUSTMENT$8);
            }
            target.setIntValue(adjustment);
        }
    }
    
    /**
     * Sets (as xml) the "Adjustment" element
     */
    public void xsetAdjustment(org.apache.xmlbeans.XmlInt adjustment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ADJUSTMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ADJUSTMENT$8);
            }
            target.set(adjustment);
        }
    }
    
    /**
     * Gets the "ActualCashValue" element
     */
    public int getActualCashValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALCASHVALUE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActualCashValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetActualCashValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTUALCASHVALUE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ActualCashValue" element
     */
    public void setActualCashValue(int actualCashValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTUALCASHVALUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTUALCASHVALUE$10);
            }
            target.setIntValue(actualCashValue);
        }
    }
    
    /**
     * Sets (as xml) the "ActualCashValue" element
     */
    public void xsetActualCashValue(org.apache.xmlbeans.XmlInt actualCashValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTUALCASHVALUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTUALCASHVALUE$10);
            }
            target.set(actualCashValue);
        }
    }
}
