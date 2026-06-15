# com.finbourne.sdk.services.lusid.model.Alias
classname Alias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The property key, identifier type, or field to be replaced by an alias. | [default to String]
**attributeAlias** | **String** | The alias to replace the property key, identifier type, or field on the bound entity. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.Alias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String attributeName = "example attributeName";
String attributeAlias = "example attributeAlias";


Alias aliasInstance = new Alias()
    .attributeName(attributeName)
    .attributeAlias(attributeAlias);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)