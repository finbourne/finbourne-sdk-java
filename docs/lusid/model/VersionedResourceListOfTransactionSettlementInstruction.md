# com.finbourne.sdk.services.lusid.model.VersionedResourceListOfTransactionSettlementInstruction
classname VersionedResourceListOfTransactionSettlementInstruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) |  | [default to List<TransactionSettlementInstruction>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.VersionedResourceListOfTransactionSettlementInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version version = new Version();
List<TransactionSettlementInstruction> values = new List<TransactionSettlementInstruction>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


VersionedResourceListOfTransactionSettlementInstruction versionedResourceListOfTransactionSettlementInstructionInstance = new VersionedResourceListOfTransactionSettlementInstruction()
    .version(version)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)