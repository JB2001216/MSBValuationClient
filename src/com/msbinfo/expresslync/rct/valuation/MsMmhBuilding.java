/*
 * XML Type:  MsMmhBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MsMmhBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML MsMmhBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface MsMmhBuilding extends com.msbinfo.expresslync.rct.valuation.Building
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MsMmhBuilding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("msmmhbuilding6a07type");
    
    /**
     * Gets array of all "Component" elements
     */
    com.msbinfo.expresslync.rct.valuation.Component[] getComponentArray();
    
    /**
     * Gets ith "Component" element
     */
    com.msbinfo.expresslync.rct.valuation.Component getComponentArray(int i);
    
    /**
     * Returns number of "Component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "Component" element
     */
    void setComponentArray(com.msbinfo.expresslync.rct.valuation.Component[] componentArray);
    
    /**
     * Sets ith "Component" element
     */
    void setComponentArray(int i, com.msbinfo.expresslync.rct.valuation.Component component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    com.msbinfo.expresslync.rct.valuation.Component insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    com.msbinfo.expresslync.rct.valuation.Component addNewComponent();
    
    /**
     * Removes the ith "Component" element
     */
    void removeComponent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhBuilding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
