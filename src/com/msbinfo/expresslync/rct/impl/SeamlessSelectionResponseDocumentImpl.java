/*
 * An XML document type.
 * Localname: SeamlessSelectionResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one SeamlessSelectionResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class SeamlessSelectionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument
{
    
    public SeamlessSelectionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEAMLESSSELECTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "SeamlessSelectionResponse");
    
    
    /**
     * Gets the "SeamlessSelectionResponse" element
     */
    public com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse getSeamlessSelectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse)get_store().find_element_user(SEAMLESSSELECTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeamlessSelectionResponse" element
     */
    public void setSeamlessSelectionResponse(com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse seamlessSelectionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse)get_store().find_element_user(SEAMLESSSELECTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse)get_store().add_element_user(SEAMLESSSELECTIONRESPONSE$0);
            }
            target.set(seamlessSelectionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SeamlessSelectionResponse" element
     */
    public com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse addNewSeamlessSelectionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse)get_store().add_element_user(SEAMLESSSELECTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SeamlessSelectionResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class SeamlessSelectionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SeamlessSelectionResponseDocument.SeamlessSelectionResponse
    {
        
        public SeamlessSelectionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUATIONTYPE$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ValuationType");
        
        
        /**
         * Gets the "ValuationType" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationType.Enum getValuationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUATIONTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.msbinfo.expresslync.rct.valuation.ValuationType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValuationType" element
         */
        public com.msbinfo.expresslync.rct.valuation.ValuationType xgetValuationType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().find_element_user(VALUATIONTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ValuationType" element
         */
        public void setValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType.Enum valuationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUATIONTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUATIONTYPE$0);
                }
                target.setEnumValue(valuationType);
            }
        }
        
        /**
         * Sets (as xml) the "ValuationType" element
         */
        public void xsetValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType valuationType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.ValuationType target = null;
                target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().find_element_user(VALUATIONTYPE$0, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.ValuationType)get_store().add_element_user(VALUATIONTYPE$0);
                }
                target.set(valuationType);
            }
        }
    }
}
