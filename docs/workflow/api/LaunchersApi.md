# LaunchersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLauncher**](LaunchersApi.md#createLauncher) | **POST** /workflow/api/workflows/{scope}/{code}/launchers | [EXPERIMENTAL] CreateLauncher: Create a new Launcher on a Workflow |
| [**deleteLauncher**](LaunchersApi.md#deleteLauncher) | **DELETE** /workflow/api/workflows/{scope}/{code}/launchers/{launcherId} | [EXPERIMENTAL] DeleteLauncher: Delete a Launcher of a Workflow |
| [**getLauncher**](LaunchersApi.md#getLauncher) | **GET** /workflow/api/workflows/{scope}/{code}/launchers/{launcherId} | [EXPERIMENTAL] GetLauncher: Get a Launcher of a Workflow |
| [**listLaunchers**](LaunchersApi.md#listLaunchers) | **GET** /workflow/api/workflows/{scope}/{code}/launchers | [EXPERIMENTAL] ListLaunchers: List the Launchers of a Workflow |
| [**updateLauncher**](LaunchersApi.md#updateLauncher) | **PUT** /workflow/api/workflows/{scope}/{code}/launchers/{launcherId} | [EXPERIMENTAL] UpdateLauncher: Update an existing Launcher of a Workflow |



## createLauncher

> LauncherResponse createLauncher(scope, code, createLauncherRequest)

[EXPERIMENTAL] CreateLauncher: Create a new Launcher on a Workflow

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.LaunchersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        CreateLauncherRequest createLauncherRequest = new CreateLauncherRequest(); // CreateLauncherRequest | The data to create a Launcher
        try {
            // uncomment the below to set overrides at the request level
            // LauncherResponse result = apiInstance.createLauncher(scope, code, createLauncherRequest).execute(opts);

            LauncherResponse result = apiInstance.createLauncher(scope, code, createLauncherRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#createLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **createLauncherRequest** | [**CreateLauncherRequest**](../model/CreateLauncherRequest.md)| The data to create a Launcher | |

### Return type

[**LauncherResponse**](../model/LauncherResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Workflow not found. |  -  |
| **409** | Launcher already exists. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## deleteLauncher

> DeletedEntityResponse deleteLauncher(scope, code, launcherId)

[EXPERIMENTAL] DeleteLauncher: Delete a Launcher of a Workflow

If the Launcher does not exist a failure will be returned

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.LaunchersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        String launcherId = "launcherId_example"; // String | The identifier of the Launcher inside its Workflow
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteLauncher(scope, code, launcherId).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteLauncher(scope, code, launcherId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#deleteLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **launcherId** | **String**| The identifier of the Launcher inside its Workflow | |

### Return type

[**DeletedEntityResponse**](../model/DeletedEntityResponse.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Launcher not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getLauncher

> LauncherResponse getLauncher(scope, code, launcherId, asAt)

[EXPERIMENTAL] GetLauncher: Get a Launcher of a Workflow

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.LaunchersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        String launcherId = "launcherId_example"; // String | The identifier of the Launcher inside its Workflow
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the Launcher. Defaults to returning the latest             version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // LauncherResponse result = apiInstance.getLauncher(scope, code, launcherId, asAt).execute(opts);

            LauncherResponse result = apiInstance.getLauncher(scope, code, launcherId, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#getLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **launcherId** | **String**| The identifier of the Launcher inside its Workflow | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the Launcher. Defaults to returning the latest             version if not specified. | [optional] |

### Return type

[**LauncherResponse**](../model/LauncherResponse.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Launcher not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listLaunchers

> PagedResourceListOfLauncherResponse listLaunchers(scope, code, asAt, filter, sortBy, limit, page)

[EXPERIMENTAL] ListLaunchers: List the Launchers of a Workflow

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.LaunchersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launchers
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launchers
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the Launchers. Defaults to return the latest version             of each Launcher if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set. Read more about filtering results from LUSID here:             https://support.lusid.com/filtering-results-from-lusid.
        List<String> sortBy = Arrays.asList(); // List<String> | A list of field names to sort by, each suffixed by \" ASC\" or \" DESC\". Defaults to             \"launcherId ASC\" if not specified.
        Integer limit = 10; // Integer | When paginating, limit the number of returned results to this many.
        String page = "page_example"; // String | The pagination token to use to continue listing Launchers from a previous call to list             Launchers. This value is returned from the previous call. If a pagination token is provided the sortBy,             filter, and asAt fields must not have changed since the original request.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfLauncherResponse result = apiInstance.listLaunchers(scope, code, asAt, filter, sortBy, limit, page).execute(opts);

            PagedResourceListOfLauncherResponse result = apiInstance.listLaunchers(scope, code, asAt, filter, sortBy, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#listLaunchers");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launchers | |
| **code** | **String**| The code that identifies the Workflow that owns the Launchers | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the Launchers. Defaults to return the latest version             of each Launcher if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. Read more about filtering results from LUSID here:             https://support.lusid.com/filtering-results-from-lusid. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](../model/String.md)| A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot;. Defaults to             \&quot;launcherId ASC\&quot; if not specified. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] [default to 10] |
| **page** | **String**| The pagination token to use to continue listing Launchers from a previous call to list             Launchers. This value is returned from the previous call. If a pagination token is provided the sortBy,             filter, and asAt fields must not have changed since the original request. | [optional] |

### Return type

[**PagedResourceListOfLauncherResponse**](../model/PagedResourceListOfLauncherResponse.md)


### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Workflow not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## updateLauncher

> LauncherResponse updateLauncher(scope, code, launcherId, updateLauncherRequest)

[EXPERIMENTAL] UpdateLauncher: Update an existing Launcher of a Workflow

The type of a Launcher cannot be changed

### Example

```java
import com.finbourne.sdk.services.workflow.model.*;
import com.finbourne.sdk.services.workflow.api.LaunchersApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LaunchersApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        LaunchersApi apiInstance = apiFactory.build(LaunchersApi.class);
        String scope = "scope_example"; // String | The scope that identifies the Workflow that owns the Launcher
        String code = "code_example"; // String | The code that identifies the Workflow that owns the Launcher
        String launcherId = "launcherId_example"; // String | The identifier of the Launcher inside its Workflow
        UpdateLauncherRequest updateLauncherRequest = new UpdateLauncherRequest(); // UpdateLauncherRequest | The data to update a Launcher
        try {
            // uncomment the below to set overrides at the request level
            // LauncherResponse result = apiInstance.updateLauncher(scope, code, launcherId, updateLauncherRequest).execute(opts);

            LauncherResponse result = apiInstance.updateLauncher(scope, code, launcherId, updateLauncherRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchersApi#updateLauncher");
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
| **scope** | **String**| The scope that identifies the Workflow that owns the Launcher | |
| **code** | **String**| The code that identifies the Workflow that owns the Launcher | |
| **launcherId** | **String**| The identifier of the Launcher inside its Workflow | |
| **updateLauncherRequest** | [**UpdateLauncherRequest**](../model/UpdateLauncherRequest.md)| The data to update a Launcher | |

### Return type

[**LauncherResponse**](../model/LauncherResponse.md)


### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | Launcher not found. |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
