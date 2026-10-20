# com.finbourne.sdk.services.lusid.model.MarginLine
classname MarginLine
One holding's contribution to a margin call: its exposure, or its value as collateral.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run that produced the line. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**item** | **String** | The margin item the line falls under. Filterable. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingId** | **String** | The holding the line was valued from. | [optional] [default to String]
**custodianAccountScope** | **String** | The scope of the custodian account the holding sits in, when it has one. | [optional] [default to String]
**custodianAccountCode** | **String** | The code of the custodian account the holding sits in, when it has one. | [optional] [default to String]
**custodianAccountName** | **String** | The name of the custodian account, when it has one. | [optional] [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The identifiers of the instrument held. | [default to Map<String, String>]
**units** | **java.math.BigDecimal** | The units held. | [default to java.math.BigDecimal]
**pv** | **java.math.BigDecimal** | The present value of the holding in the agreement&#39;s base currency, when it contributes to exposure. | [optional] [default to java.math.BigDecimal]
**variationMargin** | **java.math.BigDecimal** | The holding&#39;s contribution to variation margin, when it contributes to exposure. | [optional] [default to java.math.BigDecimal]
**collateralValue** | **java.math.BigDecimal** | The holding&#39;s value as collateral after haircuts, when it is held as collateral. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.MarginLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
ResourceId agreementId = new ResourceId();
String item = "example item";
ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String custodianAccountScope = "example custodianAccountScope";
@javax.annotation.Nullable String custodianAccountCode = "example custodianAccountCode";
@javax.annotation.Nullable String custodianAccountName = "example custodianAccountName";
Map<String, String> instrumentIdentifiers = new Map<String, String>();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal pv = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal variationMargin = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal collateralValue = new java.math.BigDecimal("100.00");


MarginLine marginLineInstance = new MarginLine()
    .runId(runId)
    .agreementId(agreementId)
    .item(item)
    .portfolioId(portfolioId)
    .holdingId(holdingId)
    .custodianAccountScope(custodianAccountScope)
    .custodianAccountCode(custodianAccountCode)
    .custodianAccountName(custodianAccountName)
    .instrumentIdentifiers(instrumentIdentifiers)
    .units(units)
    .pv(pv)
    .variationMargin(variationMargin)
    .collateralValue(collateralValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)