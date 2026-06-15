# com.finbourne.sdk.services.lusid.model.ValuationPointResourceListOfAccountedTransaction
classname ValuationPointResourceListOfAccountedTransaction
ResourceList with extra header fields used by the various ValuationPoint endpoints for returning additional context related to the list of results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startValuationPoint** | [**DiaryEntry**](DiaryEntry.md) |  | [optional] [default to DiaryEntry]
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;AccountedTransaction&gt;**](AccountedTransaction.md) |  | [default to List<AccountedTransaction>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointResourceListOfAccountedTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

DiaryEntry startValuationPoint = new DiaryEntry();
Version version = new Version();
List<AccountedTransaction> values = new List<AccountedTransaction>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationPointResourceListOfAccountedTransaction valuationPointResourceListOfAccountedTransactionInstance = new ValuationPointResourceListOfAccountedTransaction()
    .startValuationPoint(startValuationPoint)
    .version(version)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)