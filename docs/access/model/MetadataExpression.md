# com.finbourne.sdk.services.access.model.MetadataExpression
classname MetadataExpression

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataKey** | **String** |  | [default to String]
**operator** | [**Operator**](Operator.md) |  | [default to Operator]
**textValue** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.access.model.MetadataExpression;
import java.util.*;
import java.lang.System;
import java.net.URI;

String metadataKey = "example metadataKey";
Operator @javax.annotation.Nullable String textValue = "example textValue";


MetadataExpression metadataExpressionInstance = new MetadataExpression()
    .metadataKey(metadataKey)
    .operator(operator)
    .textValue(textValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)