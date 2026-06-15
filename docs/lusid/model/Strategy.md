# com.finbourne.sdk.services.lusid.model.Strategy
classname Strategy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keys** | [**List&lt;PerpetualProperty&gt;**](PerpetualProperty.md) |  | [default to List<PerpetualProperty>]
**valueType** | **String** | Available values: Units, Weight. | [default to String]
**value** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.Strategy;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<PerpetualProperty> keys = new List<PerpetualProperty>();
String valueType = "example valueType";
java.math.BigDecimal value = new java.math.BigDecimal("100.00");


Strategy strategyInstance = new Strategy()
    .keys(keys)
    .valueType(valueType)
    .value(value);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)