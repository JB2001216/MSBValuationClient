/*
 * XML Type:  AttachmentInfoType
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.AttachmentInfoType
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML AttachmentInfoType(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class AttachmentInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.AttachmentInfoType
{
    
    public AttachmentInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILEID$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FileId");
    private static final javax.xml.namespace.QName FILENAME$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FileName");
    private static final javax.xml.namespace.QName FILETYPE$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FileType");
    private static final javax.xml.namespace.QName TITLE$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Title");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Description");
    
    
    /**
     * Gets the "FileId" element
     */
    public int getFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileId" element
     */
    public org.apache.xmlbeans.XmlInt xgetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileId" element
     */
    public boolean isSetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEID$0) != 0;
        }
    }
    
    /**
     * Sets the "FileId" element
     */
    public void setFileId(int fileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEID$0);
            }
            target.setIntValue(fileId);
        }
    }
    
    /**
     * Sets (as xml) the "FileId" element
     */
    public void xsetFileId(org.apache.xmlbeans.XmlInt fileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILEID$0);
            }
            target.set(fileId);
        }
    }
    
    /**
     * Unsets the "FileId" element
     */
    public void unsetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEID$0, 0);
        }
    }
    
    /**
     * Gets the "FileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileName" element
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$2) != 0;
        }
    }
    
    /**
     * Sets the "FileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$2);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "FileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$2);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "FileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$2, 0);
        }
    }
    
    /**
     * Gets the "FileType" element
     */
    public com.msbinfo.expresslync.rct.valuation.FileTypes.Enum getFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.FileTypes.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileType" element
     */
    public com.msbinfo.expresslync.rct.valuation.FileTypes xgetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FileTypes target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FileTypes)get_store().find_element_user(FILETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FileType" element
     */
    public void setFileType(com.msbinfo.expresslync.rct.valuation.FileTypes.Enum fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILETYPE$4);
            }
            target.setEnumValue(fileType);
        }
    }
    
    /**
     * Sets (as xml) the "FileType" element
     */
    public void xsetFileType(com.msbinfo.expresslync.rct.valuation.FileTypes fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FileTypes target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FileTypes)get_store().find_element_user(FILETYPE$4, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.FileTypes)get_store().add_element_user(FILETYPE$4);
            }
            target.set(fileType);
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$6) != 0;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$6);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "Title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$6);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "Title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$6, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
}
