# com.finbourne.sdk.services.horizon.model.LusidPropertyDefinition
classname LusidPropertyDefinition
Defines the information in a LUSID Property Definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** |  | [readonly] [default to String]
**productEntityItemKey** | **String** | Property key associated with the mapping | [default to String]
**domain** | **String** | The domain of this definition. | [default to String]
**scope** | **String** | The scope of this definition. | [default to String]
**code** | **String** | The code of this definition. | [default to String]
**displayName** | **String** | The name used when this definition is displayed. | [default to String]
**dataTypeId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**description** | **String** |  | [default to String]
**lifetime** | **String** |  | [default to String]
**constraintStyle** | **String** |  | [default to String]

```java
import com.finbourne.sdk.services.horizon.model.LusidPropertyDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String productEntityItemKey = "example productEntityItemKey";
String domain = "example domain";
String scope = "example scope";
String code = "example code";
String displayName = "example displayName";
ResourceId dataTypeId = new ResourceId();
String description = "example description";
String lifetime = "example lifetime";
String constraintStyle = "example constraintStyle";


LusidPropertyDefinition lusidPropertyDefinitionInstance = new LusidPropertyDefinition()
    .key(key)
    .productEntityItemKey(productEntityItemKey)
    .domain(domain)
    .scope(scope)
    .code(code)
    .displayName(displayName)
    .dataTypeId(dataTypeId)
    .description(description)
    .lifetime(lifetime)
    .constraintStyle(constraintStyle);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)