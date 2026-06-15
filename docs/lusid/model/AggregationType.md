# com.finbourne.sdk.services.lusid.model.AggregationType
classname AggregationType
A list of types, that define the expected output types found from an aggregation request in its result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggregationType** | [**String**](.md) | **A list of types, that define the expected output types found from an aggregation request in its result.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregationType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of AggregationType:
AggregationType method = AggregationType.STRING;
AggregationType method = AggregationType.INT;
AggregationType method = AggregationType.DECIMAL;
AggregationType method = AggregationType.DATE_TIME;
AggregationType method = AggregationType.BOOLEAN;
AggregationType method = AggregationType.RESULT_VALUE;
AggregationType method = AggregationType.RESULT0_D;
AggregationType method = AggregationType.JSON;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)