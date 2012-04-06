/*
 * XML Type:  CalculationResult
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.CalculationResult
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML CalculationResult(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class CalculationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.CalculationResult
{
    
    public CalculationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCUSER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CalcUser");
    private static final javax.xml.namespace.QName CALCDATE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CalcDate");
    private static final javax.xml.namespace.QName COSTDATAVERSION$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CostDataVersion");
    private static final javax.xml.namespace.QName BUILDINGSYSTEMCOST$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BuildingSystemCost");
    private static final javax.xml.namespace.QName PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PrimaryStructureNonStandardizedCost");
    private static final javax.xml.namespace.QName PRIMARYSTRUCTURESTANDARDIZEDCOST$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PrimaryStructureStandardizedCost");
    private static final javax.xml.namespace.QName DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DetachedStructuresNonStandarddizedCost");
    private static final javax.xml.namespace.QName DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DetachedStructuresStandarddizedCost");
    private static final javax.xml.namespace.QName WHOLEBUILDINGCOST$16 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "WholeBuildingCost");
    
    
    /**
     * Gets the "CalcUser" element
     */
    public java.lang.String getCalcUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalcUser" element
     */
    public org.apache.xmlbeans.XmlString xgetCalcUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCUSER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CalcUser" element
     */
    public boolean isSetCalcUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALCUSER$0) != 0;
        }
    }
    
    /**
     * Sets the "CalcUser" element
     */
    public void setCalcUser(java.lang.String calcUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALCUSER$0);
            }
            target.setStringValue(calcUser);
        }
    }
    
    /**
     * Sets (as xml) the "CalcUser" element
     */
    public void xsetCalcUser(org.apache.xmlbeans.XmlString calcUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALCUSER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALCUSER$0);
            }
            target.set(calcUser);
        }
    }
    
    /**
     * Unsets the "CalcUser" element
     */
    public void unsetCalcUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALCUSER$0, 0);
        }
    }
    
    /**
     * Gets the "CalcDate" element
     */
    public java.util.Calendar getCalcDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalcDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCalcDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CALCDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CalcDate" element
     */
    public void setCalcDate(java.util.Calendar calcDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALCDATE$2);
            }
            target.setCalendarValue(calcDate);
        }
    }
    
    /**
     * Sets (as xml) the "CalcDate" element
     */
    public void xsetCalcDate(org.apache.xmlbeans.XmlDateTime calcDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CALCDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CALCDATE$2);
            }
            target.set(calcDate);
        }
    }
    
    /**
     * Gets the "CostDataVersion" element
     */
    public com.msbinfo.expresslync.rct.valuation.CostDataVersionType getCostDataVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CostDataVersionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CostDataVersionType)get_store().find_element_user(COSTDATAVERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CostDataVersion" element
     */
    public boolean isSetCostDataVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COSTDATAVERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "CostDataVersion" element
     */
    public void setCostDataVersion(com.msbinfo.expresslync.rct.valuation.CostDataVersionType costDataVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CostDataVersionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CostDataVersionType)get_store().find_element_user(COSTDATAVERSION$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.CostDataVersionType)get_store().add_element_user(COSTDATAVERSION$4);
            }
            target.set(costDataVersion);
        }
    }
    
    /**
     * Appends and returns a new empty "CostDataVersion" element
     */
    public com.msbinfo.expresslync.rct.valuation.CostDataVersionType addNewCostDataVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CostDataVersionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CostDataVersionType)get_store().add_element_user(COSTDATAVERSION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CostDataVersion" element
     */
    public void unsetCostDataVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COSTDATAVERSION$4, 0);
        }
    }
    
    /**
     * Gets array of all "BuildingSystemCost" elements
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[] getBuildingSystemCostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUILDINGSYSTEMCOST$6, targetList);
            com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[] result = new com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BuildingSystemCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystemCost getBuildingSystemCostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystemCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystemCost)get_store().find_element_user(BUILDINGSYSTEMCOST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BuildingSystemCost" element
     */
    public int sizeOfBuildingSystemCostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILDINGSYSTEMCOST$6);
        }
    }
    
    /**
     * Sets array of all "BuildingSystemCost" element
     */
    public void setBuildingSystemCostArray(com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[] buildingSystemCostArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(buildingSystemCostArray, BUILDINGSYSTEMCOST$6);
        }
    }
    
    /**
     * Sets ith "BuildingSystemCost" element
     */
    public void setBuildingSystemCostArray(int i, com.msbinfo.expresslync.rct.valuation.BuildingSystemCost buildingSystemCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystemCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystemCost)get_store().find_element_user(BUILDINGSYSTEMCOST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(buildingSystemCost);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BuildingSystemCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystemCost insertNewBuildingSystemCost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystemCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystemCost)get_store().insert_element_user(BUILDINGSYSTEMCOST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BuildingSystemCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystemCost addNewBuildingSystemCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystemCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystemCost)get_store().add_element_user(BUILDINGSYSTEMCOST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "BuildingSystemCost" element
     */
    public void removeBuildingSystemCost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILDINGSYSTEMCOST$6, i);
        }
    }
    
    /**
     * Gets the "PrimaryStructureNonStandardizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost getPrimaryStructureNonStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost)get_store().find_element_user(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryStructureNonStandardizedCost" element
     */
    public boolean isSetPrimaryStructureNonStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryStructureNonStandardizedCost" element
     */
    public void setPrimaryStructureNonStandardizedCost(com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost primaryStructureNonStandardizedCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost)get_store().find_element_user(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost)get_store().add_element_user(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8);
            }
            target.set(primaryStructureNonStandardizedCost);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryStructureNonStandardizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost addNewPrimaryStructureNonStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost)get_store().add_element_user(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryStructureNonStandardizedCost" element
     */
    public void unsetPrimaryStructureNonStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYSTRUCTURENONSTANDARDIZEDCOST$8, 0);
        }
    }
    
    /**
     * Gets the "PrimaryStructureStandardizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost getPrimaryStructureStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost)get_store().find_element_user(PRIMARYSTRUCTURESTANDARDIZEDCOST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryStructureStandardizedCost" element
     */
    public boolean isSetPrimaryStructureStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYSTRUCTURESTANDARDIZEDCOST$10) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryStructureStandardizedCost" element
     */
    public void setPrimaryStructureStandardizedCost(com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost primaryStructureStandardizedCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost)get_store().find_element_user(PRIMARYSTRUCTURESTANDARDIZEDCOST$10, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost)get_store().add_element_user(PRIMARYSTRUCTURESTANDARDIZEDCOST$10);
            }
            target.set(primaryStructureStandardizedCost);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryStructureStandardizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost addNewPrimaryStructureStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost)get_store().add_element_user(PRIMARYSTRUCTURESTANDARDIZEDCOST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryStructureStandardizedCost" element
     */
    public void unsetPrimaryStructureStandardizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYSTRUCTURESTANDARDIZEDCOST$10, 0);
        }
    }
    
    /**
     * Gets the "DetachedStructuresNonStandarddizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost getDetachedStructuresNonStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost)get_store().find_element_user(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DetachedStructuresNonStandarddizedCost" element
     */
    public boolean isSetDetachedStructuresNonStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12) != 0;
        }
    }
    
    /**
     * Sets the "DetachedStructuresNonStandarddizedCost" element
     */
    public void setDetachedStructuresNonStandarddizedCost(com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost detachedStructuresNonStandarddizedCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost)get_store().find_element_user(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost)get_store().add_element_user(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12);
            }
            target.set(detachedStructuresNonStandarddizedCost);
        }
    }
    
    /**
     * Appends and returns a new empty "DetachedStructuresNonStandarddizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost addNewDetachedStructuresNonStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost)get_store().add_element_user(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "DetachedStructuresNonStandarddizedCost" element
     */
    public void unsetDetachedStructuresNonStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETACHEDSTRUCTURESNONSTANDARDDIZEDCOST$12, 0);
        }
    }
    
    /**
     * Gets the "DetachedStructuresStandarddizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost getDetachedStructuresStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost)get_store().find_element_user(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DetachedStructuresStandarddizedCost" element
     */
    public boolean isSetDetachedStructuresStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14) != 0;
        }
    }
    
    /**
     * Sets the "DetachedStructuresStandarddizedCost" element
     */
    public void setDetachedStructuresStandarddizedCost(com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost detachedStructuresStandarddizedCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost)get_store().find_element_user(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost)get_store().add_element_user(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14);
            }
            target.set(detachedStructuresStandarddizedCost);
        }
    }
    
    /**
     * Appends and returns a new empty "DetachedStructuresStandarddizedCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost addNewDetachedStructuresStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost)get_store().add_element_user(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "DetachedStructuresStandarddizedCost" element
     */
    public void unsetDetachedStructuresStandarddizedCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETACHEDSTRUCTURESSTANDARDDIZEDCOST$14, 0);
        }
    }
    
    /**
     * Gets the "WholeBuildingCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.WholeBuildingCost getWholeBuildingCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.WholeBuildingCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.WholeBuildingCost)get_store().find_element_user(WHOLEBUILDINGCOST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WholeBuildingCost" element
     */
    public boolean isSetWholeBuildingCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHOLEBUILDINGCOST$16) != 0;
        }
    }
    
    /**
     * Sets the "WholeBuildingCost" element
     */
    public void setWholeBuildingCost(com.msbinfo.expresslync.rct.valuation.WholeBuildingCost wholeBuildingCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.WholeBuildingCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.WholeBuildingCost)get_store().find_element_user(WHOLEBUILDINGCOST$16, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.WholeBuildingCost)get_store().add_element_user(WHOLEBUILDINGCOST$16);
            }
            target.set(wholeBuildingCost);
        }
    }
    
    /**
     * Appends and returns a new empty "WholeBuildingCost" element
     */
    public com.msbinfo.expresslync.rct.valuation.WholeBuildingCost addNewWholeBuildingCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.WholeBuildingCost target = null;
            target = (com.msbinfo.expresslync.rct.valuation.WholeBuildingCost)get_store().add_element_user(WHOLEBUILDINGCOST$16);
            return target;
        }
    }
    
    /**
     * Unsets the "WholeBuildingCost" element
     */
    public void unsetWholeBuildingCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHOLEBUILDINGCOST$16, 0);
        }
    }
}
