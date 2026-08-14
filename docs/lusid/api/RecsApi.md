# RecsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRecResultSetApprovalDecision**](RecsApi.md#addRecResultSetApprovalDecision) | **POST** /api/api/recs/resultsets/{entityUniqueId}/$decide | [EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision |
| [**batchManageRecResultComments**](RecsApi.md#batchManageRecResultComments) | **POST** /api/api/recs/results/$batchManageComments | [EXPERIMENTAL] BatchManageRecResultComments: BatchManageRecResultComments |
| [**batchReviewRecResults**](RecsApi.md#batchReviewRecResults) | **POST** /api/api/recs/results/$batchReview | [EXPERIMENTAL] BatchReviewRecResults: BatchReviewRecResults |
| [**getRecInstance**](RecsApi.md#getRecInstance) | **GET** /api/api/recs/instances/{instanceIdType}/{instanceIdValue} | [EXPERIMENTAL] GetRecInstance: GetRecInstance |
| [**getRecResult**](RecsApi.md#getRecResult) | **GET** /api/api/recs/results/{id} | [EXPERIMENTAL] GetRecResult: GetRecResult |
| [**getRecResultSet**](RecsApi.md#getRecResultSet) | **GET** /api/api/recs/resultsets/{entityUniqueId} | [EXPERIMENTAL] GetRecResultSet: GetRecResultSet |
| [**instantiateRec**](RecsApi.md#instantiateRec) | **POST** /api/api/recs/instances | [EXPERIMENTAL] InstantiateRec: InstantiateRec |
| [**listRecInstances**](RecsApi.md#listRecInstances) | **GET** /api/api/recs/instances | [EXPERIMENTAL] ListRecInstances: ListRecInstances |
| [**listRecResultSets**](RecsApi.md#listRecResultSets) | **GET** /api/api/recs/resultsets | [EXPERIMENTAL] ListRecResultSets: ListRecResultSets |
| [**listRecResults**](RecsApi.md#listRecResults) | **GET** /api/api/recs/results | [EXPERIMENTAL] ListRecResults: ListRecResults |
| [**submitRecResultSetReview**](RecsApi.md#submitRecResultSetReview) | **POST** /api/api/recs/resultsets/{entityUniqueId}/$submit | [EXPERIMENTAL] SubmitRecResultSetReview: Submit a rec result set review for approval, or resubmit after addressing requested revisions. |
| [**transitionRecInstance**](RecsApi.md#transitionRecInstance) | **POST** /api/api/recs/instances/{instanceIdType}/{instanceIdValue}/$transition | [EXPERIMENTAL] TransitionRecInstance: TransitionRecInstance |



## addRecResultSetApprovalDecision

> RecResultSet addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest)

[EXPERIMENTAL] AddRecResultSetApprovalDecision: AddRecResultSetApprovalDecision

Add an approver decision (approve or request revisions) to a rec result set.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        RecResultSetApprovalDecisionRequest recResultSetApprovalDecisionRequest = new RecResultSetApprovalDecisionRequest(); // RecResultSetApprovalDecisionRequest | The approval decision request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute(opts);

            RecResultSet result = apiInstance.addRecResultSetApprovalDecision(entityUniqueId, recResultSetApprovalDecisionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#addRecResultSetApprovalDecision");
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
| **recResultSetApprovalDecisionRequest** | [**RecResultSetApprovalDecisionRequest**](../model/RecResultSetApprovalDecisionRequest.md)| The approval decision request. | |

### Return type

[**RecResultSet**](../model/RecResultSet.md)


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


## batchManageRecResultComments

> BatchManageCommentResponse batchManageRecResultComments(requestBody, successMode)

[EXPERIMENTAL] BatchManageRecResultComments: BatchManageRecResultComments

Add, edit or delete comments on rec results in a batch.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        Map<String, BatchManageCommentRequest> requestBody = new HashMap(); // Map<String, BatchManageCommentRequest> | The batch of comment operations, keyed by a client-supplied correlation key.
        String successMode = "Partial"; // String | Whether the batch fails Atomically or in a Partial fashion. Allowed values: Atomic, Partial.
        try {
            // uncomment the below to set overrides at the request level
            // BatchManageCommentResponse result = apiInstance.batchManageRecResultComments(requestBody, successMode).execute(opts);

            BatchManageCommentResponse result = apiInstance.batchManageRecResultComments(requestBody, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#batchManageRecResultComments");
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
| **requestBody** | [**Map&lt;String, BatchManageCommentRequest&gt;**](../model/BatchManageCommentRequest.md)| The batch of comment operations, keyed by a client-supplied correlation key. | |
| **successMode** | **String**| Whether the batch fails Atomically or in a Partial fashion. Allowed values: Atomic, Partial. | [optional] [default to Partial] |

### Return type

[**BatchManageCommentResponse**](../model/BatchManageCommentResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated rec results, keyed by batch item key. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## batchReviewRecResults

> BatchReviewRecResultResponse batchReviewRecResults(requestBody, successMode)

[EXPERIMENTAL] BatchReviewRecResults: BatchReviewRecResults

Apply a batch of review actions (decisions, assignments, comments, properties) to rec results.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        Map<String, BatchReviewRecResultRequest> requestBody = new HashMap(); // Map<String, BatchReviewRecResultRequest> | The batch of review items, keyed by a client-supplied correlation key.
        String successMode = "Partial"; // String | Whether the batch fails Atomically or in a Partial fashion. Allowed values: Atomic, Partial.
        try {
            // uncomment the below to set overrides at the request level
            // BatchReviewRecResultResponse result = apiInstance.batchReviewRecResults(requestBody, successMode).execute(opts);

            BatchReviewRecResultResponse result = apiInstance.batchReviewRecResults(requestBody, successMode).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#batchReviewRecResults");
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
| **requestBody** | [**Map&lt;String, BatchReviewRecResultRequest&gt;**](../model/BatchReviewRecResultRequest.md)| The batch of review items, keyed by a client-supplied correlation key. | |
| **successMode** | **String**| Whether the batch fails Atomically or in a Partial fashion. Allowed values: Atomic, Partial. | [optional] [default to Partial] |

### Return type

[**BatchReviewRecResultResponse**](../model/BatchReviewRecResultResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The results affected by each batch item. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getRecInstance

> RecInstance getRecInstance(instanceIdType, instanceIdValue, asAt)

[EXPERIMENTAL] GetRecInstance: GetRecInstance

Retrieve a single rec instance by its identifier.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String instanceIdType = "instanceIdType_example"; // String | How the instance was created: \"WorkflowServiceTaskId\" or \"Manual\". Available values: WorkflowServiceTaskId, Manual.
        String instanceIdValue = "instanceIdValue_example"; // String | The instance identifier value (a GUID).
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the instance. Defaults to latest if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.getRecInstance(instanceIdType, instanceIdValue, asAt).execute(opts);

            RecInstance result = apiInstance.getRecInstance(instanceIdType, instanceIdValue, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#getRecInstance");
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
| **instanceIdType** | **String**| How the instance was created: \&quot;WorkflowServiceTaskId\&quot; or \&quot;Manual\&quot;. Available values: WorkflowServiceTaskId, Manual. | |
| **instanceIdValue** | **String**| The instance identifier value (a GUID). | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the instance. Defaults to latest if not specified. | [optional] |

### Return type

[**RecInstance**](../model/RecInstance.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested rec instance. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getRecResult

> RecResult getRecResult(id, asAt, propertyKeys)

[EXPERIMENTAL] GetRecResult: GetRecResult

Retrieve a single rec result by its id.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String id = "id_example"; // String | The system-generated id of the rec result.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the result. Defaults to latest if not specified.
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys to decorate onto the result.
        try {
            // uncomment the below to set overrides at the request level
            // RecResult result = apiInstance.getRecResult(id, asAt, propertyKeys).execute(opts);

            RecResult result = apiInstance.getRecResult(id, asAt, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#getRecResult");
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
| **id** | **String**| The system-generated id of the rec result. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the result. Defaults to latest if not specified. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](../model/String.md)| The property keys to decorate onto the result. | [optional] |

### Return type

[**RecResult**](../model/RecResult.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested rec result. |  -  |
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
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the result set. Defaults to latest if not specified.
        Boolean includePreviousRuns = false; // Boolean | When true, the previousRuns array is populated with prior run snapshots. Defaults to false.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute(opts);

            RecResultSet result = apiInstance.getRecResultSet(entityUniqueId, asAt, includePreviousRuns).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#getRecResultSet");
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

[**RecResultSet**](../model/RecResultSet.md)


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


## instantiateRec

> RecInstance instantiateRec(instantiateRecRequest)

[EXPERIMENTAL] InstantiateRec: InstantiateRec

Instantiate a new rec instance from a rec definition and start its first run. The run              executes asynchronously; the response returns once the run has started, with the instance Running.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        InstantiateRecRequest instantiateRecRequest = new InstantiateRecRequest(); // InstantiateRecRequest | The instantiation request.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.instantiateRec(instantiateRecRequest).execute(opts);

            RecInstance result = apiInstance.instantiateRec(instantiateRecRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#instantiateRec");
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
| **instantiateRecRequest** | [**InstantiateRecRequest**](../model/InstantiateRecRequest.md)| The instantiation request. | |

### Return type

[**RecInstance**](../model/RecInstance.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The instantiated rec instance, in a Running state. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listRecInstances

> PagedResourceListOfRecInstance listRecInstances(asAt, page, limit, filter, sortBy)

[EXPERIMENTAL] ListRecInstances: ListRecInstances

List rec instances.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list instances. Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing instances from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\".
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRecInstance result = apiInstance.listRecInstances(asAt, page, limit, filter, sortBy).execute(opts);

            PagedResourceListOfRecInstance result = apiInstance.listRecInstances(asAt, page, limit, filter, sortBy).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#listRecInstances");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list instances. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing instances from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](../model/String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfRecInstance**](../model/PagedResourceListOfRecInstance.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec instances. |  -  |
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
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
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
            System.err.println("Exception when calling RecsApi#listRecResultSets");
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
| **sortBy** | [**List&lt;String&gt;**](../model/String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |

### Return type

[**PagedResourceListOfRecResultSet**](../model/PagedResourceListOfRecResultSet.md)


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


## listRecResults

> PagedResourceListOfRecResult listRecResults(asAt, page, limit, filter, sortBy, propertyKeys)

[EXPERIMENTAL] ListRecResults: ListRecResults

List rec results.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list results. Defaults to latest if not specified.
        String page = "page_example"; // String | The pagination token to use to continue listing results from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many. Defaults to 100 if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names suffixed by \" ASC\" or \" DESC\".
        List<String> propertyKeys = Arrays.asList(); // List<String> | The property keys to decorate onto each result.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfRecResult result = apiInstance.listRecResults(asAt, page, limit, filter, sortBy, propertyKeys).execute(opts);

            PagedResourceListOfRecResult result = apiInstance.listRecResults(asAt, page, limit, filter, sortBy, propertyKeys).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#listRecResults");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list results. Defaults to latest if not specified. | [optional] |
| **page** | **String**| The pagination token to use to continue listing results from a previous call. If a pagination token is provided the filter and asAt fields must not have changed since the original request. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](../model/String.md)| A list of field names suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. | [optional] |
| **propertyKeys** | [**List&lt;String&gt;**](../model/String.md)| The property keys to decorate onto each result. | [optional] |

### Return type

[**PagedResourceListOfRecResult**](../model/PagedResourceListOfRecResult.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec results. |  -  |
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
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String entityUniqueId = "entityUniqueId_example"; // String | The entity unique id of the rec result set (its version.entityUniqueId).
        SubmitRecResultSetReviewRequest submitRecResultSetReviewRequest = new SubmitRecResultSetReviewRequest(); // SubmitRecResultSetReviewRequest | The submission request.
        try {
            // uncomment the below to set overrides at the request level
            // RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute(opts);

            RecResultSet result = apiInstance.submitRecResultSetReview(entityUniqueId, submitRecResultSetReviewRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#submitRecResultSetReview");
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
| **submitRecResultSetReviewRequest** | [**SubmitRecResultSetReviewRequest**](../model/SubmitRecResultSetReviewRequest.md)| The submission request. | |

### Return type

[**RecResultSet**](../model/RecResultSet.md)


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


## transitionRecInstance

> RecInstance transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest)

[EXPERIMENTAL] TransitionRecInstance: TransitionRecInstance

Apply a lifecycle transition (re-run, lock or unlock) to a rec instance.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RecsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RecsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RecsApi apiInstance = apiFactory.build(RecsApi.class);
        String instanceIdType = "instanceIdType_example"; // String | How the instance was created: \"WorkflowServiceTaskId\" or \"Manual\". Available values: WorkflowServiceTaskId, Manual.
        String instanceIdValue = "instanceIdValue_example"; // String | The instance identifier value (a GUID).
        TransitionRecInstanceRequest transitionRecInstanceRequest = new TransitionRecInstanceRequest(); // TransitionRecInstanceRequest | The transition request.
        try {
            // uncomment the below to set overrides at the request level
            // RecInstance result = apiInstance.transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest).execute(opts);

            RecInstance result = apiInstance.transitionRecInstance(instanceIdType, instanceIdValue, transitionRecInstanceRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RecsApi#transitionRecInstance");
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
| **instanceIdType** | **String**| How the instance was created: \&quot;WorkflowServiceTaskId\&quot; or \&quot;Manual\&quot;. Available values: WorkflowServiceTaskId, Manual. | |
| **instanceIdValue** | **String**| The instance identifier value (a GUID). | |
| **transitionRecInstanceRequest** | [**TransitionRecInstanceRequest**](../model/TransitionRecInstanceRequest.md)| The transition request. | |

### Return type

[**RecInstance**](../model/RecInstance.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The rec instance in its post-transition state. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
