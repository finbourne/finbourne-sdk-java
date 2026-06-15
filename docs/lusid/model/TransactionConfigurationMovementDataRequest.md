# com.finbourne.sdk.services.lusid.model.TransactionConfigurationMovementDataRequest
classname TransactionConfigurationMovementDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | **String** | The movement types. Available values: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred. | [default to String]
**side** | **String** | The movement side | [default to String]
**direction** | **Integer** | The movement direction | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement. | [optional] [default to Map<String, PerpetualProperty>]
**mappings** | [**List&lt;TransactionPropertyMappingRequest&gt;**](TransactionPropertyMappingRequest.md) | This allows you to map a transaction property to a property on the underlying holding. | [optional] [default to List<TransactionPropertyMappingRequest>]
**name** | **String** | The movement name (optional) | [optional] [default to String]
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39;, &#39;Income&#39; and &#39;Expense&#39;. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. A movement type of &#39;Carry&#39; with the option as &#39;Expense&#39; will not impact the interest accrual for cash-type holdings such loans, loan facilities and deposits. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionConfigurationMovementDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String movementTypes = "example movementTypes";
String side = "example side";
Integer direction = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable List<TransactionPropertyMappingRequest> mappings = new List<TransactionPropertyMappingRequest>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable List<String> movementOptions = new List<String>();


TransactionConfigurationMovementDataRequest transactionConfigurationMovementDataRequestInstance = new TransactionConfigurationMovementDataRequest()
    .movementTypes(movementTypes)
    .side(side)
    .direction(direction)
    .properties(properties)
    .mappings(mappings)
    .name(name)
    .movementOptions(movementOptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)