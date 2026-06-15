# com.finbourne.sdk.services.lusid.model.TransactionConfigurationMovementData
classname TransactionConfigurationMovementData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | **String** | Movement types determine the impact of the movement on the holdings. Available values: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred. | [default to String]
**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration | [default to String]
**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement | [optional] [default to Map<String, PerpetualProperty>]
**mappings** | [**List&lt;TransactionPropertyMapping&gt;**](TransactionPropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding | [optional] [default to List<TransactionPropertyMapping>]
**name** | **String** | The movement name (optional) | [optional] [default to String]
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39;, &#39;Income&#39; and &#39;Expense&#39;. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. A movement type of &#39;Carry&#39; with the option as &#39;Expense&#39; will not impact the interest accrual for cash-type holdings such loans, loan facilities and deposits. | [optional] [default to List<String>]

```java
import com.finbourne.sdk.services.lusid.model.TransactionConfigurationMovementData;
import java.util.*;
import java.lang.System;
import java.net.URI;

String movementTypes = "example movementTypes";
String side = "example side";
Integer direction = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable List<TransactionPropertyMapping> mappings = new List<TransactionPropertyMapping>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable List<String> movementOptions = new List<String>();


TransactionConfigurationMovementData transactionConfigurationMovementDataInstance = new TransactionConfigurationMovementData()
    .movementTypes(movementTypes)
    .side(side)
    .direction(direction)
    .properties(properties)
    .mappings(mappings)
    .name(name)
    .movementOptions(movementOptions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)