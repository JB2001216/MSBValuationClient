/*
 * XML Type:  StringArray
 * Namespace: http://msbinfo.com/expresslync/rct/AbstractTypes
 * Java type: com.msbinfo.expresslync.rct.abstracttypes.StringArray
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.abstracttypes.impl;
/**
 * An XML StringArray(@http://msbinfo.com/expresslync/rct/AbstractTypes).
 *
 * This is a complex type.
 */
public class StringArrayImpl extends org.xmlsoap.schemas.soap.encoding.impl.ArrayImpl implements com.msbinfo.expresslync.rct.abstracttypes.StringArray
{
    
    public StringArrayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRING$0 = 
        new javax.xml.namespace.QName("", "String");
    
    
    /**
     * Gets array of all "String" elements
     */
    public java.lang.String[] getStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRING$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "String" element
     */
    public java.lang.String getStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "String" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRING$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "String" element
     */
    public org.apache.xmlbeans.XmlString xgetStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "String" element
     */
    public int sizeOfStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRING$0);
        }
    }
    
    /**
     * Sets array of all "String" element
     */
    public void setStringArray(java.lang.String[] stringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringArray, STRING$0);
        }
    }
    
    /**
     * Sets ith "String" element
     */
    public void setStringArray(int i, java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(string);
        }
    }
    
    /**
     * Sets (as xml) array of all "String" element
     */
    public void xsetStringArray(org.apache.xmlbeans.XmlString[]stringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringArray, STRING$0);
        }
    }
    
    /**
     * Sets (as xml) ith "String" element
     */
    public void xsetStringArray(int i, org.apache.xmlbeans.XmlString string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(string);
        }
    }
    
    /**
     * Inserts the value as the ith "String" element
     */
    public void insertString(int i, java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRING$0, i);
            target.setStringValue(string);
        }
    }
    
    /**
     * Appends the value as the last "String" element
     */
    public void addString(java.lang.String string)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRING$0);
            target.setStringValue(string);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "String" element
     */
    public org.apache.xmlbeans.XmlString insertNewString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "String" element
     */
    public org.apache.xmlbeans.XmlString addNewString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "String" element
     */
    public void removeString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRING$0, i);
        }
    }
}
