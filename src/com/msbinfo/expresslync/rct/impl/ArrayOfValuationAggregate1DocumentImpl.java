/*
 * An XML document type.
 * Localname: ArrayOfValuationAggregate1
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ArrayOfValuationAggregate1(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ArrayOfValuationAggregate1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document
{
    
    public ArrayOfValuationAggregate1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALUATIONAGGREGATE1$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ArrayOfValuationAggregate1");
    
    
    /**
     * Gets the "ArrayOfValuationAggregate1" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 getArrayOfValuationAggregate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().find_element_user(ARRAYOFVALUATIONAGGREGATE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValuationAggregate1" element
     */
    public boolean isNilArrayOfValuationAggregate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().find_element_user(ARRAYOFVALUATIONAGGREGATE1$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValuationAggregate1" element
     */
    public void setArrayOfValuationAggregate1(com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 arrayOfValuationAggregate1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().find_element_user(ARRAYOFVALUATIONAGGREGATE1$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().add_element_user(ARRAYOFVALUATIONAGGREGATE1$0);
            }
            target.set(arrayOfValuationAggregate1);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValuationAggregate1" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 addNewArrayOfValuationAggregate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().add_element_user(ARRAYOFVALUATIONAGGREGATE1$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValuationAggregate1" element
     */
    public void setNilArrayOfValuationAggregate1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().find_element_user(ARRAYOFVALUATIONAGGREGATE1$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1)get_store().add_element_user(ARRAYOFVALUATIONAGGREGATE1$0);
            }
            target.setNil();
        }
    }
}
