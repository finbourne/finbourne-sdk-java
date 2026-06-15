# com.finbourne.sdk.services.lusid.model.UpsertResourceRecordRequest
classname UpsertResourceRecordRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploymentScope** | **String** |  | [default to String]
**deploymentCode** | **String** |  | [default to String]
**resourceId** | **String** |  | [default to String]
**format** | **String** |  | [default to String]
**resourceType** | **String** |  | [default to String]
**resourceState** | **Object** |  | [default to Object]
**dependencies** | **List&lt;String&gt;** |  | [default to List<String>]
**trackingState** | **Object** |  | [optional] [default to Object]

```java
import com.finbourne.sdk.services.lusid.model.UpsertResourceRecordRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String deploymentScope = "example deploymentScope";
String deploymentCode = "example deploymentCode";
String resourceId = "example resourceId";
String format = "example format";
String resourceType = "example resourceType";
@javax.annotation.Nullable Object List<String> dependencies = new List<String>();
@javax.annotation.Nullable Object 

UpsertResourceRecordRequest upsertResourceRecordRequestInstance = new UpsertResourceRecordRequest()
    .deploymentScope(deploymentScope)
    .deploymentCode(deploymentCode)
    .resourceId(resourceId)
    .format(format)
    .resourceType(resourceType)
    .resourceState(resourceState)
    .dependencies(dependencies)
    .trackingState(trackingState);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)