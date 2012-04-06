/*
 * XML Type:  HighValueAdvancedBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueAdvancedBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueAdvancedBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueAdvancedBuildingImpl extends com.msbinfo.expresslync.rct.valuation.impl.BuildingImpl implements com.msbinfo.expresslync.rct.valuation.HighValueAdvancedBuilding
{
    
    public HighValueAdvancedBuildingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Section");
    
    
    /**
     * Gets array of all "Section" elements
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection[] getSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECTION$0, targetList);
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection[] result = new com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection getSectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection)get_store().find_element_user(SECTION$0, i);
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
    public void setSectionArray(com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection[] sectionArray)
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
    public void setSectionArray(int i, com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection)get_store().find_element_user(SECTION$0, i);
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
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection insertNewSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection)get_store().insert_element_user(SECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection)get_store().add_element_user(SECTION$0);
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
}
