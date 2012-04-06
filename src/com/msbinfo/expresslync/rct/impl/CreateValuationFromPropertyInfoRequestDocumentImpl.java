/*
 * An XML document type.
 * Localname: CreateValuationFromPropertyInfoRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one CreateValuationFromPropertyInfoRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class CreateValuationFromPropertyInfoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument
{
    
    public CreateValuationFromPropertyInfoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEVALUATIONFROMPROPERTYINFOREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "CreateValuationFromPropertyInfoRequest");
    
    
    /**
     * Gets the "CreateValuationFromPropertyInfoRequest" element
     */
    public com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest getCreateValuationFromPropertyInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest)get_store().find_element_user(CREATEVALUATIONFROMPROPERTYINFOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateValuationFromPropertyInfoRequest" element
     */
    public void setCreateValuationFromPropertyInfoRequest(com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest createValuationFromPropertyInfoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest)get_store().find_element_user(CREATEVALUATIONFROMPROPERTYINFOREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest)get_store().add_element_user(CREATEVALUATIONFROMPROPERTYINFOREQUEST$0);
            }
            target.set(createValuationFromPropertyInfoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateValuationFromPropertyInfoRequest" element
     */
    public com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest addNewCreateValuationFromPropertyInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest)get_store().add_element_user(CREATEVALUATIONFROMPROPERTYINFOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateValuationFromPropertyInfoRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class CreateValuationFromPropertyInfoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.CreateValuationFromPropertyInfoRequestDocument.CreateValuationFromPropertyInfoRequest
    {
        
        public CreateValuationFromPropertyInfoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTYID$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "PropertyId");
        private static final javax.xml.namespace.QName VALUATIONAGGREGATE$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ValuationAggregate");
        
        
        /**
         * Gets the "PropertyId" element
         */
        public int getPropertyId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$0, 0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTYID$0);
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
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROPERTYID$0);
                }
                target.set(propertyId);
            }
        }
        
        /**
         * Gets the "ValuationAggregate" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ValuationAggregate" element
         */
        public boolean isSetValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUATIONAGGREGATE$2) != 0;
            }
        }
        
        /**
         * Sets the "ValuationAggregate" element
         */
        public void setValuationAggregate(com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationAggregate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().find_element_user(VALUATIONAGGREGATE$2, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONAGGREGATE$2);
                }
                target.set(valuationAggregate);
            }
        }
        
        /**
         * Appends and returns a new empty "ValuationAggregate" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationAggregate target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationAggregate)get_store().add_element_user(VALUATIONAGGREGATE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "ValuationAggregate" element
         */
        public void unsetValuationAggregate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUATIONAGGREGATE$2, 0);
            }
        }
    }
}
