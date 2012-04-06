/*
 * An XML document type.
 * Localname: HazardCommands
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.HazardCommandsDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one HazardCommands(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class HazardCommandsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.HazardCommandsDocument
{
    
    public HazardCommandsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HAZARDCOMMANDS$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "HazardCommands");
    
    
    /**
     * Gets the "HazardCommands" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfString getHazardCommands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfString target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfString)get_store().find_element_user(HAZARDCOMMANDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HazardCommands" element
     */
    public void setHazardCommands(com.msbinfo.expresslync.rct.ArrayOfString hazardCommands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfString target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfString)get_store().find_element_user(HAZARDCOMMANDS$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.ArrayOfString)get_store().add_element_user(HAZARDCOMMANDS$0);
            }
            target.set(hazardCommands);
        }
    }
    
    /**
     * Appends and returns a new empty "HazardCommands" element
     */
    public com.msbinfo.expresslync.rct.ArrayOfString addNewHazardCommands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.ArrayOfString target = null;
            target = (com.msbinfo.expresslync.rct.ArrayOfString)get_store().add_element_user(HAZARDCOMMANDS$0);
            return target;
        }
    }
}
