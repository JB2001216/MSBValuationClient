/*
 * XML Type:  MsMmhSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MsMmhSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML MsMmhSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface MsMmhSection extends com.msbinfo.expresslync.rct.valuation.Section
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MsMmhSection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("msmmhsection9a48type");
    
    /**
     * Gets the "PerimeterChoice" element
     */
    com.msbinfo.expresslync.rct.valuation.PerimeterChoice.Enum getPerimeterChoice();
    
    /**
     * Gets (as xml) the "PerimeterChoice" element
     */
    com.msbinfo.expresslync.rct.valuation.PerimeterChoice xgetPerimeterChoice();
    
    /**
     * True if has "PerimeterChoice" element
     */
    boolean isSetPerimeterChoice();
    
    /**
     * Sets the "PerimeterChoice" element
     */
    void setPerimeterChoice(com.msbinfo.expresslync.rct.valuation.PerimeterChoice.Enum perimeterChoice);
    
    /**
     * Sets (as xml) the "PerimeterChoice" element
     */
    void xsetPerimeterChoice(com.msbinfo.expresslync.rct.valuation.PerimeterChoice perimeterChoice);
    
    /**
     * Unsets the "PerimeterChoice" element
     */
    void unsetPerimeterChoice();
    
    /**
     * Gets the "MeasuredPerimeter" element
     */
    short getMeasuredPerimeter();
    
    /**
     * Gets (as xml) the "MeasuredPerimeter" element
     */
    org.apache.xmlbeans.XmlShort xgetMeasuredPerimeter();
    
    /**
     * True if has "MeasuredPerimeter" element
     */
    boolean isSetMeasuredPerimeter();
    
    /**
     * Sets the "MeasuredPerimeter" element
     */
    void setMeasuredPerimeter(short measuredPerimeter);
    
    /**
     * Sets (as xml) the "MeasuredPerimeter" element
     */
    void xsetMeasuredPerimeter(org.apache.xmlbeans.XmlShort measuredPerimeter);
    
    /**
     * Unsets the "MeasuredPerimeter" element
     */
    void unsetMeasuredPerimeter();
    
    /**
     * Gets the "LengthAndWidth" element
     */
    com.msbinfo.expresslync.rct.valuation.LengthWidth getLengthAndWidth();
    
    /**
     * True if has "LengthAndWidth" element
     */
    boolean isSetLengthAndWidth();
    
    /**
     * Sets the "LengthAndWidth" element
     */
    void setLengthAndWidth(com.msbinfo.expresslync.rct.valuation.LengthWidth lengthAndWidth);
    
    /**
     * Appends and returns a new empty "LengthAndWidth" element
     */
    com.msbinfo.expresslync.rct.valuation.LengthWidth addNewLengthAndWidth();
    
    /**
     * Unsets the "LengthAndWidth" element
     */
    void unsetLengthAndWidth();
    
    /**
     * Gets the "LivingAreaEntryMethod" element
     */
    com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod.Enum getLivingAreaEntryMethod();
    
    /**
     * Gets (as xml) the "LivingAreaEntryMethod" element
     */
    com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod xgetLivingAreaEntryMethod();
    
    /**
     * True if has "LivingAreaEntryMethod" element
     */
    boolean isSetLivingAreaEntryMethod();
    
    /**
     * Sets the "LivingAreaEntryMethod" element
     */
    void setLivingAreaEntryMethod(com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod.Enum livingAreaEntryMethod);
    
    /**
     * Sets (as xml) the "LivingAreaEntryMethod" element
     */
    void xsetLivingAreaEntryMethod(com.msbinfo.expresslync.rct.valuation.LivingAreaEntryMethod livingAreaEntryMethod);
    
    /**
     * Unsets the "LivingAreaEntryMethod" element
     */
    void unsetLivingAreaEntryMethod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MsMmhSection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MsMmhSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
