# com.finbourne.sdk.services.lusid.model.BucketAmounts
classname BucketAmounts
An amount in the payment currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**local** | **java.math.BigDecimal** | The amount in the payment currency. | [optional] [default to java.math.BigDecimal]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.BucketAmounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal local = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable List<Link> links = new List<Link>();


BucketAmounts bucketAmountsInstance = new BucketAmounts()
    .local(local)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)