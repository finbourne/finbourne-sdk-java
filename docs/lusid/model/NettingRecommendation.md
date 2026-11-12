# com.finbourne.sdk.services.lusid.model.NettingRecommendation
classname NettingRecommendation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the recommendation was made from. Filterable. | [default to String]
**sourceAgreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceItem** | **String** | The initial-margin item the trades would leave. Filterable. | [default to String]
**targetAgreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**targetItem** | **String** | The initial-margin item the trades would join. Filterable. | [default to String]
**transfer** | **String** | How the trades would get there: Redesignation when both agreements face one counterparty, Novation otherwise. Filterable. | [default to String]
**instrumentType** | **String** | LUSID&#39;s type for the instruments in the cluster. Filterable. | [optional] [default to String]
**currency** | **String** | The currency the cluster&#39;s trades are denominated in. Filterable. | [optional] [default to String]
**maturityBucket** | **String** | The residual-maturity bucket the cluster&#39;s trades fall in on the run date; empty for instruments without a maturity. Filterable. | [optional] [default to String]
**trades** | [**List&lt;TradeReference&gt;**](TradeReference.md) | The holdings that would move. | [default to List<TradeReference>]
**savingPerDay** | **java.math.BigDecimal** | What we would no longer fund each day across both sets, in the sets&#39; base currency. Filterable. | [default to java.math.BigDecimal]
**oneOffCost** | **java.math.BigDecimal** | The novation cost when the transfer is one; zero for a re-designation. Filterable. | [default to java.math.BigDecimal]
**paybackDays** | **java.math.BigDecimal** | How many days of saving cover the one-off cost. Filterable. | [default to java.math.BigDecimal]
**initialMarginChange** | **java.math.BigDecimal** | The sum over both sets of what we would post after the move less what we post today. Filterable. | [default to java.math.BigDecimal]
**source** | [**InitialMarginChange**](InitialMarginChange.md) |  | [default to InitialMarginChange]
**target** | [**InitialMarginChange**](InitialMarginChange.md) |  | [default to InitialMarginChange]

```java
import com.finbourne.sdk.services.lusid.model.NettingRecommendation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
ResourceId sourceAgreementId = new ResourceId();
String sourceItem = "example sourceItem";
ResourceId targetAgreementId = new ResourceId();
String targetItem = "example targetItem";
String transfer = "example transfer";
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String maturityBucket = "example maturityBucket";
List<TradeReference> trades = new List<TradeReference>();
java.math.BigDecimal savingPerDay = new java.math.BigDecimal("100.00");
java.math.BigDecimal oneOffCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal paybackDays = new java.math.BigDecimal("100.00");
java.math.BigDecimal initialMarginChange = new java.math.BigDecimal("100.00");
InitialMarginChange source = new InitialMarginChange();
InitialMarginChange target = new InitialMarginChange();


NettingRecommendation nettingRecommendationInstance = new NettingRecommendation()
    .runId(runId)
    .sourceAgreementId(sourceAgreementId)
    .sourceItem(sourceItem)
    .targetAgreementId(targetAgreementId)
    .targetItem(targetItem)
    .transfer(transfer)
    .instrumentType(instrumentType)
    .currency(currency)
    .maturityBucket(maturityBucket)
    .trades(trades)
    .savingPerDay(savingPerDay)
    .oneOffCost(oneOffCost)
    .paybackDays(paybackDays)
    .initialMarginChange(initialMarginChange)
    .source(source)
    .target(target);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)