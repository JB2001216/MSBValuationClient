/*
 * XML Type:  StandardizedAddress
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.StandardizedAddress
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML StandardizedAddress(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface StandardizedAddress extends com.msbinfo.expresslync.rct.valuation.Address
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardizedAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("standardizedaddress1196type");
    
    /**
     * Gets the "Country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "Country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "Country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "Country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "MatchCode" element
     */
    java.lang.String getMatchCode();
    
    /**
     * Gets (as xml) the "MatchCode" element
     */
    org.apache.xmlbeans.XmlString xgetMatchCode();
    
    /**
     * True if has "MatchCode" element
     */
    boolean isSetMatchCode();
    
    /**
     * Sets the "MatchCode" element
     */
    void setMatchCode(java.lang.String matchCode);
    
    /**
     * Sets (as xml) the "MatchCode" element
     */
    void xsetMatchCode(org.apache.xmlbeans.XmlString matchCode);
    
    /**
     * Unsets the "MatchCode" element
     */
    void unsetMatchCode();
    
    /**
     * Gets the "BlockCode" element
     */
    java.lang.String getBlockCode();
    
    /**
     * Gets (as xml) the "BlockCode" element
     */
    org.apache.xmlbeans.XmlString xgetBlockCode();
    
    /**
     * True if has "BlockCode" element
     */
    boolean isSetBlockCode();
    
    /**
     * Sets the "BlockCode" element
     */
    void setBlockCode(java.lang.String blockCode);
    
    /**
     * Sets (as xml) the "BlockCode" element
     */
    void xsetBlockCode(org.apache.xmlbeans.XmlString blockCode);
    
    /**
     * Unsets the "BlockCode" element
     */
    void unsetBlockCode();
    
    /**
     * Gets the "LocationCode" element
     */
    java.lang.String getLocationCode();
    
    /**
     * Gets (as xml) the "LocationCode" element
     */
    org.apache.xmlbeans.XmlString xgetLocationCode();
    
    /**
     * True if has "LocationCode" element
     */
    boolean isSetLocationCode();
    
    /**
     * Sets the "LocationCode" element
     */
    void setLocationCode(java.lang.String locationCode);
    
    /**
     * Sets (as xml) the "LocationCode" element
     */
    void xsetLocationCode(org.apache.xmlbeans.XmlString locationCode);
    
    /**
     * Unsets the "LocationCode" element
     */
    void unsetLocationCode();
    
    /**
     * Gets the "LatLong" element
     */
    com.msbinfo.expresslync.rct.valuation.LatLongPair getLatLong();
    
    /**
     * True if has "LatLong" element
     */
    boolean isSetLatLong();
    
    /**
     * Sets the "LatLong" element
     */
    void setLatLong(com.msbinfo.expresslync.rct.valuation.LatLongPair latLong);
    
    /**
     * Appends and returns a new empty "LatLong" element
     */
    com.msbinfo.expresslync.rct.valuation.LatLongPair addNewLatLong();
    
    /**
     * Unsets the "LatLong" element
     */
    void unsetLatLong();
    
    /**
     * Gets the "County" element
     */
    java.lang.String getCounty();
    
    /**
     * Gets (as xml) the "County" element
     */
    org.apache.xmlbeans.XmlString xgetCounty();
    
    /**
     * True if has "County" element
     */
    boolean isSetCounty();
    
    /**
     * Sets the "County" element
     */
    void setCounty(java.lang.String county);
    
    /**
     * Sets (as xml) the "County" element
     */
    void xsetCounty(org.apache.xmlbeans.XmlString county);
    
    /**
     * Unsets the "County" element
     */
    void unsetCounty();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.StandardizedAddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.StandardizedAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
