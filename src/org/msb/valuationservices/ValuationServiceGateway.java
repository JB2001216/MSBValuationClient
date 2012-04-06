package org.msb.valuationservices;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.Options;
import org.apache.rampart.RampartMessageData;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import javax.xml.stream.XMLStreamException;
import java.io.InputStream;

import com.msbinfo.expresslync.rct.*;
import com.msbinfo.expresslync.rct.valuation.*;

/**
 * Created by IntelliJ IDEA.
 * User: amy
 * Date: Apr 5, 2012
 * Time: 4:07:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValuationServiceGateway {

    private org.msb.valuationservices.ValuationServicePortStub stub;

    /**
     * Constructor that takes in a configContext
     */

    public ValuationServiceGateway(String username, String password, String url) throws org.apache.axis2.AxisFault, XMLStreamException {

        ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

        stub = new ValuationServicePortStub(ctx, url);//the default implementation should point to the right endpoint


        ServiceClient sc = stub._getServiceClient();

        Options options = sc.getOptions();
        options.setProperty(RampartMessageData.KEY_RAMPART_POLICY, loadPolicy("policy.xml"));

        options.setUserName(username);
        options.setPassword(password);


        sc.engageModule("rampart");
    }

    private static Policy loadPolicy(String name) throws XMLStreamException {
        ClassLoader loader = Policy.class.getClassLoader();
        InputStream resource = loader.getResourceAsStream(name);
        StAXOMBuilder builder = new StAXOMBuilder(resource);
        return PolicyEngine.getPolicy(builder.getDocumentElement());
    }

    public ValuationOutDocument exportValuationVersionId(VersionIdDocument versionIdDocument) throws java.lang.Exception {
        return stub.exportValuationVersionId(versionIdDocument);
    }

    public ValuationOutDocument exportValuationRecordId(RecordIdDocument recordIdDocument) throws java.lang.Exception {
        return stub.exportValuationRecordId(recordIdDocument);
    }

    public ValuationOutDocument exportValuationPolicyNumber(PolicyNumberDocument policyNumberDocument) throws java.lang.Exception {
        return stub.exportValuationPolicyNumber(policyNumberDocument);
    }

    public ValuationIdentifierDocument createValuation(ValuationInDocument valuationInDocument) throws java.lang.Exception {
        return stub.createValuation(valuationInDocument);
    }

    public ValuationInDocument buildHazardValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = buildValuation();
        HazardValuation hazardValuation = valuationIn.getValuationIn().addNewHazardValuation();
        fillOutValuation(hazardValuation);

        return valuationIn;
    }

    public ValuationInDocument buildMainStreetValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = buildValuation();

        MainStreetValuation mainStreetValuation = valuationIn.getValuationIn().addNewMainStreetValuation();
        fillOutCalculatableValuation(mainStreetValuation);
        mainStreetValuation.addNewBuilding();

        return valuationIn;
    }

    public ValuationInDocument buildMMHValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = buildValuation();
        MMHValuation mmhValuation = valuationIn.getValuationIn().addNewMMHValuation();
        fillOutCalculatableValuation(mmhValuation);
        mmhValuation.addNewBuilding();
        return valuationIn;
    }

    public ValuationInDocument buildHighValueStandardValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = buildValuation();
        HighValueStandardValuation hvStandardValuation = valuationIn.getValuationIn().addNewHVStandardValuation();
        fillOutCalculatableValuation(hvStandardValuation);
        hvStandardValuation.addNewBuilding();

        return valuationIn;
    }

    public ValuationInDocument buildHighValueAdvancedValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = buildValuation();
        HighValueAdvancedValuation hvAdvancedValuation = valuationIn.getValuationIn().addNewHVAdvancedValuation();
        fillOutCalculatableValuation(hvAdvancedValuation);
        hvAdvancedValuation.addNewBuilding();

        return valuationIn;
    }

    private ValuationInDocument buildValuation() throws java.lang.Exception {

        ValuationInDocument valuationIn = ValuationInDocument.Factory.newInstance();
        valuationIn.addNewValuationIn();

        return valuationIn;
    }

    private void fillOutValuation(Valuation valuation) throws java.lang.Exception {

        valuation.addNewValuationIdentifier();
        valuation.addNewPropertyAddress();
        valuation.addNewHazardInfo();
        valuation.addNewLatLong();
        valuation.addNewPropertyStandardizedAddress();
        valuation.addNewInsuredCustomer();
    }

    private void fillOutCalculatableValuation(CalculatableValuation valuation) throws java.lang.Exception {

        fillOutValuation(valuation);
        valuation.addNewAdjustment();
        valuation.addNewCalculationResult();
        valuation.addNewNonStandardizedCostAdjustment();
        valuation.addNewPreferences();
    }
}
