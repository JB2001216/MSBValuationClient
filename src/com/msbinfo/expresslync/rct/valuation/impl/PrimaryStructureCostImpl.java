/*
 * XML Type:  PrimaryStructureCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PrimaryStructureCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML PrimaryStructureCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class PrimaryStructureCostImpl extends com.msbinfo.expresslync.rct.valuation.impl.CostImpl implements com.msbinfo.expresslync.rct.valuation.PrimaryStructureCost
{
    
    public PrimaryStructureCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABORCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LaborCost");
    private static final javax.xml.namespace.QName EQUIPMENTCOST$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "EquipmentCost");
    private static final javax.xml.namespace.QName MATERIALCOST$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MaterialCost");
    private static final javax.xml.namespace.QName SUBTOTAL$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SubTotal");
    private static final javax.xml.namespace.QName TOTALREPLACEMENTCOST$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "TotalReplacementCost");
    private static final javax.xml.namespace.QName POLICYEXCLUSIONS$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PolicyExclusions");
    private static final javax.xml.namespace.QName HISTORICALDEPRECIATION$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HistoricalDepreciation");
    private static final javax.xml.namespace.QName RCLESSHISTORICALDEPRECIATION$14 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "RCLessHistoricalDepreciation");
    private static final javax.xml.namespace.QName CURRENTCOVERAGEPERCENTOFIRC$16 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CurrentCoveragePercentOfIRC");
    
    
    /**
     * Gets the "LaborCost" element
     */
    public int getLaborCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABORCOST$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LaborCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetLaborCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LABORCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LaborCost" element
     */
    public void setLaborCost(int laborCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABORCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABORCOST$0);
            }
            target.setIntValue(laborCost);
        }
    }
    
    /**
     * Sets (as xml) the "LaborCost" element
     */
    public void xsetLaborCost(org.apache.xmlbeans.XmlInt laborCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LABORCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LABORCOST$0);
            }
            target.set(laborCost);
        }
    }
    
    /**
     * Gets the "EquipmentCost" element
     */
    public int getEquipmentCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "EquipmentCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetEquipmentCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EquipmentCost" element
     */
    public void setEquipmentCost(int equipmentCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EQUIPMENTCOST$2);
            }
            target.setIntValue(equipmentCost);
        }
    }
    
    /**
     * Sets (as xml) the "EquipmentCost" element
     */
    public void xsetEquipmentCost(org.apache.xmlbeans.XmlInt equipmentCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EQUIPMENTCOST$2);
            }
            target.set(equipmentCost);
        }
    }
    
    /**
     * Gets the "MaterialCost" element
     */
    public int getMaterialCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIALCOST$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaterialCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaterialCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MATERIALCOST$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MaterialCost" element
     */
    public void setMaterialCost(int materialCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIALCOST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATERIALCOST$4);
            }
            target.setIntValue(materialCost);
        }
    }
    
    /**
     * Sets (as xml) the "MaterialCost" element
     */
    public void xsetMaterialCost(org.apache.xmlbeans.XmlInt materialCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MATERIALCOST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MATERIALCOST$4);
            }
            target.set(materialCost);
        }
    }
    
    /**
     * Gets the "SubTotal" element
     */
    public int getSubTotal()
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
     * Gets (as xml) the "SubTotal" element
     */
    public org.apache.xmlbeans.XmlInt xgetSubTotal()
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
     * Sets the "SubTotal" element
     */
    public void setSubTotal(int subTotal)
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
            target.setIntValue(subTotal);
        }
    }
    
    /**
     * Sets (as xml) the "SubTotal" element
     */
    public void xsetSubTotal(org.apache.xmlbeans.XmlInt subTotal)
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
            target.set(subTotal);
        }
    }
    
    /**
     * Gets the "TotalReplacementCost" element
     */
    public int getTotalReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALREPLACEMENTCOST$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalReplacementCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetTotalReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALREPLACEMENTCOST$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalReplacementCost" element
     */
    public void setTotalReplacementCost(int totalReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALREPLACEMENTCOST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALREPLACEMENTCOST$8);
            }
            target.setIntValue(totalReplacementCost);
        }
    }
    
    /**
     * Sets (as xml) the "TotalReplacementCost" element
     */
    public void xsetTotalReplacementCost(org.apache.xmlbeans.XmlInt totalReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALREPLACEMENTCOST$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALREPLACEMENTCOST$8);
            }
            target.set(totalReplacementCost);
        }
    }
    
    /**
     * Gets the "PolicyExclusions" element
     */
    public int getPolicyExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYEXCLUSIONS$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyExclusions" element
     */
    public org.apache.xmlbeans.XmlInt xgetPolicyExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POLICYEXCLUSIONS$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PolicyExclusions" element
     */
    public void setPolicyExclusions(int policyExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYEXCLUSIONS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYEXCLUSIONS$10);
            }
            target.setIntValue(policyExclusions);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyExclusions" element
     */
    public void xsetPolicyExclusions(org.apache.xmlbeans.XmlInt policyExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POLICYEXCLUSIONS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(POLICYEXCLUSIONS$10);
            }
            target.set(policyExclusions);
        }
    }
    
    /**
     * Gets the "HistoricalDepreciation" element
     */
    public int getHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HistoricalDepreciation" element
     */
    public org.apache.xmlbeans.XmlInt xgetHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HISTORICALDEPRECIATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "HistoricalDepreciation" element
     */
    public boolean isSetHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORICALDEPRECIATION$12) != 0;
        }
    }
    
    /**
     * Sets the "HistoricalDepreciation" element
     */
    public void setHistoricalDepreciation(int historicalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HISTORICALDEPRECIATION$12);
            }
            target.setIntValue(historicalDepreciation);
        }
    }
    
    /**
     * Sets (as xml) the "HistoricalDepreciation" element
     */
    public void xsetHistoricalDepreciation(org.apache.xmlbeans.XmlInt historicalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HISTORICALDEPRECIATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HISTORICALDEPRECIATION$12);
            }
            target.set(historicalDepreciation);
        }
    }
    
    /**
     * Unsets the "HistoricalDepreciation" element
     */
    public void unsetHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORICALDEPRECIATION$12, 0);
        }
    }
    
    /**
     * Gets the "RCLessHistoricalDepreciation" element
     */
    public int getRCLessHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RCLESSHISTORICALDEPRECIATION$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RCLessHistoricalDepreciation" element
     */
    public org.apache.xmlbeans.XmlInt xgetRCLessHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RCLESSHISTORICALDEPRECIATION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RCLessHistoricalDepreciation" element
     */
    public boolean isSetRCLessHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RCLESSHISTORICALDEPRECIATION$14) != 0;
        }
    }
    
    /**
     * Sets the "RCLessHistoricalDepreciation" element
     */
    public void setRCLessHistoricalDepreciation(int rcLessHistoricalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RCLESSHISTORICALDEPRECIATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RCLESSHISTORICALDEPRECIATION$14);
            }
            target.setIntValue(rcLessHistoricalDepreciation);
        }
    }
    
    /**
     * Sets (as xml) the "RCLessHistoricalDepreciation" element
     */
    public void xsetRCLessHistoricalDepreciation(org.apache.xmlbeans.XmlInt rcLessHistoricalDepreciation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RCLESSHISTORICALDEPRECIATION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RCLESSHISTORICALDEPRECIATION$14);
            }
            target.set(rcLessHistoricalDepreciation);
        }
    }
    
    /**
     * Unsets the "RCLessHistoricalDepreciation" element
     */
    public void unsetRCLessHistoricalDepreciation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RCLESSHISTORICALDEPRECIATION$14, 0);
        }
    }
    
    /**
     * Gets the "CurrentCoveragePercentOfIRC" element
     */
    public java.math.BigDecimal getCurrentCoveragePercentOfIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTCOVERAGEPERCENTOFIRC$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentCoveragePercentOfIRC" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetCurrentCoveragePercentOfIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CURRENTCOVERAGEPERCENTOFIRC$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentCoveragePercentOfIRC" element
     */
    public boolean isSetCurrentCoveragePercentOfIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTCOVERAGEPERCENTOFIRC$16) != 0;
        }
    }
    
    /**
     * Sets the "CurrentCoveragePercentOfIRC" element
     */
    public void setCurrentCoveragePercentOfIRC(java.math.BigDecimal currentCoveragePercentOfIRC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTCOVERAGEPERCENTOFIRC$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTCOVERAGEPERCENTOFIRC$16);
            }
            target.setBigDecimalValue(currentCoveragePercentOfIRC);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentCoveragePercentOfIRC" element
     */
    public void xsetCurrentCoveragePercentOfIRC(org.apache.xmlbeans.XmlDecimal currentCoveragePercentOfIRC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(CURRENTCOVERAGEPERCENTOFIRC$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(CURRENTCOVERAGEPERCENTOFIRC$16);
            }
            target.set(currentCoveragePercentOfIRC);
        }
    }
    
    /**
     * Unsets the "CurrentCoveragePercentOfIRC" element
     */
    public void unsetCurrentCoveragePercentOfIRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTCOVERAGEPERCENTOFIRC$16, 0);
        }
    }
}
