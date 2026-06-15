# com.finbourne.sdk.services.lusid.model.CreditSupportAnnex
classname CreditSupportAnnex
Entity to capture the calculable and queryable methods and practices of determining and transferring collateral  to a counterparty as part of margining of transactions. These typically come from a particular ISDA agreement  that is in place between the two counterparties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceCurrency** | **String** | The base, or reference, currency against which MtM value and exposure should be calculated  and in which the CSA parameters are defined if the currency is not otherwise explicitly stated. | [default to String]
**collateralCurrencies** | **List&lt;String&gt;** | The set of currencies within which it is acceptable to post cash collateral. | [default to List<String>]
**isdaAgreementVersion** | **String** | The transactions will take place with reference to a particular ISDA master agreement. This  will likely be either the ISDA 1992 or ISDA 2002 agremeents or ISDA close-out 2009. | [default to String]
**marginCallFrequency** | **String** | The tenor, e.g. daily (1D) or biweekly (2W), at which frequency a margin call will be made, calculations  made and money transferred to readjust. The calculation might also require a specific time for valuation and notification. | [default to String]
**valuationAgent** | **String** | Are the calculations performed by the institutions&#39;s counterparty or the institution trading with them. | [default to String]
**thresholdAmount** | **java.math.BigDecimal** | At what level of exposure does collateral need to be posted. Will typically be zero for banks.  Should be stated in reference currency | [default to java.math.BigDecimal]
**roundingDecimalPlaces** | **Integer** | Where a calculation needs to be rounded to a specific number of decimal places,  this states the number that that requires. | [default to Integer]
**initialMarginAmount** | **java.math.BigDecimal** | The initial margin that is required. In the reference currency | [default to java.math.BigDecimal]
**minimumTransferAmount** | **java.math.BigDecimal** | The minimum amount, in the reference currency, that must be transferred when required. | [default to java.math.BigDecimal]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.sdk.services.lusid.model.CreditSupportAnnex;
import java.util.*;
import java.lang.System;
import java.net.URI;

String referenceCurrency = "example referenceCurrency";
List<String> collateralCurrencies = new List<String>();
String isdaAgreementVersion = "example isdaAgreementVersion";
String marginCallFrequency = "example marginCallFrequency";
String valuationAgent = "example valuationAgent";
java.math.BigDecimal thresholdAmount = new java.math.BigDecimal("100.00");
Integer roundingDecimalPlaces = new Integer("100.00");
java.math.BigDecimal initialMarginAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal minimumTransferAmount = new java.math.BigDecimal("100.00");
ResourceId id = new ResourceId();


CreditSupportAnnex creditSupportAnnexInstance = new CreditSupportAnnex()
    .referenceCurrency(referenceCurrency)
    .collateralCurrencies(collateralCurrencies)
    .isdaAgreementVersion(isdaAgreementVersion)
    .marginCallFrequency(marginCallFrequency)
    .valuationAgent(valuationAgent)
    .thresholdAmount(thresholdAmount)
    .roundingDecimalPlaces(roundingDecimalPlaces)
    .initialMarginAmount(initialMarginAmount)
    .minimumTransferAmount(minimumTransferAmount)
    .id(id);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)