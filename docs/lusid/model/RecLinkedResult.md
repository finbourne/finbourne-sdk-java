# com.finbourne.sdk.services.lusid.model.RecLinkedResult
classname RecLinkedResult
A rec result of a different rec type in the same rec instance whose items share an identifier with this  result's items, and the keys that established the link. Links are symmetric: the linked result carries one back.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the linked result within the same run, as carried in that result&#39;s own id field, e.g. &#39;break-3&#39;. With recType, names the result uniquely. | [default to String]
**recType** | **String** | The rec type of the linked result. Always differs from this result&#39;s rec type. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**linkedBy** | [**RecLinkedBy**](RecLinkedBy.md) |  | [default to RecLinkedBy]

```java
import com.finbourne.sdk.services.lusid.model.RecLinkedResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String id = "example id";
String recType = "example recType";
RecLinkedBy linkedBy = new RecLinkedBy();


RecLinkedResult recLinkedResultInstance = new RecLinkedResult()
    .id(id)
    .recType(recType)
    .linkedBy(linkedBy);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)