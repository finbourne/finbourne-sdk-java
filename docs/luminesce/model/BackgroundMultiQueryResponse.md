# com.finbourne.sdk.services.luminesce.model.BackgroundMultiQueryResponse
classname BackgroundMultiQueryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | [**UUID**](UUID.md) |  | [optional] [readonly] [default to UUID]
**progress** | [**Link**](Link.md) |  | [optional] [default to Link]
**cancel** | [**Link**](Link.md) |  | [optional] [default to Link]
**fetchJson** | [**List&lt;Link&gt;**](Link.md) | Json (as a string) data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchJsonProper** | [**List&lt;Link&gt;**](Link.md) | Json-proper data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchJsonProperWithLineage** | [**List&lt;Link&gt;**](Link.md) | Json-proper-with-lineage data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchXml** | [**List&lt;Link&gt;**](Link.md) | Xml data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchParquet** | [**List&lt;Link&gt;**](Link.md) | Parquet data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchCsv** | [**List&lt;Link&gt;**](Link.md) | CSV data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchPipe** | [**List&lt;Link&gt;**](Link.md) | Pipe delimited data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchExcel** | [**List&lt;Link&gt;**](Link.md) | Excel workbook data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**fetchSqlite** | [**List&lt;Link&gt;**](Link.md) | SqLite DB data request links for all of the child queries | [optional] [readonly] [default to List<Link>]
**histogram** | [**List&lt;Link&gt;**](Link.md) | Histogram links for all of the child queries | [optional] [readonly] [default to List<Link>]

```java
import com.finbourne.sdk.services.luminesce.model.BackgroundMultiQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

UUID executionId = "example executionId";
Link progress = new Link();
Link cancel = new Link();
@javax.annotation.Nullable List<Link> fetchJson = new List<Link>();
@javax.annotation.Nullable List<Link> fetchJsonProper = new List<Link>();
@javax.annotation.Nullable List<Link> fetchJsonProperWithLineage = new List<Link>();
@javax.annotation.Nullable List<Link> fetchXml = new List<Link>();
@javax.annotation.Nullable List<Link> fetchParquet = new List<Link>();
@javax.annotation.Nullable List<Link> fetchCsv = new List<Link>();
@javax.annotation.Nullable List<Link> fetchPipe = new List<Link>();
@javax.annotation.Nullable List<Link> fetchExcel = new List<Link>();
@javax.annotation.Nullable List<Link> fetchSqlite = new List<Link>();
@javax.annotation.Nullable List<Link> histogram = new List<Link>();


BackgroundMultiQueryResponse backgroundMultiQueryResponseInstance = new BackgroundMultiQueryResponse()
    .executionId(executionId)
    .progress(progress)
    .cancel(cancel)
    .fetchJson(fetchJson)
    .fetchJsonProper(fetchJsonProper)
    .fetchJsonProperWithLineage(fetchJsonProperWithLineage)
    .fetchXml(fetchXml)
    .fetchParquet(fetchParquet)
    .fetchCsv(fetchCsv)
    .fetchPipe(fetchPipe)
    .fetchExcel(fetchExcel)
    .fetchSqlite(fetchSqlite)
    .histogram(histogram);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)