/*
 * XML Type:  InsuredCustomer
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.InsuredCustomer
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML InsuredCustomer(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class InsuredCustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.InsuredCustomer
{
    
    public InsuredCustomerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLNAME$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FullName");
    private static final javax.xml.namespace.QName SECONDFULLNAME$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SecondFullName");
    private static final javax.xml.namespace.QName HOMEPHONE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HomePhone");
    private static final javax.xml.namespace.QName WORKPHONE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "WorkPhone");
    private static final javax.xml.namespace.QName MAILINGADDRESSSAMEASPROPERTYADDRESS$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MailingAddressSameAsPropertyAddress");
    private static final javax.xml.namespace.QName MAILINGADDRESS$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MailingAddress");
    
    
    /**
     * Gets the "FullName" element
     */
    public java.lang.String getFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FullName" element
     */
    public org.apache.xmlbeans.XmlString xgetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "FullName" element
     */
    public boolean isSetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULLNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "FullName" element
     */
    public void setFullName(java.lang.String fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$0);
            }
            target.setStringValue(fullName);
        }
    }
    
    /**
     * Sets (as xml) the "FullName" element
     */
    public void xsetFullName(org.apache.xmlbeans.XmlString fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$0);
            }
            target.set(fullName);
        }
    }
    
    /**
     * Unsets the "FullName" element
     */
    public void unsetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULLNAME$0, 0);
        }
    }
    
    /**
     * Gets the "SecondFullName" element
     */
    public java.lang.String getSecondFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDFULLNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecondFullName" element
     */
    public org.apache.xmlbeans.XmlString xgetSecondFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDFULLNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecondFullName" element
     */
    public boolean isSetSecondFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDFULLNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "SecondFullName" element
     */
    public void setSecondFullName(java.lang.String secondFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDFULLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDFULLNAME$2);
            }
            target.setStringValue(secondFullName);
        }
    }
    
    /**
     * Sets (as xml) the "SecondFullName" element
     */
    public void xsetSecondFullName(org.apache.xmlbeans.XmlString secondFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDFULLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECONDFULLNAME$2);
            }
            target.set(secondFullName);
        }
    }
    
    /**
     * Unsets the "SecondFullName" element
     */
    public void unsetSecondFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDFULLNAME$2, 0);
        }
    }
    
    /**
     * Gets the "HomePhone" element
     */
    public java.lang.String getHomePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPHONE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HomePhone" element
     */
    public org.apache.xmlbeans.XmlString xgetHomePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPHONE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "HomePhone" element
     */
    public boolean isSetHomePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEPHONE$4) != 0;
        }
    }
    
    /**
     * Sets the "HomePhone" element
     */
    public void setHomePhone(java.lang.String homePhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPHONE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEPHONE$4);
            }
            target.setStringValue(homePhone);
        }
    }
    
    /**
     * Sets (as xml) the "HomePhone" element
     */
    public void xsetHomePhone(org.apache.xmlbeans.XmlString homePhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPHONE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMEPHONE$4);
            }
            target.set(homePhone);
        }
    }
    
    /**
     * Unsets the "HomePhone" element
     */
    public void unsetHomePhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEPHONE$4, 0);
        }
    }
    
    /**
     * Gets the "WorkPhone" element
     */
    public java.lang.String getWorkPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKPHONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkPhone" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKPHONE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "WorkPhone" element
     */
    public boolean isSetWorkPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKPHONE$6) != 0;
        }
    }
    
    /**
     * Sets the "WorkPhone" element
     */
    public void setWorkPhone(java.lang.String workPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKPHONE$6);
            }
            target.setStringValue(workPhone);
        }
    }
    
    /**
     * Sets (as xml) the "WorkPhone" element
     */
    public void xsetWorkPhone(org.apache.xmlbeans.XmlString workPhone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKPHONE$6);
            }
            target.set(workPhone);
        }
    }
    
    /**
     * Unsets the "WorkPhone" element
     */
    public void unsetWorkPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKPHONE$6, 0);
        }
    }
    
    /**
     * Gets the "MailingAddressSameAsPropertyAddress" element
     */
    public boolean getMailingAddressSameAsPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MailingAddressSameAsPropertyAddress" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMailingAddressSameAsPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MailingAddressSameAsPropertyAddress" element
     */
    public void setMailingAddressSameAsPropertyAddress(boolean mailingAddressSameAsPropertyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8);
            }
            target.setBooleanValue(mailingAddressSameAsPropertyAddress);
        }
    }
    
    /**
     * Sets (as xml) the "MailingAddressSameAsPropertyAddress" element
     */
    public void xsetMailingAddressSameAsPropertyAddress(org.apache.xmlbeans.XmlBoolean mailingAddressSameAsPropertyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MAILINGADDRESSSAMEASPROPERTYADDRESS$8);
            }
            target.set(mailingAddressSameAsPropertyAddress);
        }
    }
    
    /**
     * Gets the "MailingAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address getMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(MAILINGADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MailingAddress" element
     */
    public boolean isSetMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAILINGADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "MailingAddress" element
     */
    public void setMailingAddress(com.msbinfo.expresslync.rct.valuation.Address mailingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(MAILINGADDRESS$10, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(MAILINGADDRESS$10);
            }
            target.set(mailingAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "MailingAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address addNewMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(MAILINGADDRESS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MailingAddress" element
     */
    public void unsetMailingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAILINGADDRESS$10, 0);
        }
    }
}
