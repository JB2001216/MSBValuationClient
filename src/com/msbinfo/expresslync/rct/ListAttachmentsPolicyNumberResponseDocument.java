/*
 * An XML document type.
 * Localname: ListAttachmentsPolicyNumberResponse
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one ListAttachmentsPolicyNumberResponse(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface ListAttachmentsPolicyNumberResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAttachmentsPolicyNumberResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("listattachmentspolicynumberresponsef42ddoctype");
    
    /**
     * Gets the "ListAttachmentsPolicyNumberResponse" element
     */
    com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse getListAttachmentsPolicyNumberResponse();
    
    /**
     * Sets the "ListAttachmentsPolicyNumberResponse" element
     */
    void setListAttachmentsPolicyNumberResponse(com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse listAttachmentsPolicyNumberResponse);
    
    /**
     * Appends and returns a new empty "ListAttachmentsPolicyNumberResponse" element
     */
    com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse addNewListAttachmentsPolicyNumberResponse();
    
    /**
     * An XML ListAttachmentsPolicyNumberResponse(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface ListAttachmentsPolicyNumberResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAttachmentsPolicyNumberResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("listattachmentspolicynumberresponse6153elemtype");
        
        /**
         * Gets array of all "AttachmentInfo" elements
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] getAttachmentInfoArray();
        
        /**
         * Gets ith "AttachmentInfo" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType getAttachmentInfoArray(int i);
        
        /**
         * Returns number of "AttachmentInfo" element
         */
        int sizeOfAttachmentInfoArray();
        
        /**
         * Sets array of all "AttachmentInfo" element
         */
        void setAttachmentInfoArray(com.msbinfo.expresslync.rct.valuation.AttachmentInfoType[] attachmentInfoArray);
        
        /**
         * Sets ith "AttachmentInfo" element
         */
        void setAttachmentInfoArray(int i, com.msbinfo.expresslync.rct.valuation.AttachmentInfoType attachmentInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AttachmentInfo" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType insertNewAttachmentInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AttachmentInfo" element
         */
        com.msbinfo.expresslync.rct.valuation.AttachmentInfoType addNewAttachmentInfo();
        
        /**
         * Removes the ith "AttachmentInfo" element
         */
        void removeAttachmentInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse newInstance() {
              return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument.ListAttachmentsPolicyNumberResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument newInstance() {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ListAttachmentsPolicyNumberResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
