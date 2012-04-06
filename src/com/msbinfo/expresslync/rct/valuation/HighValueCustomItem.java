/*
 * XML Type:  HighValueCustomItem
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HighValueCustomItem
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML HighValueCustomItem(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface HighValueCustomItem extends com.msbinfo.expresslync.rct.valuation.CustomItem
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HighValueCustomItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("highvaluecustomitemfe0atype");
    
    /**
     * Gets the "UnitCost" element
     */
    java.math.BigDecimal getUnitCost();
    
    /**
     * Gets (as xml) the "UnitCost" element
     */
    org.apache.xmlbeans.XmlDecimal xgetUnitCost();
    
    /**
     * True if has "UnitCost" element
     */
    boolean isSetUnitCost();
    
    /**
     * Sets the "UnitCost" element
     */
    void setUnitCost(java.math.BigDecimal unitCost);
    
    /**
     * Sets (as xml) the "UnitCost" element
     */
    void xsetUnitCost(org.apache.xmlbeans.XmlDecimal unitCost);
    
    /**
     * Unsets the "UnitCost" element
     */
    void unsetUnitCost();
    
    /**
     * Gets the "BreakdownCost" element
     */
    com.msbinfo.expresslync.rct.valuation.BreakdownCost getBreakdownCost();
    
    /**
     * True if has "BreakdownCost" element
     */
    boolean isSetBreakdownCost();
    
    /**
     * Sets the "BreakdownCost" element
     */
    void setBreakdownCost(com.msbinfo.expresslync.rct.valuation.BreakdownCost breakdownCost);
    
    /**
     * Appends and returns a new empty "BreakdownCost" element
     */
    com.msbinfo.expresslync.rct.valuation.BreakdownCost addNewBreakdownCost();
    
    /**
     * Unsets the "BreakdownCost" element
     */
    void unsetBreakdownCost();
    
    /**
     * Gets the "CoverageType" element
     */
    com.msbinfo.expresslync.rct.valuation.CoverageType.Enum getCoverageType();
    
    /**
     * Gets (as xml) the "CoverageType" element
     */
    com.msbinfo.expresslync.rct.valuation.CoverageType xgetCoverageType();
    
    /**
     * Sets the "CoverageType" element
     */
    void setCoverageType(com.msbinfo.expresslync.rct.valuation.CoverageType.Enum coverageType);
    
    /**
     * Sets (as xml) the "CoverageType" element
     */
    void xsetCoverageType(com.msbinfo.expresslync.rct.valuation.CoverageType coverageType);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.HighValueCustomItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.HighValueCustomItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
