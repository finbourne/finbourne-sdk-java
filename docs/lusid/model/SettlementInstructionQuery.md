# com.finbourne.sdk.services.lusid.model.SettlementInstructionQuery
classname SettlementInstructionQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**startDate** | **String** |  | [optional] [default to String]
**endDate** | **String** |  | [optional] [default to String]
**limit** | **Integer** |  | [optional] [default to Integer]
**page** | **String** |  | [optional] [default to String]
**filter** | **String** |  | [optional] [default to String]
**settlementInstructionPropertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**transactionPropertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**timelineScope** | **String** |  | [optional] [default to String]
**timelineCode** | **String** |  | [optional] [default to String]
**closedPeriodId** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettlementInstructionQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String startDate = "example startDate";
@javax.annotation.Nullable String endDate = "example endDate";
@javax.annotation.Nullable Integer limit = new Integer("100.00");
@javax.annotation.Nullable String page = "example page";
@javax.annotation.Nullable String filter = "example filter";
@javax.annotation.Nullable List<String> settlementInstructionPropertyKeys = new List<String>();
@javax.annotation.Nullable List<String> transactionPropertyKeys = new List<String>();
@javax.annotation.Nullable String timelineScope = "example timelineScope";
@javax.annotation.Nullable String timelineCode = "example timelineCode";
@javax.annotation.Nullable String closedPeriodId = "example closedPeriodId";


SettlementInstructionQuery settlementInstructionQueryInstance = new SettlementInstructionQuery()
    .asAt(asAt)
    .startDate(startDate)
    .endDate(endDate)
    .limit(limit)
    .page(page)
    .filter(filter)
    .settlementInstructionPropertyKeys(settlementInstructionPropertyKeys)
    .transactionPropertyKeys(transactionPropertyKeys)
    .timelineScope(timelineScope)
    .timelineCode(timelineCode)
    .closedPeriodId(closedPeriodId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)