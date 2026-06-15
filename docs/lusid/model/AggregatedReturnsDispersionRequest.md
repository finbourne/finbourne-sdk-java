# com.finbourne.sdk.services.lusid.model.AggregatedReturnsDispersionRequest
classname AggregatedReturnsDispersionRequest
The request used in the AggregatedReturnsDispersionMetric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toEffectiveAt** | **String** | The end date for when the you want the dispersion to be calculated. | [optional] [default to String]
**yearsCount** | **Integer** | For how many years to calculate the dispersion. Default to 10. | [optional] [default to Integer]
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. | [optional] [default to List<ResourceId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance. Available values: Equal, Asset. | [optional] [default to String]
**alternativeInceptionDate** | **String** | Optional - either a date, or the key for a portfolio property containing a date. If provided, the given date will override the inception date for this request. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregatedReturnsDispersionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String toEffectiveAt = "example toEffectiveAt";
Integer yearsCount = new Integer("100.00");
@javax.annotation.Nullable List<ResourceId> returnIds = new List<ResourceId>();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String compositeMethod = "example compositeMethod";
@javax.annotation.Nullable String alternativeInceptionDate = "example alternativeInceptionDate";


AggregatedReturnsDispersionRequest aggregatedReturnsDispersionRequestInstance = new AggregatedReturnsDispersionRequest()
    .toEffectiveAt(toEffectiveAt)
    .yearsCount(yearsCount)
    .returnIds(returnIds)
    .recipeId(recipeId)
    .compositeMethod(compositeMethod)
    .alternativeInceptionDate(alternativeInceptionDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)