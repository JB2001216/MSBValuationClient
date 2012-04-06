/*
 * An XML document type.
 * Localname: AddAttachmentPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one AddAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface AddAttachmentPolicyNumberRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddAttachmentPolicyNumberRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("addattachmentpolicynumberrequest2ff9doctype");
    
    /**
     * Gets the "AddAttachmentPolicyNumberRequest" element
     */
    com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest getAddAttachmentPolicyNumberRequest();
    
    /**
     * Sets the "AddAttachmentPolicyNumberRequest" element
     */
    void setAddAttachmentPolicyNumberRequest(com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest addAttachmentPolicyNumberRequest);
    
    /**
     * Appends and returns a new empty "AddAttachmentPolicyNumberRequest" element
     */
    com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest addNewAddAttachmentPolicyNumberRequest();
    
    /**
     * An XML AddAttachmentPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface AddAttachmentPolicyNumberRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddAttachmentPolicyNumberRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("addattachmentpolicynumberrequesta765elemtype");
        
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
         * Gets the "Attachment" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentType getAttachment();
        
        /**
         * True if has "Attachment" element
         */
        boolean isSetAttachment();
        
        /**
         * Sets the "Attachment" element
         */
        void setAttachment(com.msbinfo.expresslync.rct.valuation.AttachmentType attachment);
        
        /**
         * Appends and returns a new empty "Attachment" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentType addNewAttachment();
        
        /**
         * Unsets the "Attachment" element
         */
        void unsetAttachment();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest newInstance() {
              return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument.AddAttachmentPolicyNumberRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument newInstance() {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.AddAttachmentPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
