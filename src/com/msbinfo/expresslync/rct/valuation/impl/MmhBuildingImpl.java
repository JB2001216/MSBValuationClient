/*
 * XML Type:  MmhBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MmhBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MmhBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MmhBuildingImpl extends com.msbinfo.expresslync.rct.valuation.impl.MsMmhBuildingImpl implements com.msbinfo.expresslync.rct.valuation.MmhBuilding
{
    
    public MmhBuildingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Section");
    
    
    /**
     * Gets the "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhSection getSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhSection)get_store().find_element_user(SECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Section" element
     */
    public boolean isSetSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Section" element
     */
    public void setSection(com.msbinfo.expresslync.rct.valuation.MmhSection section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhSection)get_store().find_element_user(SECTION$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MmhSection)get_store().add_element_user(SECTION$0);
            }
            target.set(section);
        }
    }
    
    /**
     * Appends and returns a new empty "Section" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhSection addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhSection target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhSection)get_store().add_element_user(SECTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Section" element
     */
    public void unsetSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTION$0, 0);
        }
    }
}
