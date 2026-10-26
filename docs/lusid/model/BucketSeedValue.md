# com.finbourne.sdk.services.lusid.model.BucketSeedValue
classname BucketSeedValue
One bucket's seeded cumulative value, as stored.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The identifier of the seeded bucket. | [default to String]
**absoluteValue** | **java.math.BigDecimal** | The bucket&#39;s seeded cumulative value at the valuation point, in the fund currency. | [default to java.math.BigDecimal]
**perUnitValue** | **java.math.BigDecimal** | The per-unit value given with the seed, unrounded. Omitted where none was given, in which case the valuation point reads it off the share class&#39;s units in issue. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.BucketSeedValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String bucketId = "example bucketId";
java.math.BigDecimal absoluteValue = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal perUnitValue = new java.math.BigDecimal("100.00");


BucketSeedValue bucketSeedValueInstance = new BucketSeedValue()
    .bucketId(bucketId)
    .absoluteValue(absoluteValue)
    .perUnitValue(perUnitValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)