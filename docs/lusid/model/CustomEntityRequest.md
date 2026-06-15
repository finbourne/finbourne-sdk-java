# com.finbourne.sdk.services.lusid.model.CustomEntityRequest
classname CustomEntityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | A display label for the custom entity. | [default to String]
**description** | **String** | A description of the custom entity. | [default to String]
**identifiers** | [**List&lt;CustomEntityId&gt;**](CustomEntityId.md) | The identifiers the custom entity will be upserted with. | [default to List<CustomEntityId>]
**fields** | [**List&lt;CustomEntityField&gt;**](CustomEntityField.md) | The fields that decorate the custom entity. | [optional] [default to List<CustomEntityField>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties that decorate the custom entity. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.sdk.services.lusid.model.CustomEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
String description = "example description";
List<CustomEntityId> identifiers = new List<CustomEntityId>();
@javax.annotation.Nullable List<CustomEntityField> fields = new List<CustomEntityField>();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();


CustomEntityRequest customEntityRequestInstance = new CustomEntityRequest()
    .displayName(displayName)
    .description(description)
    .identifiers(identifiers)
    .fields(fields)
    .properties(properties);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)