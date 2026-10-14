# com.finbourne.sdk.services.luminesce.model.CustomMultiQueryRequest
classname CustomMultiQueryRequest
A caller-supplied set of queries to run in the background, as one multi-query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | An explicit ExecutionId to use.  This must be blank OR assigned to a valid GUID-as-a-string. | [optional] [default to String]
**scalarParameters** | **Map&lt;String, String&gt;** | Scalar parameter values, handed to every query that runs (e.g. filling in &#x60;:someParameter:defaultValue&#x60; style references). At most 100, each named as an identifier of at most 256 characters, with a value of at most 4096. | [optional] [default to Map<String, String>]
**queries** | [**List&lt;CustomMultiQueryItem&gt;**](CustomMultiQueryItem.md) | The queries to run.  Those ready are started in the order given here (one still waiting on those it refers to does not hold up a later one), and each may only refer to queries earlier in the list. | [default to List<CustomMultiQueryItem>]
**maxInParallel** | **Integer** | Maximum number of the queries that may run concurrently.  Defaults to 1, meaning they run one after another. Explicitly null means as many as their dependencies allow. | [optional] [default to Integer]
**timeoutSeconds** | **Integer** | Maximum time each query may run for, in seconds, timed from when it starts: &lt;0 → ∞, 0 → 1200s (20m). There is no limit on the set as a whole. | [optional] [default to Integer]
**keepForSeconds** | **Integer** | Maximum time the results may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) | [optional] [default to Integer]
**queryName** | **String** | A name for this set of queries.  This goes into logs and is returned when listing the sets of queries. | [optional] [default to String]

```java
import com.finbourne.sdk.services.luminesce.model.CustomMultiQueryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String executionId = "example executionId";
@javax.annotation.Nullable Map<String, String> scalarParameters = new Map<String, String>();
List<CustomMultiQueryItem> queries = new List<CustomMultiQueryItem>();
@javax.annotation.Nullable Integer maxInParallel = new Integer("100.00");
Integer timeoutSeconds = new Integer("100.00");
Integer keepForSeconds = new Integer("100.00");
@javax.annotation.Nullable String queryName = "example queryName";


CustomMultiQueryRequest customMultiQueryRequestInstance = new CustomMultiQueryRequest()
    .executionId(executionId)
    .scalarParameters(scalarParameters)
    .queries(queries)
    .maxInParallel(maxInParallel)
    .timeoutSeconds(timeoutSeconds)
    .keepForSeconds(keepForSeconds)
    .queryName(queryName);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)