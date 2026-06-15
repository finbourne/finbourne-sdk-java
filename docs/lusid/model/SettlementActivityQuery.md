# com.finbourne.sdk.services.lusid.model.SettlementActivityQuery
classname SettlementActivityQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time at which to query settlement activity. Defaults to latest. | [optional] [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The portfolios and / or portfolio groups to query. At least one entry is required. | [optional] [default to List<PortfolioEntityId>]
**startActivityDate** | **String** | Lower bound (inclusive) of the activity date range. If not set, no lower bound is applied. | [optional] [default to String]
**endActivityDate** | **String** | Upper bound (inclusive) of the activity date range. Defaults to the current date and time. Treated as effectiveAt. | [optional] [default to String]
**filter** | **String** | A LUSID standard filter expression. Supports traversal into transaction and settlementInstruction. | [optional] [default to String]
**settlementInstructionPropertyKeys** | **List&lt;String&gt;** | Settlement instruction property keys to populate on the response. Behaviour matches BuildSettlementInstructions. | [optional] [default to List<String>]
**transactionPropertyKeys** | **List&lt;String&gt;** | Transaction property keys to populate on the response. Behaviour matches BuildSettlementInstructions. | [optional] [default to List<String>]
**limit** | **Integer** | Page size limit; standard pagination control. Defaults to 5000. | [optional] [default to Integer]
**page** | **String** | Pagination cursor returned by a previous response. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.SettlementActivityQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable List<PortfolioEntityId> portfolioEntityIds = new List<PortfolioEntityId>();
@javax.annotation.Nullable String startActivityDate = "example startActivityDate";
@javax.annotation.Nullable String endActivityDate = "example endActivityDate";
@javax.annotation.Nullable String filter = "example filter";
@javax.annotation.Nullable List<String> settlementInstructionPropertyKeys = new List<String>();
@javax.annotation.Nullable List<String> transactionPropertyKeys = new List<String>();
@javax.annotation.Nullable Integer limit = new Integer("100.00");
@javax.annotation.Nullable String page = "example page";


SettlementActivityQuery settlementActivityQueryInstance = new SettlementActivityQuery()
    .asAt(asAt)
    .portfolioEntityIds(portfolioEntityIds)
    .startActivityDate(startActivityDate)
    .endActivityDate(endActivityDate)
    .filter(filter)
    .settlementInstructionPropertyKeys(settlementInstructionPropertyKeys)
    .transactionPropertyKeys(transactionPropertyKeys)
    .limit(limit)
    .page(page);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)