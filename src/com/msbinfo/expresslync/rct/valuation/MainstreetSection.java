/*
 * XML Type:  MainstreetSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MainstreetSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML MainstreetSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface MainstreetSection extends com.msbinfo.expresslync.rct.valuation.MsMmhSection
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MainstreetSection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("mainstreetsection4434type");
    
    /**
     * Gets the "FoundationAndBasement" element
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo getFoundationAndBasement();
    
    /**
     * True if has "FoundationAndBasement" element
     */
    boolean isSetFoundationAndBasement();
    
    /**
     * Sets the "FoundationAndBasement" element
     */
    void setFoundationAndBasement(com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo foundationAndBasement);
    
    /**
     * Appends and returns a new empty "FoundationAndBasement" element
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo addNewFoundationAndBasement();
    
    /**
     * Unsets the "FoundationAndBasement" element
     */
    void unsetFoundationAndBasement();
    
    /**
     * Gets the "Shape" element
     */
    com.msbinfo.expresslync.rct.valuation.SectionShape.Enum getShape();
    
    /**
     * Gets (as xml) the "Shape" element
     */
    com.msbinfo.expresslync.rct.valuation.SectionShape xgetShape();
    
    /**
     * True if has "Shape" element
     */
    boolean isSetShape();
    
    /**
     * Sets the "Shape" element
     */
    void setShape(com.msbinfo.expresslync.rct.valuation.SectionShape.Enum shape);
    
    /**
     * Sets (as xml) the "Shape" element
     */
    void xsetShape(com.msbinfo.expresslync.rct.valuation.SectionShape shape);
    
    /**
     * Unsets the "Shape" element
     */
    void unsetShape();
    
    /**
     * Gets the "CathedralCeilingPct" element
     */
    short getCathedralCeilingPct();
    
    /**
     * Gets (as xml) the "CathedralCeilingPct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetCathedralCeilingPct();
    
    /**
     * True if has "CathedralCeilingPct" element
     */
    boolean isSetCathedralCeilingPct();
    
    /**
     * Sets the "CathedralCeilingPct" element
     */
    void setCathedralCeilingPct(short cathedralCeilingPct);
    
    /**
     * Sets (as xml) the "CathedralCeilingPct" element
     */
    void xsetCathedralCeilingPct(org.apache.xmlbeans.XmlUnsignedByte cathedralCeilingPct);
    
    /**
     * Unsets the "CathedralCeilingPct" element
     */
    void unsetCathedralCeilingPct();
    
    /**
     * Gets the "LowerUnfinishedPct" element
     */
    short getLowerUnfinishedPct();
    
    /**
     * Gets (as xml) the "LowerUnfinishedPct" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetLowerUnfinishedPct();
    
    /**
     * True if has "LowerUnfinishedPct" element
     */
    boolean isSetLowerUnfinishedPct();
    
    /**
     * Sets the "LowerUnfinishedPct" element
     */
    void setLowerUnfinishedPct(short lowerUnfinishedPct);
    
    /**
     * Sets (as xml) the "LowerUnfinishedPct" element
     */
    void xsetLowerUnfinishedPct(org.apache.xmlbeans.XmlUnsignedByte lowerUnfinishedPct);
    
    /**
     * Unsets the "LowerUnfinishedPct" element
     */
    void unsetLowerUnfinishedPct();
    
    /**
     * Gets the "ElaborateRoof" element
     */
    boolean getElaborateRoof();
    
    /**
     * Gets (as xml) the "ElaborateRoof" element
     */
    org.apache.xmlbeans.XmlBoolean xgetElaborateRoof();
    
    /**
     * True if has "ElaborateRoof" element
     */
    boolean isSetElaborateRoof();
    
    /**
     * Sets the "ElaborateRoof" element
     */
    void setElaborateRoof(boolean elaborateRoof);
    
    /**
     * Sets (as xml) the "ElaborateRoof" element
     */
    void xsetElaborateRoof(org.apache.xmlbeans.XmlBoolean elaborateRoof);
    
    /**
     * Unsets the "ElaborateRoof" element
     */
    void unsetElaborateRoof();
    
    /**
     * Gets array of all "FloorToFloorHeight" elements
     */
    com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[] getFloorToFloorHeightArray();
    
    /**
     * Gets ith "FloorToFloorHeight" element
     */
    com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight getFloorToFloorHeightArray(int i);
    
    /**
     * Returns number of "FloorToFloorHeight" element
     */
    int sizeOfFloorToFloorHeightArray();
    
    /**
     * Sets array of all "FloorToFloorHeight" element
     */
    void setFloorToFloorHeightArray(com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[] floorToFloorHeightArray);
    
    /**
     * Sets ith "FloorToFloorHeight" element
     */
    void setFloorToFloorHeightArray(int i, com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight floorToFloorHeight);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FloorToFloorHeight" element
     */
    com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight insertNewFloorToFloorHeight(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FloorToFloorHeight" element
     */
    com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight addNewFloorToFloorHeight();
    
    /**
     * Removes the ith "FloorToFloorHeight" element
     */
    void removeFloorToFloorHeight(int i);
    
    /**
     * Gets array of all "Framing" elements
     */
    com.msbinfo.expresslync.rct.valuation.FramingBreakdown[] getFramingArray();
    
    /**
     * Gets ith "Framing" element
     */
    com.msbinfo.expresslync.rct.valuation.FramingBreakdown getFramingArray(int i);
    
    /**
     * Returns number of "Framing" element
     */
    int sizeOfFramingArray();
    
    /**
     * Sets array of all "Framing" element
     */
    void setFramingArray(com.msbinfo.expresslync.rct.valuation.FramingBreakdown[] framingArray);
    
    /**
     * Sets ith "Framing" element
     */
    void setFramingArray(int i, com.msbinfo.expresslync.rct.valuation.FramingBreakdown framing);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Framing" element
     */
    com.msbinfo.expresslync.rct.valuation.FramingBreakdown insertNewFraming(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Framing" element
     */
    com.msbinfo.expresslync.rct.valuation.FramingBreakdown addNewFraming();
    
    /**
     * Removes the ith "Framing" element
     */
    void removeFraming(int i);
    
    /**
     * Gets array of all "Foundation" elements
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[] getFoundationArray();
    
    /**
     * Gets ith "Foundation" element
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBreakdown getFoundationArray(int i);
    
    /**
     * Returns number of "Foundation" element
     */
    int sizeOfFoundationArray();
    
    /**
     * Sets array of all "Foundation" element
     */
    void setFoundationArray(com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[] foundationArray);
    
    /**
     * Sets ith "Foundation" element
     */
    void setFoundationArray(int i, com.msbinfo.expresslync.rct.valuation.FoundationBreakdown foundation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Foundation" element
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBreakdown insertNewFoundation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Foundation" element
     */
    com.msbinfo.expresslync.rct.valuation.FoundationBreakdown addNewFoundation();
    
    /**
     * Removes the ith "Foundation" element
     */
    void removeFoundation(int i);
    
    /**
     * Gets array of all "Room" elements
     */
    com.msbinfo.expresslync.rct.valuation.Room[] getRoomArray();
    
    /**
     * Gets ith "Room" element
     */
    com.msbinfo.expresslync.rct.valuation.Room getRoomArray(int i);
    
    /**
     * Returns number of "Room" element
     */
    int sizeOfRoomArray();
    
    /**
     * Sets array of all "Room" element
     */
    void setRoomArray(com.msbinfo.expresslync.rct.valuation.Room[] roomArray);
    
    /**
     * Sets ith "Room" element
     */
    void setRoomArray(int i, com.msbinfo.expresslync.rct.valuation.Room room);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Room" element
     */
    com.msbinfo.expresslync.rct.valuation.Room insertNewRoom(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Room" element
     */
    com.msbinfo.expresslync.rct.valuation.Room addNewRoom();
    
    /**
     * Removes the ith "Room" element
     */
    void removeRoom(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.MainstreetSection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.MainstreetSection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
