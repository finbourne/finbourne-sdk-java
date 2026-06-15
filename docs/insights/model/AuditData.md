# com.finbourne.sdk.services.insights.model.AuditData
classname AuditData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  | [default to String]
**category** | **String** |  | [default to String]
**userId** | **String** |  | [optional] [default to String]
**message** | **String** |  | [optional] [default to String]
**resource** | [**Resource**](Resource.md) |  | [optional] [default to Resource]
**detailsType** | **String** |  | [optional] [default to String]
**details** | **Object** |  | [optional] [default to Object]

```java
import com.finbourne.sdk.services.insights.model.AuditData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String action = "example action";
String category = "example category";
@javax.annotation.Nullable String userId = "example userId";
@javax.annotation.Nullable String message = "example message";
Resource resource = new Resource();
@javax.annotation.Nullable String detailsType = "example detailsType";
@javax.annotation.Nullable Object 

AuditData auditDataInstance = new AuditData()
    .action(action)
    .category(category)
    .userId(userId)
    .message(message)
    .resource(resource)
    .detailsType(detailsType)
    .details(details);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)