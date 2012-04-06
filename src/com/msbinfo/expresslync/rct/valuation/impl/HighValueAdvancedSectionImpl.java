/*
 * XML Type:  HighValueAdvancedSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueAdvancedSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueAdvancedSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.HighValueSectionImpl implements com.msbinfo.expresslync.rct.valuation.HighValueAdvancedSection
{
    
    public HighValueAdvancedSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Type");
    private static final javax.xml.namespace.QName COVERAGE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Coverage");
    
    
    /**
     * Gets the "Type" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.SectionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.msbinfo.expresslync.rct.valuation.SectionType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(com.msbinfo.expresslync.rct.valuation.SectionType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.SectionType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Coverage" element
     */
    public com.msbinfo.expresslync.rct.valuation.CoverageType.Enum getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.CoverageType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Coverage" element
     */
    public com.msbinfo.expresslync.rct.valuation.CoverageType xgetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CoverageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().find_element_user(COVERAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Coverage" element
     */
    public boolean isSetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COVERAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "Coverage" element
     */
    public void setCoverage(com.msbinfo.expresslync.rct.valuation.CoverageType.Enum coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVERAGE$2);
            }
            target.setEnumValue(coverage);
        }
    }
    
    /**
     * Sets (as xml) the "Coverage" element
     */
    public void xsetCoverage(com.msbinfo.expresslync.rct.valuation.CoverageType coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.CoverageType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().find_element_user(COVERAGE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.CoverageType)get_store().add_element_user(COVERAGE$2);
            }
            target.set(coverage);
        }
    }
    
    /**
     * Unsets the "Coverage" element
     */
    public void unsetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COVERAGE$2, 0);
        }
    }
}
