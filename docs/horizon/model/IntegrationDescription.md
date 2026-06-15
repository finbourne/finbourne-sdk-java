# com.finbourne.sdk.services.horizon.model.IntegrationDescription
classname IntegrationDescription
Response containing the description of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Unique identifier of the integration e.g. \&quot;copp-clark\&quot;. | [default to String]
**name** | **String** | Readable name of the integration e.g. \&quot;Copp Clark\&quot;. | [default to String]
**description** | **String** | Describes the purpose of the integration. | [default to String]
**supportedTriggerTypes** | **List&lt;String&gt;** | Trigger types (Time, File) the integration supports. | [default to List<String>]
**licensed** | **Boolean** | True if your domain is licensed to use this integration, otherwise false. | [default to Boolean]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationDescription;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String name = "example name";
String description = "example description";
List<String> supportedTriggerTypes = new List<String>();
Boolean licensed = true;


IntegrationDescription integrationDescriptionInstance = new IntegrationDescription()
    .type(type)
    .name(name)
    .description(description)
    .supportedTriggerTypes(supportedTriggerTypes)
    .licensed(licensed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)