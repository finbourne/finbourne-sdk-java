# com.finbourne.sdk.services.lusid.model.FundA2BMovementRecord
classname FundA2BMovementRecord
Fund A2B Movement Record - shows A2B category based changes relating to a specific movement within a Fund

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [optional] [default to String]
**instrumentScope** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**currency** | **String** | The holding currency. | [optional] [default to String]
**transactionId** | **String** | The unique identifier for the transaction. | [optional] [default to String]
**movementName** | **String** | The name of the movement. | [optional] [default to String]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the movement. | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The number of units of the instrument that are affected by the movement. | [optional] [default to java.math.BigDecimal]
**start** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**flows** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**gains** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**carry** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**end** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**runningUnits** | **java.math.BigDecimal** | The cumulative number of units for this sub-holding, as at this movement. | [optional] [default to java.math.BigDecimal]
**runningBalance** | [**A2BCategory**](A2BCategory.md) |  | [optional] [default to A2BCategory]
**runningCost** | **java.math.BigDecimal** | The running cost in portfolio currency for this sub-holding, as at this movement. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; domain. | [optional] [default to Map<String, Property>]
**groupId** | **String** | Arbitrary string that can be used to cross reference an entry in the A2B report with activity in the A2B-Movements. This should be used purely as a token. The content should not be relied upon. | [optional] [default to String]
**errors** | [**List&lt;ResponseMetaData&gt;**](ResponseMetaData.md) | Any errors with the record are reported here. | [optional] [default to List<ResponseMetaData>]

```java
import com.finbourne.sdk.services.lusid.model.FundA2BMovementRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId portfolioId = new ResourceId();
@javax.annotation.Nullable String holdingType = "example holdingType";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
@javax.annotation.Nullable String instrumentUid = "example instrumentUid";
@javax.annotation.Nullable Map<String, PerpetualProperty> subHoldingKeys = new Map<String, PerpetualProperty>();
@javax.annotation.Nullable String currency = "example currency";
@javax.annotation.Nullable String transactionId = "example transactionId";
@javax.annotation.Nullable String movementName = "example movementName";
OffsetDateTime effectiveDate = OffsetDateTime.now();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
A2BCategory start = new A2BCategory();
A2BCategory flows = new A2BCategory();
A2BCategory gains = new A2BCategory();
A2BCategory carry = new A2BCategory();
A2BCategory end = new A2BCategory();
@javax.annotation.Nullable java.math.BigDecimal runningUnits = new java.math.BigDecimal("100.00");
A2BCategory runningBalance = new A2BCategory();
@javax.annotation.Nullable java.math.BigDecimal runningCost = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable String groupId = "example groupId";
@javax.annotation.Nullable List<ResponseMetaData> errors = new List<ResponseMetaData>();


FundA2BMovementRecord fundA2BMovementRecordInstance = new FundA2BMovementRecord()
    .portfolioId(portfolioId)
    .holdingType(holdingType)
    .instrumentScope(instrumentScope)
    .instrumentUid(instrumentUid)
    .subHoldingKeys(subHoldingKeys)
    .currency(currency)
    .transactionId(transactionId)
    .movementName(movementName)
    .effectiveDate(effectiveDate)
    .units(units)
    .start(start)
    .flows(flows)
    .gains(gains)
    .carry(carry)
    .end(end)
    .runningUnits(runningUnits)
    .runningBalance(runningBalance)
    .runningCost(runningCost)
    .properties(properties)
    .groupId(groupId)
    .errors(errors);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)