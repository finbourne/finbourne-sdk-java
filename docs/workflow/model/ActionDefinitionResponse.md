# com.finbourne.sdk.services.workflow.model.ActionDefinitionResponse
classname ActionDefinitionResponse
Defines the Actions for a Task in a read-only form

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The Name of this Action | [optional] [default to String]
**runAsUserId** | **String** | The ID of the user that this action will be performed by. If not specified, the actions will be performed by the \&quot;current user\&quot;. | [optional] [default to String]
**actionDetails** | [**ActionDetailsResponse**](ActionDetailsResponse.md) |  | [optional] [default to ActionDetailsResponse]
**displayName** | **String** | Schema for the Action | [optional] [default to String]
**description** | **String** | Schema for the Action | [optional] [default to String]
**category** | **String** | Schema for the Action | [optional] [default to String]

```java
import com.finbourne.sdk.services.workflow.model.ActionDefinitionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable String runAsUserId = "example runAsUserId";
ActionDetailsResponse actionDetails = new ActionDetailsResponse();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String category = "example category";


ActionDefinitionResponse actionDefinitionResponseInstance = new ActionDefinitionResponse()
    .name(name)
    .runAsUserId(runAsUserId)
    .actionDetails(actionDetails)
    .displayName(displayName)
    .description(description)
    .category(category);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)