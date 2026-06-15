# com.finbourne.sdk.services.lusid.model.InputTransition
classname InputTransition
The input 'transition' within a corporate action, representing the singular input position

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unitsFactor** | **java.math.BigDecimal** | The factor to scale units by | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | The factor to scale cost by | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.InputTransition;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal unitsFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal costFactor = new java.math.BigDecimal("100.00");


InputTransition inputTransitionInstance = new InputTransition()
    .unitsFactor(unitsFactor)
    .costFactor(costFactor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)