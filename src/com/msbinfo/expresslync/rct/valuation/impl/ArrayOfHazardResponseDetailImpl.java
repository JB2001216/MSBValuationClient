/*
 * XML Type:  ArrayOfHazardResponseDetail
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML ArrayOfHazardResponseDetail(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ArrayOfHazardResponseDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail
{
    
    public ArrayOfHazardResponseDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAIL$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Detail");
    
    
    /**
     * Gets array of all "Detail" elements
     */
    public com.msbinfo.expresslync.rct.valuation.HazardResponseDetail[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$0, targetList);
            com.msbinfo.expresslync.rct.valuation.HazardResponseDetail[] result = new com.msbinfo.expresslync.rct.valuation.HazardResponseDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Detail" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardResponseDetail getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardResponseDetail)get_store().find_element_user(DETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$0);
        }
    }
    
    /**
     * Sets array of all "Detail" element
     */
    public void setDetailArray(com.msbinfo.expresslync.rct.valuation.HazardResponseDetail[] detailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(detailArray, DETAIL$0);
        }
    }
    
    /**
     * Sets ith "Detail" element
     */
    public void setDetailArray(int i, com.msbinfo.expresslync.rct.valuation.HazardResponseDetail detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardResponseDetail)get_store().find_element_user(DETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(detail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Detail" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardResponseDetail insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardResponseDetail)get_store().insert_element_user(DETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Detail" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardResponseDetail addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardResponseDetail)get_store().add_element_user(DETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$0, i);
        }
    }
}
