/*
 * An XML document type.
 * Localname: SearchPropertyInfoRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one SearchPropertyInfoRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class SearchPropertyInfoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument
{
    
    public SearchPropertyInfoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHPROPERTYINFOREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "SearchPropertyInfoRequest");
    
    
    /**
     * Gets the "SearchPropertyInfoRequest" element
     */
    public com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest getSearchPropertyInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest)get_store().find_element_user(SEARCHPROPERTYINFOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchPropertyInfoRequest" element
     */
    public void setSearchPropertyInfoRequest(com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest searchPropertyInfoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest)get_store().find_element_user(SEARCHPROPERTYINFOREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest)get_store().add_element_user(SEARCHPROPERTYINFOREQUEST$0);
            }
            target.set(searchPropertyInfoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchPropertyInfoRequest" element
     */
    public com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest addNewSearchPropertyInfoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest)get_store().add_element_user(SEARCHPROPERTYINFOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SearchPropertyInfoRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class SearchPropertyInfoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SearchPropertyInfoRequestDocument.SearchPropertyInfoRequest
    {
        
        public SearchPropertyInfoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESS$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Address");
        
        
        /**
         * Gets the "Address" element
         */
        public com.msbinfo.expresslync.rct.valuation.Address getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Address target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(ADDRESS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Address" element
         */
        public boolean isSetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$0) != 0;
            }
        }
        
        /**
         * Sets the "Address" element
         */
        public void setAddress(com.msbinfo.expresslync.rct.valuation.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Address target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(ADDRESS$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(ADDRESS$0);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "Address" element
         */
        public com.msbinfo.expresslync.rct.valuation.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Address target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(ADDRESS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Address" element
         */
        public void unsetAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$0, 0);
            }
        }
    }
}
