# com.finbourne.sdk.services.lusid.model.AggregateSpec
classname AggregateSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**op** | **String** | Available values: Sum, DefaultSum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]
**options** | **Map&lt;String, Object&gt;** | Additional options to apply when performing computations. Options that do not apply to the Key will be  ignored. Option values can be boolean, numeric, string or date-time. | [optional] [default to Map<String, Object>]

```java
import com.finbourne.sdk.services.lusid.model.AggregateSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String op = "example op";
@javax.annotation.Nullable Map<String, Object> options = new Map<String, Object>();


AggregateSpec aggregateSpecInstance = new AggregateSpec()
    .key(key)
    .op(op)
    .options(options);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)