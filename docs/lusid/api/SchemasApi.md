# SchemasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntitySchema**](SchemasApi.md#getEntitySchema) | **GET** /api/api/schemas/entities/{entity} | [EARLY ACCESS] GetEntitySchema: Get schema |
| [**getPropertySchema**](SchemasApi.md#getPropertySchema) | **GET** /api/api/schemas/properties | [EARLY ACCESS] GetPropertySchema: Get property schema |
| [**getValueTypes**](SchemasApi.md#getValueTypes) | **GET** /api/api/schemas/types | [EARLY ACCESS] GetValueTypes: Get value types |
| [**listEntities**](SchemasApi.md#listEntities) | **GET** /api/api/schemas/entities | [EARLY ACCESS] ListEntities: List entities |



## getEntitySchema

> Schema getEntitySchema(entity)

[EARLY ACCESS] GetEntitySchema: Get schema

Gets the schema and meta-data for a given entity

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SchemasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchemasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SchemasApi apiInstance = apiFactory.build(SchemasApi.class);
        String entity = "entity_example"; // String | The name of a valid entity
        try {
            // uncomment the below to set overrides at the request level
            // Schema result = apiInstance.getEntitySchema(entity).execute(opts);

            Schema result = apiInstance.getEntitySchema(entity).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#getEntitySchema");
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
| **entity** | **String**| The name of a valid entity | |

### Return type

[**Schema**](Schema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getPropertySchema

> PropertySchema getPropertySchema(propertyKeys, asAt)

[EARLY ACCESS] GetPropertySchema: Get property schema

Get the schemas for the provided list of property keys.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SchemasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchemasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SchemasApi apiInstance = apiFactory.build(SchemasApi.class);
        List<String> propertyKeys = Arrays.asList(); // List<String> | One or more property keys for which the schema is requested
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | Optional. The AsAt date of the data
        try {
            // uncomment the below to set overrides at the request level
            // PropertySchema result = apiInstance.getPropertySchema(propertyKeys, asAt).execute(opts);

            PropertySchema result = apiInstance.getPropertySchema(propertyKeys, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#getPropertySchema");
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
| **propertyKeys** | [**List&lt;String&gt;**](String.md)| One or more property keys for which the schema is requested | [optional] |
| **asAt** | **OffsetDateTime**| Optional. The AsAt date of the data | [optional] |

### Return type

[**PropertySchema**](PropertySchema.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getValueTypes

> ResourceListOfValueType getValueTypes(sortBy, limit)

[EARLY ACCESS] GetValueTypes: Get value types

Gets the available value types for which a schema is available.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SchemasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchemasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SchemasApi apiInstance = apiFactory.build(SchemasApi.class);
        List<String> sortBy = Arrays.asList(); // List<String> | Optional. Order the results by these fields. Use use the '-' sign to denote descending order e.g. -MyFieldName
        Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfValueType result = apiInstance.getValueTypes(sortBy, limit).execute(opts);

            ResourceListOfValueType result = apiInstance.getValueTypes(sortBy, limit).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#getValueTypes");
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
| **sortBy** | [**List&lt;String&gt;**](String.md)| Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName | [optional] |
| **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional] |

### Return type

[**ResourceListOfValueType**](ResourceListOfValueType.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## listEntities

> ResourceListOfString listEntities()

[EARLY ACCESS] ListEntities: List entities

List all available entities for which schema information is available.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SchemasApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SchemasApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SchemasApi apiInstance = apiFactory.build(SchemasApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfString result = apiInstance.listEntities().execute(opts);

            ResourceListOfString result = apiInstance.listEntities().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#listEntities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```
### Parameters

This endpoint does not need any parameter.

### Return type

[**ResourceListOfString**](ResourceListOfString.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
