# VendorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCoreFieldMappingsForProductEntity**](VendorApi.md#getCoreFieldMappingsForProductEntity) | **GET** /horizon/api/vendor/mappings/fields | [EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity. |
| [**getOptionalMappingsForProductEntity**](VendorApi.md#getOptionalMappingsForProductEntity) | **GET** /horizon/api/vendor/mappings/optional | [EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity. |
| [**getPropertyMappingsForProductEntity**](VendorApi.md#getPropertyMappingsForProductEntity) | **GET** /horizon/api/vendor/mappings/properties | [EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity |
| [**queryVendors**](VendorApi.md#queryVendors) | **POST** /horizon/api/vendor/$query | [EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities. |
| [**setOptionalMappingsForProductEntity**](VendorApi.md#setOptionalMappingsForProductEntity) | **POST** /horizon/api/vendor/mappings/optional | [EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity. |



## getCoreFieldMappingsForProductEntity

> List&lt;LusidField&gt; getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetCoreFieldMappingsForProductEntity: Get core field mappings for a given vendor product&#39;s entity.

### Example

```java
import com.finbourne.sdk.services.horizon.model.*;
import com.finbourne.sdk.services.horizon.api.VendorApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        VendorApi apiInstance = apiFactory.build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // List<LusidField> result = apiInstance.getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute(opts);

            List<LusidField> result = apiInstance.getCoreFieldMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getCoreFieldMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidField&gt;**](LusidField.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getOptionalMappingsForProductEntity

> Map&lt;String, LusidPropertyDefinitionOverrides&gt; getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetOptionalMappingsForProductEntity: Get a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example

```java
import com.finbourne.sdk.services.horizon.model.*;
import com.finbourne.sdk.services.horizon.api.VendorApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        VendorApi apiInstance = apiFactory.build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, LusidPropertyDefinitionOverrides> result = apiInstance.getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute(opts);

            Map<String, LusidPropertyDefinitionOverrides> result = apiInstance.getOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The details of the input related failure |  -  |
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getPropertyMappingsForProductEntity

> List&lt;LusidPropertyToVendorFieldMapping&gt; getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType)

[EARLY ACCESS] GetPropertyMappingsForProductEntity: Gets the property mappings for a given vendor product&#39;s entity

### Example

```java
import com.finbourne.sdk.services.horizon.model.*;
import com.finbourne.sdk.services.horizon.api.VendorApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        VendorApi apiInstance = apiFactory.build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // List<LusidPropertyToVendorFieldMapping> result = apiInstance.getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute(opts);

            List<LusidPropertyToVendorFieldMapping> result = apiInstance.getPropertyMappingsForProductEntity(vendorName, productName, lusidEntityType, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#getPropertyMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**List&lt;LusidPropertyToVendorFieldMapping&gt;**](LusidPropertyToVendorFieldMapping.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## queryVendors

> PagedResourceListOfVendorProduct queryVendors(queryRequest)

[EARLY ACCESS] QueryVendors: Query for vendors and their packages with entities and sub-entities.

### Example

```java
import com.finbourne.sdk.services.horizon.model.*;
import com.finbourne.sdk.services.horizon.api.VendorApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        VendorApi apiInstance = apiFactory.build(VendorApi.class);
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfVendorProduct result = apiInstance.queryVendors(queryRequest).execute(opts);

            PagedResourceListOfVendorProduct result = apiInstance.queryVendors(queryRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#queryVendors");
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
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |

### Return type

[**PagedResourceListOfVendorProduct**](PagedResourceListOfVendorProduct.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## setOptionalMappingsForProductEntity

> Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt; setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody, lusidEntitySubType)

[EARLY ACCESS] SetOptionalMappingsForProductEntity: Create a user defined LUSID property mappings for the specified vendor / LUSID entity.

### Example

```java
import com.finbourne.sdk.services.horizon.model.*;
import com.finbourne.sdk.services.horizon.api.VendorApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class VendorApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        VendorApi apiInstance = apiFactory.build(VendorApi.class);
        String vendorName = "vendorName_example"; // String | 
        String productName = "productName_example"; // String | 
        String lusidEntityType = "lusidEntityType_example"; // String | 
        Map<String, LusidPropertyDefinitionOverrides> requestBody = new HashMap(); // Map<String, LusidPropertyDefinitionOverrides> | 
        String lusidEntitySubType = "lusidEntitySubType_example"; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // Map<String, LusidPropertyDefinitionOverridesResponse> result = apiInstance.setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody, lusidEntitySubType).execute(opts);

            Map<String, LusidPropertyDefinitionOverridesResponse> result = apiInstance.setOptionalMappingsForProductEntity(vendorName, productName, lusidEntityType, requestBody, lusidEntitySubType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling VendorApi#setOptionalMappingsForProductEntity");
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
| **vendorName** | **String**|  | |
| **productName** | **String**|  | |
| **lusidEntityType** | **String**|  | |
| **requestBody** | [**Map&lt;String, LusidPropertyDefinitionOverrides&gt;**](LusidPropertyDefinitionOverrides.md)|  | |
| **lusidEntitySubType** | **String**|  | [optional] |

### Return type

[**Map&lt;String, LusidPropertyDefinitionOverridesResponse&gt;**](LusidPropertyDefinitionOverridesResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The details of the input related failure |  -  |
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
