/**
 * ValuationServicePortTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package org.msb.valuationservices;

import com.msbinfo.expresslync.rct.valuation.*;
import com.msbinfo.expresslync.rct.*;

/*
 *  ValuationServicePortTest Junit test case
*/

public class ValuationServicePortTest extends junit.framework.TestCase {


    /**
     * Auto generated test method
     */
    public void testexportValuationVersionId() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint

        VersionIdDocument versionId10 = VersionIdDocument.Factory.newInstance();

        // TODO : Fill in the versionId10 here
        versionId10.setVersionId(6296484);
        assertNotNull(gateway.exportValuationVersionId(
                versionId10));

    }

    /**
     * Auto generated test method
     */
    public void testexportValuationRecordId() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint

        RecordIdDocument recordId12 = RecordIdDocument.Factory.newInstance();
        recordId12.setRecordId(1444173);

        assertNotNull(gateway.exportValuationRecordId(
                recordId12));


    }

    /**
     * Auto generated test method
     */
    public void testexportValuationPolicyNumber() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint
        PolicyNumberDocument policyNumber14 = PolicyNumberDocument.Factory.newInstance();

        policyNumber14.setPolicyNumber("ESTIMATE-1444173");

        assertNotNull(gateway.exportValuationPolicyNumber(policyNumber14));


    }

    /**
     * Auto generated test method
     */
    public void testcreateValuation() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint
        ValuationInDocument valuationIn = gateway.buildMainStreetValuation();
        //ValuationInDocument valuationIn = gateway.buildHighValueAdvancedValuation();

        MainStreetValuation valuation = valuationIn.getValuationIn().getMainStreetValuation();
        //HighValueAdvancedValuation valuation = valuationIn.getValuationIn().getHVAdvancedValuation();
        valuation.setPropertyAddress(getAddress());
        valuation.setRecordType(RecordType.EST);

        InsuredCustomer insured = valuation.getInsuredCustomer();
        insured.setFullName("CST Test3");
        insured.setMailingAddress(getAddress());

        MainstreetBuilding building = valuation.getBuilding();
        //HighValueAdvancedBuilding building = valuation.getBuilding();
        building.setHomeStyle(HomeStyle.CAPE_COD);
        building.setSiteAccess(SiteAccess.FLAT_AREA_EASY_ACCESS_ROADS);

        MainstreetSection section = building.addNewSection();
        //HighValueAdvancedSection section = building.addNewSection();
        section.setNumber((short) 1);
        section.setYearBuilt((short) 2005);
        section.setContructionType(ConstructionType.STANDARD);
        section.setLivingArea(2200);

        assertNotNull(gateway.createValuation(valuationIn));

    }

    public void testassignPolicyNumberPolicyNumber() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint
        PolicyNumberDocument oldPolicyNumber = PolicyNumberDocument.Factory.newInstance();
        NewPolicyNumberDocument newPolicyNumber = NewPolicyNumberDocument.Factory.newInstance();

        oldPolicyNumber.setPolicyNumber("ESTIMATE-1444173");
        newPolicyNumber.setNewPolicyNumber("1444173");

        assertNotNull(gateway.assignPolicyNumberPolicyNumber(oldPolicyNumber, newPolicyNumber));


    }

    public void testassignPolicyNumberRecord() throws java.lang.Exception {

        ValuationServiceGateway gateway = new ValuationServiceGateway("cedarsprings", "c3darsprings", "http://localhost:8080/rmmi/expresslync/ValuationService.asmx");//the default implementation should point to the right endpoint
        RecordIdDocument recordId = RecordIdDocument.Factory.newInstance();
        NewPolicyNumberDocument newPolicyNumber = NewPolicyNumberDocument.Factory.newInstance();

        recordId.setRecordId(1444173);
        newPolicyNumber.setNewPolicyNumber("1444173");

        assertNotNull(gateway.assignPolicyNumberRecordId(recordId, newPolicyNumber));


    }

    public Address getAddress() throws java.lang.Exception {
        Address address = Address.Factory.newInstance();
        address.setAddress1("124 Main St");
        address.setCity("Brunswick");
        address.setStateOrProvince("ME");
        address.setZipOrPostalCode("04011");

        return address;
    }
}
    