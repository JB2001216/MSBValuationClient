/*
 * XML Type:  BreakdownCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.BreakdownCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML BreakdownCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class BreakdownCostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.BreakdownCost
{
    
    public BreakdownCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABORCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LaborCost");
    private static final javax.xml.namespace.QName EQUIPMENTCOST$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "EquipmentCost");
    private static final javax.xml.namespace.QName MATERIALCOST$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MaterialCost");
    
    
    /**
     * Gets the "LaborCost" element
     */
    public java.math.BigDecimal getLaborCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABORCOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "LaborCost" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetLaborCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LABORCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LaborCost" element
     */
    public void setLaborCost(java.math.BigDecimal laborCost)
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
            target.setBigDecimalValue(laborCost);
        }
    }
    
    /**
     * Sets (as xml) the "LaborCost" element
     */
    public void xsetLaborCost(org.apache.xmlbeans.XmlDecimal laborCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(LABORCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(LABORCOST$0);
            }
            target.set(laborCost);
        }
    }
    
    /**
     * Gets the "EquipmentCost" element
     */
    public java.math.BigDecimal getEquipmentCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "EquipmentCost" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetEquipmentCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EquipmentCost" element
     */
    public void setEquipmentCost(java.math.BigDecimal equipmentCost)
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
            target.setBigDecimalValue(equipmentCost);
        }
    }
    
    /**
     * Sets (as xml) the "EquipmentCost" element
     */
    public void xsetEquipmentCost(org.apache.xmlbeans.XmlDecimal equipmentCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(EQUIPMENTCOST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(EQUIPMENTCOST$2);
            }
            target.set(equipmentCost);
        }
    }
    
    /**
     * Gets the "MaterialCost" element
     */
    public java.math.BigDecimal getMaterialCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIALCOST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaterialCost" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetMaterialCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MATERIALCOST$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MaterialCost" element
     */
    public void setMaterialCost(java.math.BigDecimal materialCost)
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
            target.setBigDecimalValue(materialCost);
        }
    }
    
    /**
     * Sets (as xml) the "MaterialCost" element
     */
    public void xsetMaterialCost(org.apache.xmlbeans.XmlDecimal materialCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MATERIALCOST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(MATERIALCOST$4);
            }
            target.set(materialCost);
        }
    }
}
