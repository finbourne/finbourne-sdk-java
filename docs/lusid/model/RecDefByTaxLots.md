# com.finbourne.sdk.services.lusid.model.RecDefByTaxLots
classname RecDefByTaxLots
Per-side tax-lot granularity for a Holding entry of a rec definition's rulesets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **Boolean** | Whether the left side splits holdings by tax lot. Must be omitted when the left side is relational, and reads as null there. | [optional] [default to Boolean]
**right** | **Boolean** | Whether the right side splits holdings by tax lot. Must be omitted when the right side is relational, and reads as null there. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.RecDefByTaxLots;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Boolean left = true;
@javax.annotation.Nullable Boolean right = true;


RecDefByTaxLots recDefByTaxLotsInstance = new RecDefByTaxLots()
    .left(left)
    .right(right);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)