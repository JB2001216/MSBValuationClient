/*
 * XML Type:  HighValueValuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueValuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueValuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueValuationImpl extends com.msbinfo.expresslync.rct.valuation.impl.CalculatableValuationImpl implements com.msbinfo.expresslync.rct.valuation.HighValueValuation
{
    
    public HighValueValuationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMITEM$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CustomItem");
    
    
    /**
     * Gets array of all "CustomItem" elements
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueCustomItem[] getCustomItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMITEM$0, targetList);
            com.msbinfo.expresslync.rct.valuation.HighValueCustomItem[] result = new com.msbinfo.expresslync.rct.valuation.HighValueCustomItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CustomItem" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueCustomItem getCustomItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueCustomItem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem)get_store().find_element_user(CUSTOMITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CustomItem" element
     */
    public int sizeOfCustomItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMITEM$0);
        }
    }
    
    /**
     * Sets array of all "CustomItem" element
     */
    public void setCustomItemArray(com.msbinfo.expresslync.rct.valuation.HighValueCustomItem[] customItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customItemArray, CUSTOMITEM$0);
        }
    }
    
    /**
     * Sets ith "CustomItem" element
     */
    public void setCustomItemArray(int i, com.msbinfo.expresslync.rct.valuation.HighValueCustomItem customItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueCustomItem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem)get_store().find_element_user(CUSTOMITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CustomItem" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueCustomItem insertNewCustomItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueCustomItem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem)get_store().insert_element_user(CUSTOMITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CustomItem" element
     */
    public com.msbinfo.expresslync.rct.valuation.HighValueCustomItem addNewCustomItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HighValueCustomItem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem)get_store().add_element_user(CUSTOMITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CustomItem" element
     */
    public void removeCustomItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMITEM$0, i);
        }
    }
}
