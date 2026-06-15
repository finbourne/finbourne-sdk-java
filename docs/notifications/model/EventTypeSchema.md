# com.finbourne.sdk.services.notifications.model.EventTypeSchema
classname EventTypeSchema
An EventType object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the event type | [optional] [default to String]
**displayName** | **String** | Identifier name of the event | [optional] [default to String]
**description** | **String** | The summary of the event | [optional] [default to String]
**application** | **String** | The application associated with the event | [optional] [default to String]
**headerSchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The header schema for the event type | [optional] [readonly] [default to List<EventFieldDefinition>]
**bodySchema** | [**List&lt;EventFieldDefinition&gt;**](EventFieldDefinition.md) | The body schema for the event type | [optional] [readonly] [default to List<EventFieldDefinition>]
**href** | [**URI**](URI.md) | A URI for retrieving this schema | [optional] [default to URI]

```java
import com.finbourne.sdk.services.notifications.model.EventTypeSchema;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String id = "example id";
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String application = "example application";
@javax.annotation.Nullable List<EventFieldDefinition> headerSchema = new List<EventFieldDefinition>();
@javax.annotation.Nullable List<EventFieldDefinition> bodySchema = new List<EventFieldDefinition>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");


EventTypeSchema eventTypeSchemaInstance = new EventTypeSchema()
    .id(id)
    .displayName(displayName)
    .description(description)
    .application(application)
    .headerSchema(headerSchema)
    .bodySchema(bodySchema)
    .href(href);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)