/*
 * XML Type:  RoomType
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.RoomType
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML RoomType(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is an atomic type that is a restriction of com.msbinfo.expresslync.rct.valuation.RoomType.
 */
public interface RoomType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoomType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("roomtypee196type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum KITCHENS = Enum.forString("Kitchens");
    static final Enum DINING_ROOMS = Enum.forString("DiningRooms");
    static final Enum LIVING_ROOMS = Enum.forString("LivingRooms");
    static final Enum DEN_STUDY_OFFICES = Enum.forString("DenStudyOffices");
    static final Enum BEDROOMS = Enum.forString("Bedrooms");
    static final Enum HALF_BATHS = Enum.forString("HalfBaths");
    static final Enum FAMILY_ROOMS = Enum.forString("FamilyRooms");
    static final Enum ENTRIES_FOYERS = Enum.forString("EntriesFoyers");
    static final Enum EXTRA_ROOMS = Enum.forString("ExtraRooms");
    static final Enum MUD_ROOMS = Enum.forString("MudRooms");
    static final Enum STORAGE_ROOMS = Enum.forString("StorageRooms");
    static final Enum LAUNDRY_UTILITIES_SEWING = Enum.forString("LaundryUtilitiesSewing");
    static final Enum BREAKFAST_NOOKS = Enum.forString("BreakfastNooks");
    static final Enum BUILTIN_GARAGE = Enum.forString("BuiltinGarage");
    static final Enum FULL_BATHS = Enum.forString("FullBaths");
    static final Enum GREAT_ROOM = Enum.forString("GreatRoom");
    
    static final int INT_KITCHENS = Enum.INT_KITCHENS;
    static final int INT_DINING_ROOMS = Enum.INT_DINING_ROOMS;
    static final int INT_LIVING_ROOMS = Enum.INT_LIVING_ROOMS;
    static final int INT_DEN_STUDY_OFFICES = Enum.INT_DEN_STUDY_OFFICES;
    static final int INT_BEDROOMS = Enum.INT_BEDROOMS;
    static final int INT_HALF_BATHS = Enum.INT_HALF_BATHS;
    static final int INT_FAMILY_ROOMS = Enum.INT_FAMILY_ROOMS;
    static final int INT_ENTRIES_FOYERS = Enum.INT_ENTRIES_FOYERS;
    static final int INT_EXTRA_ROOMS = Enum.INT_EXTRA_ROOMS;
    static final int INT_MUD_ROOMS = Enum.INT_MUD_ROOMS;
    static final int INT_STORAGE_ROOMS = Enum.INT_STORAGE_ROOMS;
    static final int INT_LAUNDRY_UTILITIES_SEWING = Enum.INT_LAUNDRY_UTILITIES_SEWING;
    static final int INT_BREAKFAST_NOOKS = Enum.INT_BREAKFAST_NOOKS;
    static final int INT_BUILTIN_GARAGE = Enum.INT_BUILTIN_GARAGE;
    static final int INT_FULL_BATHS = Enum.INT_FULL_BATHS;
    static final int INT_GREAT_ROOM = Enum.INT_GREAT_ROOM;
    
    /**
     * Enumeration value class for com.msbinfo.expresslync.rct.valuation.RoomType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_KITCHENS
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
        
        static final int INT_KITCHENS = 1;
        static final int INT_DINING_ROOMS = 2;
        static final int INT_LIVING_ROOMS = 3;
        static final int INT_DEN_STUDY_OFFICES = 4;
        static final int INT_BEDROOMS = 5;
        static final int INT_HALF_BATHS = 6;
        static final int INT_FAMILY_ROOMS = 7;
        static final int INT_ENTRIES_FOYERS = 8;
        static final int INT_EXTRA_ROOMS = 9;
        static final int INT_MUD_ROOMS = 10;
        static final int INT_STORAGE_ROOMS = 11;
        static final int INT_LAUNDRY_UTILITIES_SEWING = 12;
        static final int INT_BREAKFAST_NOOKS = 13;
        static final int INT_BUILTIN_GARAGE = 14;
        static final int INT_FULL_BATHS = 15;
        static final int INT_GREAT_ROOM = 16;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Kitchens", INT_KITCHENS),
                new Enum("DiningRooms", INT_DINING_ROOMS),
                new Enum("LivingRooms", INT_LIVING_ROOMS),
                new Enum("DenStudyOffices", INT_DEN_STUDY_OFFICES),
                new Enum("Bedrooms", INT_BEDROOMS),
                new Enum("HalfBaths", INT_HALF_BATHS),
                new Enum("FamilyRooms", INT_FAMILY_ROOMS),
                new Enum("EntriesFoyers", INT_ENTRIES_FOYERS),
                new Enum("ExtraRooms", INT_EXTRA_ROOMS),
                new Enum("MudRooms", INT_MUD_ROOMS),
                new Enum("StorageRooms", INT_STORAGE_ROOMS),
                new Enum("LaundryUtilitiesSewing", INT_LAUNDRY_UTILITIES_SEWING),
                new Enum("BreakfastNooks", INT_BREAKFAST_NOOKS),
                new Enum("BuiltinGarage", INT_BUILTIN_GARAGE),
                new Enum("FullBaths", INT_FULL_BATHS),
                new Enum("GreatRoom", INT_GREAT_ROOM),
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
        public static com.msbinfo.expresslync.rct.valuation.RoomType newValue(java.lang.Object obj) {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) type.newValue( obj ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.RoomType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.RoomType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
