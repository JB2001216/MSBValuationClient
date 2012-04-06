/*
 * XML Type:  HighValueAdvancedValuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML HighValueAdvancedValuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface HighValueAdvancedValuation extends com.msbinfo.expresslync.rct.valuation.HighValueValuation
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HighValueAdvancedValuation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("highvalueadvancedvaluation719btype");
    
    /**
     * Gets the "Building" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueAdvancedBuilding getBuilding();
    
    /**
     * True if has "Building" element
     */
    boolean isSetBuilding();
    
    /**
     * Sets the "Building" element
     */
    void setBuilding(com.msbinfo.expresslync.rct.valuation.HighValueAdvancedBuilding building);
    
    /**
     * Appends and returns a new empty "Building" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueAdvancedBuilding addNewBuilding();
    
    /**
     * Unsets the "Building" element
     */
    void unsetBuilding();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
