/*
 * XML Type:  InsuredCustomer
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.InsuredCustomer
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation;


/**
 * An XML InsuredCustomer(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public interface InsuredCustomer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InsuredCustomer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1768D09471800D65E1818E928883FB9D").resolveHandle("insuredcustomer8235type");
    
    /**
     * Gets the "FullName" element
     */
    java.lang.String getFullName();
    
    /**
     * Gets (as xml) the "FullName" element
     */
    org.apache.xmlbeans.XmlString xgetFullName();
    
    /**
     * True if has "FullName" element
     */
    boolean isSetFullName();
    
    /**
     * Sets the "FullName" element
     */
    void setFullName(java.lang.String fullName);
    
    /**
     * Sets (as xml) the "FullName" element
     */
    void xsetFullName(org.apache.xmlbeans.XmlString fullName);
    
    /**
     * Unsets the "FullName" element
     */
    void unsetFullName();
    
    /**
     * Gets the "SecondFullName" element
     */
    java.lang.String getSecondFullName();
    
    /**
     * Gets (as xml) the "SecondFullName" element
     */
    org.apache.xmlbeans.XmlString xgetSecondFullName();
    
    /**
     * True if has "SecondFullName" element
     */
    boolean isSetSecondFullName();
    
    /**
     * Sets the "SecondFullName" element
     */
    void setSecondFullName(java.lang.String secondFullName);
    
    /**
     * Sets (as xml) the "SecondFullName" element
     */
    void xsetSecondFullName(org.apache.xmlbeans.XmlString secondFullName);
    
    /**
     * Unsets the "SecondFullName" element
     */
    void unsetSecondFullName();
    
    /**
     * Gets the "HomePhone" element
     */
    java.lang.String getHomePhone();
    
    /**
     * Gets (as xml) the "HomePhone" element
     */
    org.apache.xmlbeans.XmlString xgetHomePhone();
    
    /**
     * True if has "HomePhone" element
     */
    boolean isSetHomePhone();
    
    /**
     * Sets the "HomePhone" element
     */
    void setHomePhone(java.lang.String homePhone);
    
    /**
     * Sets (as xml) the "HomePhone" element
     */
    void xsetHomePhone(org.apache.xmlbeans.XmlString homePhone);
    
    /**
     * Unsets the "HomePhone" element
     */
    void unsetHomePhone();
    
    /**
     * Gets the "WorkPhone" element
     */
    java.lang.String getWorkPhone();
    
    /**
     * Gets (as xml) the "WorkPhone" element
     */
    org.apache.xmlbeans.XmlString xgetWorkPhone();
    
    /**
     * True if has "WorkPhone" element
     */
    boolean isSetWorkPhone();
    
    /**
     * Sets the "WorkPhone" element
     */
    void setWorkPhone(java.lang.String workPhone);
    
    /**
     * Sets (as xml) the "WorkPhone" element
     */
    void xsetWorkPhone(org.apache.xmlbeans.XmlString workPhone);
    
    /**
     * Unsets the "WorkPhone" element
     */
    void unsetWorkPhone();
    
    /**
     * Gets the "MailingAddressSameAsPropertyAddress" element
     */
    boolean getMailingAddressSameAsPropertyAddress();
    
    /**
     * Gets (as xml) the "MailingAddressSameAsPropertyAddress" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMailingAddressSameAsPropertyAddress();
    
    /**
     * Sets the "MailingAddressSameAsPropertyAddress" element
     */
    void setMailingAddressSameAsPropertyAddress(boolean mailingAddressSameAsPropertyAddress);
    
    /**
     * Sets (as xml) the "MailingAddressSameAsPropertyAddress" element
     */
    void xsetMailingAddressSameAsPropertyAddress(org.apache.xmlbeans.XmlBoolean mailingAddressSameAsPropertyAddress);
    
    /**
     * Gets the "MailingAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.Address getMailingAddress();
    
    /**
     * True if has "MailingAddress" element
     */
    boolean isSetMailingAddress();
    
    /**
     * Sets the "MailingAddress" element
     */
    void setMailingAddress(com.msbinfo.expresslync.rct.valuation.Address mailingAddress);
    
    /**
     * Appends and returns a new empty "MailingAddress" element
     */
    com.msbinfo.expresslync.rct.valuation.Address addNewMailingAddress();
    
    /**
     * Unsets the "MailingAddress" element
     */
    void unsetMailingAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer newInstance() {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.msbinfo.expresslync.rct.valuation.InsuredCustomer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.msbinfo.expresslync.rct.valuation.InsuredCustomer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
