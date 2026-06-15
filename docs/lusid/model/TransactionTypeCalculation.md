# com.finbourne.sdk.services.lusid.model.TransactionTypeCalculation
classname TransactionTypeCalculation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of calculation to perform | [default to String]
**side** | **String** | The side to which the calculation is applied | [optional] [default to String]
**formula** | **String** | The formula used to derive the total consideration amount when it is not provided on the transaction | [optional] [default to String]
**transactionFeeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**transactionFeeCapitalisation** | [**TransactionFeeCapitalisation**](TransactionFeeCapitalisation.md) |  | [optional] [default to TransactionFeeCapitalisation]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypeCalculation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String type = "example type";
@javax.annotation.Nullable String side = "example side";
@javax.annotation.Nullable String formula = "example formula";
ResourceId transactionFeeId = new ResourceId();
TransactionFeeCapitalisation transactionFeeCapitalisation = new TransactionFeeCapitalisation();


TransactionTypeCalculation transactionTypeCalculationInstance = new TransactionTypeCalculation()
    .type(type)
    .side(side)
    .formula(formula)
    .transactionFeeId(transactionFeeId)
    .transactionFeeCapitalisation(transactionFeeCapitalisation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)