# AddressKeyAliasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAddressKeyAlias**](AddressKeyAliasApi.md#deleteAddressKeyAlias) | **DELETE** /api/api/addresskeyaliases/{scope}/{code} | [EXPERIMENTAL] DeleteAddressKeyAlias: Delete an Address Key Alias, assuming that it is present. |
| [**getAddressKeyAlias**](AddressKeyAliasApi.md#getAddressKeyAlias) | **GET** /api/api/addresskeyaliases/{scope}/{code} | [EXPERIMENTAL] GetAddressKeyAlias: Get Address Key Alias |
| [**listAddressKeyAliases**](AddressKeyAliasApi.md#listAddressKeyAliases) | **GET** /api/api/addresskeyaliases/{scope} | [EXPERIMENTAL] ListAddressKeyAliases: List the set of Address Key Aliases |
| [**upsertAddressKeyAlias**](AddressKeyAliasApi.md#upsertAddressKeyAlias) | **POST** /api/api/addresskeyaliases | [EXPERIMENTAL] UpsertAddressKeyAlias: Upsert an Address Key Alias. This creates or updates the alias in LUSID. |



## deleteAddressKeyAlias

> AnnulSingleStructuredDataResponse deleteAddressKeyAlias(scope, code)

[EXPERIMENTAL] DeleteAddressKeyAlias: Delete an Address Key Alias, assuming that it is present.

Delete the specified Address Key Alias from a single scope.                The response will return either detail of the deleted item, or an explanation (failure) as to why this did not succeed.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.AddressKeyAliasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyAliasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        AddressKeyAliasApi apiInstance = apiFactory.build(AddressKeyAliasApi.class);
        String scope = "scope_example"; // String | The scope of the Address Key Alias to delete.
        String code = "code_example"; // String | The Address Key Alias to delete.
        try {
            // uncomment the below to set overrides at the request level
            // AnnulSingleStructuredDataResponse result = apiInstance.deleteAddressKeyAlias(scope, code).execute(opts);

            AnnulSingleStructuredDataResponse result = apiInstance.deleteAddressKeyAlias(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyAliasApi#deleteAddressKeyAlias");
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
| **scope** | **String**| The scope of the Address Key Alias to delete. | |
| **code** | **String**| The Address Key Alias to delete. | |

### Return type

[**AnnulSingleStructuredDataResponse**](AnnulSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AsAt of deletion or failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getAddressKeyAlias

> GetAddressKeyAliasResponse getAddressKeyAlias(scope, code, asAt)

[EXPERIMENTAL] GetAddressKeyAlias: Get Address Key Alias

Get an Address Key Alias from a single scope.                The response will return either the alias that has been stored, or a failure explaining why the request was unsuccessful.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.AddressKeyAliasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyAliasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        AddressKeyAliasApi apiInstance = apiFactory.build(AddressKeyAliasApi.class);
        String scope = "scope_example"; // String | The scope of the Address Key Alias to retrieve.
        String code = "code_example"; // String | The code of the alias to retrieve.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the alias. Defaults to return the latest version if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // GetAddressKeyAliasResponse result = apiInstance.getAddressKeyAlias(scope, code, asAt).execute(opts);

            GetAddressKeyAliasResponse result = apiInstance.getAddressKeyAlias(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyAliasApi#getAddressKeyAlias");
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
| **scope** | **String**| The scope of the Address Key Alias to retrieve. | |
| **code** | **String**| The code of the alias to retrieve. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the alias. Defaults to return the latest version if not specified. | [optional] |

### Return type

[**GetAddressKeyAliasResponse**](GetAddressKeyAliasResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully retrieved Address Key Alias or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listAddressKeyAliases

> PagedResourceListOfGetAddressKeyAliasResponse listAddressKeyAliases(scope, asAt, filter, limit, page)

[EXPERIMENTAL] ListAddressKeyAliases: List the set of Address Key Aliases

List the set of address key aliases at the specified date/time and scope.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.AddressKeyAliasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyAliasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        AddressKeyAliasApi apiInstance = apiFactory.build(AddressKeyAliasApi.class);
        String scope = "scope_example"; // String | The scope to list aliases for.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to list the aliases. Defaults to latest if not specified.
        String filter = "filter_example"; // String | Expression to filter the result set.
        Integer limit = 56; // Integer | Maximum number of results to return. Defaults to 100.
        String page = "page_example"; // String | Pagination token from a previous result to fetch the next page.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfGetAddressKeyAliasResponse result = apiInstance.listAddressKeyAliases(scope, asAt, filter, limit, page).execute(opts);

            PagedResourceListOfGetAddressKeyAliasResponse result = apiInstance.listAddressKeyAliases(scope, asAt, filter, limit, page).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyAliasApi#listAddressKeyAliases");
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
| **scope** | **String**| The scope to list aliases for. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to list the aliases. Defaults to latest if not specified. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] |
| **limit** | **Integer**| Maximum number of results to return. Defaults to 100. | [optional] |
| **page** | **String**| Pagination token from a previous result to fetch the next page. | [optional] |

### Return type

[**PagedResourceListOfGetAddressKeyAliasResponse**](PagedResourceListOfGetAddressKeyAliasResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested address key aliases |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## upsertAddressKeyAlias

> UpsertSingleStructuredDataResponse upsertAddressKeyAlias(upsertAddressKeyAliasRequest)

[EXPERIMENTAL] UpsertAddressKeyAlias: Upsert an Address Key Alias. This creates or updates the alias in LUSID.

Update or insert one Address Key Alias. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted alias or failure message if unsuccessful.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.AddressKeyAliasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AddressKeyAliasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        AddressKeyAliasApi apiInstance = apiFactory.build(AddressKeyAliasApi.class);
        UpsertAddressKeyAliasRequest upsertAddressKeyAliasRequest = new UpsertAddressKeyAliasRequest(); // UpsertAddressKeyAliasRequest | The Address Key Alias to update or insert
        try {
            // uncomment the below to set overrides at the request level
            // UpsertSingleStructuredDataResponse result = apiInstance.upsertAddressKeyAlias(upsertAddressKeyAliasRequest).execute(opts);

            UpsertSingleStructuredDataResponse result = apiInstance.upsertAddressKeyAlias(upsertAddressKeyAliasRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressKeyAliasApi#upsertAddressKeyAlias");
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
| **upsertAddressKeyAliasRequest** | [**UpsertAddressKeyAliasRequest**](UpsertAddressKeyAliasRequest.md)| The Address Key Alias to update or insert | |

### Return type

[**UpsertSingleStructuredDataResponse**](UpsertSingleStructuredDataResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The successfully updated or inserted item or any failure |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
