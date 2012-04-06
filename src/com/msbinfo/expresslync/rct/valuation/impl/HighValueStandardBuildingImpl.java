/*
 * XML Type:  HighValueStandardBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueStandardBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueStandardBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueStandardBuildingImpl extends com.msbinfo.expresslync.rct.valuation.impl.BuildingImpl implements com.msbinfo.expresslync.rct.valuation.HighValueStandardBuilding
{
    
    public HighValueStandardBuildingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Section");
    private static final javax.xml.namespace.QName COMPONENT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Component");
    
    
    /**
     * Gets array of all "Section" elements
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardSection[] getSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECTION$0, targetList);
            com.msbinfo.expresslync.rct.valuation.HighValueStandardSection[] result = new com.msbinfo.expresslync.rct.valuation.HighValueStandardSection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardSection getSectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardSection)get_store().find_element_user(SECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Section" element
     */
    public int sizeOfSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTION$0);
        }
    }
    
    /**
     * Sets array of all "Section" element
     */
    public void setSectionArray(com.msbinfo.expresslync.rct.valuation.HighValueStandardSection[] sectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sectionArray, SECTION$0);
        }
    }
    
    /**
     * Sets ith "Section" element
     */
    public void setSectionArray(int i, com.msbinfo.expresslync.rct.valuation.HighValueStandardSection section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardSection)get_store().find_element_user(SECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(section);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardSection insertNewSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardSection)get_store().insert_element_user(SECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueStandardSection addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueStandardSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueStandardSection)get_store().add_element_user(SECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Section" element
     */
    public void removeSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTION$0, i);
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
            get_store().find_all_element_users(COMPONENT$2, targetList);
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
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().find_element_user(COMPONENT$2, i);
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
            return get_store().count_elements(COMPONENT$2);
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
            arraySetterHelper(componentArray, COMPONENT$2);
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
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().find_element_user(COMPONENT$2, i);
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
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().insert_element_user(COMPONENT$2, i);
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
            target = (com.msbinfo.expresslync.rct.valuation.Component)get_store().add_element_user(COMPONENT$2);
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
            get_store().remove_element(COMPONENT$2, i);
        }
    }
}
