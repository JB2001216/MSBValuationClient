/*
 * XML Type:  ArrayOfValuationAggregate1
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * An XML ArrayOfValuationAggregate1(@http://msbinfo.com/expresslync/rct).
 *
 * This is a complex type.
 */
public class ArrayOfValuationAggregate1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1
{
    
    public ArrayOfValuationAggregate1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationAggregate");
    
    
    /**
     * Gets array of all "ValuationAggregate" elements
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] getValuationAggregateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUATIONAGGREGATE$0, targetList);
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] result = new com.msbinfo.expresslync.rct.valuation.ValuationAggregate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValuationAggregate" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationAggregateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ValuationAggregate" element
     */
    public boolean isNilValuationAggregateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ValuationAggregate" element
     */
    public int sizeOfValuationAggregateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUATIONAGGREGATE$0);
        }
    }
    
    /**
     * Sets array of all "ValuationAggregate" element
     */
    public void setValuationAggregateArray(com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] valuationAggregateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valuationAggregateArray, VALUATIONAGGREGATE$0);
        }
    }
    
    /**
     * Sets ith "ValuationAggregate" element
     */
    public void setValuationAggregateArray(int i, com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valuationAggregate);
        }
    }
    
    /**
     * Nils the ith "ValuationAggregate" element
     */
    public void setNilValuationAggregateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValuationAggregate" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate insertNewValuationAggregate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().insert_element_user(VALUATIONAGGREGATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValuationAggregate" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONAGGREGATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValuationAggregate" element
     */
    public void removeValuationAggregate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUATIONAGGREGATE$0, i);
        }
    }
}
