/*
 * XML Type:  ArrayOfValuationAggregate
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfValuationAggregate
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * An XML ArrayOfValuationAggregate(@http://msbinfo.com/expresslync/rct).
 *
 * This is a complex type.
 */
public class ArrayOfValuationAggregateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfValuationAggregate
{
    
    public ArrayOfValuationAggregateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "Valuation");
    
    
    /**
     * Gets array of all "Valuation" elements
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] getValuationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUATION$0, targetList);
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] result = new com.msbinfo.expresslync.rct.valuation.ValuationAggregate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Valuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Valuation" element
     */
    public boolean isNilValuationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Valuation" element
     */
    public int sizeOfValuationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUATION$0);
        }
    }
    
    /**
     * Sets array of all "Valuation" element
     */
    public void setValuationArray(com.msbinfo.expresslync.rct.valuation.ValuationAggregate[] valuationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valuationArray, VALUATION$0);
        }
    }
    
    /**
     * Sets ith "Valuation" element
     */
    public void setValuationArray(int i, com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valuation);
        }
    }
    
    /**
     * Nils the ith "Valuation" element
     */
    public void setNilValuationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Valuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate insertNewValuation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().insert_element_user(VALUATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Valuation" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Valuation" element
     */
    public void removeValuation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUATION$0, i);
        }
    }
}
