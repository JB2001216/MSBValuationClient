/*
 * XML Type:  VersionSummary
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.VersionSummary
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML VersionSummary(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class VersionSummaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.VersionSummary
{
    
    public VersionSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONID$0 = 
        new javax.xml.namespace.QName("", "VersionId");
    private static final javax.xml.namespace.QName VALUATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "ValuationType");
    private static final javax.xml.namespace.QName RECORDTYPE$4 = 
        new javax.xml.namespace.QName("", "RecordType");
    private static final javax.xml.namespace.QName POLICYSTATUS$6 = 
        new javax.xml.namespace.QName("", "PolicyStatus");
    private static final javax.xml.namespace.QName DATASOURCE$8 = 
        new javax.xml.namespace.QName("", "DataSource");
    private static final javax.xml.namespace.QName UPDATEDATE$10 = 
        new javax.xml.namespace.QName("", "UpdateDate");
    private static final javax.xml.namespace.QName CREATEDATE$12 = 
        new javax.xml.namespace.QName("", "CreateDate");
    private static final javax.xml.namespace.QName INSUREDFULLNAME$14 = 
        new javax.xml.namespace.QName("", "InsuredFullName");
    private static final javax.xml.namespace.QName ATTACHMENTS$16 = 
        new javax.xml.namespace.QName("", "Attachments");
    private static final javax.xml.namespace.QName CREATEUSER$18 = 
        new javax.xml.namespace.QName("", "CreateUser");
    
    
    /**
     * Gets the "VersionId" attribute
     */
    public int getVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONID$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionId" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERSIONID$0);
            return target;
        }
    }
    
    /**
     * Sets the "VersionId" attribute
     */
    public void setVersionId(int versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONID$0);
            }
            target.setIntValue(versionId);
        }
    }
    
    /**
     * Sets (as xml) the "VersionId" attribute
     */
    public void xsetVersionId(org.apache.xmlbeans.XmlInt versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(VERSIONID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(VERSIONID$0);
            }
            target.set(versionId);
        }
    }
    
    /**
     * Gets the "ValuationType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationType.Enum getValuationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUATIONTYPE$2);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.ValuationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValuationType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.ValuationType xgetValuationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().find_attribute_user(VALUATIONTYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "ValuationType" attribute
     */
    public void setValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType.Enum valuationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUATIONTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUATIONTYPE$2);
            }
            target.setEnumValue(valuationType);
        }
    }
    
    /**
     * Sets (as xml) the "ValuationType" attribute
     */
    public void xsetValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType valuationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ValuationType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().find_attribute_user(VALUATIONTYPE$2);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().add_attribute_user(VALUATIONTYPE$2);
            }
            target.set(valuationType);
        }
    }
    
    /**
     * Gets the "RecordType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RecordType.Enum getRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDTYPE$4);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.RecordType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecordType" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.RecordType xgetRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RecordType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().find_attribute_user(RECORDTYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "RecordType" attribute
     */
    public void setRecordType(com.msbinfo.expresslync.rct.valuation.RecordType.Enum recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDTYPE$4);
            }
            target.setEnumValue(recordType);
        }
    }
    
    /**
     * Sets (as xml) the "RecordType" attribute
     */
    public void xsetRecordType(com.msbinfo.expresslync.rct.valuation.RecordType recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.RecordType target = null;
            target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().find_attribute_user(RECORDTYPE$4);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.RecordType)get_store().add_attribute_user(RECORDTYPE$4);
            }
            target.set(recordType);
        }
    }
    
    /**
     * Gets the "PolicyStatus" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum getPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYSTATUS$6);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PolicyStatus" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.PolicyStatus xgetPolicyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PolicyStatus target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().find_attribute_user(POLICYSTATUS$6);
            return target;
        }
    }
    
    /**
     * Sets the "PolicyStatus" attribute
     */
    public void setPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum policyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLICYSTATUS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLICYSTATUS$6);
            }
            target.setEnumValue(policyStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PolicyStatus" attribute
     */
    public void xsetPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus policyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.PolicyStatus target = null;
            target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().find_attribute_user(POLICYSTATUS$6);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.PolicyStatus)get_store().add_attribute_user(POLICYSTATUS$6);
            }
            target.set(policyStatus);
        }
    }
    
    /**
     * Gets the "DataSource" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.DataSource.Enum getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCE$8);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.DataSource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSource" attribute
     */
    public com.msbinfo.expresslync.rct.valuation.DataSource xgetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DataSource target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().find_attribute_user(DATASOURCE$8);
            return target;
        }
    }
    
    /**
     * Sets the "DataSource" attribute
     */
    public void setDataSource(com.msbinfo.expresslync.rct.valuation.DataSource.Enum dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASOURCE$8);
            }
            target.setEnumValue(dataSource);
        }
    }
    
    /**
     * Sets (as xml) the "DataSource" attribute
     */
    public void xsetDataSource(com.msbinfo.expresslync.rct.valuation.DataSource dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.DataSource target = null;
            target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().find_attribute_user(DATASOURCE$8);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.DataSource)get_store().add_attribute_user(DATASOURCE$8);
            }
            target.set(dataSource);
        }
    }
    
    /**
     * Gets the "UpdateDate" attribute
     */
    public java.util.Calendar getUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEDATE$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "UpdateDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetUpdateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(UPDATEDATE$10);
            return target;
        }
    }
    
    /**
     * Sets the "UpdateDate" attribute
     */
    public void setUpdateDate(java.util.Calendar updateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEDATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEDATE$10);
            }
            target.setCalendarValue(updateDate);
        }
    }
    
    /**
     * Sets (as xml) the "UpdateDate" attribute
     */
    public void xsetUpdateDate(org.apache.xmlbeans.XmlDateTime updateDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(UPDATEDATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(UPDATEDATE$10);
            }
            target.set(updateDate);
        }
    }
    
    /**
     * Gets the "CreateDate" attribute
     */
    public java.util.Calendar getCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDATE$12);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreateDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreateDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDATE$12);
            return target;
        }
    }
    
    /**
     * Sets the "CreateDate" attribute
     */
    public void setCreateDate(java.util.Calendar createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEDATE$12);
            }
            target.setCalendarValue(createDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreateDate" attribute
     */
    public void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CREATEDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CREATEDATE$12);
            }
            target.set(createDate);
        }
    }
    
    /**
     * Gets the "InsuredFullName" attribute
     */
    public java.lang.String getInsuredFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSUREDFULLNAME$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InsuredFullName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInsuredFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSUREDFULLNAME$14);
            return target;
        }
    }
    
    /**
     * True if has "InsuredFullName" attribute
     */
    public boolean isSetInsuredFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSUREDFULLNAME$14) != null;
        }
    }
    
    /**
     * Sets the "InsuredFullName" attribute
     */
    public void setInsuredFullName(java.lang.String insuredFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSUREDFULLNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSUREDFULLNAME$14);
            }
            target.setStringValue(insuredFullName);
        }
    }
    
    /**
     * Sets (as xml) the "InsuredFullName" attribute
     */
    public void xsetInsuredFullName(org.apache.xmlbeans.XmlString insuredFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INSUREDFULLNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INSUREDFULLNAME$14);
            }
            target.set(insuredFullName);
        }
    }
    
    /**
     * Unsets the "InsuredFullName" attribute
     */
    public void unsetInsuredFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSUREDFULLNAME$14);
        }
    }
    
    /**
     * Gets the "Attachments" attribute
     */
    public java.lang.String getAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTS$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Attachments" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTACHMENTS$16);
            return target;
        }
    }
    
    /**
     * True if has "Attachments" attribute
     */
    public boolean isSetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTACHMENTS$16) != null;
        }
    }
    
    /**
     * Sets the "Attachments" attribute
     */
    public void setAttachments(java.lang.String attachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHMENTS$16);
            }
            target.setStringValue(attachments);
        }
    }
    
    /**
     * Sets (as xml) the "Attachments" attribute
     */
    public void xsetAttachments(org.apache.xmlbeans.XmlString attachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTACHMENTS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATTACHMENTS$16);
            }
            target.set(attachments);
        }
    }
    
    /**
     * Unsets the "Attachments" attribute
     */
    public void unsetAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTACHMENTS$16);
        }
    }
    
    /**
     * Gets the "CreateUser" attribute
     */
    public java.lang.String getCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEUSER$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreateUser" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEUSER$18);
            return target;
        }
    }
    
    /**
     * True if has "CreateUser" attribute
     */
    public boolean isSetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATEUSER$18) != null;
        }
    }
    
    /**
     * Sets the "CreateUser" attribute
     */
    public void setCreateUser(java.lang.String createUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATEUSER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATEUSER$18);
            }
            target.setStringValue(createUser);
        }
    }
    
    /**
     * Sets (as xml) the "CreateUser" attribute
     */
    public void xsetCreateUser(org.apache.xmlbeans.XmlString createUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CREATEUSER$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CREATEUSER$18);
            }
            target.set(createUser);
        }
    }
    
    /**
     * Unsets the "CreateUser" attribute
     */
    public void unsetCreateUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATEUSER$18);
        }
    }
}
