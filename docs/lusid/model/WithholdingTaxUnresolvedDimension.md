# com.finbourne.sdk.services.lusid.model.WithholdingTaxUnresolvedDimension
classname WithholdingTaxUnresolvedDimension

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readFrom** | **List&lt;String&gt;** | What booking reads the dimension from: Transaction, Portfolio or Fund. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.WithholdingTaxUnresolvedDimension;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> readFrom = new List<String>();


WithholdingTaxUnresolvedDimension withholdingTaxUnresolvedDimensionInstance = new WithholdingTaxUnresolvedDimension()
    .readFrom(readFrom);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)