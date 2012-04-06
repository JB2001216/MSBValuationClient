/*
 * An XML document type.
 * Localname: Address
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * A document containing one Address(@http://msbinfo.com/expresslync/rct/valuation) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AddressDocument
{
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Address");
    
    
    /**
     * Gets the "Address" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(com.msbinfo.expresslync.rct.valuation.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public com.msbinfo.expresslync.rct.valuation.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Address target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Address)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
}
