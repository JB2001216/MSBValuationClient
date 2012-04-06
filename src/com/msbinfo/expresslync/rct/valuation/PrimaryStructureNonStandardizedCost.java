/*
 * XML Type:  PrimaryStructureNonStandardizedCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML PrimaryStructureNonStandardizedCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface PrimaryStructureNonStandardizedCost extends com.msbinfo.expresslync.rct.valuation.PrimaryStructureCost
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryStructureNonStandardizedCost.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("primarystructurenonstandardizedcost7a87type");
    
    /**
     * Gets the "GeneralContractorOverhead" element
     */
    int getGeneralContractorOverhead();
    
    /**
     * Gets (as xml) the "GeneralContractorOverhead" element
     */
    org.apache.xmlbeans.XmlInt xgetGeneralContractorOverhead();
    
    /**
     * Sets the "GeneralContractorOverhead" element
     */
    void setGeneralContractorOverhead(int generalContractorOverhead);
    
    /**
     * Sets (as xml) the "GeneralContractorOverhead" element
     */
    void xsetGeneralContractorOverhead(org.apache.xmlbeans.XmlInt generalContractorOverhead);
    
    /**
     * Gets the "GeneralContractorProfit" element
     */
    int getGeneralContractorProfit();
    
    /**
     * Gets (as xml) the "GeneralContractorProfit" element
     */
    org.apache.xmlbeans.XmlInt xgetGeneralContractorProfit();
    
    /**
     * Sets the "GeneralContractorProfit" element
     */
    void setGeneralContractorProfit(int generalContractorProfit);
    
    /**
     * Sets (as xml) the "GeneralContractorProfit" element
     */
    void xsetGeneralContractorProfit(org.apache.xmlbeans.XmlInt generalContractorProfit);
    
    /**
     * Gets the "ArchitectFee" element
     */
    int getArchitectFee();
    
    /**
     * Gets (as xml) the "ArchitectFee" element
     */
    org.apache.xmlbeans.XmlInt xgetArchitectFee();
    
    /**
     * Sets the "ArchitectFee" element
     */
    void setArchitectFee(int architectFee);
    
    /**
     * Sets (as xml) the "ArchitectFee" element
     */
    void xsetArchitectFee(org.apache.xmlbeans.XmlInt architectFee);
    
    /**
     * Gets the "DebrisRemoval" element
     */
    int getDebrisRemoval();
    
    /**
     * Gets (as xml) the "DebrisRemoval" element
     */
    org.apache.xmlbeans.XmlInt xgetDebrisRemoval();
    
    /**
     * Sets the "DebrisRemoval" element
     */
    void setDebrisRemoval(int debrisRemoval);
    
    /**
     * Sets (as xml) the "DebrisRemoval" element
     */
    void xsetDebrisRemoval(org.apache.xmlbeans.XmlInt debrisRemoval);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
