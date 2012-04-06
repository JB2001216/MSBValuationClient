/*
 * XML Type:  WholeBuildingCost
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.WholeBuildingCost
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML WholeBuildingCost(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class WholeBuildingCostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.WholeBuildingCost
{
    
    public WholeBuildingCostImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSURABLEREPLACEMENTCOST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "InsurableReplacementCost");
    private static final javax.xml.namespace.QName INSUREDVALUE$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "InsuredValue");
    
    
    /**
     * Gets the "InsurableReplacementCost" element
     */
    public int getInsurableReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InsurableReplacementCost" element
     */
    public org.apache.xmlbeans.XmlInt xgetInsurableReplacementCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InsurableReplacementCost" element
     */
    public void setInsurableReplacementCost(int insurableReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSURABLEREPLACEMENTCOST$0);
            }
            target.setIntValue(insurableReplacementCost);
        }
    }
    
    /**
     * Sets (as xml) the "InsurableReplacementCost" element
     */
    public void xsetInsurableReplacementCost(org.apache.xmlbeans.XmlInt insurableReplacementCost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSURABLEREPLACEMENTCOST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INSURABLEREPLACEMENTCOST$0);
            }
            target.set(insurableReplacementCost);
        }
    }
    
    /**
     * Gets the "InsuredValue" element
     */
    public int getInsuredValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InsuredValue" element
     */
    public org.apache.xmlbeans.XmlInt xgetInsuredValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSUREDVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InsuredValue" element
     */
    public void setInsuredValue(int insuredValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSUREDVALUE$2);
            }
            target.setIntValue(insuredValue);
        }
    }
    
    /**
     * Sets (as xml) the "InsuredValue" element
     */
    public void xsetInsuredValue(org.apache.xmlbeans.XmlInt insuredValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INSUREDVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INSUREDVALUE$2);
            }
            target.set(insuredValue);
        }
    }
}
