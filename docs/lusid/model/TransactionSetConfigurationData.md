# com.finbourne.sdk.services.lusid.model.TransactionSetConfigurationData
classname TransactionSetConfigurationData
A collection of the data required to configure transaction types..

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionConfigs** | [**List&lt;TransactionConfigurationData&gt;**](TransactionConfigurationData.md) | Collection of transaction type models | [default to List<TransactionConfigurationData>]
**sideDefinitions** | [**List&lt;SideConfigurationData&gt;**](SideConfigurationData.md) | Collection of side definitions | [optional] [default to List<SideConfigurationData>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionSetConfigurationData;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TransactionConfigurationData> transactionConfigs = new List<TransactionConfigurationData>();
@javax.annotation.Nullable List<SideConfigurationData> sideDefinitions = new List<SideConfigurationData>();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionSetConfigurationData transactionSetConfigurationDataInstance = new TransactionSetConfigurationData()
    .transactionConfigs(transactionConfigs)
    .sideDefinitions(sideDefinitions)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)