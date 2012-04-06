/*
 * XML Type:  MmhFoundationBasementInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MmhFoundationBasementInfo(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MmhFoundationBasementInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.MmhFoundationBasementInfo
{
    
    public MmhFoundationBasementInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIERSRAISEDPCT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PiersRaisedPct");
    private static final javax.xml.namespace.QName BASEMENTPCT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BasementPct");
    private static final javax.xml.namespace.QName BASEMENTINFO$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BasementInfo");
    
    
    /**
     * Gets the "PiersRaisedPct" element
     */
    public short getPiersRaisedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIERSRAISEDPCT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "PiersRaisedPct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetPiersRaisedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PIERSRAISEDPCT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PiersRaisedPct" element
     */
    public void setPiersRaisedPct(short piersRaisedPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIERSRAISEDPCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PIERSRAISEDPCT$0);
            }
            target.setShortValue(piersRaisedPct);
        }
    }
    
    /**
     * Sets (as xml) the "PiersRaisedPct" element
     */
    public void xsetPiersRaisedPct(org.apache.xmlbeans.XmlUnsignedByte piersRaisedPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PIERSRAISEDPCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(PIERSRAISEDPCT$0);
            }
            target.set(piersRaisedPct);
        }
    }
    
    /**
     * Gets the "BasementPct" element
     */
    public short getBasementPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMENTPCT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "BasementPct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetBasementPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BASEMENTPCT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BasementPct" element
     */
    public void setBasementPct(short basementPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMENTPCT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASEMENTPCT$2);
            }
            target.setShortValue(basementPct);
        }
    }
    
    /**
     * Sets (as xml) the "BasementPct" element
     */
    public void xsetBasementPct(org.apache.xmlbeans.XmlUnsignedByte basementPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BASEMENTPCT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(BASEMENTPCT$2);
            }
            target.set(basementPct);
        }
    }
    
    /**
     * Gets the "BasementInfo" element
     */
    public com.msbinfo.expresslync.rct.valuation.BasementInfo getBasementInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().find_element_user(BASEMENTINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BasementInfo" element
     */
    public boolean isSetBasementInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEMENTINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "BasementInfo" element
     */
    public void setBasementInfo(com.msbinfo.expresslync.rct.valuation.BasementInfo basementInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().find_element_user(BASEMENTINFO$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().add_element_user(BASEMENTINFO$4);
            }
            target.set(basementInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "BasementInfo" element
     */
    public com.msbinfo.expresslync.rct.valuation.BasementInfo addNewBasementInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.BasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().add_element_user(BASEMENTINFO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "BasementInfo" element
     */
    public void unsetBasementInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEMENTINFO$4, 0);
        }
    }
}
