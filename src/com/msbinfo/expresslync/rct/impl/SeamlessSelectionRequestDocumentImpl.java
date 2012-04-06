/*
 * An XML document type.
 * Localname: SeamlessSelectionRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one SeamlessSelectionRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class SeamlessSelectionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument
{
    
    public SeamlessSelectionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEAMLESSSELECTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "SeamlessSelectionRequest");
    
    
    /**
     * Gets the "SeamlessSelectionRequest" element
     */
    public com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest getSeamlessSelectionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest)get_store().find_element_user(SEAMLESSSELECTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeamlessSelectionRequest" element
     */
    public void setSeamlessSelectionRequest(com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest seamlessSelectionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest)get_store().find_element_user(SEAMLESSSELECTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest)get_store().add_element_user(SEAMLESSSELECTIONREQUEST$0);
            }
            target.set(seamlessSelectionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SeamlessSelectionRequest" element
     */
    public com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest addNewSeamlessSelectionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest target = null;
            target = (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest)get_store().add_element_user(SEAMLESSSELECTIONREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SeamlessSelectionRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public static class SeamlessSelectionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest
    {
        
        public SeamlessSelectionRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZIPORPOSTALCODE$0 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "ZipOrPostalCode");
        private static final javax.xml.namespace.QName YEARBUILT$2 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "YearBuilt");
        private static final javax.xml.namespace.QName LIVINGAREA$4 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "LivingArea");
        private static final javax.xml.namespace.QName ESTIMATEDMARKETVALUE$6 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "EstimatedMarketValue");
        private static final javax.xml.namespace.QName SEAMLESSSELECTIONANSWERLIST$8 = 
            new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SeamlessSelectionAnswerList");
        
        
        /**
         * Gets the "ZipOrPostalCode" element
         */
        public java.lang.String getZipOrPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPORPOSTALCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZipOrPostalCode" element
         */
        public org.apache.xmlbeans.XmlString xgetZipOrPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPORPOSTALCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ZipOrPostalCode" element
         */
        public boolean isSetZipOrPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZIPORPOSTALCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "ZipOrPostalCode" element
         */
        public void setZipOrPostalCode(java.lang.String zipOrPostalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPORPOSTALCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPORPOSTALCODE$0);
                }
                target.setStringValue(zipOrPostalCode);
            }
        }
        
        /**
         * Sets (as xml) the "ZipOrPostalCode" element
         */
        public void xsetZipOrPostalCode(org.apache.xmlbeans.XmlString zipOrPostalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPORPOSTALCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPORPOSTALCODE$0);
                }
                target.set(zipOrPostalCode);
            }
        }
        
        /**
         * Unsets the "ZipOrPostalCode" element
         */
        public void unsetZipOrPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZIPORPOSTALCODE$0, 0);
            }
        }
        
        /**
         * Gets the "YearBuilt" element
         */
        public short getYearBuilt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILT$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getShortValue();
            }
        }
        
        /**
         * Gets (as xml) the "YearBuilt" element
         */
        public org.apache.xmlbeans.XmlShort xgetYearBuilt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlShort target = null;
                target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(YEARBUILT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "YearBuilt" element
         */
        public void setYearBuilt(short yearBuilt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARBUILT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARBUILT$2);
                }
                target.setShortValue(yearBuilt);
            }
        }
        
        /**
         * Sets (as xml) the "YearBuilt" element
         */
        public void xsetYearBuilt(org.apache.xmlbeans.XmlShort yearBuilt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlShort target = null;
                target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(YEARBUILT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(YEARBUILT$2);
                }
                target.set(yearBuilt);
            }
        }
        
        /**
         * Gets the "LivingArea" element
         */
        public int getLivingArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "LivingArea" element
         */
        public org.apache.xmlbeans.XmlInt xgetLivingArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LIVINGAREA$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LivingArea" element
         */
        public void setLivingArea(int livingArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIVINGAREA$4);
                }
                target.setIntValue(livingArea);
            }
        }
        
        /**
         * Sets (as xml) the "LivingArea" element
         */
        public void xsetLivingArea(org.apache.xmlbeans.XmlInt livingArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LIVINGAREA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LIVINGAREA$4);
                }
                target.set(livingArea);
            }
        }
        
        /**
         * Gets the "EstimatedMarketValue" element
         */
        public int getEstimatedMarketValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDMARKETVALUE$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstimatedMarketValue" element
         */
        public org.apache.xmlbeans.XmlInt xgetEstimatedMarketValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ESTIMATEDMARKETVALUE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EstimatedMarketValue" element
         */
        public void setEstimatedMarketValue(int estimatedMarketValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDMARKETVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDMARKETVALUE$6);
                }
                target.setIntValue(estimatedMarketValue);
            }
        }
        
        /**
         * Sets (as xml) the "EstimatedMarketValue" element
         */
        public void xsetEstimatedMarketValue(org.apache.xmlbeans.XmlInt estimatedMarketValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ESTIMATEDMARKETVALUE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ESTIMATEDMARKETVALUE$6);
                }
                target.set(estimatedMarketValue);
            }
        }
        
        /**
         * Gets the "SeamlessSelectionAnswerList" element
         */
        public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList getSeamlessSelectionAnswerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
                target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().find_element_user(SEAMLESSSELECTIONANSWERLIST$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SeamlessSelectionAnswerList" element
         */
        public boolean isSetSeamlessSelectionAnswerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEAMLESSSELECTIONANSWERLIST$8) != 0;
            }
        }
        
        /**
         * Sets the "SeamlessSelectionAnswerList" element
         */
        public void setSeamlessSelectionAnswerList(com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList seamlessSelectionAnswerList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
                target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().find_element_user(SEAMLESSSELECTIONANSWERLIST$8, 0);
                if (target == null)
                {
                    target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().add_element_user(SEAMLESSSELECTIONANSWERLIST$8);
                }
                target.set(seamlessSelectionAnswerList);
            }
        }
        
        /**
         * Appends and returns a new empty "SeamlessSelectionAnswerList" element
         */
        public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList addNewSeamlessSelectionAnswerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
                target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().add_element_user(SEAMLESSSELECTIONANSWERLIST$8);
                return target;
            }
        }
        
        /**
         * Unsets the "SeamlessSelectionAnswerList" element
         */
        public void unsetSeamlessSelectionAnswerList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEAMLESSSELECTIONANSWERLIST$8, 0);
            }
        }
    }
}
