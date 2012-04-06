/*
 * XML Type:  FoundationBasementInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML FoundationBasementInfo(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class FoundationBasementInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo
{
    
    public FoundationBasementInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SLABPCT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SlabPct");
    private static final javax.xml.namespace.QName CRAWLSPACEPCT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CrawlSpacePct");
    private static final javax.xml.namespace.QName BASEMENTPCT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BasementPct");
    private static final javax.xml.namespace.QName PIERSRAISEDPCT$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PiersRaisedPct");
    private static final javax.xml.namespace.QName HILLSIDESLOPE$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HillsideSlope");
    private static final javax.xml.namespace.QName SUSPENDEDOVERHILLSIDEPCT$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SuspendedOverHillsidePct");
    private static final javax.xml.namespace.QName BASEMENTINFO$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BasementInfo");
    
    
    /**
     * Gets the "SlabPct" element
     */
    public short getSlabPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLABPCT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "SlabPct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetSlabPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SLABPCT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SlabPct" element
     */
    public void setSlabPct(short slabPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLABPCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLABPCT$0);
            }
            target.setShortValue(slabPct);
        }
    }
    
    /**
     * Sets (as xml) the "SlabPct" element
     */
    public void xsetSlabPct(org.apache.xmlbeans.XmlUnsignedByte slabPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SLABPCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(SLABPCT$0);
            }
            target.set(slabPct);
        }
    }
    
    /**
     * Gets the "CrawlSpacePct" element
     */
    public short getCrawlSpacePct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRAWLSPACEPCT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "CrawlSpacePct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCrawlSpacePct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CRAWLSPACEPCT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CrawlSpacePct" element
     */
    public void setCrawlSpacePct(short crawlSpacePct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRAWLSPACEPCT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRAWLSPACEPCT$2);
            }
            target.setShortValue(crawlSpacePct);
        }
    }
    
    /**
     * Sets (as xml) the "CrawlSpacePct" element
     */
    public void xsetCrawlSpacePct(org.apache.xmlbeans.XmlUnsignedByte crawlSpacePct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CRAWLSPACEPCT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CRAWLSPACEPCT$2);
            }
            target.set(crawlSpacePct);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMENTPCT$4, 0);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BASEMENTPCT$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASEMENTPCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASEMENTPCT$4);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BASEMENTPCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(BASEMENTPCT$4);
            }
            target.set(basementPct);
        }
    }
    
    /**
     * Gets the "PiersRaisedPct" element
     */
    public short getPiersRaisedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIERSRAISEDPCT$6, 0);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PIERSRAISEDPCT$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIERSRAISEDPCT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PIERSRAISEDPCT$6);
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
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PIERSRAISEDPCT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(PIERSRAISEDPCT$6);
            }
            target.set(piersRaisedPct);
        }
    }
    
    /**
     * Gets the "HillsideSlope" element
     */
    public com.msbinfo.expresslync.rct.valuation.HillsideSlope.Enum getHillsideSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HILLSIDESLOPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.HillsideSlope.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HillsideSlope" element
     */
    public com.msbinfo.expresslync.rct.valuation.HillsideSlope xgetHillsideSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HillsideSlope target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HillsideSlope)get_store().find_element_user(HILLSIDESLOPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "HillsideSlope" element
     */
    public boolean isSetHillsideSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HILLSIDESLOPE$8) != 0;
        }
    }
    
    /**
     * Sets the "HillsideSlope" element
     */
    public void setHillsideSlope(com.msbinfo.expresslync.rct.valuation.HillsideSlope.Enum hillsideSlope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HILLSIDESLOPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HILLSIDESLOPE$8);
            }
            target.setEnumValue(hillsideSlope);
        }
    }
    
    /**
     * Sets (as xml) the "HillsideSlope" element
     */
    public void xsetHillsideSlope(com.msbinfo.expresslync.rct.valuation.HillsideSlope hillsideSlope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HillsideSlope target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HillsideSlope)get_store().find_element_user(HILLSIDESLOPE$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HillsideSlope)get_store().add_element_user(HILLSIDESLOPE$8);
            }
            target.set(hillsideSlope);
        }
    }
    
    /**
     * Unsets the "HillsideSlope" element
     */
    public void unsetHillsideSlope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HILLSIDESLOPE$8, 0);
        }
    }
    
    /**
     * Gets the "SuspendedOverHillsidePct" element
     */
    public short getSuspendedOverHillsidePct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENDEDOVERHILLSIDEPCT$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuspendedOverHillsidePct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetSuspendedOverHillsidePct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SUSPENDEDOVERHILLSIDEPCT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SuspendedOverHillsidePct" element
     */
    public void setSuspendedOverHillsidePct(short suspendedOverHillsidePct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUSPENDEDOVERHILLSIDEPCT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUSPENDEDOVERHILLSIDEPCT$10);
            }
            target.setShortValue(suspendedOverHillsidePct);
        }
    }
    
    /**
     * Sets (as xml) the "SuspendedOverHillsidePct" element
     */
    public void xsetSuspendedOverHillsidePct(org.apache.xmlbeans.XmlUnsignedByte suspendedOverHillsidePct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SUSPENDEDOVERHILLSIDEPCT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(SUSPENDEDOVERHILLSIDEPCT$10);
            }
            target.set(suspendedOverHillsidePct);
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
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().find_element_user(BASEMENTINFO$12, 0);
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
            return get_store().count_elements(BASEMENTINFO$12) != 0;
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
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().find_element_user(BASEMENTINFO$12, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().add_element_user(BASEMENTINFO$12);
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
            target = (com.msbinfo.expresslync.rct.valuation.BasementInfo)get_store().add_element_user(BASEMENTINFO$12);
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
            get_store().remove_element(BASEMENTINFO$12, 0);
        }
    }
}
