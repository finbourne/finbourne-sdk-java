# com.finbourne.sdk.services.horizon.model.IntegrationPropertyConfiguration
classname IntegrationPropertyConfiguration
Response containing the description of an integration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The Integration this property configuration applies to | [default to String]
**properties** | [**List&lt;PropertyMapping&gt;**](PropertyMapping.md) | The mandatory and optional properties available in this integration | [default to List<PropertyMapping>]
**fields** | [**List&lt;FieldMapping&gt;**](FieldMapping.md) | The fields available in this integration | [default to List<FieldMapping>]

```java
import com.finbourne.sdk.services.horizon.model.IntegrationPropertyConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
List<PropertyMapping> properties = new List<PropertyMapping>();
List<FieldMapping> fields = new List<FieldMapping>();


IntegrationPropertyConfiguration integrationPropertyConfigurationInstance = new IntegrationPropertyConfiguration()
    .type(type)
    .properties(properties)
    .fields(fields);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)