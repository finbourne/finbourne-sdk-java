# com.finbourne.sdk.services.luminesce.model.InlinedPropertyDesign
classname InlinedPropertyDesign
Representation of a set of inlined properties for a given provider so that SQL can be generated to be able to inline properties into luminesce

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**providerName** | **String** | The provider name for which these properties are to be inlined | [optional] [default to String]
**providerNameExtension** | **String** | The provider extension name for extended providers | [optional] [default to String]
**inlinedPropertyItems** | [**List&lt;InlinedPropertyItem&gt;**](InlinedPropertyItem.md) | Collection of Inlined properties | [optional] [default to List<InlinedPropertyItem>]

```java
import com.finbourne.sdk.services.luminesce.model.InlinedPropertyDesign;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String providerName = "example providerName";
@javax.annotation.Nullable String providerNameExtension = "example providerNameExtension";
@javax.annotation.Nullable List<InlinedPropertyItem> inlinedPropertyItems = new List<InlinedPropertyItem>();


InlinedPropertyDesign inlinedPropertyDesignInstance = new InlinedPropertyDesign()
    .providerName(providerName)
    .providerNameExtension(providerNameExtension)
    .inlinedPropertyItems(inlinedPropertyItems);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)