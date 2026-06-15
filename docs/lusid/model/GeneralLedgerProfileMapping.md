# com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileMapping
classname GeneralLedgerProfileMapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mappingFilter** | **String** | The filter syntax for the Mapping filter. See https://support.lusid.com/knowledgebase/article/KA-02140 for more information on filter syntax | [default to String]
**levels** | **List&lt;String&gt;** | References fields and properties on the associated Journal Entry Line and graph of associated objects. | [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.GeneralLedgerProfileMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String mappingFilter = "example mappingFilter";
List<String> levels = new List<String>();


GeneralLedgerProfileMapping generalLedgerProfileMappingInstance = new GeneralLedgerProfileMapping()
    .mappingFilter(mappingFilter)
    .levels(levels);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)