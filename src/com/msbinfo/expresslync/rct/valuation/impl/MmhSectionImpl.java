/*
 * XML Type:  MmhSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MmhSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MmhSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MmhSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.MsMmhSectionImpl implements com.msbinfo.expresslync.rct.valuation.MmhSection
{
    
    public MmhSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOUNDATIONANDBASEMENT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FoundationAndBasement");
    private static final javax.xml.namespace.QName FRAMING$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Framing");
    private static final javax.xml.namespace.QName HINGEDROOF$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HingedRoof");
    
    
    /**
     * Gets the "FoundationAndBasement" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo getFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo)get_store().find_element_user(FOUNDATIONANDBASEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FoundationAndBasement" element
     */
    public boolean isSetFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDATIONANDBASEMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "FoundationAndBasement" element
     */
    public void setFoundationAndBasement(com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo foundationAndBasement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo)get_store().find_element_user(FOUNDATIONANDBASEMENT$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo)get_store().add_element_user(FOUNDATIONANDBASEMENT$0);
            }
            target.set(foundationAndBasement);
        }
    }
    
    /**
     * Appends and returns a new empty "FoundationAndBasement" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo addNewFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo)get_store().add_element_user(FOUNDATIONANDBASEMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FoundationAndBasement" element
     */
    public void unsetFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDATIONANDBASEMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "Framing" elements
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown[] getFramingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FRAMING$2, targetList);
            com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown[] result = new com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown getFramingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown)get_store().find_element_user(FRAMING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Framing" element
     */
    public int sizeOfFramingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMING$2);
        }
    }
    
    /**
     * Sets array of all "Framing" element
     */
    public void setFramingArray(com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown[] framingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(framingArray, FRAMING$2);
        }
    }
    
    /**
     * Sets ith "Framing" element
     */
    public void setFramingArray(int i, com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown framing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown)get_store().find_element_user(FRAMING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(framing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown insertNewFraming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown)get_store().insert_element_user(FRAMING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown addNewFraming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MmhFramingBreakdown)get_store().add_element_user(FRAMING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Framing" element
     */
    public void removeFraming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMING$2, i);
        }
    }
    
    /**
     * Gets the "HingedRoof" element
     */
    public boolean getHingedRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINGEDROOF$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HingedRoof" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHingedRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HINGEDROOF$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "HingedRoof" element
     */
    public boolean isSetHingedRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HINGEDROOF$4) != 0;
        }
    }
    
    /**
     * Sets the "HingedRoof" element
     */
    public void setHingedRoof(boolean hingedRoof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HINGEDROOF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HINGEDROOF$4);
            }
            target.setBooleanValue(hingedRoof);
        }
    }
    
    /**
     * Sets (as xml) the "HingedRoof" element
     */
    public void xsetHingedRoof(org.apache.xmlbeans.XmlBoolean hingedRoof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HINGEDROOF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HINGEDROOF$4);
            }
            target.set(hingedRoof);
        }
    }
    
    /**
     * Unsets the "HingedRoof" element
     */
    public void unsetHingedRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HINGEDROOF$4, 0);
        }
    }
}
