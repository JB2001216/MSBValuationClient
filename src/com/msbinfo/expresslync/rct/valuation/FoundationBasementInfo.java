/*
 * XML Type:  FoundationBasementInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML FoundationBasementInfo(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface FoundationBasementInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FoundationBasementInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("foundationbasementinfob29btype");
    
    /**
     * Gets the "SlabPct" element
     */
    short getSlabPct();
    
    /**
     * Gets (as xml) the "SlabPct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetSlabPct();
    
    /**
     * Sets the "SlabPct" element
     */
    void setSlabPct(short slabPct);
    
    /**
     * Sets (as xml) the "SlabPct" element
     */
    void xsetSlabPct(org.apache.xmlbeans.XmlUnsignedByte slabPct);
    
    /**
     * Gets the "CrawlSpacePct" element
     */
    short getCrawlSpacePct();
    
    /**
     * Gets (as xml) the "CrawlSpacePct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetCrawlSpacePct();
    
    /**
     * Sets the "CrawlSpacePct" element
     */
    void setCrawlSpacePct(short crawlSpacePct);
    
    /**
     * Sets (as xml) the "CrawlSpacePct" element
     */
    void xsetCrawlSpacePct(org.apache.xmlbeans.XmlUnsignedByte crawlSpacePct);
    
    /**
     * Gets the "BasementPct" element
     */
    short getBasementPct();
    
    /**
     * Gets (as xml) the "BasementPct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetBasementPct();
    
    /**
     * Sets the "BasementPct" element
     */
    void setBasementPct(short basementPct);
    
    /**
     * Sets (as xml) the "BasementPct" element
     */
    void xsetBasementPct(org.apache.xmlbeans.XmlUnsignedByte basementPct);
    
    /**
     * Gets the "PiersRaisedPct" element
     */
    short getPiersRaisedPct();
    
    /**
     * Gets (as xml) the "PiersRaisedPct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetPiersRaisedPct();
    
    /**
     * Sets the "PiersRaisedPct" element
     */
    void setPiersRaisedPct(short piersRaisedPct);
    
    /**
     * Sets (as xml) the "PiersRaisedPct" element
     */
    void xsetPiersRaisedPct(org.apache.xmlbeans.XmlUnsignedByte piersRaisedPct);
    
    /**
     * Gets the "HillsideSlope" element
     */
    com.msbinfo.expresslync.rct.valuation.HillsideSlope.Enum getHillsideSlope();
    
    /**
     * Gets (as xml) the "HillsideSlope" element
     */
    com.msbinfo.expresslync.rct.valuation.HillsideSlope xgetHillsideSlope();
    
    /**
     * True if has "HillsideSlope" element
     */
    boolean isSetHillsideSlope();
    
    /**
     * Sets the "HillsideSlope" element
     */
    void setHillsideSlope(com.msbinfo.expresslync.rct.valuation.HillsideSlope.Enum hillsideSlope);
    
    /**
     * Sets (as xml) the "HillsideSlope" element
     */
    void xsetHillsideSlope(com.msbinfo.expresslync.rct.valuation.HillsideSlope hillsideSlope);
    
    /**
     * Unsets the "HillsideSlope" element
     */
    void unsetHillsideSlope();
    
    /**
     * Gets the "SuspendedOverHillsidePct" element
     */
    short getSuspendedOverHillsidePct();
    
    /**
     * Gets (as xml) the "SuspendedOverHillsidePct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetSuspendedOverHillsidePct();
    
    /**
     * Sets the "SuspendedOverHillsidePct" element
     */
    void setSuspendedOverHillsidePct(short suspendedOverHillsidePct);
    
    /**
     * Sets (as xml) the "SuspendedOverHillsidePct" element
     */
    void xsetSuspendedOverHillsidePct(org.apache.xmlbeans.XmlUnsignedByte suspendedOverHillsidePct);
    
    /**
     * Gets the "BasementInfo" element
     */
    com.msbinfo.expresslync.rct.valuation.BasementInfo getBasementInfo();
    
    /**
     * True if has "BasementInfo" element
     */
    boolean isSetBasementInfo();
    
    /**
     * Sets the "BasementInfo" element
     */
    void setBasementInfo(com.msbinfo.expresslync.rct.valuation.BasementInfo basementInfo);
    
    /**
     * Appends and returns a new empty "BasementInfo" element
     */
    com.msbinfo.expresslync.rct.valuation.BasementInfo addNewBasementInfo();
    
    /**
     * Unsets the "BasementInfo" element
     */
    void unsetBasementInfo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
