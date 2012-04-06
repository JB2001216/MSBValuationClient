/*
 * An XML document type.
 * Localname: NewUserLogin
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.NewUserLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one NewUserLogin(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class NewUserLoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.NewUserLoginDocument
{
    
    public NewUserLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWUSERLOGIN$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "NewUserLogin");
    
    
    /**
     * Gets the "NewUserLogin" element
     */
    public java.lang.String getNewUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWUSERLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewUserLogin" element
     */
    public org.apache.xmlbeans.XmlString xgetNewUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWUSERLOGIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NewUserLogin" element
     */
    public void setNewUserLogin(java.lang.String newUserLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWUSERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWUSERLOGIN$0);
            }
            target.setStringValue(newUserLogin);
        }
    }
    
    /**
     * Sets (as xml) the "NewUserLogin" element
     */
    public void xsetNewUserLogin(org.apache.xmlbeans.XmlString newUserLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWUSERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWUSERLOGIN$0);
            }
            target.set(newUserLogin);
        }
    }
}
