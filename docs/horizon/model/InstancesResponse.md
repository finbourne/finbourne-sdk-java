# com.finbourne.sdk.services.horizon.model.InstancesResponse
classname InstancesResponse
record containing a list of instances.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instances** | [**List&lt;InstanceResponse&gt;**](InstanceResponse.md) |  | [default to List<InstanceResponse>]

```java
import com.finbourne.sdk.services.horizon.model.InstancesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<InstanceResponse> instances = new List<InstanceResponse>();


InstancesResponse instancesResponseInstance = new InstancesResponse()
    .instances(instances);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)