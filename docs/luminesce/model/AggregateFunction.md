# com.finbourne.sdk.services.luminesce.model.AggregateFunction
classname AggregateFunction
Aggregation function type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggregateFunction** | [**String**](.md) | **Aggregation function type** | [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.AggregateFunction;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AggregateFunction:
AggregateFunction method = AggregateFunction.COUNT;
AggregateFunction method = AggregateFunction.COUNT_DISTINCT;
AggregateFunction method = AggregateFunction.SUM;
AggregateFunction method = AggregateFunction.TOTAL;
AggregateFunction method = AggregateFunction.AVG;
AggregateFunction method = AggregateFunction.MIN;
AggregateFunction method = AggregateFunction.MAX;
AggregateFunction method = AggregateFunction.GROUP_CONCAT;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)