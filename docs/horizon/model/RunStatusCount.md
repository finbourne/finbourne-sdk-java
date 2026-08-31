# com.finbourne.sdk.services.horizon.model.RunStatusCount
classname RunStatusCount
record containing the count of runs for a given status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** |  | [default to String]
**count** | **Integer** |  | [default to Integer]

```java
import com.finbourne.sdk.services.horizon.model.RunStatusCount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String status = "example status";
Integer count = new Integer("100.00");


RunStatusCount runStatusCountInstance = new RunStatusCount()
    .status(status)
    .count(count);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)