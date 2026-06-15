# com.finbourne.sdk.services.configuration.model.CreateConfigurationItem
classname CreateConfigurationItem
The information required to create a configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the new configuration item | [default to String]
**value** | **String** | The value of the new configuration item              The maximum size for secrets is 4KB and for text values is 2MB | [default to String]
**valueType** | **String** | The type (text, number, boolean, textCollection, numberCollection) of the new configuration item&#39;s value. The validation for each type is as follows: - text: any value - number: double (e.g. \&quot;5.5\&quot;) - boolean: true/false - textCollection: comma separated list (e.g. \&quot;a,b,c\&quot;) - numberCollection: comma separated list of doubles (e.g. \&quot;1,2,3\&quot;) | [optional] [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret | [default to Boolean]
**description** | **String** | The description of the new configuration item | [optional] [default to String]
**blockReveal** | **Boolean** | A property to indicate if revealing the value is blocked. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.configuration.model.CreateConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String value = "example value";
@javax.annotation.Nullable String valueType = "example valueType";
Boolean isSecret = true;
@javax.annotation.Nullable String description = "example description";
Boolean blockReveal = true;


CreateConfigurationItem createConfigurationItemInstance = new CreateConfigurationItem()
    .key(key)
    .value(value)
    .valueType(valueType)
    .isSecret(isSecret)
    .description(description)
    .blockReveal(blockReveal);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)