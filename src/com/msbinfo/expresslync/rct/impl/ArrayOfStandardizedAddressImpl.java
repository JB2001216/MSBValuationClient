/*
 * XML Type:  ArrayOfStandardizedAddress
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * An XML ArrayOfStandardizedAddress(@http://msbinfo.com/expresslync/rct).
 *
 * This is a complex type.
 */
public class ArrayOfStandardizedAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress
{
    
    public ArrayOfStandardizedAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDIZEDADDRESS$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "StandardizedAddress");
    
    
    /**
     * Gets array of all "StandardizedAddress" elements
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress[] getStandardizedAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STANDARDIZEDADDRESS$0, targetList);
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress[] result = new com.msbinfo.expresslync.rct.valuation.StandardizedAddress[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StandardizedAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress getStandardizedAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().find_element_user(STANDARDIZEDADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StandardizedAddress" element
     */
    public int sizeOfStandardizedAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDIZEDADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "StandardizedAddress" element
     */
    public void setStandardizedAddressArray(com.msbinfo.expresslync.rct.valuation.StandardizedAddress[] standardizedAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(standardizedAddressArray, STANDARDIZEDADDRESS$0);
        }
    }
    
    /**
     * Sets ith "StandardizedAddress" element
     */
    public void setStandardizedAddressArray(int i, com.msbinfo.expresslync.rct.valuation.StandardizedAddress standardizedAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().find_element_user(STANDARDIZEDADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(standardizedAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StandardizedAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress insertNewStandardizedAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().insert_element_user(STANDARDIZEDADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StandardizedAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress addNewStandardizedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().add_element_user(STANDARDIZEDADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StandardizedAddress" element
     */
    public void removeStandardizedAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDIZEDADDRESS$0, i);
        }
    }
}
