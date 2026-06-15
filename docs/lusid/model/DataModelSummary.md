# com.finbourne.sdk.services.lusid.model.DataModelSummary
classname DataModelSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Custom Data Model. | [default to String]
**description** | **String** | A description for the Custom Data Model. | [optional] [default to String]
**entityType** | **String** | The entity type that the Custom Data Model binds to. | [default to String]
**type** | **String** | Either Root or Leaf or Intermediate. | [default to String]
**precedence** | **Integer** | Where in the hierarchy this model sits. | [default to Integer]
**parent** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**children** | [**List&lt;DataModelSummary&gt;**](DataModelSummary.md) | Child Custom Data Models that will inherit from this data model. | [default to List<DataModelSummary>]

```java
import com.finbourne.sdk.services.lusid.model.DataModelSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String entityType = "example entityType";
String type = "example type";
Integer precedence = new Integer("100.00");
ResourceId parent = new ResourceId();
List<DataModelSummary> children = new List<DataModelSummary>();


DataModelSummary dataModelSummaryInstance = new DataModelSummary()
    .id(id)
    .displayName(displayName)
    .description(description)
    .entityType(entityType)
    .type(type)
    .precedence(precedence)
    .parent(parent)
    .children(children);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)