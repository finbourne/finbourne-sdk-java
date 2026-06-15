# com.finbourne.sdk.services.lusid.model.RecommendedSortBy
classname RecommendedSortBy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The property key, identifier type, or field to be sorted by. | [default to String]
**sortOrder** | **String** | The sorting direction. Either ascending (ASC) or descending (DESC). | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RecommendedSortBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String attributeName = "example attributeName";
@javax.annotation.Nullable String sortOrder = "example sortOrder";


RecommendedSortBy recommendedSortByInstance = new RecommendedSortBy()
    .attributeName(attributeName)
    .sortOrder(sortOrder);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)