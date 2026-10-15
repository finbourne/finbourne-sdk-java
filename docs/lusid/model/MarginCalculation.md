# com.finbourne.sdk.services.lusid.model.MarginCalculation
classname MarginCalculation
How the margin requirement for an item is calculated. The method field selects the method and the  remaining fields are the ones that method uses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The calculation method. One of NetMtm, Ccp, GmraExposure, GmslaRcv, HouseRules, Simm, RegulatoryGrid or CcpIngested. Available values: NetMtm, Ccp, GmraExposure, GmslaRcv, HouseRules, Simm, RegulatoryGrid, CcpIngested. | [default to String]
**exposureMethod** | **String** | For GmraExposure, the exposure method. One of Gmra2011A or Gmra2011B. Available values: Gmra2011A, Gmra2011B. | [optional] [default to String]
**repricingPermitted** | **Boolean** | For GmraExposure, whether repricing is permitted. | [optional] [default to Boolean]
**marginPercentage** | **java.math.BigDecimal** | For GmslaRcv, the margin percentage applied to the loan value. | [optional] [default to java.math.BigDecimal]
**lendingFeeBps** | **Integer** | For GmslaRcv, the lending fee in basis points. | [optional] [default to Integer]
**creditLine** | **java.math.BigDecimal** | For HouseRules, the credit line extended to the counterparty. | [optional] [default to java.math.BigDecimal]
**thresholdAllocation** | [**ThresholdAllocation**](ThresholdAllocation.md) |  | [optional] [default to ThresholdAllocation]
**ccp** | **String** | For CcpIngested, the name of the central counterparty. | [optional] [default to String]
**fcmAddOn** | **java.math.BigDecimal** | For CcpIngested, the add-on charged by the futures commission merchant. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MarginCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String method = "example method";
@javax.annotation.Nullable String exposureMethod = "example exposureMethod";
@javax.annotation.Nullable Boolean repricingPermitted = true;
@javax.annotation.Nullable java.math.BigDecimal marginPercentage = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Integer lendingFeeBps = new Integer("100.00");
@javax.annotation.Nullable java.math.BigDecimal creditLine = new java.math.BigDecimal("100.00");
ThresholdAllocation thresholdAllocation = new ThresholdAllocation();
@javax.annotation.Nullable String ccp = "example ccp";
@javax.annotation.Nullable java.math.BigDecimal fcmAddOn = new java.math.BigDecimal("100.00");


MarginCalculation marginCalculationInstance = new MarginCalculation()
    .method(method)
    .exposureMethod(exposureMethod)
    .repricingPermitted(repricingPermitted)
    .marginPercentage(marginPercentage)
    .lendingFeeBps(lendingFeeBps)
    .creditLine(creditLine)
    .thresholdAllocation(thresholdAllocation)
    .ccp(ccp)
    .fcmAddOn(fcmAddOn);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)