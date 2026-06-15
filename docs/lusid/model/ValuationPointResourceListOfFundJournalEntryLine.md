# com.finbourne.sdk.services.lusid.model.ValuationPointResourceListOfFundJournalEntryLine
classname ValuationPointResourceListOfFundJournalEntryLine
ResourceList with extra header fields used by the various ValuationPoint endpoints for returning additional context related to the list of results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startValuationPoint** | [**DiaryEntry**](DiaryEntry.md) |  | [optional] [default to DiaryEntry]
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;FundJournalEntryLine&gt;**](FundJournalEntryLine.md) |  | [default to List<FundJournalEntryLine>]
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**nextPage** | **String** |  | [optional] [default to String]
**previousPage** | **String** |  | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.ValuationPointResourceListOfFundJournalEntryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

DiaryEntry startValuationPoint = new DiaryEntry();
Version version = new Version();
List<FundJournalEntryLine> values = new List<FundJournalEntryLine>();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
@javax.annotation.Nullable String nextPage = "example nextPage";
@javax.annotation.Nullable String previousPage = "example previousPage";
@javax.annotation.Nullable List<Link> links = new List<Link>();


ValuationPointResourceListOfFundJournalEntryLine valuationPointResourceListOfFundJournalEntryLineInstance = new ValuationPointResourceListOfFundJournalEntryLine()
    .startValuationPoint(startValuationPoint)
    .version(version)
    .values(values)
    .href(href)
    .nextPage(nextPage)
    .previousPage(previousPage)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)