# com.finbourne.sdk.services.luminesce.model.InlinedPropertyItem
classname InlinedPropertyItem
Information about a inlined property so that decorated properties can be inlined into luminesce

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | Key of the property | [default to String]
**name** | **String** | Name of the property | [optional] [default to String]
**isMain** | **Boolean** | Is Main indicator for the property | [optional] [default to Boolean]
**description** | **String** | Description of the property | [optional] [default to String]
**dataType** | **String** | Data type of the property | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.InlinedPropertyItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String key = "example key";
@javax.annotation.Nullable String name = "example name";
Boolean isMain = true;
@javax.annotation.Nullable String description = "example description";
@javax.annotation.Nullable String dataType = "example dataType";


InlinedPropertyItem inlinedPropertyItemInstance = new InlinedPropertyItem()
    .key(key)
    .name(name)
    .isMain(isMain)
    .description(description)
    .dataType(dataType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)