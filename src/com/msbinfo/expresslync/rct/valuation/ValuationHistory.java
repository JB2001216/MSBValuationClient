/*
 * XML Type:  ValuationHistory
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.ValuationHistory
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML ValuationHistory(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface ValuationHistory extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValuationHistory.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("valuationhistorydeb8type");
    
    /**
     * Gets array of all "Version" elements
     */
    com.msbinfo.expresslync.rct.valuation.VersionSummary[] getVersionArray();
    
    /**
     * Gets ith "Version" element
     */
    com.msbinfo.expresslync.rct.valuation.VersionSummary getVersionArray(int i);
    
    /**
     * Returns number of "Version" element
     */
    int sizeOfVersionArray();
    
    /**
     * Sets array of all "Version" element
     */
    void setVersionArray(com.msbinfo.expresslync.rct.valuation.VersionSummary[] versionArray);
    
    /**
     * Sets ith "Version" element
     */
    void setVersionArray(int i, com.msbinfo.expresslync.rct.valuation.VersionSummary version);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Version" element
     */
    com.msbinfo.expresslync.rct.valuation.VersionSummary insertNewVersion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Version" element
     */
    com.msbinfo.expresslync.rct.valuation.VersionSummary addNewVersion();
    
    /**
     * Removes the ith "Version" element
     */
    void removeVersion(int i);
    
    /**
     * Gets array of all "PropertyInfoSummary" elements
     */
    com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] getPropertyInfoSummaryArray();
    
    /**
     * Gets ith "PropertyInfoSummary" element
     */
    com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary getPropertyInfoSummaryArray(int i);
    
    /**
     * Returns number of "PropertyInfoSummary" element
     */
    int sizeOfPropertyInfoSummaryArray();
    
    /**
     * Sets array of all "PropertyInfoSummary" element
     */
    void setPropertyInfoSummaryArray(com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary[] propertyInfoSummaryArray);
    
    /**
     * Sets ith "PropertyInfoSummary" element
     */
    void setPropertyInfoSummaryArray(int i, com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary propertyInfoSummary);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropertyInfoSummary" element
     */
    com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary insertNewPropertyInfoSummary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropertyInfoSummary" element
     */
    com.msbinfo.expresslync.rct.valuation.PropertyInfoSummary addNewPropertyInfoSummary();
    
    /**
     * Removes the ith "PropertyInfoSummary" element
     */
    void removePropertyInfoSummary(int i);
    
    /**
     * Gets the "RecordId" attribute
     */
    int getRecordId();
    
    /**
     * Gets (as xml) the "RecordId" attribute
     */
    org.apache.xmlbeans.XmlInt xgetRecordId();
    
    /**
     * Sets the "RecordId" attribute
     */
    void setRecordId(int recordId);
    
    /**
     * Sets (as xml) the "RecordId" attribute
     */
    void xsetRecordId(org.apache.xmlbeans.XmlInt recordId);
    
    /**
     * Gets the "PolicyNumber" attribute
     */
    java.lang.String getPolicyNumber();
    
    /**
     * Gets (as xml) the "PolicyNumber" attribute
     */
    org.apache.xmlbeans.XmlString xgetPolicyNumber();
    
    /**
     * True if has "PolicyNumber" attribute
     */
    boolean isSetPolicyNumber();
    
    /**
     * Sets the "PolicyNumber" attribute
     */
    void setPolicyNumber(java.lang.String policyNumber);
    
    /**
     * Sets (as xml) the "PolicyNumber" attribute
     */
    void xsetPolicyNumber(org.apache.xmlbeans.XmlString policyNumber);
    
    /**
     * Unsets the "PolicyNumber" attribute
     */
    void unsetPolicyNumber();
    
    /**
     * Gets the "OwnerUser" attribute
     */
    java.lang.String getOwnerUser();
    
    /**
     * Gets (as xml) the "OwnerUser" attribute
     */
    org.apache.xmlbeans.XmlString xgetOwnerUser();
    
    /**
     * True if has "OwnerUser" attribute
     */
    boolean isSetOwnerUser();
    
    /**
     * Sets the "OwnerUser" attribute
     */
    void setOwnerUser(java.lang.String ownerUser);
    
    /**
     * Sets (as xml) the "OwnerUser" attribute
     */
    void xsetOwnerUser(org.apache.xmlbeans.XmlString ownerUser);
    
    /**
     * Unsets the "OwnerUser" attribute
     */
    void unsetOwnerUser();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.ValuationHistory parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.ValuationHistory) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
