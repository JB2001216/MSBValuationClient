/*
 * XML Type:  Building
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Building
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Building(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class BuildingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Building
{
    
    public BuildingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITEACCESS$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SiteAccess");
    private static final javax.xml.namespace.QName HOMESTYLE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HomeStyle");
    
    
    /**
     * Gets the "SiteAccess" element
     */
    public com.msbinfo.expresslync.rct.valuation.SiteAccess.Enum getSiteAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.SiteAccess.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteAccess" element
     */
    public com.msbinfo.expresslync.rct.valuation.SiteAccess xgetSiteAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SiteAccess target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SiteAccess)get_store().find_element_user(SITEACCESS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteAccess" element
     */
    public boolean isSetSiteAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEACCESS$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteAccess" element
     */
    public void setSiteAccess(com.msbinfo.expresslync.rct.valuation.SiteAccess.Enum siteAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEACCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEACCESS$0);
            }
            target.setEnumValue(siteAccess);
        }
    }
    
    /**
     * Sets (as xml) the "SiteAccess" element
     */
    public void xsetSiteAccess(com.msbinfo.expresslync.rct.valuation.SiteAccess siteAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SiteAccess target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SiteAccess)get_store().find_element_user(SITEACCESS$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.SiteAccess)get_store().add_element_user(SITEACCESS$0);
            }
            target.set(siteAccess);
        }
    }
    
    /**
     * Unsets the "SiteAccess" element
     */
    public void unsetSiteAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEACCESS$0, 0);
        }
    }
    
    /**
     * Gets the "HomeStyle" element
     */
    public com.msbinfo.expresslync.rct.valuation.HomeStyle.Enum getHomeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMESTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.HomeStyle.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HomeStyle" element
     */
    public com.msbinfo.expresslync.rct.valuation.HomeStyle xgetHomeStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HomeStyle target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HomeStyle)get_store().find_element_user(HOMESTYLE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HomeStyle" element
     */
    public void setHomeStyle(com.msbinfo.expresslync.rct.valuation.HomeStyle.Enum homeStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMESTYLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMESTYLE$2);
            }
            target.setEnumValue(homeStyle);
        }
    }
    
    /**
     * Sets (as xml) the "HomeStyle" element
     */
    public void xsetHomeStyle(com.msbinfo.expresslync.rct.valuation.HomeStyle homeStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HomeStyle target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HomeStyle)get_store().find_element_user(HOMESTYLE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HomeStyle)get_store().add_element_user(HOMESTYLE$2);
            }
            target.set(homeStyle);
        }
    }
}
