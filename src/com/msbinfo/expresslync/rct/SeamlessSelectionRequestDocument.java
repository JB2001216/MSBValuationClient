/*
 * An XML document type.
 * Localname: SeamlessSelectionRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one SeamlessSelectionRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface SeamlessSelectionRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeamlessSelectionRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("seamlessselectionrequestb04fdoctype");
    
    /**
     * Gets the "SeamlessSelectionRequest" element
     */
    com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest getSeamlessSelectionRequest();
    
    /**
     * Sets the "SeamlessSelectionRequest" element
     */
    void setSeamlessSelectionRequest(com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest seamlessSelectionRequest);
    
    /**
     * Appends and returns a new empty "SeamlessSelectionRequest" element
     */
    com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest addNewSeamlessSelectionRequest();
    
    /**
     * An XML SeamlessSelectionRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface SeamlessSelectionRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeamlessSelectionRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("seamlessselectionrequest9ca5elemtype");
        
        /**
         * Gets the "ZipOrPostalCode" element
         */
        java.lang.String getZipOrPostalCode();
        
        /**
         * Gets (as xml) the "ZipOrPostalCode" element
         */
        org.apache.xmlbeans.XmlString xgetZipOrPostalCode();
        
        /**
         * True if has "ZipOrPostalCode" element
         */
        boolean isSetZipOrPostalCode();
        
        /**
         * Sets the "ZipOrPostalCode" element
         */
        void setZipOrPostalCode(java.lang.String zipOrPostalCode);
        
        /**
         * Sets (as xml) the "ZipOrPostalCode" element
         */
        void xsetZipOrPostalCode(org.apache.xmlbeans.XmlString zipOrPostalCode);
        
        /**
         * Unsets the "ZipOrPostalCode" element
         */
        void unsetZipOrPostalCode();
        
        /**
         * Gets the "YearBuilt" element
         */
        short getYearBuilt();
        
        /**
         * Gets (as xml) the "YearBuilt" element
         */
        org.apache.xmlbeans.XmlShort xgetYearBuilt();
        
        /**
         * Sets the "YearBuilt" element
         */
        void setYearBuilt(short yearBuilt);
        
        /**
         * Sets (as xml) the "YearBuilt" element
         */
        void xsetYearBuilt(org.apache.xmlbeans.XmlShort yearBuilt);
        
        /**
         * Gets the "LivingArea" element
         */
        int getLivingArea();
        
        /**
         * Gets (as xml) the "LivingArea" element
         */
        org.apache.xmlbeans.XmlInt xgetLivingArea();
        
        /**
         * Sets the "LivingArea" element
         */
        void setLivingArea(int livingArea);
        
        /**
         * Sets (as xml) the "LivingArea" element
         */
        void xsetLivingArea(org.apache.xmlbeans.XmlInt livingArea);
        
        /**
         * Gets the "EstimatedMarketValue" element
         */
        int getEstimatedMarketValue();
        
        /**
         * Gets (as xml) the "EstimatedMarketValue" element
         */
        org.apache.xmlbeans.XmlInt xgetEstimatedMarketValue();
        
        /**
         * Sets the "EstimatedMarketValue" element
         */
        void setEstimatedMarketValue(int estimatedMarketValue);
        
        /**
         * Sets (as xml) the "EstimatedMarketValue" element
         */
        void xsetEstimatedMarketValue(org.apache.xmlbeans.XmlInt estimatedMarketValue);
        
        /**
         * Gets the "SeamlessSelectionAnswerList" element
         */
        com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList getSeamlessSelectionAnswerList();
        
        /**
         * True if has "SeamlessSelectionAnswerList" element
         */
        boolean isSetSeamlessSelectionAnswerList();
        
        /**
         * Sets the "SeamlessSelectionAnswerList" element
         */
        void setSeamlessSelectionAnswerList(com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList seamlessSelectionAnswerList);
        
        /**
         * Appends and returns a new empty "SeamlessSelectionAnswerList" element
         */
        com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList addNewSeamlessSelectionAnswerList();
        
        /**
         * Unsets the "SeamlessSelectionAnswerList" element
         */
        void unsetSeamlessSelectionAnswerList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest newInstance() {
              return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument.SeamlessSelectionRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument newInstance() {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.SeamlessSelectionRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
