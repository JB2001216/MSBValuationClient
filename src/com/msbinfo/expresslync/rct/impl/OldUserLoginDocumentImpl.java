/*
 * An XML document type.
 * Localname: OldUserLogin
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.OldUserLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one OldUserLogin(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class OldUserLoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.OldUserLoginDocument
{
    
    public OldUserLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OLDUSERLOGIN$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "OldUserLogin");
    
    
    /**
     * Gets the "OldUserLogin" element
     */
    public java.lang.String getOldUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDUSERLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OldUserLogin" element
     */
    public org.apache.xmlbeans.XmlString xgetOldUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OLDUSERLOGIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OldUserLogin" element
     */
    public void setOldUserLogin(java.lang.String oldUserLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDUSERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDUSERLOGIN$0);
            }
            target.setStringValue(oldUserLogin);
        }
    }
    
    /**
     * Sets (as xml) the "OldUserLogin" element
     */
    public void xsetOldUserLogin(org.apache.xmlbeans.XmlString oldUserLogin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OLDUSERLOGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OLDUSERLOGIN$0);
            }
            target.set(oldUserLogin);
        }
    }
}
