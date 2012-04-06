/*
 * XML Type:  VersionSummary
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.VersionSummary
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML VersionSummary(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface VersionSummary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VersionSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("versionsummary53fdtype");
    
    /**
     * Gets the "VersionId" attribute
     */
    int getVersionId();
    
    /**
     * Gets (as xml) the "VersionId" attribute
     */
    org.apache.xmlbeans.XmlInt xgetVersionId();
    
    /**
     * Sets the "VersionId" attribute
     */
    void setVersionId(int versionId);
    
    /**
     * Sets (as xml) the "VersionId" attribute
     */
    void xsetVersionId(org.apache.xmlbeans.XmlInt versionId);
    
    /**
     * Gets the "ValuationType" attribute
     */
    com.msbinfo.expresslync.rct.valuation.ValuationType.Enum getValuationType();
    
    /**
     * Gets (as xml) the "ValuationType" attribute
     */
    com.msbinfo.expresslync.rct.valuation.ValuationType xgetValuationType();
    
    /**
     * Sets the "ValuationType" attribute
     */
    void setValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType.Enum valuationType);
    
    /**
     * Sets (as xml) the "ValuationType" attribute
     */
    void xsetValuationType(com.msbinfo.expresslync.rct.valuation.ValuationType valuationType);
    
    /**
     * Gets the "RecordType" attribute
     */
    com.msbinfo.expresslync.rct.valuation.RecordType.Enum getRecordType();
    
    /**
     * Gets (as xml) the "RecordType" attribute
     */
    com.msbinfo.expresslync.rct.valuation.RecordType xgetRecordType();
    
    /**
     * Sets the "RecordType" attribute
     */
    void setRecordType(com.msbinfo.expresslync.rct.valuation.RecordType.Enum recordType);
    
    /**
     * Sets (as xml) the "RecordType" attribute
     */
    void xsetRecordType(com.msbinfo.expresslync.rct.valuation.RecordType recordType);
    
    /**
     * Gets the "PolicyStatus" attribute
     */
    com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum getPolicyStatus();
    
    /**
     * Gets (as xml) the "PolicyStatus" attribute
     */
    com.msbinfo.expresslync.rct.valuation.PolicyStatus xgetPolicyStatus();
    
    /**
     * Sets the "PolicyStatus" attribute
     */
    void setPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum policyStatus);
    
    /**
     * Sets (as xml) the "PolicyStatus" attribute
     */
    void xsetPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus policyStatus);
    
    /**
     * Gets the "DataSource" attribute
     */
    com.msbinfo.expresslync.rct.valuation.DataSource.Enum getDataSource();
    
    /**
     * Gets (as xml) the "DataSource" attribute
     */
    com.msbinfo.expresslync.rct.valuation.DataSource xgetDataSource();
    
    /**
     * Sets the "DataSource" attribute
     */
    void setDataSource(com.msbinfo.expresslync.rct.valuation.DataSource.Enum dataSource);
    
    /**
     * Sets (as xml) the "DataSource" attribute
     */
    void xsetDataSource(com.msbinfo.expresslync.rct.valuation.DataSource dataSource);
    
    /**
     * Gets the "UpdateDate" attribute
     */
    java.util.Calendar getUpdateDate();
    
    /**
     * Gets (as xml) the "UpdateDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetUpdateDate();
    
    /**
     * Sets the "UpdateDate" attribute
     */
    void setUpdateDate(java.util.Calendar updateDate);
    
    /**
     * Sets (as xml) the "UpdateDate" attribute
     */
    void xsetUpdateDate(org.apache.xmlbeans.XmlDateTime updateDate);
    
    /**
     * Gets the "CreateDate" attribute
     */
    java.util.Calendar getCreateDate();
    
    /**
     * Gets (as xml) the "CreateDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetCreateDate();
    
    /**
     * Sets the "CreateDate" attribute
     */
    void setCreateDate(java.util.Calendar createDate);
    
    /**
     * Sets (as xml) the "CreateDate" attribute
     */
    void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate);
    
    /**
     * Gets the "InsuredFullName" attribute
     */
    java.lang.String getInsuredFullName();
    
    /**
     * Gets (as xml) the "InsuredFullName" attribute
     */
    org.apache.xmlbeans.XmlString xgetInsuredFullName();
    
    /**
     * True if has "InsuredFullName" attribute
     */
    boolean isSetInsuredFullName();
    
    /**
     * Sets the "InsuredFullName" attribute
     */
    void setInsuredFullName(java.lang.String insuredFullName);
    
    /**
     * Sets (as xml) the "InsuredFullName" attribute
     */
    void xsetInsuredFullName(org.apache.xmlbeans.XmlString insuredFullName);
    
    /**
     * Unsets the "InsuredFullName" attribute
     */
    void unsetInsuredFullName();
    
    /**
     * Gets the "Attachments" attribute
     */
    java.lang.String getAttachments();
    
    /**
     * Gets (as xml) the "Attachments" attribute
     */
    org.apache.xmlbeans.XmlString xgetAttachments();
    
    /**
     * True if has "Attachments" attribute
     */
    boolean isSetAttachments();
    
    /**
     * Sets the "Attachments" attribute
     */
    void setAttachments(java.lang.String attachments);
    
    /**
     * Sets (as xml) the "Attachments" attribute
     */
    void xsetAttachments(org.apache.xmlbeans.XmlString attachments);
    
    /**
     * Unsets the "Attachments" attribute
     */
    void unsetAttachments();
    
    /**
     * Gets the "CreateUser" attribute
     */
    java.lang.String getCreateUser();
    
    /**
     * Gets (as xml) the "CreateUser" attribute
     */
    org.apache.xmlbeans.XmlString xgetCreateUser();
    
    /**
     * True if has "CreateUser" attribute
     */
    boolean isSetCreateUser();
    
    /**
     * Sets the "CreateUser" attribute
     */
    void setCreateUser(java.lang.String createUser);
    
    /**
     * Sets (as xml) the "CreateUser" attribute
     */
    void xsetCreateUser(org.apache.xmlbeans.XmlString createUser);
    
    /**
     * Unsets the "CreateUser" attribute
     */
    void unsetCreateUser();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.VersionSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.VersionSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
