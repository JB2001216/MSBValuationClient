/*
 * XML Type:  Room
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Room
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Room(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class RoomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Room
{
    
    public RoomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName SIZE$2 = 
        new javax.xml.namespace.QName("", "Size");
    private static final javax.xml.namespace.QName NUMBER$4 = 
        new javax.xml.namespace.QName("", "Number");
    
    
    /**
     * Gets the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RoomType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.RoomType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RoomType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RoomType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RoomType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(com.msbinfo.expresslync.rct.valuation.RoomType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(com.msbinfo.expresslync.rct.valuation.RoomType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RoomType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RoomType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.RoomType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "Size" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RoomSize.Enum getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.RoomSize.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Size" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RoomSize xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RoomSize target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RoomSize)get_store().find_attribute_user(SIZE$2);
            return target;
        }
    }
    
    /**
     * Sets the "Size" attribute
     */
    public void setSize(com.msbinfo.expresslync.rct.valuation.RoomSize.Enum size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
            }
            target.setEnumValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "Size" attribute
     */
    public void xsetSize(com.msbinfo.expresslync.rct.valuation.RoomSize size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RoomSize target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RoomSize)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.RoomSize)get_store().add_attribute_user(SIZE$2);
            }
            target.set(size);
        }
    }
    
    /**
     * Gets the "Number" attribute
     */
    public short getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$4);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(NUMBER$4);
            return target;
        }
    }
    
    /**
     * Sets the "Number" attribute
     */
    public void setNumber(short number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBER$4);
            }
            target.setShortValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" attribute
     */
    public void xsetNumber(org.apache.xmlbeans.XmlUnsignedByte number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_attribute_user(NUMBER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_attribute_user(NUMBER$4);
            }
            target.set(number);
        }
    }
}
