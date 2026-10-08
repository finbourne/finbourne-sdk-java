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
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39;, &#39;Income&#39;, &#39;Expense&#39;, &#39;Bought&#39;, &#39;Sold&#39;, &#39;Coupon&#39;, &#39;Dividend&#39;, &#39;Fee&#39; and &#39;Tax&#39;. More than one option may be given. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. A movement type of &#39;Carry&#39; with the option as &#39;Expense&#39; will not impact the interest accrual for cash-type holdings such loans, loan facilities and deposits. &#39;Bought&#39; and &#39;Sold&#39; declare the direction of traded interest and are only valid alongside &#39;IncludesTradedInterest&#39; on a &#39;Carry&#39; or &#39;CarryAsPnl&#39; movement; without them the direction is inferred from the sign of the amount. &#39;Coupon&#39; and &#39;Dividend&#39; declare the kind of income and are only valid alongside &#39;Income&#39;. &#39;Fee&#39; and &#39;Tax&#39; declare the kind of charge and are valid on &#39;Fee&#39;, &#39;Capital&#39;, &#39;Carry&#39; and &#39;CarryAsPnl&#39; movements; on a &#39;Carry&#39; or &#39;CarryAsPnl&#39; movement they must be declared alongside &#39;Expense&#39;, and they cannot be combined with &#39;Income&#39; or &#39;IncludesTradedInterest&#39;. &#39;Income&#39;, &#39;Expense&#39; and &#39;IncludesTradedInterest&#39; are mutually exclusive, as are &#39;Bought&#39; and &#39;Sold&#39;, &#39;Coupon&#39; and &#39;Dividend&#39;, and &#39;Fee&#39; and &#39;Tax&#39;. | [optional] [default to List<String>]

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