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
**initialMarginItem** | **String** | The initial-margin item the line falls under, when the holding matched one. Filterable. | [optional] [default to String]
**initialMargin** | **java.math.BigDecimal** | The holding&#39;s share of its netting set&#39;s initial margin, before the threshold, when it contributes to it. | [optional] [default to java.math.BigDecimal]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**lineKey** | **String** | A key that identifies the line within its run, with which its explanation is asked for. A line valued under a scenario has a different key from the same holding in the base market. Null for a line stored before lines carried a key. | [optional] [default to String]
**explainAvailable** | **Boolean** | Whether the working behind the line&#39;s figures was stored, so that the line can be explained. One flag covers every figure of the line. | [optional] [default to Boolean]
**instrumentType** | **String** | LUSID&#39;s type for the instrument held, when the run read it. | [optional] [default to String]
**assetClass** | **String** | The instrument&#39;s asset class, when the run read it. | [optional] [default to String]
**currency** | **String** | The currency the holding is denominated in, when the run read it. | [optional] [default to String]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The instrument&#39;s maturity, when it has one. | [optional] [default to OffsetDateTime]
**notional** | **java.math.BigDecimal** | The holding&#39;s notional in its own currency, when the instrument has one. | [optional] [default to java.math.BigDecimal]
**grossInitialMargin** | **java.math.BigDecimal** | The regulatory-grid charge on the holding before its netting set&#39;s net-to-gross scaling. Null under other methods. | [optional] [default to java.math.BigDecimal]
**movableTo** | **List&lt;String&gt;** | The initial-margin netting sets of other agreements in the run the holding could be re-booked into, as scope/code/item. Recorded for base-case trading lines under an initial-margin item; empty otherwise. | [default to List<String>]

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
@javax.annotation.Nullable String initialMarginItem = "example initialMarginItem";
@javax.annotation.Nullable java.math.BigDecimal initialMargin = new java.math.BigDecimal("100.00");
ResourceId scenario = new ResourceId();
@javax.annotation.Nullable String lineKey = "example lineKey";
Boolean explainAvailable = true;
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String assetClass = "example assetClass";
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable OffsetDateTime maturityDate = OffsetDateTime.now();
@javax.annotation.Nullable java.math.BigDecimal notional = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal grossInitialMargin = new java.math.BigDecimal("100.00");
List<String> movableTo = new List<String>();


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
    .collateralValue(collateralValue)
    .initialMarginItem(initialMarginItem)
    .initialMargin(initialMargin)
    .scenario(scenario)
    .lineKey(lineKey)
    .explainAvailable(explainAvailable)
    .instrumentType(instrumentType)
    .assetClass(assetClass)
    .currency(currency)
    .maturityDate(maturityDate)
    .notional(notional)
    .grossInitialMargin(grossInitialMargin)
    .movableTo(movableTo);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)