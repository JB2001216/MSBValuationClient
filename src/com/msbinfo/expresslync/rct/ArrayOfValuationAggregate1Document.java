/*
 * An XML document type.
 * Localname: ArrayOfValuationAggregate1
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct;


/**
 * A document containing one ArrayOfValuationAggregate1(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public interface ArrayOfValuationAggregate1Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfValuationAggregate1Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("arrayofvaluationaggregate15106doctype");
    
    /**
     * Gets the "ArrayOfValuationAggregate1" element
     */
    com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 getArrayOfValuationAggregate1();
    
    /**
     * Tests for nil "ArrayOfValuationAggregate1" element
     */
    boolean isNilArrayOfValuationAggregate1();
    
    /**
     * Sets the "ArrayOfValuationAggregate1" element
     */
    void setArrayOfValuationAggregate1(com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 arrayOfValuationAggregate1);
    
    /**
     * Appends and returns a new empty "ArrayOfValuationAggregate1" element
     */
    com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1 addNewArrayOfValuationAggregate1();
    
    /**
     * Nils the "ArrayOfValuationAggregate1" element
     */
    void setNilArrayOfValuationAggregate1();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document newInstance() {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.ArrayOfValuationAggregate1Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
