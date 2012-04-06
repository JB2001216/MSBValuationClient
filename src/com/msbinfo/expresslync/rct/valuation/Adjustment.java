/*
 * XML Type:  Adjustment
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Adjustment
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML Adjustment(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface Adjustment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Adjustment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("adjustment341etype");
    
    /**
     * Gets the "GeneralPercentage" element
     */
    java.math.BigDecimal getGeneralPercentage();
    
    /**
     * Gets (as xml) the "GeneralPercentage" element
     */
    org.apache.xmlbeans.XmlDecimal xgetGeneralPercentage();
    
    /**
     * True if has "GeneralPercentage" element
     */
    boolean isSetGeneralPercentage();
    
    /**
     * Sets the "GeneralPercentage" element
     */
    void setGeneralPercentage(java.math.BigDecimal generalPercentage);
    
    /**
     * Sets (as xml) the "GeneralPercentage" element
     */
    void xsetGeneralPercentage(org.apache.xmlbeans.XmlDecimal generalPercentage);
    
    /**
     * Unsets the "GeneralPercentage" element
     */
    void unsetGeneralPercentage();
    
    /**
     * Gets the "DepreciationChoice" element
     */
    com.msbinfo.expresslync.rct.valuation.DepreciationChoice.Enum getDepreciationChoice();
    
    /**
     * Gets (as xml) the "DepreciationChoice" element
     */
    com.msbinfo.expresslync.rct.valuation.DepreciationChoice xgetDepreciationChoice();
    
    /**
     * True if has "DepreciationChoice" element
     */
    boolean isSetDepreciationChoice();
    
    /**
     * Sets the "DepreciationChoice" element
     */
    void setDepreciationChoice(com.msbinfo.expresslync.rct.valuation.DepreciationChoice.Enum depreciationChoice);
    
    /**
     * Sets (as xml) the "DepreciationChoice" element
     */
    void xsetDepreciationChoice(com.msbinfo.expresslync.rct.valuation.DepreciationChoice depreciationChoice);
    
    /**
     * Unsets the "DepreciationChoice" element
     */
    void unsetDepreciationChoice();
    
    /**
     * Gets the "DepreciationPercentage" element
     */
    java.math.BigDecimal getDepreciationPercentage();
    
    /**
     * Gets (as xml) the "DepreciationPercentage" element
     */
    org.apache.xmlbeans.XmlDecimal xgetDepreciationPercentage();
    
    /**
     * True if has "DepreciationPercentage" element
     */
    boolean isSetDepreciationPercentage();
    
    /**
     * Sets the "DepreciationPercentage" element
     */
    void setDepreciationPercentage(java.math.BigDecimal depreciationPercentage);
    
    /**
     * Sets (as xml) the "DepreciationPercentage" element
     */
    void xsetDepreciationPercentage(org.apache.xmlbeans.XmlDecimal depreciationPercentage);
    
    /**
     * Unsets the "DepreciationPercentage" element
     */
    void unsetDepreciationPercentage();
    
    /**
     * Gets the "DepreciationEffectiveAge" element
     */
    int getDepreciationEffectiveAge();
    
    /**
     * Gets (as xml) the "DepreciationEffectiveAge" element
     */
    org.apache.xmlbeans.XmlInt xgetDepreciationEffectiveAge();
    
    /**
     * True if has "DepreciationEffectiveAge" element
     */
    boolean isSetDepreciationEffectiveAge();
    
    /**
     * Sets the "DepreciationEffectiveAge" element
     */
    void setDepreciationEffectiveAge(int depreciationEffectiveAge);
    
    /**
     * Sets (as xml) the "DepreciationEffectiveAge" element
     */
    void xsetDepreciationEffectiveAge(org.apache.xmlbeans.XmlInt depreciationEffectiveAge);
    
    /**
     * Unsets the "DepreciationEffectiveAge" element
     */
    void unsetDepreciationEffectiveAge();
    
    /**
     * Gets the "WageType" element
     */
    com.msbinfo.expresslync.rct.valuation.WageType.Enum getWageType();
    
    /**
     * Gets (as xml) the "WageType" element
     */
    com.msbinfo.expresslync.rct.valuation.WageType xgetWageType();
    
    /**
     * True if has "WageType" element
     */
    boolean isSetWageType();
    
    /**
     * Sets the "WageType" element
     */
    void setWageType(com.msbinfo.expresslync.rct.valuation.WageType.Enum wageType);
    
    /**
     * Sets (as xml) the "WageType" element
     */
    void xsetWageType(com.msbinfo.expresslync.rct.valuation.WageType wageType);
    
    /**
     * Unsets the "WageType" element
     */
    void unsetWageType();
    
    /**
     * Gets the "DepreciationCondition" element
     */
    com.msbinfo.expresslync.rct.valuation.DepreciationCondition.Enum getDepreciationCondition();
    
    /**
     * Gets (as xml) the "DepreciationCondition" element
     */
    com.msbinfo.expresslync.rct.valuation.DepreciationCondition xgetDepreciationCondition();
    
    /**
     * True if has "DepreciationCondition" element
     */
    boolean isSetDepreciationCondition();
    
    /**
     * Sets the "DepreciationCondition" element
     */
    void setDepreciationCondition(com.msbinfo.expresslync.rct.valuation.DepreciationCondition.Enum depreciationCondition);
    
    /**
     * Sets (as xml) the "DepreciationCondition" element
     */
    void xsetDepreciationCondition(com.msbinfo.expresslync.rct.valuation.DepreciationCondition depreciationCondition);
    
    /**
     * Unsets the "DepreciationCondition" element
     */
    void unsetDepreciationCondition();
    
    /**
     * Gets the "ApplyHistoricalDepreciation" element
     */
    boolean getApplyHistoricalDepreciation();
    
    /**
     * Gets (as xml) the "ApplyHistoricalDepreciation" element
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyHistoricalDepreciation();
    
    /**
     * True if has "ApplyHistoricalDepreciation" element
     */
    boolean isSetApplyHistoricalDepreciation();
    
    /**
     * Sets the "ApplyHistoricalDepreciation" element
     */
    void setApplyHistoricalDepreciation(boolean applyHistoricalDepreciation);
    
    /**
     * Sets (as xml) the "ApplyHistoricalDepreciation" element
     */
    void xsetApplyHistoricalDepreciation(org.apache.xmlbeans.XmlBoolean applyHistoricalDepreciation);
    
    /**
     * Unsets the "ApplyHistoricalDepreciation" element
     */
    void unsetApplyHistoricalDepreciation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.Adjustment newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.Adjustment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.Adjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
