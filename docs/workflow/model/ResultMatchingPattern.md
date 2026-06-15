# com.finbourne.sdk.services.workflow.model.ResultMatchingPattern
classname ResultMatchingPattern
Standard Finbourne filter to match against Run Worker results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** | Filter string | [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ResultMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

String filter = "example filter";


ResultMatchingPattern resultMatchingPatternInstance = new ResultMatchingPattern()
    .filter(filter);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)