# com.finbourne.sdk.services.lusid.model.AggregateSpec
classname AggregateSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**op** | **String** | Available values: Sum, DefaultSum, Proportion, Average, Count, Min, Max, Value, SumOfPositiveValues, SumOfNegativeValues, SumOfAbsoluteValues, ProportionOfAbsoluteValues, SumCumulativeInAdvance, SumCumulativeInArrears. | [default to String]
**options** | **Map&lt;String, Object&gt;** | Additional options to apply when performing computations. Options that do not apply to the Key will be  ignored. Option values can be boolean, numeric, string or date-time. | [optional] [default to Map<String, Object>]
**returnAs** | **String** | Optional client-chosen name for this metric. When supplied, the corresponding column in the returned  data is keyed by this name instead of the serialised address key (with options), letting callers  associate each requested metric with its result without reconstructing the key serialisation.  Names must be unique within a request, start with a letter and contain only letters, digits,  underscores or hyphens. When omitted, the column is keyed by the serialised address key as before. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.AggregateSpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String op = "example op";
@javax.annotation.Nullable Map<String, Object> options = new Map<String, Object>();
@javax.annotation.Nullable String returnAs = "example returnAs";


AggregateSpec aggregateSpecInstance = new AggregateSpec()
    .key(key)
    .op(op)
    .options(options)
    .returnAs(returnAs);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)