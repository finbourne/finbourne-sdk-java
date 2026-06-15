# com.finbourne.sdk.services.lusid.model.TransactionQueryParameters
classname TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. | [default to String]
**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. | [default to String]
**queryMode** | **String** | The date to compare against the upper and lower bounds for the effective datetime or cut label. Default value: TradeDate. Available values: TradeDate, SettleDate. | [optional] [default to String]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. | [optional] [default to Boolean]
**timelineScope** | **String** | Scope of the Timeline for the Portfolio. The Timeline to be used while building transactions | [optional] [default to String]
**timelineCode** | **String** | Code of the Timeline for the Portfolio. The Timeline to be used while building transactions. This can optionally include a colon, followed by the Closed Period Id to use at the head of the timeline, for a timeline with unconfirmed periods. | [optional] [default to String]
**includeEconomics** | **Boolean** | By default is false. When set to true the Economics data would be populated in the response. | [optional] [default to Boolean]
**includeSettlementStatus** | **Boolean** | By default is false. When set to true the Settlement Status data would be populated in the response. | [optional] [default to Boolean]
**settlementStatusDate** | **String** | Optional date used to specify end of an extended window for settlement information. When provided, transactions will be returned between start and end date, but settlement information between start date and this date will be included. When provided, the value must be greater than or equal to end date. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

String startDate = "example startDate";
String endDate = "example endDate";
String queryMode = "example queryMode";
Boolean showCancelledTransactions = true;
@javax.annotation.Nullable String timelineScope = "example timelineScope";
@javax.annotation.Nullable String timelineCode = "example timelineCode";
Boolean includeEconomics = true;
Boolean includeSettlementStatus = true;
@javax.annotation.Nullable String settlementStatusDate = "example settlementStatusDate";


TransactionQueryParameters transactionQueryParametersInstance = new TransactionQueryParameters()
    .startDate(startDate)
    .endDate(endDate)
    .queryMode(queryMode)
    .showCancelledTransactions(showCancelledTransactions)
    .timelineScope(timelineScope)
    .timelineCode(timelineCode)
    .includeEconomics(includeEconomics)
    .includeSettlementStatus(includeSettlementStatus)
    .settlementStatusDate(settlementStatusDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)