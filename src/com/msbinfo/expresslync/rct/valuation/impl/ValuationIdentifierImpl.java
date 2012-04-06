/*
 * XML Type:  ValuationIdentifier
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ValuationIdentifier
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML ValuationIdentifier(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ValuationIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.ValuationIdentifier
{
    
    public ValuationIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "RecordId");
    private static final javax.xml.namespace.QName POLICYNUMBER$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PolicyNumber");
    private static final javax.xml.namespace.QName VERSIONID$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "VersionId");
    
    
    /**
     * Gets the "RecordId" element
     */
    public int getRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordId" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecordId" element
     */
    public boolean isSetRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDID$0) != 0;
        }
    }
    
    /**
     * Sets the "RecordId" element
     */
    public void setRecordId(int recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDID$0);
            }
            target.setIntValue(recordId);
        }
    }
    
    /**
     * Sets (as xml) the "RecordId" element
     */
    public void xsetRecordId(org.apache.xmlbeans.XmlInt recordId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECORDID$0);
            }
            target.set(recordId);
        }
    }
    
    /**
     * Unsets the "RecordId" element
     */
    public void unsetRecordId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDID$0, 0);
        }
    }
    
    /**
     * Gets the "PolicyNumber" element
     */
    public java.lang.String getPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PolicyNumber" element
     */
    public boolean isSetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICYNUMBER$2) != 0;
        }
    }
    
    /**
     * Sets the "PolicyNumber" element
     */
    public void setPolicyNumber(java.lang.String policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYNUMBER$2);
            }
            target.setStringValue(policyNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyNumber" element
     */
    public void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLICYNUMBER$2);
            }
            target.set(policyNumber);
        }
    }
    
    /**
     * Unsets the "PolicyNumber" element
     */
    public void unsetPolicyNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICYNUMBER$2, 0);
        }
    }
    
    /**
     * Gets the "VersionId" element
     */
    public int getVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionId" element
     */
    public org.apache.xmlbeans.XmlInt xgetVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "VersionId" element
     */
    public boolean isSetVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONID$4) != 0;
        }
    }
    
    /**
     * Sets the "VersionId" element
     */
    public void setVersionId(int versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONID$4);
            }
            target.setIntValue(versionId);
        }
    }
    
    /**
     * Sets (as xml) the "VersionId" element
     */
    public void xsetVersionId(org.apache.xmlbeans.XmlInt versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERSIONID$4);
            }
            target.set(versionId);
        }
    }
    
    /**
     * Unsets the "VersionId" element
     */
    public void unsetVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONID$4, 0);
        }
    }
}
