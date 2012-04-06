/*
 * XML Type:  SiteAccess
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.SiteAccess
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML SiteAccess(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is an atomic type that is a restriction of com.msbinfo.expresslync.rct.valuation.SiteAccess.
 */
public interface SiteAccess extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteAccess.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("siteaccess4ac0type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DIFFICULT_ACCESS_OR_STEEP_TERRAIN = Enum.forString("Difficult_Access_or_Steep_Terrain");
    static final Enum ELEVATOR_ACCESS = Enum.forString("Elevator_Access");
    static final Enum FLAT_AREA_EASY_ACCESS_ROADS = Enum.forString("Flat_Area__Easy_Access_Roads");
    static final Enum ISLAND_ACCESS_LONG_DISTANCE = Enum.forString("Island_Access__Long_Distance");
    static final Enum ISLAND_ACCESS_SHORT_DISTANCE = Enum.forString("Island_Access__Short_Distance");
    static final Enum ISOLATED_RURAL_AREA = Enum.forString("Isolated_Rural_Area");
    static final Enum MOUNTAIN_REGION = Enum.forString("Mountain_Region");
    static final Enum NARROW_OR_HILLSIDE_AREA = Enum.forString("Narrow_or_Hillside_Area");
    static final Enum SLIGHTLY_CONGESTED_ROADS = Enum.forString("Slightly_Congested_Roads");
    
    static final int INT_DIFFICULT_ACCESS_OR_STEEP_TERRAIN = Enum.INT_DIFFICULT_ACCESS_OR_STEEP_TERRAIN;
    static final int INT_ELEVATOR_ACCESS = Enum.INT_ELEVATOR_ACCESS;
    static final int INT_FLAT_AREA_EASY_ACCESS_ROADS = Enum.INT_FLAT_AREA_EASY_ACCESS_ROADS;
    static final int INT_ISLAND_ACCESS_LONG_DISTANCE = Enum.INT_ISLAND_ACCESS_LONG_DISTANCE;
    static final int INT_ISLAND_ACCESS_SHORT_DISTANCE = Enum.INT_ISLAND_ACCESS_SHORT_DISTANCE;
    static final int INT_ISOLATED_RURAL_AREA = Enum.INT_ISOLATED_RURAL_AREA;
    static final int INT_MOUNTAIN_REGION = Enum.INT_MOUNTAIN_REGION;
    static final int INT_NARROW_OR_HILLSIDE_AREA = Enum.INT_NARROW_OR_HILLSIDE_AREA;
    static final int INT_SLIGHTLY_CONGESTED_ROADS = Enum.INT_SLIGHTLY_CONGESTED_ROADS;
    
    /**
     * Enumeration value class for com.msbinfo.expresslync.rct.valuation.SiteAccess.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DIFFICULT_ACCESS_OR_STEEP_TERRAIN
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
        
        static final int INT_DIFFICULT_ACCESS_OR_STEEP_TERRAIN = 1;
        static final int INT_ELEVATOR_ACCESS = 2;
        static final int INT_FLAT_AREA_EASY_ACCESS_ROADS = 3;
        static final int INT_ISLAND_ACCESS_LONG_DISTANCE = 4;
        static final int INT_ISLAND_ACCESS_SHORT_DISTANCE = 5;
        static final int INT_ISOLATED_RURAL_AREA = 6;
        static final int INT_MOUNTAIN_REGION = 7;
        static final int INT_NARROW_OR_HILLSIDE_AREA = 8;
        static final int INT_SLIGHTLY_CONGESTED_ROADS = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Difficult_Access_or_Steep_Terrain", INT_DIFFICULT_ACCESS_OR_STEEP_TERRAIN),
                new Enum("Elevator_Access", INT_ELEVATOR_ACCESS),
                new Enum("Flat_Area__Easy_Access_Roads", INT_FLAT_AREA_EASY_ACCESS_ROADS),
                new Enum("Island_Access__Long_Distance", INT_ISLAND_ACCESS_LONG_DISTANCE),
                new Enum("Island_Access__Short_Distance", INT_ISLAND_ACCESS_SHORT_DISTANCE),
                new Enum("Isolated_Rural_Area", INT_ISOLATED_RURAL_AREA),
                new Enum("Mountain_Region", INT_MOUNTAIN_REGION),
                new Enum("Narrow_or_Hillside_Area", INT_NARROW_OR_HILLSIDE_AREA),
                new Enum("Slightly_Congested_Roads", INT_SLIGHTLY_CONGESTED_ROADS),
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
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess newValue(java.lang.Object obj) {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) type.newValue( obj ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.SiteAccess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.SiteAccess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
