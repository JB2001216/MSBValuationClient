/*
 * An XML document type.
 * Localname: GetPropertyInfoSourceRecordResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one GetPropertyInfoSourceRecordResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class GetPropertyInfoSourceRecordResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument
{
    
    public GetPropertyInfoSourceRecordResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROPERTYINFOSOURCERECORDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "GetPropertyInfoSourceRecordResponse");
    
    
    /**
     * Gets the "GetPropertyInfoSourceRecordResponse" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse getGetPropertyInfoSourceRecordResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPropertyInfoSourceRecordResponse" element
     */
    public void setGetPropertyInfoSourceRecordResponse(com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse getPropertyInfoSourceRecordResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse)get_store().find_element_user(GETPROPERTYINFOSOURCERECORDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDRESPONSE$0);
            }
            target.set(getPropertyInfoSourceRecordResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPropertyInfoSourceRecordResponse" element
     */
    public com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse addNewGetPropertyInfoSourceRecordResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse target = null;
            target = (com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse)get_store().add_element_user(GETPROPERTYINFOSOURCERECORDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPropertyInfoSourceRecordResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class GetPropertyInfoSourceRecordResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.GetPropertyInfoSourceRecordResponseDocument.GetPropertyInfoSourceRecordResponse
    {
        
        public GetPropertyInfoSourceRecordResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
