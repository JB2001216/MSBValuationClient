/*
 * XML Type:  SeamlessSelectionAnswerList
 * Namespace: http://msbinfo.com/expresslync/rct/valuation
 * Java type: com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList
 *
 * Automatically generated - do not modify.
 */
package com.msbinfo.expresslync.rct.valuation.impl;
/**
 * An XML SeamlessSelectionAnswerList(@http://msbinfo.com/expresslync/rct/valuation).
 *
 * This is a complex type.
 */
public class SeamlessSelectionAnswerListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswerList
{
    
    public SeamlessSelectionAnswerListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANSWER$0 = 
        new javax.xml.namespace.QName("http://msbinfo.com/expresslync/rct/valuation", "Answer");
    
    
    /**
     * Gets array of all "Answer" elements
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer[] getAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANSWER$0, targetList);
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer[] result = new com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Answer" element
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer getAnswerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Answer" element
     */
    public boolean isNilAnswerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Answer" element
     */
    public int sizeOfAnswerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWER$0);
        }
    }
    
    /**
     * Sets array of all "Answer" element
     */
    public void setAnswerArray(com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer[] answerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(answerArray, ANSWER$0);
        }
    }
    
    /**
     * Sets ith "Answer" element
     */
    public void setAnswerArray(int i, com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer answer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(answer);
        }
    }
    
    /**
     * Nils the ith "Answer" element
     */
    public void setNilAnswerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().find_element_user(ANSWER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Answer" element
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer insertNewAnswer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().insert_element_user(ANSWER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Answer" element
     */
    public com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer addNewAnswer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer target = null;
            target = (com.msbinfo.expresslync.rct.valuation.SeamlessSelectionAnswer)get_store().add_element_user(ANSWER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Answer" element
     */
    public void removeAnswer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWER$0, i);
        }
    }
}
