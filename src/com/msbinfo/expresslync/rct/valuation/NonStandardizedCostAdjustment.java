/*
 * XML Type:  NonStandardizedCostAdjustment
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML NonStandardizedCostAdjustment(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface NonStandardizedCostAdjustment extends com.msbinfo.expresslync.rct.valuation.Adjustment
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NonStandardizedCostAdjustment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("nonstandardizedcostadjustment5be9type");
    
    /**
     * Gets the "ArchitectFee" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getArchitectFee();
    
    /**
     * True if has "ArchitectFee" element
     */
    boolean isSetArchitectFee();
    
    /**
     * Sets the "ArchitectFee" element
     */
    void setArchitectFee(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters architectFee);
    
    /**
     * Appends and returns a new empty "ArchitectFee" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewArchitectFee();
    
    /**
     * Unsets the "ArchitectFee" element
     */
    void unsetArchitectFee();
    
    /**
     * Gets the "GeneralContractorOverhead" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getGeneralContractorOverhead();
    
    /**
     * True if has "GeneralContractorOverhead" element
     */
    boolean isSetGeneralContractorOverhead();
    
    /**
     * Sets the "GeneralContractorOverhead" element
     */
    void setGeneralContractorOverhead(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters generalContractorOverhead);
    
    /**
     * Appends and returns a new empty "GeneralContractorOverhead" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewGeneralContractorOverhead();
    
    /**
     * Unsets the "GeneralContractorOverhead" element
     */
    void unsetGeneralContractorOverhead();
    
    /**
     * Gets the "GeneralContractorProfit" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getGeneralContractorProfit();
    
    /**
     * True if has "GeneralContractorProfit" element
     */
    boolean isSetGeneralContractorProfit();
    
    /**
     * Sets the "GeneralContractorProfit" element
     */
    void setGeneralContractorProfit(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters generalContractorProfit);
    
    /**
     * Appends and returns a new empty "GeneralContractorProfit" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewGeneralContractorProfit();
    
    /**
     * Unsets the "GeneralContractorProfit" element
     */
    void unsetGeneralContractorProfit();
    
    /**
     * Gets the "DebrisRemoval" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters getDebrisRemoval();
    
    /**
     * True if has "DebrisRemoval" element
     */
    boolean isSetDebrisRemoval();
    
    /**
     * Sets the "DebrisRemoval" element
     */
    void setDebrisRemoval(com.msbinfo.expresslync.rct.valuation.AdjustmentParameters debrisRemoval);
    
    /**
     * Appends and returns a new empty "DebrisRemoval" element
     */
    com.msbinfo.expresslync.rct.valuation.AdjustmentParameters addNewDebrisRemoval();
    
    /**
     * Unsets the "DebrisRemoval" element
     */
    void unsetDebrisRemoval();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.NonStandardizedCostAdjustment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
