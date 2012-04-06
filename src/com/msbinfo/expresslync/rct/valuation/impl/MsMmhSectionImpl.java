/*
 * XML Type:  MsMmhSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MsMmhSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MsMmhSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MsMmhSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.SectionImpl implements com.msbinfo.expresslync.rct.valuation.MsMmhSection
{
    
    public MsMmhSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIMETERCHOICE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PerimeterChoice");
    private static final javax.xml.namespace.QName MEASUREDPERIMETER$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MeasuredPerimeter");
    private static final javax.xml.namespace.QName LENGTHANDWIDTH$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LengthAndWidth");
    private static final javax.xml.namespace.QName LIVINGAREAENTRYMETHOD$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LivingAreaEntryMethod");
    
    
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
     * Gets the "MeasuredPerimeter" element
     */
    public short getMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREDPERIMETER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MeasuredPerimeter" element
     */
    public org.apache.xmlbeans.XmlShort xgetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MEASUREDPERIMETER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MeasuredPerimeter" element
     */
    public boolean isSetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDPERIMETER$2) != 0;
        }
    }
    
    /**
     * Sets the "MeasuredPerimeter" element
     */
    public void setMeasuredPerimeter(short measuredPerimeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEASUREDPERIMETER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEASUREDPERIMETER$2);
            }
            target.setShortValue(measuredPerimeter);
        }
    }
    
    /**
     * Sets (as xml) the "MeasuredPerimeter" element
     */
    public void xsetMeasuredPerimeter(org.apache.xmlbeans.XmlShort measuredPerimeter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(MEASUREDPERIMETER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(MEASUREDPERIMETER$2);
            }
            target.set(measuredPerimeter);
        }
    }
    
    /**
     * Unsets the "MeasuredPerimeter" element
     */
    public void unsetMeasuredPerimeter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDPERIMETER$2, 0);
        }
    }
    
    /**
     * Gets the "LengthAndWidth" element
     */
    public com.msbinfo.expresslync.rct.valuation.LengthWidth getLengthAndWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LengthWidth target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LengthWidth)get_store().find_element_user(LENGTHANDWIDTH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LengthAndWidth" element
     */
    public boolean isSetLengthAndWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTHANDWIDTH$4) != 0;
        }
    }
    
    /**
     * Sets the "LengthAndWidth" element
     */
    public void setLengthAndWidth(com.msbinfo.expresslync.rct.valuation.LengthWidth lengthAndWidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LengthWidth target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LengthWidth)get_store().find_element_user(LENGTHANDWIDTH$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.LengthWidth)get_store().add_element_user(LENGTHANDWIDTH$4);
            }
            target.set(lengthAndWidth);
        }
    }
    
    /**
     * Appends and returns a new empty "LengthAndWidth" element
     */
    public com.msbinfo.expresslync.rct.valuation.LengthWidth addNewLengthAndWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LengthWidth target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LengthWidth)get_store().add_element_user(LENGTHANDWIDTH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LengthAndWidth" element
     */
    public void unsetLengthAndWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTHANDWIDTH$4, 0);
        }
    }
    
    /**
     * Gets the "LivingAreaEntryMethod" element
     */
    public com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod.Enum getLivingAreaEntryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREAENTRYMETHOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LivingAreaEntryMethod" element
     */
    public com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod xgetLivingAreaEntryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod)get_store().find_element_user(LIVINGAREAENTRYMETHOD$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LivingAreaEntryMethod" element
     */
    public boolean isSetLivingAreaEntryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVINGAREAENTRYMETHOD$6) != 0;
        }
    }
    
    /**
     * Sets the "LivingAreaEntryMethod" element
     */
    public void setLivingAreaEntryMethod(com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod.Enum livingAreaEntryMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREAENTRYMETHOD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVINGAREAENTRYMETHOD$6);
            }
            target.setEnumValue(livingAreaEntryMethod);
        }
    }
    
    /**
     * Sets (as xml) the "LivingAreaEntryMethod" element
     */
    public void xsetLivingAreaEntryMethod(com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod livingAreaEntryMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod)get_store().find_element_user(LIVINGAREAENTRYMETHOD$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod)get_store().add_element_user(LIVINGAREAENTRYMETHOD$6);
            }
            target.set(livingAreaEntryMethod);
        }
    }
    
    /**
     * Unsets the "LivingAreaEntryMethod" element
     */
    public void unsetLivingAreaEntryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVINGAREAENTRYMETHOD$6, 0);
        }
    }
}
