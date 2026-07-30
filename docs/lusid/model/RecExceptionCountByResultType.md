# com.finbourne.sdk.services.lusid.model.RecExceptionCountByResultType
classname RecExceptionCountByResultType
Exception result counts broken down by result type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_break** | **Integer** | The number of Break results. | [default to Integer]
**partialMatch** | **Integer** | The number of Partial Match results. | [default to Integer]
**partialCross** | **Integer** | The number of Partial Cross results. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.RecExceptionCountByResultType;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer break = new Integer("100.00");
Integer partialMatch = new Integer("100.00");
Integer partialCross = new Integer("100.00");


RecExceptionCountByResultType recExceptionCountByResultTypeInstance = new RecExceptionCountByResultType()
    .break(break)
    .partialMatch(partialMatch)
    .partialCross(partialCross);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)