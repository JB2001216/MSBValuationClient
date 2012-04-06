/*
 * XML Type:  AdjustmentParameters
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AdjustmentParameters
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML AdjustmentParameters(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class AdjustmentParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AdjustmentParameters
{
    
    public AdjustmentParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDEFORVALUATION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "IncludeForValuation");
    private static final javax.xml.namespace.QName PERCENTAGE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Percentage");
    private static final javax.xml.namespace.QName CAP$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Cap");
    
    
    /**
     * Gets the "IncludeForValuation" element
     */
    public boolean getIncludeForValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEFORVALUATION$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncludeForValuation" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeForValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEFORVALUATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncludeForValuation" element
     */
    public void setIncludeForValuation(boolean includeForValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEFORVALUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEFORVALUATION$0);
            }
            target.setBooleanValue(includeForValuation);
        }
    }
    
    /**
     * Sets (as xml) the "IncludeForValuation" element
     */
    public void xsetIncludeForValuation(org.apache.xmlbeans.XmlBoolean includeForValuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEFORVALUATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEFORVALUATION$0);
            }
            target.set(includeForValuation);
        }
    }
    
    /**
     * Gets the "Percentage" element
     */
    public java.math.BigDecimal getPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Percentage" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERCENTAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Percentage" element
     */
    public void setPercentage(java.math.BigDecimal percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTAGE$2);
            }
            target.setBigDecimalValue(percentage);
        }
    }
    
    /**
     * Sets (as xml) the "Percentage" element
     */
    public void xsetPercentage(org.apache.xmlbeans.XmlDecimal percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PERCENTAGE$2);
            }
            target.set(percentage);
        }
    }
    
    /**
     * Gets the "Cap" element
     */
    public int getCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cap" element
     */
    public org.apache.xmlbeans.XmlInt xgetCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Cap" element
     */
    public void setCap(int cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAP$4);
            }
            target.setIntValue(cap);
        }
    }
    
    /**
     * Sets (as xml) the "Cap" element
     */
    public void xsetCap(org.apache.xmlbeans.XmlInt cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CAP$4);
            }
            target.set(cap);
        }
    }
}
