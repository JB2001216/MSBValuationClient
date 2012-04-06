/*
 * XML Type:  HighValueStandardSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueStandardSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HighValueStandardSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HighValueStandardSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.HighValueSectionImpl implements com.msbinfo.expresslync.rct.valuation.HighValueStandardSection
{
    
    public HighValueStandardSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIMETERCHOICE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PerimeterChoice");
    private static final javax.xml.namespace.QName SHAPE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Shape");
    
    
    /**
     * Gets the "PerimeterChoice" element
     */
    public com.msbinfo.expresslync.rct.valuation.PerimeterChoice.Enum getPerimeterChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIMETERCHOICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.PerimeterChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PerimeterChoice" element
     */
    public com.msbinfo.expresslync.rct.valuation.PerimeterChoice xgetPerimeterChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PerimeterChoice target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PerimeterChoice)get_store().find_element_user(PERIMETERCHOICE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "PerimeterChoice" element
     */
    public boolean isSetPerimeterChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIMETERCHOICE$0) != 0;
        }
    }
    
    /**
     * Sets the "PerimeterChoice" element
     */
    public void setPerimeterChoice(com.msbinfo.expresslync.rct.valuation.PerimeterChoice.Enum perimeterChoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIMETERCHOICE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIMETERCHOICE$0);
            }
            target.setEnumValue(perimeterChoice);
        }
    }
    
    /**
     * Sets (as xml) the "PerimeterChoice" element
     */
    public void xsetPerimeterChoice(com.msbinfo.expresslync.rct.valuation.PerimeterChoice perimeterChoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PerimeterChoice target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PerimeterChoice)get_store().find_element_user(PERIMETERCHOICE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PerimeterChoice)get_store().add_element_user(PERIMETERCHOICE$0);
            }
            target.set(perimeterChoice);
        }
    }
    
    /**
     * Unsets the "PerimeterChoice" element
     */
    public void unsetPerimeterChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIMETERCHOICE$0, 0);
        }
    }
    
    /**
     * Gets the "Shape" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionShape.Enum getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.SectionShape.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Shape" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionShape xgetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionShape target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().find_element_user(SHAPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Shape" element
     */
    public boolean isSetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPE$2) != 0;
        }
    }
    
    /**
     * Sets the "Shape" element
     */
    public void setShape(com.msbinfo.expresslync.rct.valuation.SectionShape.Enum shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAPE$2);
            }
            target.setEnumValue(shape);
        }
    }
    
    /**
     * Sets (as xml) the "Shape" element
     */
    public void xsetShape(com.msbinfo.expresslync.rct.valuation.SectionShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionShape target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().add_element_user(SHAPE$2);
            }
            target.set(shape);
        }
    }
    
    /**
     * Unsets the "Shape" element
     */
    public void unsetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPE$2, 0);
        }
    }
}
