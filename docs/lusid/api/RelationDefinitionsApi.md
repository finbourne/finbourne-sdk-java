# RelationDefinitionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRelationDefinition**](RelationDefinitionsApi.md#createRelationDefinition) | **POST** /api/api/relationdefinitions | [EXPERIMENTAL] CreateRelationDefinition: Create a relation definition |
| [**deleteRelationDefinition**](RelationDefinitionsApi.md#deleteRelationDefinition) | **DELETE** /api/api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteRelationDefinition: Delete relation definition |
| [**getRelationDefinition**](RelationDefinitionsApi.md#getRelationDefinition) | **GET** /api/api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] GetRelationDefinition: Get relation definition |



## createRelationDefinition

> RelationDefinition createRelationDefinition(createRelationDefinitionRequest)

[EXPERIMENTAL] CreateRelationDefinition: Create a relation definition

Define a new relation.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RelationDefinitionsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RelationDefinitionsApi apiInstance = apiFactory.build(RelationDefinitionsApi.class);
        CreateRelationDefinitionRequest createRelationDefinitionRequest = new CreateRelationDefinitionRequest(); // CreateRelationDefinitionRequest | The definition of the new relation.
        try {
            // uncomment the below to set overrides at the request level
            // RelationDefinition result = apiInstance.createRelationDefinition(createRelationDefinitionRequest).execute(opts);

            RelationDefinition result = apiInstance.createRelationDefinition(createRelationDefinitionRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationDefinitionsApi#createRelationDefinition");
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
| **createRelationDefinitionRequest** | [**CreateRelationDefinitionRequest**](CreateRelationDefinitionRequest.md)| The definition of the new relation. | |

### Return type

[**RelationDefinition**](RelationDefinition.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The newly created relation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## deleteRelationDefinition

> DeletedEntityResponse deleteRelationDefinition(scope, code)

[EXPERIMENTAL] DeleteRelationDefinition: Delete relation definition

Delete the definition of the specified relation.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RelationDefinitionsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RelationDefinitionsApi apiInstance = apiFactory.build(RelationDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the relation to be deleted.
        String code = "code_example"; // String | The code of the relation to be deleted. Together with the domain and scope this uniquely              identifies the relation.
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteRelationDefinition(scope, code).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteRelationDefinition(scope, code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationDefinitionsApi#deleteRelationDefinition");
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
| **scope** | **String**| The scope of the relation to be deleted. | |
| **code** | **String**| The code of the relation to be deleted. Together with the domain and scope this uniquely              identifies the relation. | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The time that the relation definition was deleted |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## getRelationDefinition

> RelationDefinition getRelationDefinition(scope, code, asAt)

[EXPERIMENTAL] GetRelationDefinition: Get relation definition

Retrieve the definition of a specified relation.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.RelationDefinitionsApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class RelationDefinitionsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        RelationDefinitionsApi apiInstance = apiFactory.build(RelationDefinitionsApi.class);
        String scope = "scope_example"; // String | The scope of the specified relation.
        String code = "code_example"; // String | The code of the specified relation. Together with the domain and scope this uniquely              identifies the relation.
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the relation definition. Defaults to return              the latest version of the definition if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // RelationDefinition result = apiInstance.getRelationDefinition(scope, code, asAt).execute(opts);

            RelationDefinition result = apiInstance.getRelationDefinition(scope, code, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling RelationDefinitionsApi#getRelationDefinition");
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
| **scope** | **String**| The scope of the specified relation. | |
| **code** | **String**| The code of the specified relation. Together with the domain and scope this uniquely              identifies the relation. | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the relation definition. Defaults to return              the latest version of the definition if not specified. | [optional] |

### Return type

[**RelationDefinition**](RelationDefinition.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested relation definition |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
