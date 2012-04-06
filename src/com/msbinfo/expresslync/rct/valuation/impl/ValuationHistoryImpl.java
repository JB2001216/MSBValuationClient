/*
 * XML Type:  ValuationHistory
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ValuationHistory
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML ValuationHistory(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ValuationHistoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.ValuationHistory
{
    
    public ValuationHistoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Version");
    private static final javax.xml.namespace.QName PROPERTYINFOSUMMARY$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyInfoSummary");
    private static final javax.xml.namespace.QName RECORDID$4 = 
        new javax.xml.namespace.QName("", "RecordId");
    private static final javax.xml.namespace.QName POLICYNUMBER$6 = 
        new javax.xml.namespace.QName("", "PolicyNumber");
    private static final javax.xml.namespace.QName OWNERUSER$8 = 
        new javax.xml.namespace.QName("", "OwnerUser");
    
    
    /**
     * Gets array of all "Version" elements
     */
    public com.msbinfo.expresslync.rct.valuation.VersionSummary[] getVersionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSION$0, targetList);
            com.msbinfo.expresslync.rct.valuation.VersionSummary[] result = new com.msbinfo.expresslync.rct.valuation.VersionSummary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Version" element
     */
    public com.msbinfo.expresslync.rct.valuation.VersionSummary getVersionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.VersionSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.VersionSummary)get_store().find_element_user(VERSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Version" element
     */
    public int sizeOfVersionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$0);
        }
    }
    
    /**
     * Sets array of all "Version" element
     */
    public void setVersionArray(com.msbinfo.expresslync.rct.valuation.VersionSummary[] versionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionArray, VERSION$0);
        }
    }
    
    /**
     * Sets ith "Version" element
     */
    public void setVersionArray(int i, com.msbinfo.expresslync.rct.valuation.VersionSummary version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.VersionSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.VersionSummary)get_store().find_element_user(VERSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(version);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Version" element
     */
    public com.msbinfo.expresslync.rct.valuation.VersionSummary insertNewVersion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.VersionSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.VersionSummary)get_store().insert_element_user(VERSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Version" element
     */
    public com.msbinfo.expresslync.rct.valuation.VersionSummary addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.VersionSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.VersionSummary)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Version" element
     */
    public void removeVersion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$0, i);
        }
    }
    
    /**
     * Gets array of all "PropertyInfoSummary" elements
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] getPropertyInfoSummaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTYINFOSUMMARY$2, targetList);
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] result = new com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PropertyInfoSummary" element
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary getPropertyInfoSummaryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PropertyInfoSummary" element
     */
    public int sizeOfPropertyInfoSummaryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYINFOSUMMARY$2);
        }
    }
    
    /**
     * Sets array of all "PropertyInfoSummary" element
     */
    public void setPropertyInfoSummaryArray(com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] propertyInfoSummaryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyInfoSummaryArray, PROPERTYINFOSUMMARY$2);
        }
    }
    
    /**
     * Sets ith "PropertyInfoSummary" element
     */
    public void setPropertyInfoSummaryArray(int i, com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary propertyInfoSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(propertyInfoSummary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropertyInfoSummary" element
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary insertNewPropertyInfoSummary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().insert_element_user(PROPERTYINFOSUMMARY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropertyInfoSummary" element
     */
    public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary addNewPropertyInfoSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().add_element_user(PROPERTYINFOSUMMARY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PropertyInfoSummary" element
     */
    public void removePropertyInfoSummary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYINFOSUMMARY$2, i);
        }
    }
    
    /**
     * Gets the "RecordId" attribute
     */
    public int getRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordId" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RECORDID$4);
            return target;
        }
    }
    
    /**
     * Sets the "RecordId" attribute
     */
    public void setRecordId(int recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDID$4);
            }
            target.setIntValue(recordId);
        }
    }
    
    /**
     * Sets (as xml) the "RecordId" attribute
     */
    public void xsetRecordId(org.apache.xmlbeans.XmlInt recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RECORDID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(RECORDID$4);
            }
            target.set(recordId);
        }
    }
    
    /**
     * Gets the "PolicyNumber" attribute
     */
    public java.lang.String getPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYNUMBER$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyNumber" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLICYNUMBER$6);
            return target;
        }
    }
    
    /**
     * True if has "PolicyNumber" attribute
     */
    public boolean isSetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POLICYNUMBER$6) != null;
        }
    }
    
    /**
     * Sets the "PolicyNumber" attribute
     */
    public void setPolicyNumber(java.lang.String policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYNUMBER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLICYNUMBER$6);
            }
            target.setStringValue(policyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyNumber" attribute
     */
    public void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLICYNUMBER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLICYNUMBER$6);
            }
            target.set(policyNumber);
        }
    }
    
    /**
     * Unsets the "PolicyNumber" attribute
     */
    public void unsetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POLICYNUMBER$6);
        }
    }
    
    /**
     * Gets the "OwnerUser" attribute
     */
    public java.lang.String getOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERUSER$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnerUser" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OWNERUSER$8);
            return target;
        }
    }
    
    /**
     * True if has "OwnerUser" attribute
     */
    public boolean isSetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNERUSER$8) != null;
        }
    }
    
    /**
     * Sets the "OwnerUser" attribute
     */
    public void setOwnerUser(java.lang.String ownerUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERUSER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNERUSER$8);
            }
            target.setStringValue(ownerUser);
        }
    }
    
    /**
     * Sets (as xml) the "OwnerUser" attribute
     */
    public void xsetOwnerUser(org.apache.xmlbeans.XmlString ownerUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OWNERUSER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OWNERUSER$8);
            }
            target.set(ownerUser);
        }
    }
    
    /**
     * Unsets the "OwnerUser" attribute
     */
    public void unsetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNERUSER$8);
        }
    }
}
