# com.finbourne.sdk.services.lusid.model.TransactionFeeType
classname TransactionFeeType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**displayName** | **String** | The display name of the transaction fee type. | [optional] [default to String]
**description** | **String** | A description of the transaction fee type. | [optional] [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [optional] [default to FeeCalculationRequest]
**condition** | **String** | The condition that the transaction must meet in order for the fee to be applied. | [optional] [default to String]
**txnPropertyKey** | **String** | The property key to which the fee value will be applied and decorated onto the transaction. Must be in the &#39;Transaction&#39; property domain. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee type. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**isActive** | **Boolean** | Indicates whether the transaction fee type is currently active and should be applied to transactions. Optional when creating a transaction fee type, defaults to true, if a value is not provided. | [optional] [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionFeeType;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId id = new ResourceId();
@javax.annotation.Nullable String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
FeeCalculationRequest calculation = new FeeCalculationRequest();
@javax.annotation.Nullable String condition = "example condition";
@javax.annotation.Nullable String txnPropertyKey = "example txnPropertyKey";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Version version = new Version();
@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
Boolean isActive = true;
@javax.annotation.Nullable List<Link> links = new List<Link>();


TransactionFeeType transactionFeeTypeInstance = new TransactionFeeType()
    .id(id)
    .displayName(displayName)
    .description(description)
    .calculation(calculation)
    .condition(condition)
    .txnPropertyKey(txnPropertyKey)
    .properties(properties)
    .version(version)
    .href(href)
    .isActive(isActive)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)