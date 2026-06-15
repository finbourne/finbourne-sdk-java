# com.finbourne.sdk.services.configuration.model.ConfigurationSetSummary
classname ConfigurationSetSummary
A group of configuration items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the configuration set | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.ConfigurationSetSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
String type = "example type";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ConfigurationSetSummary configurationSetSummaryInstance = new ConfigurationSetSummary()
    .id(id)
    .type(type)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)