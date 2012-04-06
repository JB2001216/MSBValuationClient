/*
 * XML Type:  MainstreetSection
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.MainstreetSection
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML MainstreetSection(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class MainstreetSectionImpl extends com.msbinfo.expresslync.rct.valuation.impl.MsMmhSectionImpl implements com.msbinfo.expresslync.rct.valuation.MainstreetSection
{
    
    public MainstreetSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOUNDATIONANDBASEMENT$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FoundationAndBasement");
    private static final javax.xml.namespace.QName SHAPE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Shape");
    private static final javax.xml.namespace.QName CATHEDRALCEILINGPCT$4 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "CathedralCeilingPct");
    private static final javax.xml.namespace.QName LOWERUNFINISHEDPCT$6 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "LowerUnfinishedPct");
    private static final javax.xml.namespace.QName ELABORATEROOF$8 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "ElaborateRoof");
    private static final javax.xml.namespace.QName FLOORTOFLOORHEIGHT$10 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "FloorToFloorHeight");
    private static final javax.xml.namespace.QName FRAMING$12 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Framing");
    private static final javax.xml.namespace.QName FOUNDATION$14 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Foundation");
    private static final javax.xml.namespace.QName ROOM$16 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Room");
    
    
    /**
     * Gets the "FoundationAndBasement" element
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo getFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo)get_store().find_element_user(FOUNDATIONANDBASEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FoundationAndBasement" element
     */
    public boolean isSetFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDATIONANDBASEMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "FoundationAndBasement" element
     */
    public void setFoundationAndBasement(com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo foundationAndBasement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo)get_store().find_element_user(FOUNDATIONANDBASEMENT$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo)get_store().add_element_user(FOUNDATIONANDBASEMENT$0);
            }
            target.set(foundationAndBasement);
        }
    }
    
    /**
     * Appends and returns a new empty "FoundationAndBasement" element
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo addNewFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBasementInfo)get_store().add_element_user(FOUNDATIONANDBASEMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FoundationAndBasement" element
     */
    public void unsetFoundationAndBasement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDATIONANDBASEMENT$0, 0);
        }
    }
    
    /**
     * Gets the "Shape" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionShape.Enum getShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.msbinfo.expresslync.rct.valuation.SectionShape.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Shape" element
     */
    public com.msbinfo.expresslync.rct.valuation.SectionShape xgetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionShape target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().find_element_user(SHAPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Shape" element
     */
    public boolean isSetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAPE$2) != 0;
        }
    }
    
    /**
     * Sets the "Shape" element
     */
    public void setShape(com.msbinfo.expresslync.rct.valuation.SectionShape.Enum shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAPE$2);
            }
            target.setEnumValue(shape);
        }
    }
    
    /**
     * Sets (as xml) the "Shape" element
     */
    public void xsetShape(com.msbinfo.expresslync.rct.valuation.SectionShape shape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SectionShape target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().find_element_user(SHAPE$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.SectionShape)get_store().add_element_user(SHAPE$2);
            }
            target.set(shape);
        }
    }
    
    /**
     * Unsets the "Shape" element
     */
    public void unsetShape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAPE$2, 0);
        }
    }
    
    /**
     * Gets the "CathedralCeilingPct" element
     */
    public short getCathedralCeilingPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATHEDRALCEILINGPCT$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "CathedralCeilingPct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCathedralCeilingPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CATHEDRALCEILINGPCT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CathedralCeilingPct" element
     */
    public boolean isSetCathedralCeilingPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATHEDRALCEILINGPCT$4) != 0;
        }
    }
    
    /**
     * Sets the "CathedralCeilingPct" element
     */
    public void setCathedralCeilingPct(short cathedralCeilingPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATHEDRALCEILINGPCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATHEDRALCEILINGPCT$4);
            }
            target.setShortValue(cathedralCeilingPct);
        }
    }
    
    /**
     * Sets (as xml) the "CathedralCeilingPct" element
     */
    public void xsetCathedralCeilingPct(org.apache.xmlbeans.XmlUnsignedByte cathedralCeilingPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CATHEDRALCEILINGPCT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CATHEDRALCEILINGPCT$4);
            }
            target.set(cathedralCeilingPct);
        }
    }
    
    /**
     * Unsets the "CathedralCeilingPct" element
     */
    public void unsetCathedralCeilingPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATHEDRALCEILINGPCT$4, 0);
        }
    }
    
    /**
     * Gets the "LowerUnfinishedPct" element
     */
    public short getLowerUnfinishedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERUNFINISHEDPCT$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "LowerUnfinishedPct" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetLowerUnfinishedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(LOWERUNFINISHEDPCT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LowerUnfinishedPct" element
     */
    public boolean isSetLowerUnfinishedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERUNFINISHEDPCT$6) != 0;
        }
    }
    
    /**
     * Sets the "LowerUnfinishedPct" element
     */
    public void setLowerUnfinishedPct(short lowerUnfinishedPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERUNFINISHEDPCT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERUNFINISHEDPCT$6);
            }
            target.setShortValue(lowerUnfinishedPct);
        }
    }
    
    /**
     * Sets (as xml) the "LowerUnfinishedPct" element
     */
    public void xsetLowerUnfinishedPct(org.apache.xmlbeans.XmlUnsignedByte lowerUnfinishedPct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(LOWERUNFINISHEDPCT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(LOWERUNFINISHEDPCT$6);
            }
            target.set(lowerUnfinishedPct);
        }
    }
    
    /**
     * Unsets the "LowerUnfinishedPct" element
     */
    public void unsetLowerUnfinishedPct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERUNFINISHEDPCT$6, 0);
        }
    }
    
    /**
     * Gets the "ElaborateRoof" element
     */
    public boolean getElaborateRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELABORATEROOF$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ElaborateRoof" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetElaborateRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ELABORATEROOF$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ElaborateRoof" element
     */
    public boolean isSetElaborateRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELABORATEROOF$8) != 0;
        }
    }
    
    /**
     * Sets the "ElaborateRoof" element
     */
    public void setElaborateRoof(boolean elaborateRoof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELABORATEROOF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELABORATEROOF$8);
            }
            target.setBooleanValue(elaborateRoof);
        }
    }
    
    /**
     * Sets (as xml) the "ElaborateRoof" element
     */
    public void xsetElaborateRoof(org.apache.xmlbeans.XmlBoolean elaborateRoof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ELABORATEROOF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ELABORATEROOF$8);
            }
            target.set(elaborateRoof);
        }
    }
    
    /**
     * Unsets the "ElaborateRoof" element
     */
    public void unsetElaborateRoof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELABORATEROOF$8, 0);
        }
    }
    
    /**
     * Gets array of all "FloorToFloorHeight" elements
     */
    public com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[] getFloorToFloorHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOORTOFLOORHEIGHT$10, targetList);
            com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[] result = new com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight getFloorToFloorHeightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight)get_store().find_element_user(FLOORTOFLOORHEIGHT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FloorToFloorHeight" element
     */
    public int sizeOfFloorToFloorHeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOORTOFLOORHEIGHT$10);
        }
    }
    
    /**
     * Sets array of all "FloorToFloorHeight" element
     */
    public void setFloorToFloorHeightArray(com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight[] floorToFloorHeightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(floorToFloorHeightArray, FLOORTOFLOORHEIGHT$10);
        }
    }
    
    /**
     * Sets ith "FloorToFloorHeight" element
     */
    public void setFloorToFloorHeightArray(int i, com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight floorToFloorHeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight)get_store().find_element_user(FLOORTOFLOORHEIGHT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(floorToFloorHeight);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight insertNewFloorToFloorHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight)get_store().insert_element_user(FLOORTOFLOORHEIGHT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FloorToFloorHeight" element
     */
    public com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight addNewFloorToFloorHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight target = null;
            target = (com.msbinfo.expresslync.rct.valuation.MSFloorToFloorHeight)get_store().add_element_user(FLOORTOFLOORHEIGHT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "FloorToFloorHeight" element
     */
    public void removeFloorToFloorHeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOORTOFLOORHEIGHT$10, i);
        }
    }
    
    /**
     * Gets array of all "Framing" elements
     */
    public com.msbinfo.expresslync.rct.valuation.FramingBreakdown[] getFramingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FRAMING$12, targetList);
            com.msbinfo.expresslync.rct.valuation.FramingBreakdown[] result = new com.msbinfo.expresslync.rct.valuation.FramingBreakdown[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.FramingBreakdown getFramingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FramingBreakdown)get_store().find_element_user(FRAMING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Framing" element
     */
    public int sizeOfFramingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMING$12);
        }
    }
    
    /**
     * Sets array of all "Framing" element
     */
    public void setFramingArray(com.msbinfo.expresslync.rct.valuation.FramingBreakdown[] framingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(framingArray, FRAMING$12);
        }
    }
    
    /**
     * Sets ith "Framing" element
     */
    public void setFramingArray(int i, com.msbinfo.expresslync.rct.valuation.FramingBreakdown framing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FramingBreakdown)get_store().find_element_user(FRAMING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(framing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.FramingBreakdown insertNewFraming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FramingBreakdown)get_store().insert_element_user(FRAMING$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Framing" element
     */
    public com.msbinfo.expresslync.rct.valuation.FramingBreakdown addNewFraming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FramingBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FramingBreakdown)get_store().add_element_user(FRAMING$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Framing" element
     */
    public void removeFraming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMING$12, i);
        }
    }
    
    /**
     * Gets array of all "Foundation" elements
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[] getFoundationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOUNDATION$14, targetList);
            com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[] result = new com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Foundation" element
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBreakdown getFoundationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBreakdown)get_store().find_element_user(FOUNDATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Foundation" element
     */
    public int sizeOfFoundationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOUNDATION$14);
        }
    }
    
    /**
     * Sets array of all "Foundation" element
     */
    public void setFoundationArray(com.msbinfo.expresslync.rct.valuation.FoundationBreakdown[] foundationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(foundationArray, FOUNDATION$14);
        }
    }
    
    /**
     * Sets ith "Foundation" element
     */
    public void setFoundationArray(int i, com.msbinfo.expresslync.rct.valuation.FoundationBreakdown foundation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBreakdown)get_store().find_element_user(FOUNDATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(foundation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Foundation" element
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBreakdown insertNewFoundation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBreakdown)get_store().insert_element_user(FOUNDATION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Foundation" element
     */
    public com.msbinfo.expresslync.rct.valuation.FoundationBreakdown addNewFoundation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.FoundationBreakdown target = null;
            target = (com.msbinfo.expresslync.rct.valuation.FoundationBreakdown)get_store().add_element_user(FOUNDATION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Foundation" element
     */
    public void removeFoundation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOUNDATION$14, i);
        }
    }
    
    /**
     * Gets array of all "Room" elements
     */
    public com.msbinfo.expresslync.rct.valuation.Room[] getRoomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROOM$16, targetList);
            com.msbinfo.expresslync.rct.valuation.Room[] result = new com.msbinfo.expresslync.rct.valuation.Room[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Room" element
     */
    public com.msbinfo.expresslync.rct.valuation.Room getRoomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Room target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Room)get_store().find_element_user(ROOM$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Room" element
     */
    public int sizeOfRoomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOM$16);
        }
    }
    
    /**
     * Sets array of all "Room" element
     */
    public void setRoomArray(com.msbinfo.expresslync.rct.valuation.Room[] roomArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roomArray, ROOM$16);
        }
    }
    
    /**
     * Sets ith "Room" element
     */
    public void setRoomArray(int i, com.msbinfo.expresslync.rct.valuation.Room room)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Room target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Room)get_store().find_element_user(ROOM$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(room);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Room" element
     */
    public com.msbinfo.expresslync.rct.valuation.Room insertNewRoom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Room target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Room)get_store().insert_element_user(ROOM$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Room" element
     */
    public com.msbinfo.expresslync.rct.valuation.Room addNewRoom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.Room target = null;
            target = (com.msbinfo.expresslync.rct.valuation.Room)get_store().add_element_user(ROOM$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Room" element
     */
    public void removeRoom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOM$16, i);
        }
    }
}
