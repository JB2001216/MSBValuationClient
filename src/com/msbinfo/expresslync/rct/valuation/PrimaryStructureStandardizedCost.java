/*
 * XML Type:  PrimaryStructureStandardizedCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML PrimaryStructureStandardizedCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface PrimaryStructureStandardizedCost extends com.msbinfo.expresslync.rct.valuation.PrimaryStructureCost
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryStructureStandardizedCost.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("primarystructurestandardizedcost6820type");
    
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
     * Gets the "SubtotalAfterDebrisRemoval" element
     */
    int getSubtotalAfterDebrisRemoval();
    
    /**
     * Gets (as xml) the "SubtotalAfterDebrisRemoval" element
     */
    org.apache.xmlbeans.XmlInt xgetSubtotalAfterDebrisRemoval();
    
    /**
     * Sets the "SubtotalAfterDebrisRemoval" element
     */
    void setSubtotalAfterDebrisRemoval(int subtotalAfterDebrisRemoval);
    
    /**
     * Sets (as xml) the "SubtotalAfterDebrisRemoval" element
     */
    void xsetSubtotalAfterDebrisRemoval(org.apache.xmlbeans.XmlInt subtotalAfterDebrisRemoval);
    
    /**
     * Gets the "FinishedFloorArea" element
     */
    int getFinishedFloorArea();
    
    /**
     * Gets (as xml) the "FinishedFloorArea" element
     */
    org.apache.xmlbeans.XmlInt xgetFinishedFloorArea();
    
    /**
     * True if has "FinishedFloorArea" element
     */
    boolean isSetFinishedFloorArea();
    
    /**
     * Sets the "FinishedFloorArea" element
     */
    void setFinishedFloorArea(int finishedFloorArea);
    
    /**
     * Sets (as xml) the "FinishedFloorArea" element
     */
    void xsetFinishedFloorArea(org.apache.xmlbeans.XmlInt finishedFloorArea);
    
    /**
     * Unsets the "FinishedFloorArea" element
     */
    void unsetFinishedFloorArea();
    
    /**
     * Gets the "TotalFloorArea" element
     */
    int getTotalFloorArea();
    
    /**
     * Gets (as xml) the "TotalFloorArea" element
     */
    org.apache.xmlbeans.XmlInt xgetTotalFloorArea();
    
    /**
     * True if has "TotalFloorArea" element
     */
    boolean isSetTotalFloorArea();
    
    /**
     * Sets the "TotalFloorArea" element
     */
    void setTotalFloorArea(int totalFloorArea);
    
    /**
     * Sets (as xml) the "TotalFloorArea" element
     */
    void xsetTotalFloorArea(org.apache.xmlbeans.XmlInt totalFloorArea);
    
    /**
     * Unsets the "TotalFloorArea" element
     */
    void unsetTotalFloorArea();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
