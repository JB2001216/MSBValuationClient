/*
 * XML Type:  Valuation
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.Valuation
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML Valuation(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface Valuation extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Valuation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("valuation3e7ctype");
    
    /**
     * Gets the "ValuationIdentifier" element
     */
    com.msbinfo.expresslync.rct.valuation.ValuationIdentifier getValuationIdentifier();
    
    /**
     * True if has "ValuationIdentifier" element
     */
    boolean isSetValuationIdentifier();
    
    /**
     * Sets the "ValuationIdentifier" element
     */
    void setValuationIdentifier(com.msbinfo.expresslync.rct.valuation.ValuationIdentifier valuationIdentifier);
    
    /**
     * Appends and returns a new empty "ValuationIdentifier" element
     */
    com.msbinfo.expresslync.rct.valuation.ValuationIdentifier addNewValuationIdentifier();
    
    /**
     * Unsets the "ValuationIdentifier" element
     */
    void unsetValuationIdentifier();
    
    /**
     * Gets the "RecordType" element
     */
    com.msbinfo.expresslync.rct.valuation.RecordType.Enum getRecordType();
    
    /**
     * Gets (as xml) the "RecordType" element
     */
    com.msbinfo.expresslync.rct.valuation.RecordType xgetRecordType();
    
    /**
     * True if has "RecordType" element
     */
    boolean isSetRecordType();
    
    /**
     * Sets the "RecordType" element
     */
    void setRecordType(com.msbinfo.expresslync.rct.valuation.RecordType.Enum recordType);
    
    /**
     * Sets (as xml) the "RecordType" element
     */
    void xsetRecordType(com.msbinfo.expresslync.rct.valuation.RecordType recordType);
    
    /**
     * Unsets the "RecordType" element
     */
    void unsetRecordType();
    
    /**
     * Gets the "PolicyStatus" element
     */
    com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum getPolicyStatus();
    
    /**
     * Gets (as xml) the "PolicyStatus" element
     */
    com.msbinfo.expresslync.rct.valuation.PolicyStatus xgetPolicyStatus();
    
    /**
     * True if has "PolicyStatus" element
     */
    boolean isSetPolicyStatus();
    
    /**
     * Sets the "PolicyStatus" element
     */
    void setPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus.Enum policyStatus);
    
    /**
     * Sets (as xml) the "PolicyStatus" element
     */
    void xsetPolicyStatus(com.msbinfo.expresslync.rct.valuation.PolicyStatus policyStatus);
    
    /**
     * Unsets the "PolicyStatus" element
     */
    void unsetPolicyStatus();
    
    /**
     * Gets the "DataSource" element
     */
    com.msbinfo.expresslync.rct.valuation.DataSource.Enum getDataSource();
    
    /**
     * Gets (as xml) the "DataSource" element
     */
    com.msbinfo.expresslync.rct.valuation.DataSource xgetDataSource();
    
    /**
     * True if has "DataSource" element
     */
    boolean isSetDataSource();
    
    /**
     * Sets the "DataSource" element
     */
    void setDataSource(com.msbinfo.expresslync.rct.valuation.DataSource.Enum dataSource);
    
    /**
     * Sets (as xml) the "DataSource" element
     */
    void xsetDataSource(com.msbinfo.expresslync.rct.valuation.DataSource dataSource);
    
    /**
     * Unsets the "DataSource" element
     */
    void unsetDataSource();
    
    /**
     * Gets the "PropertyAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.Address getPropertyAddress();
    
    /**
     * True if has "PropertyAddress" element
     */
    boolean isSetPropertyAddress();
    
    /**
     * Sets the "PropertyAddress" element
     */
    void setPropertyAddress(com.msbinfo.expresslync.rct.valuation.Address propertyAddress);
    
    /**
     * Appends and returns a new empty "PropertyAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.Address addNewPropertyAddress();
    
    /**
     * Unsets the "PropertyAddress" element
     */
    void unsetPropertyAddress();
    
    /**
     * Gets the "PropertyStandardizedAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.StandardizedAddress getPropertyStandardizedAddress();
    
    /**
     * True if has "PropertyStandardizedAddress" element
     */
    boolean isSetPropertyStandardizedAddress();
    
    /**
     * Sets the "PropertyStandardizedAddress" element
     */
    void setPropertyStandardizedAddress(com.msbinfo.expresslync.rct.valuation.StandardizedAddress propertyStandardizedAddress);
    
    /**
     * Appends and returns a new empty "PropertyStandardizedAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.StandardizedAddress addNewPropertyStandardizedAddress();
    
    /**
     * Unsets the "PropertyStandardizedAddress" element
     */
    void unsetPropertyStandardizedAddress();
    
    /**
     * Gets the "OwnerUser" element
     */
    java.lang.String getOwnerUser();
    
    /**
     * Gets (as xml) the "OwnerUser" element
     */
    org.apache.xmlbeans.XmlString xgetOwnerUser();
    
    /**
     * True if has "OwnerUser" element
     */
    boolean isSetOwnerUser();
    
    /**
     * Sets the "OwnerUser" element
     */
    void setOwnerUser(java.lang.String ownerUser);
    
    /**
     * Sets (as xml) the "OwnerUser" element
     */
    void xsetOwnerUser(org.apache.xmlbeans.XmlString ownerUser);
    
    /**
     * Unsets the "OwnerUser" element
     */
    void unsetOwnerUser();
    
    /**
     * Gets the "AssignedByUser" element
     */
    java.lang.String getAssignedByUser();
    
    /**
     * Gets (as xml) the "AssignedByUser" element
     */
    org.apache.xmlbeans.XmlString xgetAssignedByUser();
    
    /**
     * True if has "AssignedByUser" element
     */
    boolean isSetAssignedByUser();
    
    /**
     * Sets the "AssignedByUser" element
     */
    void setAssignedByUser(java.lang.String assignedByUser);
    
    /**
     * Sets (as xml) the "AssignedByUser" element
     */
    void xsetAssignedByUser(org.apache.xmlbeans.XmlString assignedByUser);
    
    /**
     * Unsets the "AssignedByUser" element
     */
    void unsetAssignedByUser();
    
    /**
     * Gets the "CreateDate" element
     */
    java.util.Calendar getCreateDate();
    
    /**
     * Gets (as xml) the "CreateDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreateDate();
    
    /**
     * True if has "CreateDate" element
     */
    boolean isSetCreateDate();
    
    /**
     * Sets the "CreateDate" element
     */
    void setCreateDate(java.util.Calendar createDate);
    
    /**
     * Sets (as xml) the "CreateDate" element
     */
    void xsetCreateDate(org.apache.xmlbeans.XmlDateTime createDate);
    
    /**
     * Unsets the "CreateDate" element
     */
    void unsetCreateDate();
    
    /**
     * Gets the "CreateUser" element
     */
    java.lang.String getCreateUser();
    
    /**
     * Gets (as xml) the "CreateUser" element
     */
    org.apache.xmlbeans.XmlString xgetCreateUser();
    
    /**
     * True if has "CreateUser" element
     */
    boolean isSetCreateUser();
    
    /**
     * Sets the "CreateUser" element
     */
    void setCreateUser(java.lang.String createUser);
    
    /**
     * Sets (as xml) the "CreateUser" element
     */
    void xsetCreateUser(org.apache.xmlbeans.XmlString createUser);
    
    /**
     * Unsets the "CreateUser" element
     */
    void unsetCreateUser();
    
    /**
     * Gets the "UpdateDate" element
     */
    java.util.Calendar getUpdateDate();
    
    /**
     * Gets (as xml) the "UpdateDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUpdateDate();
    
    /**
     * True if has "UpdateDate" element
     */
    boolean isSetUpdateDate();
    
    /**
     * Sets the "UpdateDate" element
     */
    void setUpdateDate(java.util.Calendar updateDate);
    
    /**
     * Sets (as xml) the "UpdateDate" element
     */
    void xsetUpdateDate(org.apache.xmlbeans.XmlDateTime updateDate);
    
    /**
     * Unsets the "UpdateDate" element
     */
    void unsetUpdateDate();
    
    /**
     * Gets the "UpdateStatusDate" element
     */
    java.util.Calendar getUpdateStatusDate();
    
    /**
     * Gets (as xml) the "UpdateStatusDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUpdateStatusDate();
    
    /**
     * True if has "UpdateStatusDate" element
     */
    boolean isSetUpdateStatusDate();
    
    /**
     * Sets the "UpdateStatusDate" element
     */
    void setUpdateStatusDate(java.util.Calendar updateStatusDate);
    
    /**
     * Sets (as xml) the "UpdateStatusDate" element
     */
    void xsetUpdateStatusDate(org.apache.xmlbeans.XmlDateTime updateStatusDate);
    
    /**
     * Unsets the "UpdateStatusDate" element
     */
    void unsetUpdateStatusDate();
    
    /**
     * Gets the "UpdateUser" element
     */
    java.lang.String getUpdateUser();
    
    /**
     * Gets (as xml) the "UpdateUser" element
     */
    org.apache.xmlbeans.XmlString xgetUpdateUser();
    
    /**
     * True if has "UpdateUser" element
     */
    boolean isSetUpdateUser();
    
    /**
     * Sets the "UpdateUser" element
     */
    void setUpdateUser(java.lang.String updateUser);
    
    /**
     * Sets (as xml) the "UpdateUser" element
     */
    void xsetUpdateUser(org.apache.xmlbeans.XmlString updateUser);
    
    /**
     * Unsets the "UpdateUser" element
     */
    void unsetUpdateUser();
    
    /**
     * Gets the "PolicyEffectiveDate" element
     */
    java.util.Calendar getPolicyEffectiveDate();
    
    /**
     * Gets (as xml) the "PolicyEffectiveDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetPolicyEffectiveDate();
    
    /**
     * True if has "PolicyEffectiveDate" element
     */
    boolean isSetPolicyEffectiveDate();
    
    /**
     * Sets the "PolicyEffectiveDate" element
     */
    void setPolicyEffectiveDate(java.util.Calendar policyEffectiveDate);
    
    /**
     * Sets (as xml) the "PolicyEffectiveDate" element
     */
    void xsetPolicyEffectiveDate(org.apache.xmlbeans.XmlDateTime policyEffectiveDate);
    
    /**
     * Unsets the "PolicyEffectiveDate" element
     */
    void unsetPolicyEffectiveDate();
    
    /**
     * Gets the "PolicyRenewalDate" element
     */
    java.util.Calendar getPolicyRenewalDate();
    
    /**
     * Gets (as xml) the "PolicyRenewalDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetPolicyRenewalDate();
    
    /**
     * True if has "PolicyRenewalDate" element
     */
    boolean isSetPolicyRenewalDate();
    
    /**
     * Sets the "PolicyRenewalDate" element
     */
    void setPolicyRenewalDate(java.util.Calendar policyRenewalDate);
    
    /**
     * Sets (as xml) the "PolicyRenewalDate" element
     */
    void xsetPolicyRenewalDate(org.apache.xmlbeans.XmlDateTime policyRenewalDate);
    
    /**
     * Unsets the "PolicyRenewalDate" element
     */
    void unsetPolicyRenewalDate();
    
    /**
     * Gets the "EstimateExpirationDate" element
     */
    java.util.Calendar getEstimateExpirationDate();
    
    /**
     * Gets (as xml) the "EstimateExpirationDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEstimateExpirationDate();
    
    /**
     * True if has "EstimateExpirationDate" element
     */
    boolean isSetEstimateExpirationDate();
    
    /**
     * Sets the "EstimateExpirationDate" element
     */
    void setEstimateExpirationDate(java.util.Calendar estimateExpirationDate);
    
    /**
     * Sets (as xml) the "EstimateExpirationDate" element
     */
    void xsetEstimateExpirationDate(org.apache.xmlbeans.XmlDateTime estimateExpirationDate);
    
    /**
     * Unsets the "EstimateExpirationDate" element
     */
    void unsetEstimateExpirationDate();
    
    /**
     * Gets the "InsuredCustomer" element
     */
    com.msbinfo.expresslync.rct.valuation.InsuredCustomer getInsuredCustomer();
    
    /**
     * True if has "InsuredCustomer" element
     */
    boolean isSetInsuredCustomer();
    
    /**
     * Sets the "InsuredCustomer" element
     */
    void setInsuredCustomer(com.msbinfo.expresslync.rct.valuation.InsuredCustomer insuredCustomer);
    
    /**
     * Appends and returns a new empty "InsuredCustomer" element
     */
    com.msbinfo.expresslync.rct.valuation.InsuredCustomer addNewInsuredCustomer();
    
    /**
     * Unsets the "InsuredCustomer" element
     */
    void unsetInsuredCustomer();
    
    /**
     * Gets the "CurrentCoverageAmount" element
     */
    int getCurrentCoverageAmount();
    
    /**
     * Gets (as xml) the "CurrentCoverageAmount" element
     */
    org.apache.xmlbeans.XmlInt xgetCurrentCoverageAmount();
    
    /**
     * True if has "CurrentCoverageAmount" element
     */
    boolean isSetCurrentCoverageAmount();
    
    /**
     * Sets the "CurrentCoverageAmount" element
     */
    void setCurrentCoverageAmount(int currentCoverageAmount);
    
    /**
     * Sets (as xml) the "CurrentCoverageAmount" element
     */
    void xsetCurrentCoverageAmount(org.apache.xmlbeans.XmlInt currentCoverageAmount);
    
    /**
     * Unsets the "CurrentCoverageAmount" element
     */
    void unsetCurrentCoverageAmount();
    
    /**
     * Gets the "MarketValue" element
     */
    int getMarketValue();
    
    /**
     * Gets (as xml) the "MarketValue" element
     */
    org.apache.xmlbeans.XmlInt xgetMarketValue();
    
    /**
     * True if has "MarketValue" element
     */
    boolean isSetMarketValue();
    
    /**
     * Sets the "MarketValue" element
     */
    void setMarketValue(int marketValue);
    
    /**
     * Sets (as xml) the "MarketValue" element
     */
    void xsetMarketValue(org.apache.xmlbeans.XmlInt marketValue);
    
    /**
     * Unsets the "MarketValue" element
     */
    void unsetMarketValue();
    
    /**
     * Gets the "AccountNumber" element
     */
    java.lang.String getAccountNumber();
    
    /**
     * Gets (as xml) the "AccountNumber" element
     */
    org.apache.xmlbeans.XmlString xgetAccountNumber();
    
    /**
     * True if has "AccountNumber" element
     */
    boolean isSetAccountNumber();
    
    /**
     * Sets the "AccountNumber" element
     */
    void setAccountNumber(java.lang.String accountNumber);
    
    /**
     * Sets (as xml) the "AccountNumber" element
     */
    void xsetAccountNumber(org.apache.xmlbeans.XmlString accountNumber);
    
    /**
     * Unsets the "AccountNumber" element
     */
    void unsetAccountNumber();
    
    /**
     * Gets array of all "Comment" elements
     */
    com.msbinfo.expresslync.rct.valuation.Comment[] getCommentArray();
    
    /**
     * Gets ith "Comment" element
     */
    com.msbinfo.expresslync.rct.valuation.Comment getCommentArray(int i);
    
    /**
     * Returns number of "Comment" element
     */
    int sizeOfCommentArray();
    
    /**
     * Sets array of all "Comment" element
     */
    void setCommentArray(com.msbinfo.expresslync.rct.valuation.Comment[] commentArray);
    
    /**
     * Sets ith "Comment" element
     */
    void setCommentArray(int i, com.msbinfo.expresslync.rct.valuation.Comment comment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comment" element
     */
    com.msbinfo.expresslync.rct.valuation.Comment insertNewComment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Comment" element
     */
    com.msbinfo.expresslync.rct.valuation.Comment addNewComment();
    
    /**
     * Removes the ith "Comment" element
     */
    void removeComment(int i);
    
    /**
     * Gets the "HazardInfo" element
     */
    com.msbinfo.expresslync.rct.valuation.HazardInfo getHazardInfo();
    
    /**
     * True if has "HazardInfo" element
     */
    boolean isSetHazardInfo();
    
    /**
     * Sets the "HazardInfo" element
     */
    void setHazardInfo(com.msbinfo.expresslync.rct.valuation.HazardInfo hazardInfo);
    
    /**
     * Appends and returns a new empty "HazardInfo" element
     */
    com.msbinfo.expresslync.rct.valuation.HazardInfo addNewHazardInfo();
    
    /**
     * Unsets the "HazardInfo" element
     */
    void unsetHazardInfo();
    
    /**
     * Gets the "LatLong" element
     */
    com.msbinfo.expresslync.rct.valuation.LatLongPair getLatLong();
    
    /**
     * True if has "LatLong" element
     */
    boolean isSetLatLong();
    
    /**
     * Sets the "LatLong" element
     */
    void setLatLong(com.msbinfo.expresslync.rct.valuation.LatLongPair latLong);
    
    /**
     * Appends and returns a new empty "LatLong" element
     */
    com.msbinfo.expresslync.rct.valuation.LatLongPair addNewLatLong();
    
    /**
     * Unsets the "LatLong" element
     */
    void unsetLatLong();
    
    /**
     * Gets the "AttachmentCount" element
     */
    int getAttachmentCount();
    
    /**
     * Gets (as xml) the "AttachmentCount" element
     */
    org.apache.xmlbeans.XmlInt xgetAttachmentCount();
    
    /**
     * Tests for nil "AttachmentCount" element
     */
    boolean isNilAttachmentCount();
    
    /**
     * Sets the "AttachmentCount" element
     */
    void setAttachmentCount(int attachmentCount);
    
    /**
     * Sets (as xml) the "AttachmentCount" element
     */
    void xsetAttachmentCount(org.apache.xmlbeans.XmlInt attachmentCount);
    
    /**
     * Nils the "AttachmentCount" element
     */
    void setNilAttachmentCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.Valuation newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.msbinfo.expresslync.rct.valuation.Valuation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.Valuation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.Valuation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
