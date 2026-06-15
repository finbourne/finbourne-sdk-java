# com.finbourne.sdk.services.lusid.model.RequestedChanges
classname RequestedChanges

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeCount** | **Integer** | Number of attributes staged change applies to | [optional] [default to Integer]
**attributeNames** | **List&lt;String&gt;** | Names of the attributes the staged change applies to. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.RequestedChanges;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer attributeCount = new Integer("100.00");
@javax.annotation.Nullable List<String> attributeNames = new List<String>();


RequestedChanges requestedChangesInstance = new RequestedChanges()
    .attributeCount(attributeCount)
    .attributeNames(attributeNames);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)