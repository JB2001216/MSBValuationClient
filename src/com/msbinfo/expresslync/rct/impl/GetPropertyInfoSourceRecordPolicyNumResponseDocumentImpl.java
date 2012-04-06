/*
 * An XML document type.
 * Localname: GetPropertyInfoSourceRecordPolicyNumResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetPropertyInfoSourceRecordPolicyNumResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetPropertyInfoSourceRecordPolicyNumResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument
{
    
    public GetPropertyInfoSourceRecordPolicyNumResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROPERTYINFOSOURCERECORDPOLICYNUMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetPropertyInfoSourceRecordPolicyNumResponse");
    
    
    /**
     * Gets the "GetPropertyInfoSourceRecordPolicyNumResponse" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse getGetPropertyInfoSourceRecordPolicyNumResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPropertyInfoSourceRecordPolicyNumResponse" element
     */
    public void setGetPropertyInfoSourceRecordPolicyNumResponse(com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse getPropertyInfoSourceRecordPolicyNumResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMRESPONSE$0);
            }
            target.set(getPropertyInfoSourceRecordPolicyNumResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPropertyInfoSourceRecordPolicyNumResponse" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse addNewGetPropertyInfoSourceRecordPolicyNumResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDPOLICYNUMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPropertyInfoSourceRecordPolicyNumResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class GetPropertyInfoSourceRecordPolicyNumResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordPolicyNumResponseDocument.GetPropertyInfoSourceRecordPolicyNumResponse
    {
        
        public GetPropertyInfoSourceRecordPolicyNumResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUATION$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Valuation");
        
        
        /**
         * Gets the "Valuation" element
         */
        public com.msbinfo.expresslync.rct.valuation.Valuation getValuation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Valuation target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Valuation" element
         */
        public boolean isSetValuation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUATION$0) != 0;
            }
        }
        
        /**
         * Sets the "Valuation" element
         */
        public void setValuation(com.msbinfo.expresslync.rct.valuation.Valuation valuation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Valuation target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().find_element_user(VALUATION$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().add_element_user(VALUATION$0);
                }
                target.set(valuation);
            }
        }
        
        /**
         * Appends and returns a new empty "Valuation" element
         */
        public com.msbinfo.expresslync.rct.valuation.Valuation addNewValuation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.Valuation target = null;
                target = (com.msbinfo.expresslync.rct.valuation.Valuation)get_store().add_element_user(VALUATION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Valuation" element
         */
        public void unsetValuation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUATION$0, 0);
            }
        }
    }
}
