# com.finbourne.sdk.services.scheduler.model.RequiredResources
classname RequiredResources
Information related to a jobs required access to resources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidApis** | **List&lt;String&gt;** | List of LUSID APIs the job needs access to | [optional] [default to List<String>]
**lusidFileSystem** | **List&lt;String&gt;** | List of S3 bucket or folder names that the job can access | [optional] [default to List<String>]
**externalCalls** | **List&lt;String&gt;** | External URLs that the job can call | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.scheduler.model.RequiredResources;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable List<String> lusidApis = new List<String>();
@javax.annotation.Nullable List<String> lusidFileSystem = new List<String>();
@javax.annotation.Nullable List<String> externalCalls = new List<String>();


RequiredResources requiredResourcesInstance = new RequiredResources()
    .lusidApis(lusidApis)
    .lusidFileSystem(lusidFileSystem)
    .externalCalls(externalCalls);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)