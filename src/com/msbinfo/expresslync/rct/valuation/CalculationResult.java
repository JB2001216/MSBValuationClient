/*
 * XML Type:  CalculationResult
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.CalculationResult
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML CalculationResult(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface CalculationResult extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculationResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("calculationresult9f57type");
    
    /**
     * Gets the "CalcUser" element
     */
    java.lang.String getCalcUser();
    
    /**
     * Gets (as xml) the "CalcUser" element
     */
    org.apache.xmlbeans.XmlString xgetCalcUser();
    
    /**
     * True if has "CalcUser" element
     */
    boolean isSetCalcUser();
    
    /**
     * Sets the "CalcUser" element
     */
    void setCalcUser(java.lang.String calcUser);
    
    /**
     * Sets (as xml) the "CalcUser" element
     */
    void xsetCalcUser(org.apache.xmlbeans.XmlString calcUser);
    
    /**
     * Unsets the "CalcUser" element
     */
    void unsetCalcUser();
    
    /**
     * Gets the "CalcDate" element
     */
    java.util.Calendar getCalcDate();
    
    /**
     * Gets (as xml) the "CalcDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCalcDate();
    
    /**
     * Sets the "CalcDate" element
     */
    void setCalcDate(java.util.Calendar calcDate);
    
    /**
     * Sets (as xml) the "CalcDate" element
     */
    void xsetCalcDate(org.apache.xmlbeans.XmlDateTime calcDate);
    
    /**
     * Gets the "CostDataVersion" element
     */
    com.msbinfo.expresslync.rct.valuation.CostDataVersionType getCostDataVersion();
    
    /**
     * True if has "CostDataVersion" element
     */
    boolean isSetCostDataVersion();
    
    /**
     * Sets the "CostDataVersion" element
     */
    void setCostDataVersion(com.msbinfo.expresslync.rct.valuation.CostDataVersionType costDataVersion);
    
    /**
     * Appends and returns a new empty "CostDataVersion" element
     */
    com.msbinfo.expresslync.rct.valuation.CostDataVersionType addNewCostDataVersion();
    
    /**
     * Unsets the "CostDataVersion" element
     */
    void unsetCostDataVersion();
    
    /**
     * Gets array of all "BuildingSystemCost" elements
     */
    com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[] getBuildingSystemCostArray();
    
    /**
     * Gets ith "BuildingSystemCost" element
     */
    com.msbinfo.expresslync.rct.valuation.BuildingSystemCost getBuildingSystemCostArray(int i);
    
    /**
     * Returns number of "BuildingSystemCost" element
     */
    int sizeOfBuildingSystemCostArray();
    
    /**
     * Sets array of all "BuildingSystemCost" element
     */
    void setBuildingSystemCostArray(com.msbinfo.expresslync.rct.valuation.BuildingSystemCost[] buildingSystemCostArray);
    
    /**
     * Sets ith "BuildingSystemCost" element
     */
    void setBuildingSystemCostArray(int i, com.msbinfo.expresslync.rct.valuation.BuildingSystemCost buildingSystemCost);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BuildingSystemCost" element
     */
    com.msbinfo.expresslync.rct.valuation.BuildingSystemCost insertNewBuildingSystemCost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BuildingSystemCost" element
     */
    com.msbinfo.expresslync.rct.valuation.BuildingSystemCost addNewBuildingSystemCost();
    
    /**
     * Removes the ith "BuildingSystemCost" element
     */
    void removeBuildingSystemCost(int i);
    
    /**
     * Gets the "PrimaryStructureNonStandardizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost getPrimaryStructureNonStandardizedCost();
    
    /**
     * True if has "PrimaryStructureNonStandardizedCost" element
     */
    boolean isSetPrimaryStructureNonStandardizedCost();
    
    /**
     * Sets the "PrimaryStructureNonStandardizedCost" element
     */
    void setPrimaryStructureNonStandardizedCost(com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost primaryStructureNonStandardizedCost);
    
    /**
     * Appends and returns a new empty "PrimaryStructureNonStandardizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.PrimaryStructureNonStandardizedCost addNewPrimaryStructureNonStandardizedCost();
    
    /**
     * Unsets the "PrimaryStructureNonStandardizedCost" element
     */
    void unsetPrimaryStructureNonStandardizedCost();
    
    /**
     * Gets the "PrimaryStructureStandardizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost getPrimaryStructureStandardizedCost();
    
    /**
     * True if has "PrimaryStructureStandardizedCost" element
     */
    boolean isSetPrimaryStructureStandardizedCost();
    
    /**
     * Sets the "PrimaryStructureStandardizedCost" element
     */
    void setPrimaryStructureStandardizedCost(com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost primaryStructureStandardizedCost);
    
    /**
     * Appends and returns a new empty "PrimaryStructureStandardizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.PrimaryStructureStandardizedCost addNewPrimaryStructureStandardizedCost();
    
    /**
     * Unsets the "PrimaryStructureStandardizedCost" element
     */
    void unsetPrimaryStructureStandardizedCost();
    
    /**
     * Gets the "DetachedStructuresNonStandarddizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost getDetachedStructuresNonStandarddizedCost();
    
    /**
     * True if has "DetachedStructuresNonStandarddizedCost" element
     */
    boolean isSetDetachedStructuresNonStandarddizedCost();
    
    /**
     * Sets the "DetachedStructuresNonStandarddizedCost" element
     */
    void setDetachedStructuresNonStandarddizedCost(com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost detachedStructuresNonStandarddizedCost);
    
    /**
     * Appends and returns a new empty "DetachedStructuresNonStandarddizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.DetachedStructureNonStandardizedCost addNewDetachedStructuresNonStandarddizedCost();
    
    /**
     * Unsets the "DetachedStructuresNonStandarddizedCost" element
     */
    void unsetDetachedStructuresNonStandarddizedCost();
    
    /**
     * Gets the "DetachedStructuresStandarddizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost getDetachedStructuresStandarddizedCost();
    
    /**
     * True if has "DetachedStructuresStandarddizedCost" element
     */
    boolean isSetDetachedStructuresStandarddizedCost();
    
    /**
     * Sets the "DetachedStructuresStandarddizedCost" element
     */
    void setDetachedStructuresStandarddizedCost(com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost detachedStructuresStandarddizedCost);
    
    /**
     * Appends and returns a new empty "DetachedStructuresStandarddizedCost" element
     */
    com.msbinfo.expresslync.rct.valuation.DetachedStructureStandardizedCost addNewDetachedStructuresStandarddizedCost();
    
    /**
     * Unsets the "DetachedStructuresStandarddizedCost" element
     */
    void unsetDetachedStructuresStandarddizedCost();
    
    /**
     * Gets the "WholeBuildingCost" element
     */
    com.msbinfo.expresslync.rct.valuation.WholeBuildingCost getWholeBuildingCost();
    
    /**
     * True if has "WholeBuildingCost" element
     */
    boolean isSetWholeBuildingCost();
    
    /**
     * Sets the "WholeBuildingCost" element
     */
    void setWholeBuildingCost(com.msbinfo.expresslync.rct.valuation.WholeBuildingCost wholeBuildingCost);
    
    /**
     * Appends and returns a new empty "WholeBuildingCost" element
     */
    com.msbinfo.expresslync.rct.valuation.WholeBuildingCost addNewWholeBuildingCost();
    
    /**
     * Unsets the "WholeBuildingCost" element
     */
    void unsetWholeBuildingCost();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.CalculationResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.CalculationResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
