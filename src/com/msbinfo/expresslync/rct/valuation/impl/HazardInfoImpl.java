/*
 * XML Type:  HazardInfo
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.HazardInfo
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML HazardInfo(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class HazardInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.HazardInfo
{
    
    public HazardInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Request");
    private static final javax.xml.namespace.QName RESULT$2 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Result");
    
    
    /**
     * Gets the "Request" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardRequest getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardRequest target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardRequest)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Request" element
     */
    public boolean isSetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "Request" element
     */
    public void setRequest(com.msbinfo.expresslync.rct.valuation.HazardRequest request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardRequest target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardRequest)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.HazardRequest)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "Request" element
     */
    public com.msbinfo.expresslync.rct.valuation.HazardRequest addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.HazardRequest target = null;
            target = (com.msbinfo.expresslync.rct.valuation.HazardRequest)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Request" element
     */
    public void unsetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUEST$0, 0);
        }
    }
    
    /**
     * Gets the "Result" element
     */
    public com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail)get_store().find_element_user(RESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Result" element
     */
    public boolean isSetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "Result" element
     */
    public void setResult(com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail)get_store().find_element_user(RESULT$2, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail)get_store().add_element_user(RESULT$2);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "Result" element
     */
    public com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail target = null;
            target = (com.msbinfo.expresslync.rct.valuation.ArrayOfHazardResponseDetail)get_store().add_element_user(RESULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Result" element
     */
    public void unsetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$2, 0);
        }
    }
}
