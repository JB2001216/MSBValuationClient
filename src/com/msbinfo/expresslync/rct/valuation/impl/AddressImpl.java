/*
 * XML Type:  Address
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Address
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Address(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Address
{
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS1$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Address1");
    private static final javax.xml.namespace.QName ADDRESS2$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Address2");
    private static final javax.xml.namespace.QName CITY$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "City");
    private static final javax.xml.namespace.QName STATEORPROVINCE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "StateOrProvince");
    private static final javax.xml.namespace.QName ZIPORPOSTALCODE$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ZipOrPostalCode");
    
    
    /**
     * Gets the "Address1" element
     */
    public java.lang.String getAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Address1" element
     */
    public boolean isSetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1$0) != 0;
        }
    }
    
    /**
     * Sets the "Address1" element
     */
    public void setAddress1(java.lang.String address1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1$0);
            }
            target.setStringValue(address1);
        }
    }
    
    /**
     * Sets (as xml) the "Address1" element
     */
    public void xsetAddress1(org.apache.xmlbeans.XmlString address1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1$0);
            }
            target.set(address1);
        }
    }
    
    /**
     * Unsets the "Address1" element
     */
    public void unsetAddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1$0, 0);
        }
    }
    
    /**
     * Gets the "Address2" element
     */
    public java.lang.String getAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Address2" element
     */
    public boolean isSetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2$2) != 0;
        }
    }
    
    /**
     * Sets the "Address2" element
     */
    public void setAddress2(java.lang.String address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2$2);
            }
            target.setStringValue(address2);
        }
    }
    
    /**
     * Sets (as xml) the "Address2" element
     */
    public void xsetAddress2(org.apache.xmlbeans.XmlString address2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2$2);
            }
            target.set(address2);
        }
    }
    
    /**
     * Unsets the "Address2" element
     */
    public void unsetAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2$2, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$4) != 0;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$4);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$4);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$4, 0);
        }
    }
    
    /**
     * Gets the "StateOrProvince" element
     */
    public java.lang.String getStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StateOrProvince" element
     */
    public org.apache.xmlbeans.XmlString xgetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEORPROVINCE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "StateOrProvince" element
     */
    public boolean isSetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATEORPROVINCE$6) != 0;
        }
    }
    
    /**
     * Sets the "StateOrProvince" element
     */
    public void setStateOrProvince(java.lang.String stateOrProvince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATEORPROVINCE$6);
            }
            target.setStringValue(stateOrProvince);
        }
    }
    
    /**
     * Sets (as xml) the "StateOrProvince" element
     */
    public void xsetStateOrProvince(org.apache.xmlbeans.XmlString stateOrProvince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATEORPROVINCE$6);
            }
            target.set(stateOrProvince);
        }
    }
    
    /**
     * Unsets the "StateOrProvince" element
     */
    public void unsetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATEORPROVINCE$6, 0);
        }
    }
    
    /**
     * Gets the "ZipOrPostalCode" element
     */
    public java.lang.String getZipOrPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPORPOSTALCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ZipOrPostalCode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipOrPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPORPOSTALCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ZipOrPostalCode" element
     */
    public boolean isSetZipOrPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIPORPOSTALCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "ZipOrPostalCode" element
     */
    public void setZipOrPostalCode(java.lang.String zipOrPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPORPOSTALCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPORPOSTALCODE$8);
            }
            target.setStringValue(zipOrPostalCode);
        }
    }
    
    /**
     * Sets (as xml) the "ZipOrPostalCode" element
     */
    public void xsetZipOrPostalCode(org.apache.xmlbeans.XmlString zipOrPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPORPOSTALCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPORPOSTALCODE$8);
            }
            target.set(zipOrPostalCode);
        }
    }
    
    /**
     * Unsets the "ZipOrPostalCode" element
     */
    public void unsetZipOrPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIPORPOSTALCODE$8, 0);
        }
    }
}
