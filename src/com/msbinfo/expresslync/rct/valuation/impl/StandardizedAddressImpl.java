/*
 * XML Type:  StandardizedAddress
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.StandardizedAddress
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML StandardizedAddress(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class StandardizedAddressImpl extends com.msbinfo.expresslync.rct.valuation.impl.AddressImpl implements com.msbinfo.expresslync.rct.valuation.StandardizedAddress
{
    
    public StandardizedAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRY$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Country");
    private static final javax.xml.namespace.QName MATCHCODE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MatchCode");
    private static final javax.xml.namespace.QName BLOCKCODE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "BlockCode");
    private static final javax.xml.namespace.QName LOCATIONCODE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LocationCode");
    private static final javax.xml.namespace.QName LATLONG$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LatLong");
    private static final javax.xml.namespace.QName COUNTY$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "County");
    
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$0) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$0);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$0);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$0, 0);
        }
    }
    
    /**
     * Gets the "MatchCode" element
     */
    public java.lang.String getMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MatchCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MatchCode" element
     */
    public boolean isSetMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATCHCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "MatchCode" element
     */
    public void setMatchCode(java.lang.String matchCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHCODE$2);
            }
            target.setStringValue(matchCode);
        }
    }
    
    /**
     * Sets (as xml) the "MatchCode" element
     */
    public void xsetMatchCode(org.apache.xmlbeans.XmlString matchCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCHCODE$2);
            }
            target.set(matchCode);
        }
    }
    
    /**
     * Unsets the "MatchCode" element
     */
    public void unsetMatchCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATCHCODE$2, 0);
        }
    }
    
    /**
     * Gets the "BlockCode" element
     */
    public java.lang.String getBlockCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BlockCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBlockCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BlockCode" element
     */
    public boolean isSetBlockCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "BlockCode" element
     */
    public void setBlockCode(java.lang.String blockCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKCODE$4);
            }
            target.setStringValue(blockCode);
        }
    }
    
    /**
     * Sets (as xml) the "BlockCode" element
     */
    public void xsetBlockCode(org.apache.xmlbeans.XmlString blockCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOCKCODE$4);
            }
            target.set(blockCode);
        }
    }
    
    /**
     * Unsets the "BlockCode" element
     */
    public void unsetBlockCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKCODE$4, 0);
        }
    }
    
    /**
     * Gets the "LocationCode" element
     */
    public java.lang.String getLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocationCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocationCode" element
     */
    public boolean isSetLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "LocationCode" element
     */
    public void setLocationCode(java.lang.String locationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONCODE$6);
            }
            target.setStringValue(locationCode);
        }
    }
    
    /**
     * Sets (as xml) the "LocationCode" element
     */
    public void xsetLocationCode(org.apache.xmlbeans.XmlString locationCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONCODE$6);
            }
            target.set(locationCode);
        }
    }
    
    /**
     * Unsets the "LocationCode" element
     */
    public void unsetLocationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCODE$6, 0);
        }
    }
    
    /**
     * Gets the "LatLong" element
     */
    public com.msbinfo.expresslync.rct.valuation.LatLongPair getLatLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LatLongPair target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().find_element_user(LATLONG$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LatLong" element
     */
    public boolean isSetLatLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATLONG$8) != 0;
        }
    }
    
    /**
     * Sets the "LatLong" element
     */
    public void setLatLong(com.msbinfo.expresslync.rct.valuation.LatLongPair latLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LatLongPair target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().find_element_user(LATLONG$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().add_element_user(LATLONG$8);
            }
            target.set(latLong);
        }
    }
    
    /**
     * Appends and returns a new empty "LatLong" element
     */
    public com.msbinfo.expresslync.rct.valuation.LatLongPair addNewLatLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.LatLongPair target = null;
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().add_element_user(LATLONG$8);
            return target;
        }
    }
    
    /**
     * Unsets the "LatLong" element
     */
    public void unsetLatLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATLONG$8, 0);
        }
    }
    
    /**
     * Gets the "County" element
     */
    public java.lang.String getCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "County" element
     */
    public org.apache.xmlbeans.XmlString xgetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "County" element
     */
    public boolean isSetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTY$10) != 0;
        }
    }
    
    /**
     * Sets the "County" element
     */
    public void setCounty(java.lang.String county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$10);
            }
            target.setStringValue(county);
        }
    }
    
    /**
     * Sets (as xml) the "County" element
     */
    public void xsetCounty(org.apache.xmlbeans.XmlString county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTY$10);
            }
            target.set(county);
        }
    }
    
    /**
     * Unsets the "County" element
     */
    public void unsetCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTY$10, 0);
        }
    }
}
