/*
 * XML Type:  SectionType
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.SectionType
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML SectionType(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is an atomic type that is a restriction of com.msbinfo.expresslync.rct.valuation.SectionType.
 */
public interface SectionType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("sectiontype8b3etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum WHOLE_HOUSE = Enum.forString("Whole_House");
    static final Enum VERTICAL_SECTION = Enum.forString("Vertical_Section");
    static final Enum HORIZONTAL_GROUND_FLOOR = Enum.forString("Horizontal_Ground_Floor");
    static final Enum HORIZONTAL_UPPER_FLOOR = Enum.forString("Horizontal_Upper_Floor");
    static final Enum BASEMENT = Enum.forString("Basement");
    static final Enum BASEMENT_DAYLIGHT = Enum.forString("Basement_Daylight");
    static final Enum BASEMENT_WALKOUT = Enum.forString("Basement_Walkout");
    static final Enum ATTACHED_GARAGE = Enum.forString("Attached_Garage");
    static final Enum DETACHED_GARAGE = Enum.forString("Detached_Garage");
    static final Enum DETACHED_GARAGE_LIVING_AREA_ABOVE = Enum.forString("Detached_Garage__Living_Area_Above");
    static final Enum DETACHED_GARAGE_LIVING_AREA_ATTACHED = Enum.forString("Detached_Garage__Living_Area_Attached");
    static final Enum BUILT_IN_GARAGE = Enum.forString("BuiltIn_Garage");
    static final Enum BASEMENT_GARAGE = Enum.forString("Basement_Garage");
    static final Enum BATHHOUSE = Enum.forString("Bathhouse");
    static final Enum GUESTHOUSE = Enum.forString("Guesthouse");
    static final Enum STUDIO = Enum.forString("Studio");
    static final Enum USER_DEFINED = Enum.forString("User_Defined");
    
    static final int INT_WHOLE_HOUSE = Enum.INT_WHOLE_HOUSE;
    static final int INT_VERTICAL_SECTION = Enum.INT_VERTICAL_SECTION;
    static final int INT_HORIZONTAL_GROUND_FLOOR = Enum.INT_HORIZONTAL_GROUND_FLOOR;
    static final int INT_HORIZONTAL_UPPER_FLOOR = Enum.INT_HORIZONTAL_UPPER_FLOOR;
    static final int INT_BASEMENT = Enum.INT_BASEMENT;
    static final int INT_BASEMENT_DAYLIGHT = Enum.INT_BASEMENT_DAYLIGHT;
    static final int INT_BASEMENT_WALKOUT = Enum.INT_BASEMENT_WALKOUT;
    static final int INT_ATTACHED_GARAGE = Enum.INT_ATTACHED_GARAGE;
    static final int INT_DETACHED_GARAGE = Enum.INT_DETACHED_GARAGE;
    static final int INT_DETACHED_GARAGE_LIVING_AREA_ABOVE = Enum.INT_DETACHED_GARAGE_LIVING_AREA_ABOVE;
    static final int INT_DETACHED_GARAGE_LIVING_AREA_ATTACHED = Enum.INT_DETACHED_GARAGE_LIVING_AREA_ATTACHED;
    static final int INT_BUILT_IN_GARAGE = Enum.INT_BUILT_IN_GARAGE;
    static final int INT_BASEMENT_GARAGE = Enum.INT_BASEMENT_GARAGE;
    static final int INT_BATHHOUSE = Enum.INT_BATHHOUSE;
    static final int INT_GUESTHOUSE = Enum.INT_GUESTHOUSE;
    static final int INT_STUDIO = Enum.INT_STUDIO;
    static final int INT_USER_DEFINED = Enum.INT_USER_DEFINED;
    
    /**
     * Enumeration value class for com.msbinfo.expresslync.rct.valuation.SectionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_WHOLE_HOUSE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_WHOLE_HOUSE = 1;
        static final int INT_VERTICAL_SECTION = 2;
        static final int INT_HORIZONTAL_GROUND_FLOOR = 3;
        static final int INT_HORIZONTAL_UPPER_FLOOR = 4;
        static final int INT_BASEMENT = 5;
        static final int INT_BASEMENT_DAYLIGHT = 6;
        static final int INT_BASEMENT_WALKOUT = 7;
        static final int INT_ATTACHED_GARAGE = 8;
        static final int INT_DETACHED_GARAGE = 9;
        static final int INT_DETACHED_GARAGE_LIVING_AREA_ABOVE = 10;
        static final int INT_DETACHED_GARAGE_LIVING_AREA_ATTACHED = 11;
        static final int INT_BUILT_IN_GARAGE = 12;
        static final int INT_BASEMENT_GARAGE = 13;
        static final int INT_BATHHOUSE = 14;
        static final int INT_GUESTHOUSE = 15;
        static final int INT_STUDIO = 16;
        static final int INT_USER_DEFINED = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Whole_House", INT_WHOLE_HOUSE),
                new Enum("Vertical_Section", INT_VERTICAL_SECTION),
                new Enum("Horizontal_Ground_Floor", INT_HORIZONTAL_GROUND_FLOOR),
                new Enum("Horizontal_Upper_Floor", INT_HORIZONTAL_UPPER_FLOOR),
                new Enum("Basement", INT_BASEMENT),
                new Enum("Basement_Daylight", INT_BASEMENT_DAYLIGHT),
                new Enum("Basement_Walkout", INT_BASEMENT_WALKOUT),
                new Enum("Attached_Garage", INT_ATTACHED_GARAGE),
                new Enum("Detached_Garage", INT_DETACHED_GARAGE),
                new Enum("Detached_Garage__Living_Area_Above", INT_DETACHED_GARAGE_LIVING_AREA_ABOVE),
                new Enum("Detached_Garage__Living_Area_Attached", INT_DETACHED_GARAGE_LIVING_AREA_ATTACHED),
                new Enum("BuiltIn_Garage", INT_BUILT_IN_GARAGE),
                new Enum("Basement_Garage", INT_BASEMENT_GARAGE),
                new Enum("Bathhouse", INT_BATHHOUSE),
                new Enum("Guesthouse", INT_GUESTHOUSE),
                new Enum("Studio", INT_STUDIO),
                new Enum("User_Defined", INT_USER_DEFINED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.SectionType newValue(java.lang.Object obj) {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) type.newValue( obj ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.SectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.SectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
