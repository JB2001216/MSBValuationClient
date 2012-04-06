/*
 * An XML document type.
 * Localname: ApplyPropertyInfoPolicyNumRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one ApplyPropertyInfoPolicyNumRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface ApplyPropertyInfoPolicyNumRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplyPropertyInfoPolicyNumRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("applypropertyinfopolicynumrequestbdafdoctype");
    
    /**
     * Gets the "ApplyPropertyInfoPolicyNumRequest" element
     */
    com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest getApplyPropertyInfoPolicyNumRequest();
    
    /**
     * Sets the "ApplyPropertyInfoPolicyNumRequest" element
     */
    void setApplyPropertyInfoPolicyNumRequest(com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest applyPropertyInfoPolicyNumRequest);
    
    /**
     * Appends and returns a new empty "ApplyPropertyInfoPolicyNumRequest" element
     */
    com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest addNewApplyPropertyInfoPolicyNumRequest();
    
    /**
     * An XML ApplyPropertyInfoPolicyNumRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface ApplyPropertyInfoPolicyNumRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplyPropertyInfoPolicyNumRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("applypropertyinfopolicynumrequestb897elemtype");
        
        /**
         * Gets the "PolicyNumber" element
         */
        java.lang.String getPolicyNumber();
        
        /**
         * Gets (as xml) the "PolicyNumber" element
         */
        org.apache.xmlbeans.XmlString xgetPolicyNumber();
        
        /**
         * True if has "PolicyNumber" element
         */
        boolean isSetPolicyNumber();
        
        /**
         * Sets the "PolicyNumber" element
         */
        void setPolicyNumber(java.lang.String policyNumber);
        
        /**
         * Sets (as xml) the "PolicyNumber" element
         */
        void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber);
        
        /**
         * Unsets the "PolicyNumber" element
         */
        void unsetPolicyNumber();
        
        /**
         * Gets the "PropertyId" element
         */
        int getPropertyId();
        
        /**
         * Gets (as xml) the "PropertyId" element
         */
        org.apache.xmlbeans.XmlInt xgetPropertyId();
        
        /**
         * Sets the "PropertyId" element
         */
        void setPropertyId(int propertyId);
        
        /**
         * Sets (as xml) the "PropertyId" element
         */
        void xsetPropertyId(org.apache.xmlbeans.XmlInt propertyId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest newInstance() {
              return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument.ApplyPropertyInfoPolicyNumRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument newInstance() {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ApplyPropertyInfoPolicyNumRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
