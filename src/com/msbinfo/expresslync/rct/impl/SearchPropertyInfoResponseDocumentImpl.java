/*
 * An XML document type.
 * Localname: SearchPropertyInfoResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one SearchPropertyInfoResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class SearchPropertyInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument
{
    
    public SearchPropertyInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHPROPERTYINFORESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "SearchPropertyInfoResponse");
    
    
    /**
     * Gets the "SearchPropertyInfoResponse" element
     */
    public com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse getSearchPropertyInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse)get_store().find_element_user(SEARCHPROPERTYINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchPropertyInfoResponse" element
     */
    public void setSearchPropertyInfoResponse(com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse searchPropertyInfoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse)get_store().find_element_user(SEARCHPROPERTYINFORESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse)get_store().add_element_user(SEARCHPROPERTYINFORESPONSE$0);
            }
            target.set(searchPropertyInfoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchPropertyInfoResponse" element
     */
    public com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse addNewSearchPropertyInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse target = null;
            target = (com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse)get_store().add_element_user(SEARCHPROPERTYINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SearchPropertyInfoResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class SearchPropertyInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SearchPropertyInfoResponseDocument.SearchPropertyInfoResponse
    {
        
        public SearchPropertyInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTYINFOSUMMARY$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "PropertyInfoSummary");
        
        
        /**
         * Gets array of all "PropertyInfoSummary" elements
         */
        public com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] getPropertyInfoSummaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTYINFOSUMMARY$0, targetList);
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
                target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$0, i);
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
                return get_store().count_elements(PROPERTYINFOSUMMARY$0);
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
                arraySetterHelper(propertyInfoSummaryArray, PROPERTYINFOSUMMARY$0);
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
                target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().find_element_user(PROPERTYINFOSUMMARY$0, i);
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
                target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().insert_element_user(PROPERTYINFOSUMMARY$0, i);
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
                target = (com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary)get_store().add_element_user(PROPERTYINFOSUMMARY$0);
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
                get_store().remove_element(PROPERTYINFOSUMMARY$0, i);
            }
        }
    }
}
