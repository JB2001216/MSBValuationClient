/*
 * An XML document type.
 * Localname: ApplyPropertyInfoPolicyNumResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one ApplyPropertyInfoPolicyNumResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface ApplyPropertyInfoPolicyNumResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplyPropertyInfoPolicyNumResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("applypropertyinfopolicynumresponsee2c5doctype");
    
    /**
     * Gets the "ApplyPropertyInfoPolicyNumResponse" element
     */
    com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse getApplyPropertyInfoPolicyNumResponse();
    
    /**
     * Sets the "ApplyPropertyInfoPolicyNumResponse" element
     */
    void setApplyPropertyInfoPolicyNumResponse(com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse applyPropertyInfoPolicyNumResponse);
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoPolicyNumResponse" element
     */
    com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse addNewApplyPropertyInfoPolicyNumResponse();
    
    /**
     * An XML ApplyPropertyInfoPolicyNumResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface ApplyPropertyInfoPolicyNumResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplyPropertyInfoPolicyNumResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("applypropertyinfopolicynumresponsec025elemtype");
        
        /**
         * Gets the "ValuationAggregate" element
         */
        com.msbinfo.expresslync.rct.valuation.ValuationAggregate getValuationAggregate();
        
        /**
         * True if has "ValuationAggregate" element
         */
        boolean isSetValuationAggregate();
        
        /**
         * Sets the "ValuationAggregate" element
         */
        void setValuationAggregate(com.msbinfo.expresslync.rct.valuation.ValuationAggregate valuationAggregate);
        
        /**
         * Appends and returns a new empty "ValuationAggregate" element
         */
        com.msbinfo.expresslync.rct.valuation.ValuationAggregate addNewValuationAggregate();
        
        /**
         * Unsets the "ValuationAggregate" element
         */
        void unsetValuationAggregate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse newInstance() {
              return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument.ApplyPropertyInfoPolicyNumResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument newInstance() {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
