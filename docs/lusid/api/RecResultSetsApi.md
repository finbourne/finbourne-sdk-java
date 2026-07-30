# RecResultSetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRecResultSetApprovalDecision**](RecResultSetsApi.md#addRecResultSetApprovalDecision) | **POST** /api/api/recs/resultsets/{entityUniqueId}/$decide | [EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision |
| [**getRecResultSet**](RecResultSetsApi.md#getRecResultSet) | **GET** /api/api/recs/resultsets/{entityUniqueId} | [EXPERIMENTAL] GetRecResultSet: GetRecResultSet |
| [**listRecResultSets**](RecResultSetsApi.md#listRecResultSets) | **GET** /api/api/recs/resultsets | [EXPERIMENTAL] ListRecResultSets: ListRecResultSets |
| [**submitRecResultSetReview**](RecResultSetsApi.md#submitRecResultSetReview) | **POST** /api/api/recs/resultsets/{entityUniqueId}/$submit | [EXPERIMENTAL] SubmitRecResultSetReview: Submit a rec result set review for approval, or resubmit after addressing requested revisions. |



## addRecResultSetApprovalDecision

> RecResultSet addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest)

[EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision

Add an approver decision (approve or request revisions) to a rec result set.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecResultSetsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecResultSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecResultSetsApi apiInstance = apiFactory.build(RecResultSetsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        RecResultSetApprovalDecisionRequest recResultSetApprovalDecisionRequest = new RecResultSetApprovalDecisionRequest(); // RecResultSetApprovalDecisionRequest | The approval decision request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute(opts);

            RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecResultSetsApi#addRecResultSetApprovalDecision");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **recResultSetApprovalDecisionRequest** | [**RecResultSetApprovalDecisionRequest**](RecResultSetApprovalDecisionRequest.md)| The approval decision request. | |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getRecResultSet

> RecResultSet getRecResultSet(entityUniqueId, asAt, includePreviousRuns)

[EXPERIMENTAL] GetRecResultSet: GetRecResultSet

Retrieve a single rec result set by its entity unique id.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecResultSetsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecResultSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecResultSetsApi apiInstance = apiFactory.build(RecResultSetsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the result set. Defaults to latest if not specified.
        Boolean includePreviousRuns = false; // Boolean | When true, the previousRuns array is populated with prior run snapshots. Defaults to false.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute(opts);

            RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecResultSetsApi#getRecResultSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the result set. Defaults to latest if not specified. | [optional] |
| **includePreviousRuns** | **Boolean**| When true, the previousRuns array is populated with prior run snapshots. Defaults to false. | [optional] [default to false] |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listRecResultSets

> PagedResourceListOfRecResultSet listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy)

[EXPERIMENTAL] ListRecResultSets: ListRecResultSets

List rec result sets.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecResultSetsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecResultSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecResultSetsApi apiInstance = apiFactory.build(RecResultSetsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list result sets. Defaults to latest if not specified.
        Boolean includePreviousRuns = false; // Boolean | When true, each item's previousRuns array is populated with prior run snapshots. Defaults to false.
        String page = "page_example"; // String | The pagination token to use to continue listing result sets from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRecResultSet result = apiInstance.listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfRecResultSet result = apiInstance.listRecResultSets(asAt, includePreviousRuns, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecResultSetsApi#listRecResultSets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list result sets. Defaults to latest if not specified. | [optional] |
| **includePreviousRuns** | **Boolean**| When true, each item&#39;s previousRuns array is populated with prior run snapshots. Defaults to false. | [optional] [default to false] |
| **page** | **String**| The pagination token to use to continue listing result sets from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfRecResultSet**](PagedResourceListOfRecResultSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec result sets. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## submitRecResultSetReview

> RecResultSet submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest)

[EXPERIMENTAL] SubmitRecResultSetReview: Submit a rec result set review for approval, or resubmit after addressing requested revisions.

Submit a rec result set review for approval, or resubmit after addressing requested revisions.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecResultSetsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecResultSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecResultSetsApi apiInstance = apiFactory.build(RecResultSetsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        SubmitRecResultSetReviewRequest submitRecResultSetReviewRequest = new SubmitRecResultSetReviewRequest(); // SubmitRecResultSetReviewRequest | The submission request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute(opts);

            RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecResultSetsApi#submitRecResultSetReview");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entityUniqueId** | **String**| The entity unique id of the rec result set (its version.entityUniqueId). | |
| **submitRecResultSetReviewRequest** | [**SubmitRecResultSetReviewRequest**](SubmitRecResultSetReviewRequest.md)| The submission request. | |

### Return type

[**RecResultSet**](RecResultSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated rec result set. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
