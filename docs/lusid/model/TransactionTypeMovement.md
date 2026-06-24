# com.finbourne.sdk.services.lusid.model.TransactionTypeMovement
classname TransactionTypeMovement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementTypes** | **String** | Movement types determine the impact of the movement on the holdings. Available values: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, Carry, CarryAsPnl, VariationMargin, Capital, Fee, LimitAdjustment, BalanceAdjustment, Deferred, CashDeferred. | [default to String]
**side** | **String** | The Side determines which of the fields from our transaction are used to generate the Movement. Side1 means the &#39;security&#39; side of the transaction, ie the Instrument and Units; Side2 means the &#39;cash&#39; side, ie the Total Consideration | [default to String]
**direction** | **Integer** |  A multiplier to apply to Transaction amounts; the values are -1 to indicate to reverse the signs and 1 to indicate to use the signed values from the Transaction directly. For a typical Transaction with unsigned values, 1 means increase, -1 means decrease | [default to Integer]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The properties associated with the underlying Movement | [optional] [default to Map<String, PerpetualProperty>]
**mappings** | [**List&lt;TransactionTypePropertyMapping&gt;**](TransactionTypePropertyMapping.md) | This allows you to map a transaction property to a property on the underlying holding | [optional] [default to List<TransactionTypePropertyMapping>]
**name** | **String** | The movement name (optional) | [optional] [default to String]
**movementOptions** | **List&lt;String&gt;** | Allows extra specifications for the movement. The options currently available are &#39;DirectAdjustment&#39;, &#39;IncludesTradedInterest&#39;, &#39;Virtual&#39;, &#39;Income&#39; and &#39;Expense&#39;. A movement type of &#39;StockMovement&#39; with an option of &#39;DirectAdjusment&#39; will allow you to adjust the units of a holding without affecting its cost base. You will, therefore, be able to reflect the impact of a stock split by loading a Transaction. A movement type of &#39;Carry&#39; with the option as &#39;Expense&#39; will not impact the interest accrual for cash-type holdings such loans, loan facilities and deposits. | [optional] [default to List<String>]
**settlementDateOverride** | **String** | Optional property key that must be in the Transaction domain when specified. When the movement is processed and the transaction has this property set to a valid date, then the property value will override the SettlementDate of the transaction. | [optional] [default to String]
**condition** | **String** | The condition that the transaction must satisfy to generate the movement, such as: Portfolio.BaseCurrency eq &#39;GBP&#39;. The condition can contain fields and properties from transactions and portfolios. If no condition is provided, the movement will apply for all transactions of this type. | [optional] [default to String]
**settlementMode** | **String** | Configures how movements should settle. Allowed values: &#39;Internal&#39; and &#39;External&#39;. A movement with &#39;Internal&#39; settlement mode will settle automatically on the contractual settlement date regardlesss of portfolio configuration or settlement instruction. An &#39;External&#39; movement can be settled automatically or by a settlement instruction. Available values: Internal, External. | [optional] [default to String]
**calculateTradeDateToSettlementFxPnL** | **Boolean** | Configures whether Trade To Settlement Date Realised Gain Loss should be calculated. This overrides the value set at the Portfolio level.If null, then the Portfolio Settlement Configuration TradeToSettlementDateRealisedFxPnl setting will be used.If false, then no TradeToSettlementDateRealisedFxPnl will apply for this movement and if true, then TradeToSettlementDateRealisedFxPnlwill be calculated for this movement. | [optional] [default to Boolean]
**custodianAccountType** | **String** | The type of custodian account this movement targets, e.g. Cash or Margin. Free text, optional. | [optional] [default to String]
**accountSelector** | **String** | An optional selector expression used to identify the specific account this movement targets. E.g. From/To. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TransactionTypeMovement;
import java.util.*;
import java.lang.System;
import java.net.URI;

String movementTypes = "example movementTypes";
String side = "example side";
Integer direction = new Integer("100.00");
@javax.annotation.Nullable Map<String, PerpetualProperty> properties = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable List<TransactionTypePropertyMapping> mappings = new List<TransactionTypePropertyMapping>();
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable List<String> movementOptions = new List<String>();
@javax.annotation.Nullable String settlementDateOverride = "example settlementDateOverride";
@javax.annotation.Nullable String condition = "example condition";
@javax.annotation.Nullable String settlementMode = "example settlementMode";
@javax.annotation.Nullable Boolean calculateTradeDateToSettlementFxPnL = true;
@javax.annotation.Nullable String custodianAccountType = "example custodianAccountType";
@javax.annotation.Nullable String accountSelector = "example accountSelector";


TransactionTypeMovement transactionTypeMovementInstance = new TransactionTypeMovement()
    .movementTypes(movementTypes)
    .side(side)
    .direction(direction)
    .properties(properties)
    .mappings(mappings)
    .name(name)
    .movementOptions(movementOptions)
    .settlementDateOverride(settlementDateOverride)
    .condition(condition)
    .settlementMode(settlementMode)
    .calculateTradeDateToSettlementFxPnL(calculateTradeDateToSettlementFxPnL)
    .custodianAccountType(custodianAccountType)
    .accountSelector(accountSelector);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)