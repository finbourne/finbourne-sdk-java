# SystemConfigurationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConfigurationTransactionType**](SystemConfigurationApi.md#createConfigurationTransactionType) | **POST** /api/api/systemconfiguration/transactions/type | [EARLY ACCESS] CreateConfigurationTransactionType: Create transaction type |
| [**createSideDefinition**](SystemConfigurationApi.md#createSideDefinition) | **POST** /api/api/systemconfiguration/transactions/side | [EXPERIMENTAL] CreateSideDefinition: Create side definition |
| [**deleteTransactionConfigurationSource**](SystemConfigurationApi.md#deleteTransactionConfigurationSource) | **DELETE** /api/api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] DeleteTransactionConfigurationSource: Delete all transaction configurations for a source |
| [**getTransactionConfigurationSource**](SystemConfigurationApi.md#getTransactionConfigurationSource) | **GET** /api/api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] GetTransactionConfigurationSource: Get all transaction configurations for a source |
| [**listConfigurationTransactionTypes**](SystemConfigurationApi.md#listConfigurationTransactionTypes) | **GET** /api/api/systemconfiguration/transactions | [EARLY ACCESS] ListConfigurationTransactionTypes: List transaction types |
| [**setConfigurationTransactionTypes**](SystemConfigurationApi.md#setConfigurationTransactionTypes) | **PUT** /api/api/systemconfiguration/transactions | [EXPERIMENTAL] SetConfigurationTransactionTypes: Set transaction types |
| [**setTransactionConfigurationSource**](SystemConfigurationApi.md#setTransactionConfigurationSource) | **PUT** /api/api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] SetTransactionConfigurationSource: Set transaction types for a source |



## createConfigurationTransactionType

> TransactionSetConfigurationData createConfigurationTransactionType(transactionConfigurationDataRequest)

[EARLY ACCESS] CreateConfigurationTransactionType: Create transaction type

Create a new transaction type by specifying a definition and mappings to movements.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        TransactionConfigurationDataRequest transactionConfigurationDataRequest = new TransactionConfigurationDataRequest(); // TransactionConfigurationDataRequest | A transaction type definition.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.createConfigurationTransactionType(transactionConfigurationDataRequest).execute(opts);

            TransactionSetConfigurationData result = apiInstance.createConfigurationTransactionType(transactionConfigurationDataRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#createConfigurationTransactionType");
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
| **transactionConfigurationDataRequest** | [**TransactionConfigurationDataRequest**](TransactionConfigurationDataRequest.md)| A transaction type definition. | [optional] |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## createSideDefinition

> TransactionSetConfigurationData createSideDefinition(sideConfigurationDataRequest)

[EXPERIMENTAL] CreateSideDefinition: Create side definition

Create a new side definition for use in a transaction type. For more information, see https://support.lusid.com/knowledgebase/article/KA-01875.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        SideConfigurationDataRequest sideConfigurationDataRequest = new SideConfigurationDataRequest(); // SideConfigurationDataRequest | The definition of the side.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.createSideDefinition(sideConfigurationDataRequest).execute(opts);

            TransactionSetConfigurationData result = apiInstance.createSideDefinition(sideConfigurationDataRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#createSideDefinition");
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
| **sideConfigurationDataRequest** | [**SideConfigurationDataRequest**](SideConfigurationDataRequest.md)| The definition of the side. | [optional] |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## deleteTransactionConfigurationSource

> DeletedEntityResponse deleteTransactionConfigurationSource(source)

[EXPERIMENTAL] DeleteTransactionConfigurationSource: Delete all transaction configurations for a source

/// WARNING! Changing existing transaction types has a material impact on how data, new and old,  is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        String source = "source_example"; // String | The source to delete transaction configurations for
        try {
            // uncomment the below to set overrides at the request level
            // DeletedEntityResponse result = apiInstance.deleteTransactionConfigurationSource(source).execute(opts);

            DeletedEntityResponse result = apiInstance.deleteTransactionConfigurationSource(source).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#deleteTransactionConfigurationSource");
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
| **source** | **String**| The source to delete transaction configurations for | |

### Return type

[**DeletedEntityResponse**](DeletedEntityResponse.md)

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


## getTransactionConfigurationSource

> TransactionSetConfigurationData getTransactionConfigurationSource(source, asAt)

[EXPERIMENTAL] GetTransactionConfigurationSource: Get all transaction configurations for a source

Returns failure if requested source is not found

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        String source = "source_example"; // String | The source for which to retrieve transaction configurations
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction configurations.              Defaults to returning the latest version of the transaction configurations if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.getTransactionConfigurationSource(source, asAt).execute(opts);

            TransactionSetConfigurationData result = apiInstance.getTransactionConfigurationSource(source, asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#getTransactionConfigurationSource");
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
| **source** | **String**| The source for which to retrieve transaction configurations | |
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction configurations.              Defaults to returning the latest version of the transaction configurations if not specified. | [optional] |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

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


## listConfigurationTransactionTypes

> TransactionSetConfigurationData listConfigurationTransactionTypes(asAt)

[EARLY ACCESS] ListConfigurationTransactionTypes: List transaction types

Get the list of current transaction types. For information on the default transaction types provided with  LUSID, see https://support.lusid.com/knowledgebase/article/KA-01873/.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.listConfigurationTransactionTypes(asAt).execute(opts);

            TransactionSetConfigurationData result = apiInstance.listConfigurationTransactionTypes(asAt).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#listConfigurationTransactionTypes");
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
| **asAt** | **OffsetDateTime**| The asAt datetime at which to retrieve the transaction types. Defaults              to returning the latest versions if not specified. | [optional] |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

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


## setConfigurationTransactionTypes

> TransactionSetConfigurationData setConfigurationTransactionTypes(transactionSetConfigurationDataRequest)

[EXPERIMENTAL] SetConfigurationTransactionTypes: Set transaction types

Configure all existing transaction types. Note it is not possible to configure a single existing transaction type on its own.                WARNING! Changing existing transaction types has a material impact on how data, new and old, is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        TransactionSetConfigurationDataRequest transactionSetConfigurationDataRequest = new TransactionSetConfigurationDataRequest(); // TransactionSetConfigurationDataRequest | The complete set of transaction type definitions.
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.setConfigurationTransactionTypes(transactionSetConfigurationDataRequest).execute(opts);

            TransactionSetConfigurationData result = apiInstance.setConfigurationTransactionTypes(transactionSetConfigurationDataRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#setConfigurationTransactionTypes");
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
| **transactionSetConfigurationDataRequest** | [**TransactionSetConfigurationDataRequest**](TransactionSetConfigurationDataRequest.md)| The complete set of transaction type definitions. | [optional] |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)


## setTransactionConfigurationSource

> TransactionSetConfigurationData setTransactionConfigurationSource(source, setTransactionConfigurationSourceRequest)

[EXPERIMENTAL] SetTransactionConfigurationSource: Set transaction types for a source

This will replace all the existing transaction configurations for the given source                WARNING! Changing existing transaction types has a material impact on how data, new and old, is processed and aggregated by LUSID, and will affect your whole organisation. Only call this API if you are fully aware of the implications of the change.

### Example

```java
import com.finbourne.sdk.services.lusid.model.*;
import com.finbourne.sdk.services.lusid.api.SystemConfigurationApi;
import com.finbourne.sdk.core.config.ApiConfigurationException;
import com.finbourne.sdk.extensions.ApiFactoryBuilder;
import com.finbourne.sdk.core.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemConfigurationApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        
        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        ApiFactory apiFactory = new ApiFactoryBuilder().build();
        
        SystemConfigurationApi apiInstance = apiFactory.build(SystemConfigurationApi.class);
        String source = "source_example"; // String | The source to set the transaction configurations for
        List<SetTransactionConfigurationSourceRequest> setTransactionConfigurationSourceRequest = Arrays.asList(); // List<SetTransactionConfigurationSourceRequest> | The set of transaction configurations
        try {
            // uncomment the below to set overrides at the request level
            // TransactionSetConfigurationData result = apiInstance.setTransactionConfigurationSource(source, setTransactionConfigurationSourceRequest).execute(opts);

            TransactionSetConfigurationData result = apiInstance.setTransactionConfigurationSource(source, setTransactionConfigurationSourceRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemConfigurationApi#setTransactionConfigurationSource");
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
| **source** | **String**| The source to set the transaction configurations for | |
| **setTransactionConfigurationSourceRequest** | [**List&lt;SetTransactionConfigurationSourceRequest&gt;**](SetTransactionConfigurationSourceRequest.md)| The set of transaction configurations | |

### Return type

[**TransactionSetConfigurationData**](TransactionSetConfigurationData.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)
