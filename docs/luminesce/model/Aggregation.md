# com.finbourne.sdk.services.luminesce.model.Aggregation
classname Aggregation
How to aggregate over a field

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**AggregateFunction**](AggregateFunction.md) |  | [default to AggregateFunction]
**alias** | **String** | Alias, if any, for the Aggregate expression when selected | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.Aggregation;
import java.util.*;
import java.lang.System;
import java.net.URI;

AggregateFunction @javax.annotation.Nullable String alias = "example alias";


Aggregation aggregationInstance = new Aggregation()
    .type(type)
    .alias(alias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)