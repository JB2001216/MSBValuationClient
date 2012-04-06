/*
 * XML Type:  MainstreetBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MainstreetBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MainstreetBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MainstreetBuildingImpl extends com.msbinfo.expresslync.rct.valuation.impl.MsMmhBuildingImpl implements com.msbinfo.expresslync.rct.valuation.MainstreetBuilding
{
    
    public MainstreetBuildingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBEROFFAMILIES$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "NumberOfFamilies");
    private static final javax.xml.namespace.QName SECTION$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Section");
    
    
    /**
     * Gets the "NumberOfFamilies" element
     */
    public short getNumberOfFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFFAMILIES$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfFamilies" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetNumberOfFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NUMBEROFFAMILIES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfFamilies" element
     */
    public boolean isSetNumberOfFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFFAMILIES$0) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfFamilies" element
     */
    public void setNumberOfFamilies(short numberOfFamilies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFFAMILIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFFAMILIES$0);
            }
            target.setShortValue(numberOfFamilies);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfFamilies" element
     */
    public void xsetNumberOfFamilies(org.apache.xmlbeans.XmlUnsignedByte numberOfFamilies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NUMBEROFFAMILIES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(NUMBEROFFAMILIES$0);
            }
            target.set(numberOfFamilies);
        }
    }
    
    /**
     * Unsets the "NumberOfFamilies" element
     */
    public void unsetNumberOfFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFFAMILIES$0, 0);
        }
    }
    
    /**
     * Gets array of all "Section" elements
     */
    public com.msbinfo.expresslync.rct.valuation.MainstreetSection[] getSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECTION$2, targetList);
            com.msbinfo.expresslync.rct.valuation.MainstreetSection[] result = new com.msbinfo.expresslync.rct.valuation.MainstreetSection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.MainstreetSection getSectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainstreetSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainstreetSection)get_store().find_element_user(SECTION$2, i);
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
            return get_store().count_elements(SECTION$2);
        }
    }
    
    /**
     * Sets array of all "Section" element
     */
    public void setSectionArray(com.msbinfo.expresslync.rct.valuation.MainstreetSection[] sectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sectionArray, SECTION$2);
        }
    }
    
    /**
     * Sets ith "Section" element
     */
    public void setSectionArray(int i, com.msbinfo.expresslync.rct.valuation.MainstreetSection section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainstreetSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainstreetSection)get_store().find_element_user(SECTION$2, i);
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
    public com.msbinfo.expresslync.rct.valuation.MainstreetSection insertNewSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainstreetSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainstreetSection)get_store().insert_element_user(SECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.MainstreetSection addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MainstreetSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MainstreetSection)get_store().add_element_user(SECTION$2);
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
            get_store().remove_element(SECTION$2, i);
        }
    }
}
