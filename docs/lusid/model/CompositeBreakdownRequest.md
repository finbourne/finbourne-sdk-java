# com.finbourne.sdk.services.lusid.model.CompositeBreakdownRequest
classname CompositeBreakdownRequest
The request used in the GetCompositeBreakdown.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Scope and code of the returns. | [optional] [default to List<ResourceId>]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**compositeMethod** | **String** | The method used to calculate the Portfolio performance. Available values: Equal, Asset. | [optional] [default to String]
**period** | **String** | The type of the returns used to calculate the aggregation result. Available values: Daily, Monthly. | [optional] [default to String]
**holidayCalendars** | **List&lt;String&gt;** | The holiday calendar(s) that should be used in determining the date schedule. Holiday calendar(s) are supplied by their codes, for example, &#39;CoppClark&#39;. Note that when the calendars are not available (e.g. when the user has insufficient permissions), a recipe setting will be used to determine whether the whole batch should then fail or whether the calendar not being available should simply be ignored. | [optional] [default to List<String>]
**currency** | **String** | Optional - either a string or a property. If provided, the results will be converted to the specified currency | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CompositeBreakdownRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<ResourceId> returnIds = new List<ResourceId>();
ResourceId recipeId = new ResourceId();
@javax.annotation.Nullable String compositeMethod = "example compositeMethod";
@javax.annotation.Nullable String period = "example period";
@javax.annotation.Nullable List<String> holidayCalendars = new List<String>();
@javax.annotation.Nullable String currency = "example currency";


CompositeBreakdownRequest compositeBreakdownRequestInstance = new CompositeBreakdownRequest()
    .returnIds(returnIds)
    .recipeId(recipeId)
    .compositeMethod(compositeMethod)
    .period(period)
    .holidayCalendars(holidayCalendars)
    .currency(currency);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)