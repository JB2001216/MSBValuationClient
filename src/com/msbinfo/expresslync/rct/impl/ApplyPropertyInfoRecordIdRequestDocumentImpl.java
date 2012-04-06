/*
 * An XML document type.
 * Localname: ApplyPropertyInfoRecordIdRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one ApplyPropertyInfoRecordIdRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class ApplyPropertyInfoRecordIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument
{
    
    public ApplyPropertyInfoRecordIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLYPROPERTYINFORECORDIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ApplyPropertyInfoRecordIdRequest");
    
    
    /**
     * Gets the "ApplyPropertyInfoRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest getApplyPropertyInfoRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest)get_store().find_element_user(APPLYPROPERTYINFORECORDIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ApplyPropertyInfoRecordIdRequest" element
     */
    public void setApplyPropertyInfoRecordIdRequest(com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest applyPropertyInfoRecordIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest)get_store().find_element_user(APPLYPROPERTYINFORECORDIDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest)get_store().add_element_user(APPLYPROPERTYINFORECORDIDREQUEST$0);
            }
            target.set(applyPropertyInfoRecordIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoRecordIdRequest" element
     */
    public com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest addNewApplyPropertyInfoRecordIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest target = null;
            target = (com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest)get_store().add_element_user(APPLYPROPERTYINFORECORDIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ApplyPropertyInfoRecordIdRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class ApplyPropertyInfoRecordIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.ApplyPropertyInfoRecordIdRequestDocument.ApplyPropertyInfoRecordIdRequest
    {
        
        public ApplyPropertyInfoRecordIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "RecordId");
        private static final javax.xml.namespace.QName PROPERTYID$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PropertyId");
        
        
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
