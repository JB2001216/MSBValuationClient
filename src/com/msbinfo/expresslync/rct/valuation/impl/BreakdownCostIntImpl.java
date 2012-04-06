/*
 * XML Type:  BreakdownCostInt
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.BreakdownCostInt
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML BreakdownCostInt(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class BreakdownCostIntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.BreakdownCostInt
{
    
    public BreakdownCostIntImpl(org.apache.xmlbeans.SchemaType sType)
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
}
