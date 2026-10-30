# com.finbourne.sdk.services.luminesce.model.CustomMultiQueryRequest
classname CustomMultiQueryRequest
A caller-supplied set of queries to run in the background, as one multi-query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**executionId** | **String** | An explicit ExecutionId to use.  This must be blank OR assigned to a valid GUID-as-a-string. | [optional] [default to String]
**scalarParameters** | **Map&lt;String, String&gt;** | Scalar parameter values, handed to every query that runs (e.g. filling in &#x60;:someParameter:defaultValue&#x60; style references). At most 100, each named as an identifier of at most 256 characters, with a value of at most 4096. | [optional] [default to Map<String, String>]
**queries** | [**List&lt;CustomMultiQueryItem&gt;**](CustomMultiQueryItem.md) | The queries to run.  Those ready are started in the order given here (one still waiting on those it refers to does not hold up a later one), and each may only refer to queries earlier in the list. | [default to List<CustomMultiQueryItem>]
**queriesFromWorkspace** | **String** | A custom multi-query saved in the Workspaces API to take the queries from, rather than giving them in &#x60;Queries&#x60; (exactly one of which must be given), e.g. &#x60;shared/SomeWorkspace/items/sets/SomeSet&#x60;. What this request leaves unspecified of &#x60;maxInParallel&#x60;, &#x60;timeoutSeconds&#x60;, &#x60;keepForSeconds&#x60; and &#x60;queryName&#x60; is taken from it too, and its saved scalar parameter values are used for any this request does not give. It may instead be a Saved Query, e.g. &#x60;shared/SomeWorkspace/items/queries/SomeQuery&#x60;, run as the one query, named &#x60;Result&#x60;. | [optional] [default to String]
**maxInParallel** | **Integer** | Maximum number of the queries that may run concurrently.  Defaults to 1, meaning they run one after another. Explicitly null means as many as their dependencies allow. | [optional] [default to Integer]
**timeoutSeconds** | **Integer** | Maximum time each query may run for, in seconds, timed from when it starts: &lt;0 → ∞, 0 or null → 1200s (20m). There is no limit on the set as a whole.  Null (or absent) with &#x60;queriesFromWorkspace&#x60; is that saved with it. | [optional] [default to Integer]
**keepForSeconds** | **Integer** | Maximum time the results may be kept for, in seconds: &lt;0 → 1200 (20m), 0 or null → 28800 (8h), max &#x3D; 2,678,400 (31d). Null (or absent) with &#x60;queriesFromWorkspace&#x60; is that saved with it. | [optional] [default to Integer]
**executionFlags** | [**SqlExecutionFlags**](SqlExecutionFlags.md) |  | [optional] [default to SqlExecutionFlags]
**queryName** | **String** | A name for this set of queries.  This goes into logs and is returned when listing the sets of queries. | [optional] [default to String]
**export** | [**CustomMultiQueryExport**](CustomMultiQueryExport.md) |  | [optional] [default to CustomMultiQueryExport]

```java
import com.finbourne.sdk.services.luminesce.model.CustomMultiQueryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String executionId = "example executionId";
@javax.annotation.Nullable Map<String, String> scalarParameters = new Map<String, String>();
List<CustomMultiQueryItem> queries = new List<CustomMultiQueryItem>();
@javax.annotation.Nullable String queriesFromWorkspace = "example queriesFromWorkspace";
@javax.annotation.Nullable Integer maxInParallel = new Integer("100.00");
@javax.annotation.Nullable Integer timeoutSeconds = new Integer("100.00");
@javax.annotation.Nullable Integer keepForSeconds = new Integer("100.00");
SqlExecutionFlags @javax.annotation.Nullable String queryName = "example queryName";
CustomMultiQueryExport export = new CustomMultiQueryExport();


CustomMultiQueryRequest customMultiQueryRequestInstance = new CustomMultiQueryRequest()
    .executionId(executionId)
    .scalarParameters(scalarParameters)
    .queries(queries)
    .queriesFromWorkspace(queriesFromWorkspace)
    .maxInParallel(maxInParallel)
    .timeoutSeconds(timeoutSeconds)
    .keepForSeconds(keepForSeconds)
    .executionFlags(executionFlags)
    .queryName(queryName)
    .export(export);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)