# com.finbourne.sdk.services.lusid.model.TransactionTemplate
classname TransactionTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | A value that represents the instrument type. | [default to String]
**instrumentEventType** | **String** | A value that represents the instrument event type. | [default to String]
**description** | **String** | The description of the transaction template. | [default to String]
**scope** | **String** | The scope in which the transaction template resides. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the template to be created. | [default to List<ComponentTransaction>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

String instrumentType = "example instrumentType";
String instrumentEventType = "example instrumentEventType";
String description = "example description";
String scope = "example scope";
List<ComponentTransaction> componentTransactions = new List<ComponentTransaction>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionTemplate transactionTemplateInstance = new TransactionTemplate()
    .instrumentType(instrumentType)
    .instrumentEventType(instrumentEventType)
    .description(description)
    .scope(scope)
    .componentTransactions(componentTransactions)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)