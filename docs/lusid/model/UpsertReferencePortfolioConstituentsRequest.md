# com.finbourne.sdk.services.lusid.model.UpsertReferencePortfolioConstituentsRequest
classname UpsertReferencePortfolioConstituentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveFrom** | **String** | The first date from which the weights will apply | [default to String]
**weightType** | **String** | Available values: Static, Floating, Periodical. | [default to String]
**periodType** | **String** | Available values: Daily, Weekly, Monthly, Quarterly, Annually. | [optional] [default to String]
**periodCount** | **Integer** |  | [optional] [default to Integer]
**constituents** | [**List&lt;ReferencePortfolioConstituentRequest&gt;**](ReferencePortfolioConstituentRequest.md) | Set of constituents (instrument/weight pairings) | [default to List<ReferencePortfolioConstituentRequest>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertReferencePortfolioConstituentsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String effectiveFrom = "example effectiveFrom";
String weightType = "example weightType";
@javax.annotation.Nullable String periodType = "example periodType";
@javax.annotation.Nullable Integer periodCount = new Integer("100.00");
List<ReferencePortfolioConstituentRequest> constituents = new List<ReferencePortfolioConstituentRequest>();


UpsertReferencePortfolioConstituentsRequest upsertReferencePortfolioConstituentsRequestInstance = new UpsertReferencePortfolioConstituentsRequest()
    .effectiveFrom(effectiveFrom)
    .weightType(weightType)
    .periodType(periodType)
    .periodCount(periodCount)
    .constituents(constituents);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)