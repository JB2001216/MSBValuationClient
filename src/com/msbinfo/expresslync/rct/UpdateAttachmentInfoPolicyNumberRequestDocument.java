/*
 * An XML document type.
 * Localname: UpdateAttachmentInfoPolicyNumberRequest
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one UpdateAttachmentInfoPolicyNumberRequest(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface UpdateAttachmentInfoPolicyNumberRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateAttachmentInfoPolicyNumberRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("updateattachmentinfopolicynumberrequestad01doctype");
    
    /**
     * Gets the "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest getUpdateAttachmentInfoPolicyNumberRequest();
    
    /**
     * Sets the "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    void setUpdateAttachmentInfoPolicyNumberRequest(com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest updateAttachmentInfoPolicyNumberRequest);
    
    /**
     * Appends and returns a new empty "UpdateAttachmentInfoPolicyNumberRequest" element
     */
    com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest addNewUpdateAttachmentInfoPolicyNumberRequest();
    
    /**
     * An XML UpdateAttachmentInfoPolicyNumberRequest(@http://msbinfo.com/expresslync/rct).
     *
     * This is a complex type.
     */
    public interface UpdateAttachmentInfoPolicyNumberRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateAttachmentInfoPolicyNumberRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("updateattachmentinfopolicynumberrequest5f7belemtype");
        
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
         * Gets the "FileId" element
         */
        int getFileId();
        
        /**
         * Gets (as xml) the "FileId" element
         */
        org.apache.xmlbeans.XmlInt xgetFileId();
        
        /**
         * Sets the "FileId" element
         */
        void setFileId(int fileId);
        
        /**
         * Sets (as xml) the "FileId" element
         */
        void xsetFileId(org.apache.xmlbeans.XmlInt fileId);
        
        /**
         * Gets the "Title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "Title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "Title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "Title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "Title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "Title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "Description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "Description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "Description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "Description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "Description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "Description" element
         */
        void unsetDescription();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest newInstance() {
              return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument.UpdateAttachmentInfoPolicyNumberRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument newInstance() {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.UpdateAttachmentInfoPolicyNumberRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
