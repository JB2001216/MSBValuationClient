/*
 * XML Type:  CalculatableValuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.CalculatableValuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML CalculatableValuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface CalculatableValuation extends com.msbinfo.expresslync.rct.valuation.Valuation
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculatableValuation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("calculatablevaluation4715type");
    
    /**
     * Gets the "CalculationResult" element
     */
    com.msbinfo.expresslync.rct.valuation.CalculationResult getCalculationResult();
    
    /**
     * True if has "CalculationResult" element
     */
    boolean isSetCalculationResult();
    
    /**
     * Sets the "CalculationResult" element
     */
    void setCalculationResult(com.msbinfo.expresslync.rct.valuation.CalculationResult calculationResult);
    
    /**
     * Appends and returns a new empty "CalculationResult" element
     */
    com.msbinfo.expresslync.rct.valuation.CalculationResult addNewCalculationResult();
    
    /**
     * Unsets the "CalculationResult" element
     */
    void unsetCalculationResult();
    
    /**
     * Gets the "Preferences" element
     */
    com.msbinfo.expresslync.rct.valuation.Preferences getPreferences();
    
    /**
     * True if has "Preferences" element
     */
    boolean isSetPreferences();
    
    /**
     * Sets the "Preferences" element
     */
    void setPreferences(com.msbinfo.expresslync.rct.valuation.Preferences preferences);
    
    /**
     * Appends and returns a new empty "Preferences" element
     */
    com.msbinfo.expresslync.rct.valuation.Preferences addNewPreferences();
    
    /**
     * Unsets the "Preferences" element
     */
    void unsetPreferences();
    
    /**
     * Gets the "Adjustment" element
     */
    com.msbinfo.expresslync.rct.valuation.Adjustment getAdjustment();
    
    /**
     * True if has "Adjustment" element
     */
    boolean isSetAdjustment();
    
    /**
     * Sets the "Adjustment" element
     */
    void setAdjustment(com.msbinfo.expresslync.rct.valuation.Adjustment adjustment);
    
    /**
     * Appends and returns a new empty "Adjustment" element
     */
    com.msbinfo.expresslync.rct.valuation.Adjustment addNewAdjustment();
    
    /**
     * Unsets the "Adjustment" element
     */
    void unsetAdjustment();
    
    /**
     * Gets the "NonStandardizedCostAdjustment" element
     */
    com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment getNonStandardizedCostAdjustment();
    
    /**
     * True if has "NonStandardizedCostAdjustment" element
     */
    boolean isSetNonStandardizedCostAdjustment();
    
    /**
     * Sets the "NonStandardizedCostAdjustment" element
     */
    void setNonStandardizedCostAdjustment(com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment nonStandardizedCostAdjustment);
    
    /**
     * Appends and returns a new empty "NonStandardizedCostAdjustment" element
     */
    com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment addNewNonStandardizedCostAdjustment();
    
    /**
     * Unsets the "NonStandardizedCostAdjustment" element
     */
    void unsetNonStandardizedCostAdjustment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.CalculatableValuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.CalculatableValuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
