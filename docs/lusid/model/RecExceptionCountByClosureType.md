# com.finbourne.sdk.services.lusid.model.RecExceptionCountByClosureType
classname RecExceptionCountByClosureType
Closed exception result counts broken down by closure type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cleared** | **Integer** | The number of Cleared results. | [default to Integer]
**accepted** | **Integer** | The number of Accepted results. | [default to Integer]
**forceMatched** | **Integer** | The number of Force Matched results. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.RecExceptionCountByClosureType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer cleared = new Integer("100.00");
Integer accepted = new Integer("100.00");
Integer forceMatched = new Integer("100.00");


RecExceptionCountByClosureType recExceptionCountByClosureTypeInstance = new RecExceptionCountByClosureType()
    .cleared(cleared)
    .accepted(accepted)
    .forceMatched(forceMatched);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)