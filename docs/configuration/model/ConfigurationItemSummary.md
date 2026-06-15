# com.finbourne.sdk.services.configuration.model.ConfigurationItemSummary
classname ConfigurationItemSummary
A single configuration object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key which identifies the configuration item | [default to String]
**value** | **String** | The value of the configuration item | [default to String]
**valueType** | **String** | The type of the configuration item&#39;s value | [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret. | [default to Boolean]
**ref** | **String** | The reference to the configuration item | [readonly] [default to String]
**blockReveal** | **Boolean** | Defines whether the value is blocked with non-internal request. | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.configuration.model.ConfigurationItemSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
String value = "example value";
String valueType = "example valueType";
Boolean isSecret = true;
String ref = "example ref";
Boolean blockReveal = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


ConfigurationItemSummary configurationItemSummaryInstance = new ConfigurationItemSummary()
    .key(key)
    .value(value)
    .valueType(valueType)
    .isSecret(isSecret)
    .ref(ref)
    .blockReveal(blockReveal)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)