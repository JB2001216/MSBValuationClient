/*
 * An XML document type.
 * Localname: UserLogin
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.UserLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one UserLogin(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class UserLoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.UserLoginDocument
{
    
    public UserLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERLOGIN$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "UserLogin");
    
    
    /**
     * Gets the "UserLogin" element
     */
    public java.lang.String getUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserLogin" element
     */
    public org.apache.xmlbeans.XmlString xgetUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERLOGIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserLogin" element
     */
    public void setUserLogin(java.lang.String userLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERLOGIN$0);
            }
            target.setStringValue(userLogin);
        }
    }
    
    /**
     * Sets (as xml) the "UserLogin" element
     */
    public void xsetUserLogin(org.apache.xmlbeans.XmlString userLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERLOGIN$0);
            }
            target.set(userLogin);
        }
    }
}
