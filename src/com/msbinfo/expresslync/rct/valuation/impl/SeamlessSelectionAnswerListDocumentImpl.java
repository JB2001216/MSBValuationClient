/*
 * An XML document type.
 * Localname: SeamlessSelectionAnswerList
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerListDocument
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * A document containing one SeamlessSelectionAnswerList(@http://msbinfo.com/expresslync/rct/valuation) element.
 *
 * This is a complex type.
 */
public class SeamlessSelectionAnswerListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerListDocument
{
    
    public SeamlessSelectionAnswerListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEAMLESSSELECTIONANSWERLIST$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "SeamlessSelectionAnswerList");
    
    
    /**
     * Gets the "SeamlessSelectionAnswerList" element
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList getSeamlessSelectionAnswerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().find_element_user(SEAMLESSSELECTIONANSWERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeamlessSelectionAnswerList" element
     */
    public void setSeamlessSelectionAnswerList(com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList seamlessSelectionAnswerList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().find_element_user(SEAMLESSSELECTIONANSWERLIST$0, 0);
            if (target == null)
            {
                target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().add_element_user(SEAMLESSSELECTIONANSWERLIST$0);
            }
            target.set(seamlessSelectionAnswerList);
        }
    }
    
    /**
     * Appends and returns a new empty "SeamlessSelectionAnswerList" element
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList addNewSeamlessSelectionAnswerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList)get_store().add_element_user(SEAMLESSSELECTIONANSWERLIST$0);
            return target;
        }
    }
}
