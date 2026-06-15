# CurrentTableFieldCatalogApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCatalog**](CurrentTableFieldCatalogApi.md#getCatalog) | **GET** /honeycomb/api/Catalog | GetCatalog: Get a Flattened Table/Field Catalog |
| [**getCatalogV1**](CurrentTableFieldCatalogApi.md#getCatalogV1) | **GET** /honeycomb/api/CatalogV1 | [DEPRECATED] GetCatalogV1: Get a Flattened Table/Field Catalog |
| [**getFields**](CurrentTableFieldCatalogApi.md#getFields) | **GET** /honeycomb/api/Catalog/fields | GetFields: List field and parameters for providers |
| [**getFieldsV1**](CurrentTableFieldCatalogApi.md#getFieldsV1) | **GET** /honeycomb/api/CatalogV1/fields | [DEPRECATED] GetFieldsV1: List field and parameters for providers |
| [**getProviders**](CurrentTableFieldCatalogApi.md#getProviders) | **GET** /honeycomb/api/Catalog/providers | GetProviders: List available providers |
| [**getProvidersV1**](CurrentTableFieldCatalogApi.md#getProvidersV1) | **GET** /honeycomb/api/CatalogV1/providers | [DEPRECATED] GetProvidersV1: List available providers |



## getCatalog

> String getCatalog(freeTextSearch, jsonProper)

GetCatalog: Get a Flattened Table/Field Catalog

 Returns the User&#39;s full version of the catalog (Providers, their fields and associated information) that are currently running that you have access to (in Json format).  This is the entire catalog flattened, which is often quite large and always a bit repetitive.   The internal results are cached for several minutes.  Consider using &#x60;api/Catalog/providers&#x60; and &#x60;api/Catalog/fields&#x60; for a more granular and incremental loading flow.  It is possible to be throttled if you make too many requests in a short period of time, receiving a: - 429 Too Many Requests : Please try your request again soon  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getCatalog(freeTextSearch, jsonProper).execute(opts);

            String result = apiInstance.getCatalog(freeTextSearch, jsonProper).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getCatalog");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getCatalogV1

> String getCatalogV1(freeTextSearch, jsonProper, useCache)

[DEPRECATED] GetCatalogV1: Get a Flattened Table/Field Catalog

 Returns the User&#39;s full version of the catalog (Providers, their fields and associated information) that are currently running that you have access to (in Json format).  This is the entire catalog flattened, which is often quite large and always a bit repetitive.   The internal results are cached for several minutes.  Consider using &#x60;api/Catalog/providers&#x60; and &#x60;api/Catalog/fields&#x60; for a more granular and incremental loading flow.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
        Boolean useCache = false; // Boolean | Should the available cache be used? false is effectively to pick up a change in the catalog
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getCatalogV1(freeTextSearch, jsonProper, useCache).execute(opts);

            String result = apiInstance.getCatalogV1(freeTextSearch, jsonProper, useCache).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getCatalogV1");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false] |
| **useCache** | **Boolean**| Should the available cache be used? false is effectively to pick up a change in the catalog | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getFields

> String getFields(tableLike, addLineage, addLineageMarker)

GetFields: List field and parameters for providers

 Returns the User&#39;s full version of the catalog but only the field/parameter-level information  (as well as the TableName they refer to, of course) for tables matching the &#x60;tableLike&#x60; (manually include wildcards if desired).  The internal results are cached for several minutes.  It is possible to be throttled if you make too many requests in a short period of time, receiving a: - 429 Too Many Requests : Please try your request again soon  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String tableLike = "%"; // String | Allows for SQL-LIKE style filtering of which Providers you want the fields for.
        Boolean addLineage = false; // Boolean | Adds in any column lineage which is registered in the catalog to the results.
        Boolean addLineageMarker = false; // Boolean | Adds in a marker for column lineage which is registered in the catalog to the results: hasLineage true/false
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getFields(tableLike, addLineage, addLineageMarker).execute(opts);

            String result = apiInstance.getFields(tableLike, addLineage, addLineageMarker).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getFields");
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
| **tableLike** | **String**| Allows for SQL-LIKE style filtering of which Providers you want the fields for. | [optional] [default to %] |
| **addLineage** | **Boolean**| Adds in any column lineage which is registered in the catalog to the results. | [optional] [default to false] |
| **addLineageMarker** | **Boolean**| Adds in a marker for column lineage which is registered in the catalog to the results: hasLineage true/false | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getFieldsV1

> String getFieldsV1(tableLike)

[DEPRECATED] GetFieldsV1: List field and parameters for providers

 Returns the User&#39;s full version of the catalog but only the field/parameter-level information  (as well as the TableName they refer to, of course) for tables matching the &#x60;tableLike&#x60; (manually include wildcards if desired).  The internal results are cached for several minutes.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String tableLike = "%"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getFieldsV1(tableLike).execute(opts);

            String result = apiInstance.getFieldsV1(tableLike).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getFieldsV1");
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
| **tableLike** | **String**|  | [optional] [default to %] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getProviders

> String getProviders(freeTextSearch, tableLike, addLineage, addLineageMarker)

GetProviders: List available providers

 Returns the User&#39;s full version of the catalog but only the table/provider-level information they have access to.  The internal results are cached for several minutes.  It is possible to be throttled if you make too many requests in a short period of time, receiving a: - 429 Too Many Requests : Please try your request again soon  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        String tableLike = "tableLike_example"; // String | Allows for SQL-LIKE style filtering of which Providers you want the data for.
        Boolean addLineage = false; // Boolean | Adds in any provider lineage which is registered in the catalog to the results (can produce very large responses).
        Boolean addLineageMarker = false; // Boolean | Adds in a marker for provider lineage which is registered in the catalog to the results: hasLineage true/false
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getProviders(freeTextSearch, tableLike, addLineage, addLineageMarker).execute(opts);

            String result = apiInstance.getProviders(freeTextSearch, tableLike, addLineage, addLineageMarker).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getProviders");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **tableLike** | **String**| Allows for SQL-LIKE style filtering of which Providers you want the data for. | [optional] |
| **addLineage** | **Boolean**| Adds in any provider lineage which is registered in the catalog to the results (can produce very large responses). | [optional] [default to false] |
| **addLineageMarker** | **Boolean**| Adds in a marker for provider lineage which is registered in the catalog to the results: hasLineage true/false | [optional] [default to false] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getProvidersV1

> String getProvidersV1(freeTextSearch, useCache)

[DEPRECATED] GetProvidersV1: List available providers

 Returns the User&#39;s full version of the catalog but only the table/provider-level information they have access to.  The internal results are cached for several minutes.  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 403 Forbidden 

### Example

```java
import com.finbourne.sdk.services.luminesce.model.*;
import com.finbourne.sdk.services.luminesce.api.CurrentTableFieldCatalogApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CurrentTableFieldCatalogApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        CurrentTableFieldCatalogApi apiInstance = apiFactory.build(CurrentTableFieldCatalogApi.class);
        String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
        Boolean useCache = true; // Boolean | Should the available cache be used? false is effectively to pick up a change in the catalog
        try {
            // uncomment the below to set overrides at the request level
            // String result = apiInstance.getProvidersV1(freeTextSearch, useCache).execute(opts);

            String result = apiInstance.getProvidersV1(freeTextSearch, useCache).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentTableFieldCatalogApi#getProvidersV1");
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
| **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional] |
| **useCache** | **Boolean**| Should the available cache be used? false is effectively to pick up a change in the catalog | [optional] [default to true] |

### Return type

**String**

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
