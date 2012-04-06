/*
 * An XML document type.
 * Localname: UpdateAttachmentInfoPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one UpdateAttachmentInfoPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface UpdateAttachmentInfoPolicyNumberResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateAttachmentInfoPolicyNumberResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("updateattachmentinfopolicynumberresponseddb3doctype");
    
    /**
     * Gets the "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse getUpdateAttachmentInfoPolicyNumberResponse();
    
    /**
     * Sets the "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    void setUpdateAttachmentInfoPolicyNumberResponse(com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse updateAttachmentInfoPolicyNumberResponse);
    
    /**
     * Appends and returns a new empty "UpdateAttachmentInfoPolicyNumberResponse" element
     */
    com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse addNewUpdateAttachmentInfoPolicyNumberResponse();
    
    /**
     * An XML UpdateAttachmentInfoPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface UpdateAttachmentInfoPolicyNumberResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateAttachmentInfoPolicyNumberResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("updateattachmentinfopolicynumberresponse9c25elemtype");
        
        /**
         * Gets the "AttachmentInfo" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfo();
        
        /**
         * True if has "AttachmentInfo" element
         */
        boolean isSetAttachmentInfo();
        
        /**
         * Sets the "AttachmentInfo" element
         */
        void setAttachmentInfo(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfo);
        
        /**
         * Appends and returns a new empty "AttachmentInfo" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType addNewAttachmentInfo();
        
        /**
         * Unsets the "AttachmentInfo" element
         */
        void unsetAttachmentInfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse newInstance() {
              return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument.UpdateAttachmentInfoPolicyNumberResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument newInstance() {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
