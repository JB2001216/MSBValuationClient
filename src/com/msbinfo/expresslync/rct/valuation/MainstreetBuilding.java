/*
 * XML Type:  MainstreetBuilding
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MainstreetBuilding
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML MainstreetBuilding(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface MainstreetBuilding extends com.msbinfo.expresslync.rct.valuation.MsMmhBuilding
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainstreetBuilding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("mainstreetbuildingfd9btype");
    
    /**
     * Gets the "NumberOfFamilies" element
     */
    short getNumberOfFamilies();
    
    /**
     * Gets (as xml) the "NumberOfFamilies" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetNumberOfFamilies();
    
    /**
     * True if has "NumberOfFamilies" element
     */
    boolean isSetNumberOfFamilies();
    
    /**
     * Sets the "NumberOfFamilies" element
     */
    void setNumberOfFamilies(short numberOfFamilies);
    
    /**
     * Sets (as xml) the "NumberOfFamilies" element
     */
    void xsetNumberOfFamilies(org.apache.xmlbeans.XmlUnsignedByte numberOfFamilies);
    
    /**
     * Unsets the "NumberOfFamilies" element
     */
    void unsetNumberOfFamilies();
    
    /**
     * Gets array of all "Section" elements
     */
    com.msbinfo.expresslync.rct.valuation.MainstreetSection[] getSectionArray();
    
    /**
     * Gets ith "Section" element
     */
    com.msbinfo.expresslync.rct.valuation.MainstreetSection getSectionArray(int i);
    
    /**
     * Returns number of "Section" element
     */
    int sizeOfSectionArray();
    
    /**
     * Sets array of all "Section" element
     */
    void setSectionArray(com.msbinfo.expresslync.rct.valuation.MainstreetSection[] sectionArray);
    
    /**
     * Sets ith "Section" element
     */
    void setSectionArray(int i, com.msbinfo.expresslync.rct.valuation.MainstreetSection section);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Section" element
     */
    com.msbinfo.expresslync.rct.valuation.MainstreetSection insertNewSection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    com.msbinfo.expresslync.rct.valuation.MainstreetSection addNewSection();
    
    /**
     * Removes the ith "Section" element
     */
    void removeSection(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetBuilding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetBuilding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
