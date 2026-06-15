# com.finbourne.sdk.services.lusid.model.UpdateTransactionFeeTypeRequest
classname UpdateTransactionFeeTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the transaction fee type. | [optional] [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [optional] [default to FeeCalculationRequest]
**condition** | **String** | The condition that the transaction must meet in order for the fee to be applied. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee type. | [optional] [default to Map<String, Property>]
**isActive** | **Boolean** | Indicates whether the transaction fee type is currently active and should be applied to transactions. Optional when creating a transaction fee type, defaults to true, if a value is not provided. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.UpdateTransactionFeeTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String description = "example description";
FeeCalculationRequest calculation = new FeeCalculationRequest();
@javax.annotation.Nullable String condition = "example condition";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable Boolean isActive = true;


UpdateTransactionFeeTypeRequest updateTransactionFeeTypeRequestInstance = new UpdateTransactionFeeTypeRequest()
    .description(description)
    .calculation(calculation)
    .condition(condition)
    .properties(properties)
    .isActive(isActive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)