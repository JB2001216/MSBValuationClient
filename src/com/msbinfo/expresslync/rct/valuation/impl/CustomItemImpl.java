/*
 * XML Type:  CustomItem
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.CustomItem
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML CustomItem(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class CustomItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.CustomItem
{
    
    public CustomItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Description");
    private static final javax.xml.namespace.QName COMMENT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Comment");
    private static final javax.xml.namespace.QName QUANTITY$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Quantity");
    private static final javax.xml.namespace.QName UNITOFMEASURE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "UnitOfMeasure");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Location");
    
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "Comment" element
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comment" element
     */
    public org.apache.xmlbeans.XmlString xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$2) != 0;
        }
    }
    
    /**
     * Sets the "Comment" element
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$2);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "Comment" element
     */
    public void xsetComment(org.apache.xmlbeans.XmlString comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$2);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "Comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$2, 0);
        }
    }
    
    /**
     * Gets the "Quantity" element
     */
    public java.math.BigDecimal getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantity" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(QUANTITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(java.math.BigDecimal quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$4);
            }
            target.setBigDecimalValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "Quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlDecimal quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(QUANTITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(QUANTITY$4);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Gets the "UnitOfMeasure" element
     */
    public com.msbinfo.expresslync.rct.valuation.Unit.Enum getUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.Unit.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitOfMeasure" element
     */
    public com.msbinfo.expresslync.rct.valuation.Unit xgetUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Unit target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Unit)get_store().find_element_user(UNITOFMEASURE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UnitOfMeasure" element
     */
    public void setUnitOfMeasure(com.msbinfo.expresslync.rct.valuation.Unit.Enum unitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITOFMEASURE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITOFMEASURE$6);
            }
            target.setEnumValue(unitOfMeasure);
        }
    }
    
    /**
     * Sets (as xml) the "UnitOfMeasure" element
     */
    public void xsetUnitOfMeasure(com.msbinfo.expresslync.rct.valuation.Unit unitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Unit target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Unit)get_store().find_element_user(UNITOFMEASURE$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Unit)get_store().add_element_user(UNITOFMEASURE$6);
            }
            target.set(unitOfMeasure);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Location" element
     */
    public com.msbinfo.expresslync.rct.valuation.BuildingSystem xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().find_element_user(LOCATION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(com.msbinfo.expresslync.rct.valuation.BuildingSystem.Enum location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$8);
            }
            target.setEnumValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "Location" element
     */
    public void xsetLocation(com.msbinfo.expresslync.rct.valuation.BuildingSystem location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BuildingSystem target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().find_element_user(LOCATION$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BuildingSystem)get_store().add_element_user(LOCATION$8);
            }
            target.set(location);
        }
    }
}
