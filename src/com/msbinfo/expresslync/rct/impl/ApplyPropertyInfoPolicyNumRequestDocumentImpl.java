/*
 * An XML document type.
 * Localname: ApplyPropertyInfoPolicyNumRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ApplyPropertyInfoPolicyNumRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ApplyPropertyInfoPolicyNumRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument
{
    
    public ApplyPropertyInfoPolicyNumRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYPROPERTYINFOPOLICYNUMREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ApplyPropertyInfoPolicyNumRequest");
    
    
    /**
     * Gets the "ApplyPropertyInfoPolicyNumRequest" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest getApplyPropertyInfoPolicyNumRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest)get_store().find_element_user(APPLYPROPERTYINFOPOLICYNUMREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyPropertyInfoPolicyNumRequest" element
     */
    public void setApplyPropertyInfoPolicyNumRequest(com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest applyPropertyInfoPolicyNumRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest)get_store().find_element_user(APPLYPROPERTYINFOPOLICYNUMREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest)get_store().add_element_user(APPLYPROPERTYINFOPOLICYNUMREQUEST$0);
            }
            target.set(applyPropertyInfoPolicyNumRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoPolicyNumRequest" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest addNewApplyPropertyInfoPolicyNumRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest)get_store().add_element_user(APPLYPROPERTYINFOPOLICYNUMREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ApplyPropertyInfoPolicyNumRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ApplyPropertyInfoPolicyNumRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest
    {
        
        public ApplyPropertyInfoPolicyNumRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POLICYNUMBER$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PolicyNumber");
        private static final javax.xml.namespace.QName PROPERTYID$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PropertyId");
        
        
        /**
         * Gets the "PolicyNumber" element
         */
        public java.lang.String getPolicyNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
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
                return get_store().count_elements(POLICYNUMBER$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLICYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLICYNUMBER$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLICYNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLICYNUMBER$0);
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
                get_store().remove_element(POLICYNUMBER$0, 0);
            }
        }
        
        /**
         * Gets the "PropertyId" element
         */
        public int getPropertyId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "PropertyId" element
         */
        public org.apache.xmlbeans.XmlInt xgetPropertyId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PropertyId" element
         */
        public void setPropertyId(int propertyId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYID$2);
                }
                target.setIntValue(propertyId);
            }
        }
        
        /**
         * Sets (as xml) the "PropertyId" element
         */
        public void xsetPropertyId(org.apache.xmlbeans.XmlInt propertyId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROPERTYID$2);
                }
                target.set(propertyId);
            }
        }
    }
}
