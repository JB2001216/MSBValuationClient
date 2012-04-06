/*
 * XML Type:  Valuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Valuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML Valuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class ValuationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.Valuation
{
    
    public ValuationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUATIONIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ValuationIdentifier");
    private static final javax.xml.namespace.QName RECORDTYPE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "RecordType");
    private static final javax.xml.namespace.QName POLICYSTATUS$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PolicyStatus");
    private static final javax.xml.namespace.QName DATASOURCE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "DataSource");
    private static final javax.xml.namespace.QName PROPERTYADDRESS$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyAddress");
    private static final javax.xml.namespace.QName PROPERTYSTANDARDIZEDADDRESS$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyStandardizedAddress");
    private static final javax.xml.namespace.QName OWNERUSER$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "OwnerUser");
    private static final javax.xml.namespace.QName ASSIGNEDBYUSER$14 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "AssignedByUser");
    private static final javax.xml.namespace.QName CREATEDATE$16 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CreateDate");
    private static final javax.xml.namespace.QName CREATEUSER$18 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CreateUser");
    private static final javax.xml.namespace.QName UPDATEDATE$20 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "UpdateDate");
    private static final javax.xml.namespace.QName UPDATESTATUSDATE$22 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "UpdateStatusDate");
    private static final javax.xml.namespace.QName UPDATEUSER$24 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "UpdateUser");
    private static final javax.xml.namespace.QName POLICYEFFECTIVEDATE$26 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PolicyEffectiveDate");
    private static final javax.xml.namespace.QName POLICYRENEWALDATE$28 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PolicyRenewalDate");
    private static final javax.xml.namespace.QName ESTIMATEEXPIRATIONDATE$30 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "EstimateExpirationDate");
    private static final javax.xml.namespace.QName INSUREDCUSTOMER$32 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "InsuredCustomer");
    private static final javax.xml.namespace.QName CURRENTCOVERAGEAMOUNT$34 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CurrentCoverageAmount");
    private static final javax.xml.namespace.QName MARKETVALUE$36 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "MarketValue");
    private static final javax.xml.namespace.QName ACCOUNTNUMBER$38 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "AccountNumber");
    private static final javax.xml.namespace.QName COMMENT$40 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Comment");
    private static final javax.xml.namespace.QName HAZARDINFO$42 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "HazardInfo");
    private static final javax.xml.namespace.QName LATLONG$44 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LatLong");
    private static final javax.xml.namespace.QName ATTACHMENTCOUNT$46 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "AttachmentCount");
    
    
    /**
     * Gets the "ValuationIdentifier" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationIdentifier getValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().find_element_user(VALUATIONIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValuationIdentifier" element
     */
    public boolean isSetValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUATIONIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "ValuationIdentifier" element
     */
    public void setValuationIdentifier(com.msbinfo.expresslync.rct.valuation.ValuationIdentifier valuationIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().find_element_user(VALUATIONIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().add_element_user(VALUATIONIDENTIFIER$0);
            }
            target.set(valuationIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "ValuationIdentifier" element
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationIdentifier addNewValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationIdentifier target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationIdentifier)get_store().add_element_user(VALUATIONIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ValuationIdentifier" element
     */
    public void unsetValuationIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUATIONIDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "RecordType" element
     */
    public com.msbinfo.expresslync.rct.valuation.RecordType.Enum getRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.RecordType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordType" element
     */
    public com.msbinfo.expresslync.rct.valuation.RecordType xgetRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RecordType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().find_element_user(RECORDTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RecordType" element
     */
    public boolean isSetRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "RecordType" element
     */
    public void setRecordType(com.msbinfo.expresslync.rct.valuation.RecordType.Enum recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDTYPE$2);
            }
            target.setEnumValue(recordType);
        }
    }
    
    /**
     * Sets (as xml) the "RecordType" element
     */
    public void xsetRecordType(com.msbinfo.expresslync.rct.valuation.RecordType recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RecordType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().find_element_user(RECORDTYPE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().add_element_user(RECORDTYPE$2);
            }
            target.set(recordType);
        }
    }
    
    /**
     * Unsets the "RecordType" element
     */
    public void unsetRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "PolicyStatus" element
     */
    public com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum getPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyStatus" element
     */
    public com.msbinfo.expresslync.rct.valuation.PolicyStatus xgetPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PolicyStatus target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().find_element_user(POLICYSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PolicyStatus" element
     */
    public boolean isSetPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICYSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "PolicyStatus" element
     */
    public void setPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum policyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYSTATUS$4);
            }
            target.setEnumValue(policyStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyStatus" element
     */
    public void xsetPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus policyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PolicyStatus target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().find_element_user(POLICYSTATUS$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().add_element_user(POLICYSTATUS$4);
            }
            target.set(policyStatus);
        }
    }
    
    /**
     * Unsets the "PolicyStatus" element
     */
    public void unsetPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICYSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "DataSource" element
     */
    public com.msbinfo.expresslync.rct.valuation.DataSource.Enum getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.DataSource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSource" element
     */
    public com.msbinfo.expresslync.rct.valuation.DataSource xgetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DataSource target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().find_element_user(DATASOURCE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSource" element
     */
    public boolean isSetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$6) != 0;
        }
    }
    
    /**
     * Sets the "DataSource" element
     */
    public void setDataSource(com.msbinfo.expresslync.rct.valuation.DataSource.Enum dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCE$6);
            }
            target.setEnumValue(dataSource);
        }
    }
    
    /**
     * Sets (as xml) the "DataSource" element
     */
    public void xsetDataSource(com.msbinfo.expresslync.rct.valuation.DataSource dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DataSource target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().find_element_user(DATASOURCE$6, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().add_element_user(DATASOURCE$6);
            }
            target.set(dataSource);
        }
    }
    
    /**
     * Unsets the "DataSource" element
     */
    public void unsetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$6, 0);
        }
    }
    
    /**
     * Gets the "PropertyAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address getPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(PROPERTYADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PropertyAddress" element
     */
    public boolean isSetPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYADDRESS$8) != 0;
        }
    }
    
    /**
     * Sets the "PropertyAddress" element
     */
    public void setPropertyAddress(com.msbinfo.expresslync.rct.valuation.Address propertyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(PROPERTYADDRESS$8, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(PROPERTYADDRESS$8);
            }
            target.set(propertyAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertyAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address addNewPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(PROPERTYADDRESS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PropertyAddress" element
     */
    public void unsetPropertyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYADDRESS$8, 0);
        }
    }
    
    /**
     * Gets the "PropertyStandardizedAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress getPropertyStandardizedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().find_element_user(PROPERTYSTANDARDIZEDADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PropertyStandardizedAddress" element
     */
    public boolean isSetPropertyStandardizedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTYSTANDARDIZEDADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "PropertyStandardizedAddress" element
     */
    public void setPropertyStandardizedAddress(com.msbinfo.expresslync.rct.valuation.StandardizedAddress propertyStandardizedAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().find_element_user(PROPERTYSTANDARDIZEDADDRESS$10, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().add_element_user(PROPERTYSTANDARDIZEDADDRESS$10);
            }
            target.set(propertyStandardizedAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "PropertyStandardizedAddress" element
     */
    public com.msbinfo.expresslync.rct.valuation.StandardizedAddress addNewPropertyStandardizedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.StandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.valuation.StandardizedAddress)get_store().add_element_user(PROPERTYSTANDARDIZEDADDRESS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "PropertyStandardizedAddress" element
     */
    public void unsetPropertyStandardizedAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTYSTANDARDIZEDADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "OwnerUser" element
     */
    public java.lang.String getOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERUSER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnerUser" element
     */
    public org.apache.xmlbeans.XmlString xgetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERUSER$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "OwnerUser" element
     */
    public boolean isSetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERUSER$12) != 0;
        }
    }
    
    /**
     * Sets the "OwnerUser" element
     */
    public void setOwnerUser(java.lang.String ownerUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERUSER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERUSER$12);
            }
            target.setStringValue(ownerUser);
        }
    }
    
    /**
     * Sets (as xml) the "OwnerUser" element
     */
    public void xsetOwnerUser(org.apache.xmlbeans.XmlString ownerUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNERUSER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNERUSER$12);
            }
            target.set(ownerUser);
        }
    }
    
    /**
     * Unsets the "OwnerUser" element
     */
    public void unsetOwnerUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERUSER$12, 0);
        }
    }
    
    /**
     * Gets the "AssignedByUser" element
     */
    public java.lang.String getAssignedByUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDBYUSER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssignedByUser" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedByUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDBYUSER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "AssignedByUser" element
     */
    public boolean isSetAssignedByUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDBYUSER$14) != 0;
        }
    }
    
    /**
     * Sets the "AssignedByUser" element
     */
    public void setAssignedByUser(java.lang.String assignedByUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDBYUSER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDBYUSER$14);
            }
            target.setStringValue(assignedByUser);
        }
    }
    
    /**
     * Sets (as xml) the "AssignedByUser" element
     */
    public void xsetAssignedByUser(org.apache.xmlbeans.XmlString assignedByUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDBYUSER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDBYUSER$14);
            }
            target.set(assignedByUser);
        }
    }
    
    /**
     * Unsets the "AssignedByUser" element
     */
    public void unsetAssignedByUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDBYUSER$14, 0);
        }
    }
    
    /**
     * Gets the "CreateDate" element
     */
    public java.util.Calendar getCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreateDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreateDate" element
     */
    public boolean isSetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "CreateDate" element
     */
    public void setCreateDate(java.util.Calendar createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDATE$16);
            }
            target.setCalendarValue(createDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreateDate" element
     */
    public void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDATE$16);
            }
            target.set(createDate);
        }
    }
    
    /**
     * Unsets the "CreateDate" element
     */
    public void unsetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDATE$16, 0);
        }
    }
    
    /**
     * Gets the "CreateUser" element
     */
    public java.lang.String getCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEUSER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreateUser" element
     */
    public org.apache.xmlbeans.XmlString xgetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEUSER$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreateUser" element
     */
    public boolean isSetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEUSER$18) != 0;
        }
    }
    
    /**
     * Sets the "CreateUser" element
     */
    public void setCreateUser(java.lang.String createUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEUSER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEUSER$18);
            }
            target.setStringValue(createUser);
        }
    }
    
    /**
     * Sets (as xml) the "CreateUser" element
     */
    public void xsetCreateUser(org.apache.xmlbeans.XmlString createUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEUSER$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEUSER$18);
            }
            target.set(createUser);
        }
    }
    
    /**
     * Unsets the "CreateUser" element
     */
    public void unsetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEUSER$18, 0);
        }
    }
    
    /**
     * Gets the "UpdateDate" element
     */
    public java.util.Calendar getUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEDATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpdateDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATEDATE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpdateDate" element
     */
    public boolean isSetUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATEDATE$20) != 0;
        }
    }
    
    /**
     * Sets the "UpdateDate" element
     */
    public void setUpdateDate(java.util.Calendar updateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATEDATE$20);
            }
            target.setCalendarValue(updateDate);
        }
    }
    
    /**
     * Sets (as xml) the "UpdateDate" element
     */
    public void xsetUpdateDate(org.apache.xmlbeans.XmlDateTime updateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATEDATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UPDATEDATE$20);
            }
            target.set(updateDate);
        }
    }
    
    /**
     * Unsets the "UpdateDate" element
     */
    public void unsetUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATEDATE$20, 0);
        }
    }
    
    /**
     * Gets the "UpdateStatusDate" element
     */
    public java.util.Calendar getUpdateStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSDATE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpdateStatusDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUpdateStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATESTATUSDATE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpdateStatusDate" element
     */
    public boolean isSetUpdateStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATESTATUSDATE$22) != 0;
        }
    }
    
    /**
     * Sets the "UpdateStatusDate" element
     */
    public void setUpdateStatusDate(java.util.Calendar updateStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATUSDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATUSDATE$22);
            }
            target.setCalendarValue(updateStatusDate);
        }
    }
    
    /**
     * Sets (as xml) the "UpdateStatusDate" element
     */
    public void xsetUpdateStatusDate(org.apache.xmlbeans.XmlDateTime updateStatusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPDATESTATUSDATE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UPDATESTATUSDATE$22);
            }
            target.set(updateStatusDate);
        }
    }
    
    /**
     * Unsets the "UpdateStatusDate" element
     */
    public void unsetUpdateStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATESTATUSDATE$22, 0);
        }
    }
    
    /**
     * Gets the "UpdateUser" element
     */
    public java.lang.String getUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEUSER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpdateUser" element
     */
    public org.apache.xmlbeans.XmlString xgetUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATEUSER$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "UpdateUser" element
     */
    public boolean isSetUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATEUSER$24) != 0;
        }
    }
    
    /**
     * Sets the "UpdateUser" element
     */
    public void setUpdateUser(java.lang.String updateUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATEUSER$24);
            }
            target.setStringValue(updateUser);
        }
    }
    
    /**
     * Sets (as xml) the "UpdateUser" element
     */
    public void xsetUpdateUser(org.apache.xmlbeans.XmlString updateUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATEUSER$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATEUSER$24);
            }
            target.set(updateUser);
        }
    }
    
    /**
     * Unsets the "UpdateUser" element
     */
    public void unsetUpdateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATEUSER$24, 0);
        }
    }
    
    /**
     * Gets the "PolicyEffectiveDate" element
     */
    public java.util.Calendar getPolicyEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYEFFECTIVEDATE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyEffectiveDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetPolicyEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POLICYEFFECTIVEDATE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "PolicyEffectiveDate" element
     */
    public boolean isSetPolicyEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICYEFFECTIVEDATE$26) != 0;
        }
    }
    
    /**
     * Sets the "PolicyEffectiveDate" element
     */
    public void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYEFFECTIVEDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYEFFECTIVEDATE$26);
            }
            target.setCalendarValue(policyEffectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyEffectiveDate" element
     */
    public void xsetPolicyEffectiveDate(org.apache.xmlbeans.XmlDateTime policyEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POLICYEFFECTIVEDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(POLICYEFFECTIVEDATE$26);
            }
            target.set(policyEffectiveDate);
        }
    }
    
    /**
     * Unsets the "PolicyEffectiveDate" element
     */
    public void unsetPolicyEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICYEFFECTIVEDATE$26, 0);
        }
    }
    
    /**
     * Gets the "PolicyRenewalDate" element
     */
    public java.util.Calendar getPolicyRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYRENEWALDATE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyRenewalDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetPolicyRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POLICYRENEWALDATE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "PolicyRenewalDate" element
     */
    public boolean isSetPolicyRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICYRENEWALDATE$28) != 0;
        }
    }
    
    /**
     * Sets the "PolicyRenewalDate" element
     */
    public void setPolicyRenewalDate(java.util.Calendar policyRenewalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYRENEWALDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYRENEWALDATE$28);
            }
            target.setCalendarValue(policyRenewalDate);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyRenewalDate" element
     */
    public void xsetPolicyRenewalDate(org.apache.xmlbeans.XmlDateTime policyRenewalDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(POLICYRENEWALDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(POLICYRENEWALDATE$28);
            }
            target.set(policyRenewalDate);
        }
    }
    
    /**
     * Unsets the "PolicyRenewalDate" element
     */
    public void unsetPolicyRenewalDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICYRENEWALDATE$28, 0);
        }
    }
    
    /**
     * Gets the "EstimateExpirationDate" element
     */
    public java.util.Calendar getEstimateExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEEXPIRATIONDATE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EstimateExpirationDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEstimateExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ESTIMATEEXPIRATIONDATE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "EstimateExpirationDate" element
     */
    public boolean isSetEstimateExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEEXPIRATIONDATE$30) != 0;
        }
    }
    
    /**
     * Sets the "EstimateExpirationDate" element
     */
    public void setEstimateExpirationDate(java.util.Calendar estimateExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEEXPIRATIONDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEEXPIRATIONDATE$30);
            }
            target.setCalendarValue(estimateExpirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "EstimateExpirationDate" element
     */
    public void xsetEstimateExpirationDate(org.apache.xmlbeans.XmlDateTime estimateExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ESTIMATEEXPIRATIONDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ESTIMATEEXPIRATIONDATE$30);
            }
            target.set(estimateExpirationDate);
        }
    }
    
    /**
     * Unsets the "EstimateExpirationDate" element
     */
    public void unsetEstimateExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEEXPIRATIONDATE$30, 0);
        }
    }
    
    /**
     * Gets the "InsuredCustomer" element
     */
    public com.msbinfo.expresslync.rct.valuation.InsuredCustomer getInsuredCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.InsuredCustomer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.InsuredCustomer)get_store().find_element_user(INSUREDCUSTOMER$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InsuredCustomer" element
     */
    public boolean isSetInsuredCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSUREDCUSTOMER$32) != 0;
        }
    }
    
    /**
     * Sets the "InsuredCustomer" element
     */
    public void setInsuredCustomer(com.msbinfo.expresslync.rct.valuation.InsuredCustomer insuredCustomer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.InsuredCustomer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.InsuredCustomer)get_store().find_element_user(INSUREDCUSTOMER$32, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.InsuredCustomer)get_store().add_element_user(INSUREDCUSTOMER$32);
            }
            target.set(insuredCustomer);
        }
    }
    
    /**
     * Appends and returns a new empty "InsuredCustomer" element
     */
    public com.msbinfo.expresslync.rct.valuation.InsuredCustomer addNewInsuredCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.InsuredCustomer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.InsuredCustomer)get_store().add_element_user(INSUREDCUSTOMER$32);
            return target;
        }
    }
    
    /**
     * Unsets the "InsuredCustomer" element
     */
    public void unsetInsuredCustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSUREDCUSTOMER$32, 0);
        }
    }
    
    /**
     * Gets the "CurrentCoverageAmount" element
     */
    public int getCurrentCoverageAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTCOVERAGEAMOUNT$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentCoverageAmount" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrentCoverageAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTCOVERAGEAMOUNT$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "CurrentCoverageAmount" element
     */
    public boolean isSetCurrentCoverageAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTCOVERAGEAMOUNT$34) != 0;
        }
    }
    
    /**
     * Sets the "CurrentCoverageAmount" element
     */
    public void setCurrentCoverageAmount(int currentCoverageAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTCOVERAGEAMOUNT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTCOVERAGEAMOUNT$34);
            }
            target.setIntValue(currentCoverageAmount);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentCoverageAmount" element
     */
    public void xsetCurrentCoverageAmount(org.apache.xmlbeans.XmlInt currentCoverageAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENTCOVERAGEAMOUNT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENTCOVERAGEAMOUNT$34);
            }
            target.set(currentCoverageAmount);
        }
    }
    
    /**
     * Unsets the "CurrentCoverageAmount" element
     */
    public void unsetCurrentCoverageAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTCOVERAGEAMOUNT$34, 0);
        }
    }
    
    /**
     * Gets the "MarketValue" element
     */
    public int getMarketValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKETVALUE$36, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MarketValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetMarketValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MARKETVALUE$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "MarketValue" element
     */
    public boolean isSetMarketValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETVALUE$36) != 0;
        }
    }
    
    /**
     * Sets the "MarketValue" element
     */
    public void setMarketValue(int marketValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKETVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKETVALUE$36);
            }
            target.setIntValue(marketValue);
        }
    }
    
    /**
     * Sets (as xml) the "MarketValue" element
     */
    public void xsetMarketValue(org.apache.xmlbeans.XmlInt marketValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MARKETVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MARKETVALUE$36);
            }
            target.set(marketValue);
        }
    }
    
    /**
     * Unsets the "MarketValue" element
     */
    public void unsetMarketValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETVALUE$36, 0);
        }
    }
    
    /**
     * Gets the "AccountNumber" element
     */
    public java.lang.String getAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "AccountNumber" element
     */
    public boolean isSetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTNUMBER$38) != 0;
        }
    }
    
    /**
     * Sets the "AccountNumber" element
     */
    public void setAccountNumber(java.lang.String accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNUMBER$38);
            }
            target.setStringValue(accountNumber);
        }
    }
    
    /**
     * Sets (as xml) the "AccountNumber" element
     */
    public void xsetAccountNumber(org.apache.xmlbeans.XmlString accountNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTNUMBER$38);
            }
            target.set(accountNumber);
        }
    }
    
    /**
     * Unsets the "AccountNumber" element
     */
    public void unsetAccountNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTNUMBER$38, 0);
        }
    }
    
    /**
     * Gets array of all "Comment" elements
     */
    public com.msbinfo.expresslync.rct.valuation.Comment[] getCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENT$40, targetList);
            com.msbinfo.expresslync.rct.valuation.Comment[] result = new com.msbinfo.expresslync.rct.valuation.Comment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Comment" element
     */
    public com.msbinfo.expresslync.rct.valuation.Comment getCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Comment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Comment)get_store().find_element_user(COMMENT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Comment" element
     */
    public int sizeOfCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$40);
        }
    }
    
    /**
     * Sets array of all "Comment" element
     */
    public void setCommentArray(com.msbinfo.expresslync.rct.valuation.Comment[] commentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$40);
        }
    }
    
    /**
     * Sets ith "Comment" element
     */
    public void setCommentArray(int i, com.msbinfo.expresslync.rct.valuation.Comment comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Comment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Comment)get_store().find_element_user(COMMENT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comment" element
     */
    public com.msbinfo.expresslync.rct.valuation.Comment insertNewComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Comment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Comment)get_store().insert_element_user(COMMENT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Comment" element
     */
    public com.msbinfo.expresslync.rct.valuation.Comment addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Comment target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Comment)get_store().add_element_user(COMMENT$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "Comment" element
     */
    public void removeComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$40, i);
        }
    }
    
    /**
     * Gets the "HazardInfo" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardInfo getHazardInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardInfo)get_store().find_element_user(HAZARDINFO$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HazardInfo" element
     */
    public boolean isSetHazardInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HAZARDINFO$42) != 0;
        }
    }
    
    /**
     * Sets the "HazardInfo" element
     */
    public void setHazardInfo(com.msbinfo.expresslync.rct.valuation.HazardInfo hazardInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardInfo)get_store().find_element_user(HAZARDINFO$42, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HazardInfo)get_store().add_element_user(HAZARDINFO$42);
            }
            target.set(hazardInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "HazardInfo" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardInfo addNewHazardInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardInfo)get_store().add_element_user(HAZARDINFO$42);
            return target;
        }
    }
    
    /**
     * Unsets the "HazardInfo" element
     */
    public void unsetHazardInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HAZARDINFO$42, 0);
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
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().find_element_user(LATLONG$44, 0);
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
            return get_store().count_elements(LATLONG$44) != 0;
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
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().find_element_user(LATLONG$44, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().add_element_user(LATLONG$44);
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
            target = (com.msbinfo.expresslync.rct.valuation.LatLongPair)get_store().add_element_user(LATLONG$44);
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
            get_store().remove_element(LATLONG$44, 0);
        }
    }
    
    /**
     * Gets the "AttachmentCount" element
     */
    public int getAttachmentCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetAttachmentCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AttachmentCount" element
     */
    public boolean isNilAttachmentCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AttachmentCount" element
     */
    public void setAttachmentCount(int attachmentCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTCOUNT$46);
            }
            target.setIntValue(attachmentCount);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentCount" element
     */
    public void xsetAttachmentCount(org.apache.xmlbeans.XmlInt attachmentCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ATTACHMENTCOUNT$46);
            }
            target.set(attachmentCount);
        }
    }
    
    /**
     * Nils the "AttachmentCount" element
     */
    public void setNilAttachmentCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ATTACHMENTCOUNT$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ATTACHMENTCOUNT$46);
            }
            target.setNil();
        }
    }
}
