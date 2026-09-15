# com.finbourne.sdk.services.lusid.model.FlowConventionName
classname FlowConventionName
Representation of an abstract definition of a flow convention set consisting of currency, tenor and an index name (arbitrary string but likely something like \"IBOR\").

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency of the flow convention name. | [default to String]
**indexName** | **String** | The index, if present, that is required. e.g. \&quot;IBOR\&quot;, \&quot;OIS\&quot; or \&quot;SONIA\&quot;. | [optional] [default to String]
**tenor** | **String** | Tenor for the convention name.    For more information on tenors, see [Specifying tenors in LUSID](https://support.lusid.com/docs/specifying-tenors-in-lusid) | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.FlowConventionName;
import java.util.*;
import java.lang.System;
import java.net.URI;

String currency = "example currency";
@javax.annotation.Nullable String indexName = "example indexName";
String tenor = "example tenor";


FlowConventionName flowConventionNameInstance = new FlowConventionName()
    .currency(currency)
    .indexName(indexName)
    .tenor(tenor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)