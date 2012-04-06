/*
 * XML Type:  ValuationAggregate
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ValuationAggregate
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML ValuationAggregate(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface ValuationAggregate extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValuationAggregate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("valuationaggregatea16dtype");
    
    /**
     * Gets the "HazardValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HazardValuation getHazardValuation();
    
    /**
     * True if has "HazardValuation" element
     */
    boolean isSetHazardValuation();
    
    /**
     * Sets the "HazardValuation" element
     */
    void setHazardValuation(com.msbinfo.expresslync.rct.valuation.HazardValuation hazardValuation);
    
    /**
     * Appends and returns a new empty "HazardValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HazardValuation addNewHazardValuation();
    
    /**
     * Unsets the "HazardValuation" element
     */
    void unsetHazardValuation();
    
    /**
     * Gets the "MMHValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.MMHValuation getMMHValuation();
    
    /**
     * True if has "MMHValuation" element
     */
    boolean isSetMMHValuation();
    
    /**
     * Sets the "MMHValuation" element
     */
    void setMMHValuation(com.msbinfo.expresslync.rct.valuation.MMHValuation mmhValuation);
    
    /**
     * Appends and returns a new empty "MMHValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.MMHValuation addNewMMHValuation();
    
    /**
     * Unsets the "MMHValuation" element
     */
    void unsetMMHValuation();
    
    /**
     * Gets the "MainStreetValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.MainStreetValuation getMainStreetValuation();
    
    /**
     * True if has "MainStreetValuation" element
     */
    boolean isSetMainStreetValuation();
    
    /**
     * Sets the "MainStreetValuation" element
     */
    void setMainStreetValuation(com.msbinfo.expresslync.rct.valuation.MainStreetValuation mainStreetValuation);
    
    /**
     * Appends and returns a new empty "MainStreetValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.MainStreetValuation addNewMainStreetValuation();
    
    /**
     * Unsets the "MainStreetValuation" element
     */
    void unsetMainStreetValuation();
    
    /**
     * Gets the "HVStandardValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation getHVStandardValuation();
    
    /**
     * True if has "HVStandardValuation" element
     */
    boolean isSetHVStandardValuation();
    
    /**
     * Sets the "HVStandardValuation" element
     */
    void setHVStandardValuation(com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation hvStandardValuation);
    
    /**
     * Appends and returns a new empty "HVStandardValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueStandardValuation addNewHVStandardValuation();
    
    /**
     * Unsets the "HVStandardValuation" element
     */
    void unsetHVStandardValuation();
    
    /**
     * Gets the "HVAdvancedValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation getHVAdvancedValuation();
    
    /**
     * True if has "HVAdvancedValuation" element
     */
    boolean isSetHVAdvancedValuation();
    
    /**
     * Sets the "HVAdvancedValuation" element
     */
    void setHVAdvancedValuation(com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation hvAdvancedValuation);
    
    /**
     * Appends and returns a new empty "HVAdvancedValuation" element
     */
    com.msbinfo.expresslync.rct.valuation.HighValueAdvancedValuation addNewHVAdvancedValuation();
    
    /**
     * Unsets the "HVAdvancedValuation" element
     */
    void unsetHVAdvancedValuation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.ValuationAggregate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationAggregate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
