# com.finbourne.sdk.services.lusid.model.SetTransactionConfigurationAlias
classname SetTransactionConfigurationAlias

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  | [default to String]
**description** | **String** |  | [default to String]
**transactionClass** | **String** |  | [default to String]
**transactionRole** | **String** | Available values: None, LongLonger, LongShorter, ShortShorter, Shorter, ShortLonger, Longer, AllRoles. | [default to String]
**isDefault** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.SetTransactionConfigurationAlias;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
String description = "example description";
String transactionClass = "example transactionClass";
String transactionRole = "example transactionRole";
Boolean isDefault = true;


SetTransactionConfigurationAlias setTransactionConfigurationAliasInstance = new SetTransactionConfigurationAlias()
    .type(type)
    .description(description)
    .transactionClass(transactionClass)
    .transactionRole(transactionRole)
    .isDefault(isDefault);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)