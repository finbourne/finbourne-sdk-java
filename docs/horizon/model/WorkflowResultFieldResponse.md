# com.finbourne.sdk.services.horizon.model.WorkflowResultFieldResponse
classname WorkflowResultFieldResponse
A single declared field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | [default to String]
**type** | **String** | One of the Workflow field types: String, Decimal, DateTime, Boolean, LusidUserId. | [default to String]
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.horizon.model.WorkflowResultFieldResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

String name = "example name";
String type = "example type";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";


WorkflowResultFieldResponse workflowResultFieldResponseInstance = new WorkflowResultFieldResponse()
    .name(name)
    .type(type)
    .displayName(displayName)
    .description(description);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)