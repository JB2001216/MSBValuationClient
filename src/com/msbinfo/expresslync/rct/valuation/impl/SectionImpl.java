/*
 * XML Type:  Section
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Section
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Section(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class SectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Section
{
    
    public SectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Number");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Name");
    private static final javax.xml.namespace.QName YEARBUILT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "YearBuilt");
    private static final javax.xml.namespace.QName CONTRUCTIONTYPE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ContructionType");
    private static final javax.xml.namespace.QName NOOFSTORIES$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "NoOfStories");
    private static final javax.xml.namespace.QName LIVINGAREA$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LivingArea");
    
    
    /**
     * Gets the "Number" element
     */
    public short getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    public void setNumber(short number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$0);
            }
            target.setShortValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlUnsignedByte number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(NUMBER$0);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "YearBuilt" element
     */
    public short getYearBuilt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILT$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "YearBuilt" element
     */
    public org.apache.xmlbeans.XmlShort xgetYearBuilt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(YEARBUILT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "YearBuilt" element
     */
    public boolean isSetYearBuilt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEARBUILT$4) != 0;
        }
    }
    
    /**
     * Sets the "YearBuilt" element
     */
    public void setYearBuilt(short yearBuilt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARBUILT$4);
            }
            target.setShortValue(yearBuilt);
        }
    }
    
    /**
     * Sets (as xml) the "YearBuilt" element
     */
    public void xsetYearBuilt(org.apache.xmlbeans.XmlShort yearBuilt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(YEARBUILT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(YEARBUILT$4);
            }
            target.set(yearBuilt);
        }
    }
    
    /**
     * Unsets the "YearBuilt" element
     */
    public void unsetYearBuilt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEARBUILT$4, 0);
        }
    }
    
    /**
     * Gets the "ContructionType" element
     */
    public com.msbinfo.expresslync.rct.valuation.ConstructionType.Enum getContructionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRUCTIONTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.ConstructionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContructionType" element
     */
    public com.msbinfo.expresslync.rct.valuation.ConstructionType xgetContructionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ConstructionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ConstructionType)get_store().find_element_user(CONTRUCTIONTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContructionType" element
     */
    public boolean isSetContructionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRUCTIONTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "ContructionType" element
     */
    public void setContructionType(com.msbinfo.expresslync.rct.valuation.ConstructionType.Enum contructionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRUCTIONTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRUCTIONTYPE$6);
            }
            target.setEnumValue(contructionType);
        }
    }
    
    /**
     * Sets (as xml) the "ContructionType" element
     */
    public void xsetContructionType(com.msbinfo.expresslync.rct.valuation.ConstructionType contructionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ConstructionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ConstructionType)get_store().find_element_user(CONTRUCTIONTYPE$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ConstructionType)get_store().add_element_user(CONTRUCTIONTYPE$6);
            }
            target.set(contructionType);
        }
    }
    
    /**
     * Unsets the "ContructionType" element
     */
    public void unsetContructionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRUCTIONTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "NoOfStories" element
     */
    public java.math.BigDecimal getNoOfStories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFSTORIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "NoOfStories" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetNoOfStories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(NOOFSTORIES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "NoOfStories" element
     */
    public boolean isSetNoOfStories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOOFSTORIES$8) != 0;
        }
    }
    
    /**
     * Sets the "NoOfStories" element
     */
    public void setNoOfStories(java.math.BigDecimal noOfStories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOOFSTORIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOOFSTORIES$8);
            }
            target.setBigDecimalValue(noOfStories);
        }
    }
    
    /**
     * Sets (as xml) the "NoOfStories" element
     */
    public void xsetNoOfStories(org.apache.xmlbeans.XmlDecimal noOfStories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(NOOFSTORIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(NOOFSTORIES$8);
            }
            target.set(noOfStories);
        }
    }
    
    /**
     * Unsets the "NoOfStories" element
     */
    public void unsetNoOfStories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOOFSTORIES$8, 0);
        }
    }
    
    /**
     * Gets the "LivingArea" element
     */
    public int getLivingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LivingArea" element
     */
    public org.apache.xmlbeans.XmlInt xgetLivingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LIVINGAREA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "LivingArea" element
     */
    public boolean isSetLivingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVINGAREA$10) != 0;
        }
    }
    
    /**
     * Sets the "LivingArea" element
     */
    public void setLivingArea(int livingArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVINGAREA$10);
            }
            target.setIntValue(livingArea);
        }
    }
    
    /**
     * Sets (as xml) the "LivingArea" element
     */
    public void xsetLivingArea(org.apache.xmlbeans.XmlInt livingArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LIVINGAREA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LIVINGAREA$10);
            }
            target.set(livingArea);
        }
    }
    
    /**
     * Unsets the "LivingArea" element
     */
    public void unsetLivingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVINGAREA$10, 0);
        }
    }
}
