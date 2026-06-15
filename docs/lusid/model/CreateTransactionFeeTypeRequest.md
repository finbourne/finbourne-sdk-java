# com.finbourne.sdk.services.lusid.model.CreateTransactionFeeTypeRequest
classname CreateTransactionFeeTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the transaction fee type. | [default to String]
**description** | **String** | A description of the transaction fee type. | [optional] [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [default to FeeCalculationRequest]
**condition** | **String** | The condition that the transaction must meet in order for the fee to be applied. | [default to String]
**txnPropertyKey** | **String** | The property key to which the fee value will be applied and decorated onto the transaction. Must be in the &#39;Transaction&#39; property domain. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee type. | [optional] [default to Map<String, Property>]
**isActive** | **Boolean** | Indicates whether the transaction fee type is currently active and should be applied to transactions. Optional when creating a transaction fee type, defaults to true, if a value is not provided. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CreateTransactionFeeTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
FeeCalculationRequest calculation = new FeeCalculationRequest();
String condition = "example condition";
String txnPropertyKey = "example txnPropertyKey";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Boolean isActive = true;


CreateTransactionFeeTypeRequest createTransactionFeeTypeRequestInstance = new CreateTransactionFeeTypeRequest()
    .displayName(displayName)
    .description(description)
    .calculation(calculation)
    .condition(condition)
    .txnPropertyKey(txnPropertyKey)
    .properties(properties)
    .isActive(isActive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)