/*
 * An XML document type.
 * Localname: VersionId
 * Namespace: http://msbinfo.com/expresslync/rct
 * Java type: com.msbinfo.expresslync.rct.VersionIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.impl;
/**
 * A document containing one VersionId(@http://msbinfo.com/expresslync/rct) element.
 *
 * This is a complex type.
 */
public class VersionIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.VersionIdDocument
{
    
    public VersionIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct", "VersionId");
    
    
    /**
     * Gets the "VersionId" element
     */
    public int getVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionId" element
     */
    public org.apache.xmlbeans.XmlInt xgetVersionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VersionId" element
     */
    public void setVersionId(int versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONID$0);
            }
            target.setIntValue(versionId);
        }
    }
    
    /**
     * Sets (as xml) the "VersionId" element
     */
    public void xsetVersionId(org.apache.xmlbeans.XmlInt versionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERSIONID$0);
            }
            target.set(versionId);
        }
    }
}
