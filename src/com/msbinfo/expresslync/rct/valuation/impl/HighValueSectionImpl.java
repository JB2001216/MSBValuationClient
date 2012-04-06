/*
 * XML Type:  HighValueSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.SectionImpl implements com.msbinfo.expresslync.rct.valuation.HighValueSection
{
    
    public HighValueSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREDPERIMETER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MeasuredPerimeter");
    private static final javax.xml.namespace.QName FLOORTOFLOORHEIGHT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FloorToFloorHeight");
    private static final javax.xml.namespace.QName COMPONENT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Component");
    
    
    /**
     * Gets the "MeasuredPerimeter" element
     */
    public short getMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREDPERIMETER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MeasuredPerimeter" element
     */
    public org.apache.xmlbeans.XmlShort xgetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MEASUREDPERIMETER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MeasuredPerimeter" element
     */
    public boolean isSetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDPERIMETER$0) != 0;
        }
    }
    
    /**
     * Sets the "MeasuredPerimeter" element
     */
    public void setMeasuredPerimeter(short measuredPerimeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREDPERIMETER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEASUREDPERIMETER$0);
            }
            target.setShortValue(measuredPerimeter);
        }
    }
    
    /**
     * Sets (as xml) the "MeasuredPerimeter" element
     */
    public void xsetMeasuredPerimeter(org.apache.xmlbeans.XmlShort measuredPerimeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MEASUREDPERIMETER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MEASUREDPERIMETER$0);
            }
            target.set(measuredPerimeter);
        }
    }
    
    /**
     * Unsets the "MeasuredPerimeter" element
     */
    public void unsetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDPERIMETER$0, 0);
        }
    }
    
    /**
     * Gets array of all "FloorToFloorHeight" elements
     */
    public com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight[] getFloorToFloorHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOORTOFLOORHEIGHT$2, targetList);
            com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight[] result = new com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight getFloorToFloorHeightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight)get_store().find_element_user(FLOORTOFLOORHEIGHT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FloorToFloorHeight" element
     */
    public int sizeOfFloorToFloorHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOORTOFLOORHEIGHT$2);
        }
    }
    
    /**
     * Sets array of all "FloorToFloorHeight" element
     */
    public void setFloorToFloorHeightArray(com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight[] floorToFloorHeightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(floorToFloorHeightArray, FLOORTOFLOORHEIGHT$2);
        }
    }
    
    /**
     * Sets ith "FloorToFloorHeight" element
     */
    public void setFloorToFloorHeightArray(int i, com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight floorToFloorHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight)get_store().find_element_user(FLOORTOFLOORHEIGHT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(floorToFloorHeight);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight insertNewFloorToFloorHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight)get_store().insert_element_user(FLOORTOFLOORHEIGHT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight addNewFloorToFloorHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FloorToFloorHeight)get_store().add_element_user(FLOORTOFLOORHEIGHT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "FloorToFloorHeight" element
     */
    public void removeFloorToFloorHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOORTOFLOORHEIGHT$2, i);
        }
    }
    
    /**
     * Gets array of all "Component" elements
     */
    public com.msbinfo.expresslync.rct.valuation.Component[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$4, targetList);
            com.msbinfo.expresslync.rct.valuation.Component[] result = new com.msbinfo.expresslync.rct.valuation.Component[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Component" element
     */
    public com.msbinfo.expresslync.rct.valuation.Component getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Component target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().find_element_user(COMPONENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$4);
        }
    }
    
    /**
     * Sets array of all "Component" element
     */
    public void setComponentArray(com.msbinfo.expresslync.rct.valuation.Component[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$4);
        }
    }
    
    /**
     * Sets ith "Component" element
     */
    public void setComponentArray(int i, com.msbinfo.expresslync.rct.valuation.Component component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Component target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().find_element_user(COMPONENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    public com.msbinfo.expresslync.rct.valuation.Component insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Component target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().insert_element_user(COMPONENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    public com.msbinfo.expresslync.rct.valuation.Component addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Component target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().add_element_user(COMPONENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$4, i);
        }
    }
}
