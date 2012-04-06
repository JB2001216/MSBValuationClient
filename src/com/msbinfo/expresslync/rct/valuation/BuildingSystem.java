/*
 * XML Type:  BuildingSystem
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.BuildingSystem
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML BuildingSystem(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is an atomic type that is a restriction of com.msbinfo.expresslync.rct.valuation.BuildingSystem.
 */
public interface BuildingSystem extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildingSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("buildingsystem7fc8type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SITEWORK = Enum.forString("Sitework");
    static final Enum FOUNDATIONS = Enum.forString("Foundations");
    static final Enum SLABON_GRADE = Enum.forString("SlabonGrade");
    static final Enum FRAMING = Enum.forString("Framing");
    static final Enum ROOFING = Enum.forString("Roofing");
    static final Enum EXTERIOR_WALLS = Enum.forString("ExteriorWalls");
    static final Enum PARTITIONS = Enum.forString("Partitions");
    static final Enum WALL_FINISHES = Enum.forString("WallFinishes");
    static final Enum FLOOR_FINISHES = Enum.forString("FloorFinishes");
    static final Enum CEILING_FINISHES = Enum.forString("CeilingFinishes");
    static final Enum EQUIPMENT = Enum.forString("Equipment");
    static final Enum CONVEYING_SYSTEMS = Enum.forString("ConveyingSystems");
    static final Enum PLUMBING_SYSTEMS = Enum.forString("PlumbingSystems");
    static final Enum HVAC_SYSTEMS = Enum.forString("HVACSystems");
    static final Enum ELECTRICAL_SYSTEMS = Enum.forString("ElectricalSystems");
    static final Enum ATTACHED_STRUCTURES = Enum.forString("AttachedStructures");
    static final Enum DETACHED_STRUCTURE = Enum.forString("DetachedStructure");
    static final Enum GENERAL_CONDITIONS = Enum.forString("GeneralConditions");
    
    static final int INT_SITEWORK = Enum.INT_SITEWORK;
    static final int INT_FOUNDATIONS = Enum.INT_FOUNDATIONS;
    static final int INT_SLABON_GRADE = Enum.INT_SLABON_GRADE;
    static final int INT_FRAMING = Enum.INT_FRAMING;
    static final int INT_ROOFING = Enum.INT_ROOFING;
    static final int INT_EXTERIOR_WALLS = Enum.INT_EXTERIOR_WALLS;
    static final int INT_PARTITIONS = Enum.INT_PARTITIONS;
    static final int INT_WALL_FINISHES = Enum.INT_WALL_FINISHES;
    static final int INT_FLOOR_FINISHES = Enum.INT_FLOOR_FINISHES;
    static final int INT_CEILING_FINISHES = Enum.INT_CEILING_FINISHES;
    static final int INT_EQUIPMENT = Enum.INT_EQUIPMENT;
    static final int INT_CONVEYING_SYSTEMS = Enum.INT_CONVEYING_SYSTEMS;
    static final int INT_PLUMBING_SYSTEMS = Enum.INT_PLUMBING_SYSTEMS;
    static final int INT_HVAC_SYSTEMS = Enum.INT_HVAC_SYSTEMS;
    static final int INT_ELECTRICAL_SYSTEMS = Enum.INT_ELECTRICAL_SYSTEMS;
    static final int INT_ATTACHED_STRUCTURES = Enum.INT_ATTACHED_STRUCTURES;
    static final int INT_DETACHED_STRUCTURE = Enum.INT_DETACHED_STRUCTURE;
    static final int INT_GENERAL_CONDITIONS = Enum.INT_GENERAL_CONDITIONS;
    
    /**
     * Enumeration value class for com.msbinfo.expresslync.rct.valuation.BuildingSystem.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SITEWORK
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
        
        static final int INT_SITEWORK = 1;
        static final int INT_FOUNDATIONS = 2;
        static final int INT_SLABON_GRADE = 3;
        static final int INT_FRAMING = 4;
        static final int INT_ROOFING = 5;
        static final int INT_EXTERIOR_WALLS = 6;
        static final int INT_PARTITIONS = 7;
        static final int INT_WALL_FINISHES = 8;
        static final int INT_FLOOR_FINISHES = 9;
        static final int INT_CEILING_FINISHES = 10;
        static final int INT_EQUIPMENT = 11;
        static final int INT_CONVEYING_SYSTEMS = 12;
        static final int INT_PLUMBING_SYSTEMS = 13;
        static final int INT_HVAC_SYSTEMS = 14;
        static final int INT_ELECTRICAL_SYSTEMS = 15;
        static final int INT_ATTACHED_STRUCTURES = 16;
        static final int INT_DETACHED_STRUCTURE = 17;
        static final int INT_GENERAL_CONDITIONS = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Sitework", INT_SITEWORK),
                new Enum("Foundations", INT_FOUNDATIONS),
                new Enum("SlabonGrade", INT_SLABON_GRADE),
                new Enum("Framing", INT_FRAMING),
                new Enum("Roofing", INT_ROOFING),
                new Enum("ExteriorWalls", INT_EXTERIOR_WALLS),
                new Enum("Partitions", INT_PARTITIONS),
                new Enum("WallFinishes", INT_WALL_FINISHES),
                new Enum("FloorFinishes", INT_FLOOR_FINISHES),
                new Enum("CeilingFinishes", INT_CEILING_FINISHES),
                new Enum("Equipment", INT_EQUIPMENT),
                new Enum("ConveyingSystems", INT_CONVEYING_SYSTEMS),
                new Enum("PlumbingSystems", INT_PLUMBING_SYSTEMS),
                new Enum("HVACSystems", INT_HVAC_SYSTEMS),
                new Enum("ElectricalSystems", INT_ELECTRICAL_SYSTEMS),
                new Enum("AttachedStructures", INT_ATTACHED_STRUCTURES),
                new Enum("DetachedStructure", INT_DETACHED_STRUCTURE),
                new Enum("GeneralConditions", INT_GENERAL_CONDITIONS),
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
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem newValue(java.lang.Object obj) {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) type.newValue( obj ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.BuildingSystem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.BuildingSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
