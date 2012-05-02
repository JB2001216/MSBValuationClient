package org.msb.valuationservices;

import oracle.xdb.XMLType;

import java.sql.CallableStatement;
import java.sql.SQLXML;
import java.sql.SQLException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: cswanberg
 * Date: May 1, 2012
 * Time: 10:47:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class ValuationRepository extends com.phenix.qHO.OracleConnection {


    /**
     * Invokes the oracle insertXmlValuation function
     *
     * @param valuationXml
     */
    public boolean saveValuation(String valuationXml) throws SQLException {
        CallableStatement cstmt = null;


        //Connect to the pool
        this.getConnection();


        XMLType xml;
        byte[] byteBuffer = valuationXml.getBytes();
        InputStream is = new ByteArrayInputStream(byteBuffer);
        xml = XMLType.createXML(conn, is);

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // The following oracle function below has a signature of:
        // procedure add_xml(valuation in XMLTYPE)
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        String call = "{call msb.pkgmsb.add_xml(?)}";
        cstmt = conn.prepareCall(call);


        cstmt.setObject(1, xml);


        cstmt.execute();


        return true;
    }
}
