# com.finbourne.sdk.services.lusid.model.QueryRelationalDatasetRequest
classname QueryRelationalDatasetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queryMethod** | **String** | The method used to query data points. Can be either &#39;Latest&#39; or &#39;TimeSeries&#39;. | [optional] [default to String]
**filter** | **String** | Expression to filter the result set. For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] [default to String]
**customSortBy** | [**List&lt;CustomSortBy&gt;**](CustomSortBy.md) | A list of fields and values to sort the results by. | [optional] [default to List<CustomSortBy>]

```java
import com.finbourne.sdk.services.lusid.model.QueryRelationalDatasetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String queryMethod = "example queryMethod";
@javax.annotation.Nullable String filter = "example filter";
@javax.annotation.Nullable List<CustomSortBy> customSortBy = new List<CustomSortBy>();


QueryRelationalDatasetRequest queryRelationalDatasetRequestInstance = new QueryRelationalDatasetRequest()
    .queryMethod(queryMethod)
    .filter(filter)
    .customSortBy(customSortBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)