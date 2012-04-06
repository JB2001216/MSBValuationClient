/*
 * XML Type:  Adjustment
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Adjustment
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Adjustment(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class AdjustmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Adjustment
{
    
    public AdjustmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALPERCENTAGE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "GeneralPercentage");
    private static final javax.xml.namespace.QName DEPRECIATIONCHOICE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DepreciationChoice");
    private static final javax.xml.namespace.QName DEPRECIATIONPERCENTAGE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DepreciationPercentage");
    private static final javax.xml.namespace.QName DEPRECIATIONEFFECTIVEAGE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DepreciationEffectiveAge");
    private static final javax.xml.namespace.QName WAGETYPE$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "WageType");
    private static final javax.xml.namespace.QName DEPRECIATIONCONDITION$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DepreciationCondition");
    private static final javax.xml.namespace.QName APPLYHISTORICALDEPRECIATION$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ApplyHistoricalDepreciation");
    
    
    /**
     * Gets the "GeneralPercentage" element
     */
    public java.math.BigDecimal getGeneralPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALPERCENTAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "GeneralPercentage" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetGeneralPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(GENERALPERCENTAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "GeneralPercentage" element
     */
    public boolean isSetGeneralPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERALPERCENTAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "GeneralPercentage" element
     */
    public void setGeneralPercentage(java.math.BigDecimal generalPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALPERCENTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALPERCENTAGE$0);
            }
            target.setBigDecimalValue(generalPercentage);
        }
    }
    
    /**
     * Sets (as xml) the "GeneralPercentage" element
     */
    public void xsetGeneralPercentage(org.apache.xmlbeans.XmlDecimal generalPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(GENERALPERCENTAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(GENERALPERCENTAGE$0);
            }
            target.set(generalPercentage);
        }
    }
    
    /**
     * Unsets the "GeneralPercentage" element
     */
    public void unsetGeneralPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERALPERCENTAGE$0, 0);
        }
    }
    
    /**
     * Gets the "DepreciationChoice" element
     */
    public com.msbinfo.expresslync.rct.valuation.DepreciationChoice.Enum getDepreciationChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONCHOICE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.DepreciationChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepreciationChoice" element
     */
    public com.msbinfo.expresslync.rct.valuation.DepreciationChoice xgetDepreciationChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DepreciationChoice target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DepreciationChoice)get_store().find_element_user(DEPRECIATIONCHOICE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepreciationChoice" element
     */
    public boolean isSetDepreciationChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPRECIATIONCHOICE$2) != 0;
        }
    }
    
    /**
     * Sets the "DepreciationChoice" element
     */
    public void setDepreciationChoice(com.msbinfo.expresslync.rct.valuation.DepreciationChoice.Enum depreciationChoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONCHOICE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECIATIONCHOICE$2);
            }
            target.setEnumValue(depreciationChoice);
        }
    }
    
    /**
     * Sets (as xml) the "DepreciationChoice" element
     */
    public void xsetDepreciationChoice(com.msbinfo.expresslync.rct.valuation.DepreciationChoice depreciationChoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DepreciationChoice target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DepreciationChoice)get_store().find_element_user(DEPRECIATIONCHOICE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DepreciationChoice)get_store().add_element_user(DEPRECIATIONCHOICE$2);
            }
            target.set(depreciationChoice);
        }
    }
    
    /**
     * Unsets the "DepreciationChoice" element
     */
    public void unsetDepreciationChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPRECIATIONCHOICE$2, 0);
        }
    }
    
    /**
     * Gets the "DepreciationPercentage" element
     */
    public java.math.BigDecimal getDepreciationPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONPERCENTAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepreciationPercentage" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetDepreciationPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DEPRECIATIONPERCENTAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepreciationPercentage" element
     */
    public boolean isSetDepreciationPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPRECIATIONPERCENTAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "DepreciationPercentage" element
     */
    public void setDepreciationPercentage(java.math.BigDecimal depreciationPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONPERCENTAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECIATIONPERCENTAGE$4);
            }
            target.setBigDecimalValue(depreciationPercentage);
        }
    }
    
    /**
     * Sets (as xml) the "DepreciationPercentage" element
     */
    public void xsetDepreciationPercentage(org.apache.xmlbeans.XmlDecimal depreciationPercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(DEPRECIATIONPERCENTAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(DEPRECIATIONPERCENTAGE$4);
            }
            target.set(depreciationPercentage);
        }
    }
    
    /**
     * Unsets the "DepreciationPercentage" element
     */
    public void unsetDepreciationPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPRECIATIONPERCENTAGE$4, 0);
        }
    }
    
    /**
     * Gets the "DepreciationEffectiveAge" element
     */
    public int getDepreciationEffectiveAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONEFFECTIVEAGE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepreciationEffectiveAge" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepreciationEffectiveAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPRECIATIONEFFECTIVEAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepreciationEffectiveAge" element
     */
    public boolean isSetDepreciationEffectiveAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPRECIATIONEFFECTIVEAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "DepreciationEffectiveAge" element
     */
    public void setDepreciationEffectiveAge(int depreciationEffectiveAge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONEFFECTIVEAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECIATIONEFFECTIVEAGE$6);
            }
            target.setIntValue(depreciationEffectiveAge);
        }
    }
    
    /**
     * Sets (as xml) the "DepreciationEffectiveAge" element
     */
    public void xsetDepreciationEffectiveAge(org.apache.xmlbeans.XmlInt depreciationEffectiveAge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPRECIATIONEFFECTIVEAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPRECIATIONEFFECTIVEAGE$6);
            }
            target.set(depreciationEffectiveAge);
        }
    }
    
    /**
     * Unsets the "DepreciationEffectiveAge" element
     */
    public void unsetDepreciationEffectiveAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPRECIATIONEFFECTIVEAGE$6, 0);
        }
    }
    
    /**
     * Gets the "WageType" element
     */
    public com.msbinfo.expresslync.rct.valuation.WageType.Enum getWageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAGETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.WageType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WageType" element
     */
    public com.msbinfo.expresslync.rct.valuation.WageType xgetWageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.WageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.WageType)get_store().find_element_user(WAGETYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "WageType" element
     */
    public boolean isSetWageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WAGETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "WageType" element
     */
    public void setWageType(com.msbinfo.expresslync.rct.valuation.WageType.Enum wageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WAGETYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WAGETYPE$8);
            }
            target.setEnumValue(wageType);
        }
    }
    
    /**
     * Sets (as xml) the "WageType" element
     */
    public void xsetWageType(com.msbinfo.expresslync.rct.valuation.WageType wageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.WageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.WageType)get_store().find_element_user(WAGETYPE$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.WageType)get_store().add_element_user(WAGETYPE$8);
            }
            target.set(wageType);
        }
    }
    
    /**
     * Unsets the "WageType" element
     */
    public void unsetWageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WAGETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "DepreciationCondition" element
     */
    public com.msbinfo.expresslync.rct.valuation.DepreciationCondition.Enum getDepreciationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONCONDITION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.DepreciationCondition.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DepreciationCondition" element
     */
    public com.msbinfo.expresslync.rct.valuation.DepreciationCondition xgetDepreciationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DepreciationCondition target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DepreciationCondition)get_store().find_element_user(DEPRECIATIONCONDITION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "DepreciationCondition" element
     */
    public boolean isSetDepreciationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPRECIATIONCONDITION$10) != 0;
        }
    }
    
    /**
     * Sets the "DepreciationCondition" element
     */
    public void setDepreciationCondition(com.msbinfo.expresslync.rct.valuation.DepreciationCondition.Enum depreciationCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPRECIATIONCONDITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPRECIATIONCONDITION$10);
            }
            target.setEnumValue(depreciationCondition);
        }
    }
    
    /**
     * Sets (as xml) the "DepreciationCondition" element
     */
    public void xsetDepreciationCondition(com.msbinfo.expresslync.rct.valuation.DepreciationCondition depreciationCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DepreciationCondition target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DepreciationCondition)get_store().find_element_user(DEPRECIATIONCONDITION$10, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DepreciationCondition)get_store().add_element_user(DEPRECIATIONCONDITION$10);
            }
            target.set(depreciationCondition);
        }
    }
    
    /**
     * Unsets the "DepreciationCondition" element
     */
    public void unsetDepreciationCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPRECIATIONCONDITION$10, 0);
        }
    }
    
    /**
     * Gets the "ApplyHistoricalDepreciation" element
     */
    public boolean getApplyHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLYHISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ApplyHistoricalDepreciation" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetApplyHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPLYHISTORICALDEPRECIATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ApplyHistoricalDepreciation" element
     */
    public boolean isSetApplyHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLYHISTORICALDEPRECIATION$12) != 0;
        }
    }
    
    /**
     * Sets the "ApplyHistoricalDepreciation" element
     */
    public void setApplyHistoricalDepreciation(boolean applyHistoricalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLYHISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLYHISTORICALDEPRECIATION$12);
            }
            target.setBooleanValue(applyHistoricalDepreciation);
        }
    }
    
    /**
     * Sets (as xml) the "ApplyHistoricalDepreciation" element
     */
    public void xsetApplyHistoricalDepreciation(org.apache.xmlbeans.XmlBoolean applyHistoricalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APPLYHISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(APPLYHISTORICALDEPRECIATION$12);
            }
            target.set(applyHistoricalDepreciation);
        }
    }
    
    /**
     * Unsets the "ApplyHistoricalDepreciation" element
     */
    public void unsetApplyHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLYHISTORICALDEPRECIATION$12, 0);
        }
    }
}
