/*
 * An XML document type.
 * Localname: StandardizedAddresses
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.StandardizedAddressesDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one StandardizedAddresses(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class StandardizedAddressesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.StandardizedAddressesDocument
{
    
    public StandardizedAddressesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDIZEDADDRESSES$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "StandardizedAddresses");
    
    
    /**
     * Gets the "StandardizedAddresses" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress getStandardizedAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress)get_store().find_element_user(STANDARDIZEDADDRESSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardizedAddresses" element
     */
    public void setStandardizedAddresses(com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress standardizedAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress)get_store().find_element_user(STANDARDIZEDADDRESSES$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress)get_store().add_element_user(STANDARDIZEDADDRESSES$0);
            }
            target.set(standardizedAddresses);
        }
    }
    
    /**
     * Appends and returns a new empty "StandardizedAddresses" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress addNewStandardizedAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfStandardizedAddress)get_store().add_element_user(STANDARDIZEDADDRESSES$0);
            return target;
        }
    }
}
