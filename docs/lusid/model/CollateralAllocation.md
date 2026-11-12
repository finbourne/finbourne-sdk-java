# com.finbourne.sdk.services.lusid.model.CollateralAllocation
classname CollateralAllocation
Which of our assets to move for a margin call and why: every holding considered, with its rank or the constraint  that excluded it, and the lines chosen cheapest first, each carrying what a transaction moving it needs. Amounts  are in the agreement's base currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the call belongs to. | [default to String]
**callId** | **String** | The business key of the call within the run: agreement scope and code, item, margin type and direction joined with &#39;/&#39;. | [default to String]
**direction** | **String** | Whether the collateral is delivered to the counterparty or recalled from it. One of Deliver or Recall. | [default to String]
**inventorySource** | **String** | Where the holdings were read from: RunStore for the proposal the run made, Live for a ranking against the holdings as they stand now. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the holdings and terms were read at. | [default to OffsetDateTime]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**item** | **String** | The margin item of the call. | [optional] [default to String]
**counterparty** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**businessDate** | [**OffsetDateTime**](OffsetDateTime.md) | The business date of the call, which a transaction for a line trades on. | [optional] [default to OffsetDateTime]
**deadline** | [**OffsetDateTime**](OffsetDateTime.md) | When the movement must have settled under the agreement&#39;s cut label. Null when the agreement sets none. | [optional] [default to OffsetDateTime]
**marginAccount** | **String** | The code of the custodian account the item names for collateral we post, which a delivery moves assets into and a recall moves them out of. Null when the item names none. | [optional] [default to String]
**baseCurrency** | **String** | The agreement&#39;s base currency, which every amount is in. | [default to String]
**requiredAmount** | **java.math.BigDecimal** | The collateral value to deliver, or for a recall the excess to take back. | [default to java.math.BigDecimal]
**coveredAmount** | **java.math.BigDecimal** | The collateral value of the lines chosen: below the requirement when the inventory ran out, above it when a lot could not be split. | [default to java.math.BigDecimal]
**carryPerDay** | **java.math.BigDecimal** | What the chosen lines cost the fund a day to leave locked up, in the base currency. | [default to java.math.BigDecimal]
**allCashCarryPerDay** | **java.math.BigDecimal** | What covering the whole call in base-currency cash would cost a day. Null when the cash rate is unavailable or for a recall. | [optional] [default to java.math.BigDecimal]
**candidates** | [**List&lt;CollateralAllocationCandidate&gt;**](CollateralAllocationCandidate.md) | Every holding considered, ranked ones first by rank, then the excluded with the constraint that excluded them. | [default to List<CollateralAllocationCandidate>]
**allocation** | [**List&lt;CollateralAllocationLine&gt;**](CollateralAllocationLine.md) | The assets chosen, cheapest first, each with what a transaction moving it needs. | [default to List<CollateralAllocationLine>]

```java
import com.finbourne.sdk.services.lusid.model.CollateralAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String runId = "example runId";
String callId = "example callId";
String direction = "example direction";
String inventorySource = "example inventorySource";
OffsetDateTime asAt = OffsetDateTime.now();
ResourceId agreementId = new ResourceId();
@javax.annotation.Nullable String item = "example item";
CounterpartyIdentifier counterparty = new CounterpartyIdentifier();
@javax.annotation.Nullable OffsetDateTime businessDate = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime deadline = OffsetDateTime.now();
@javax.annotation.Nullable String marginAccount = "example marginAccount";
String baseCurrency = "example baseCurrency";
java.math.BigDecimal requiredAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal coveredAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal carryPerDay = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable java.math.BigDecimal allCashCarryPerDay = new java.math.BigDecimal("100.00");
List<CollateralAllocationCandidate> candidates = new List<CollateralAllocationCandidate>();
List<CollateralAllocationLine> allocation = new List<CollateralAllocationLine>();


CollateralAllocation collateralAllocationInstance = new CollateralAllocation()
    .runId(runId)
    .callId(callId)
    .direction(direction)
    .inventorySource(inventorySource)
    .asAt(asAt)
    .agreementId(agreementId)
    .item(item)
    .counterparty(counterparty)
    .businessDate(businessDate)
    .deadline(deadline)
    .marginAccount(marginAccount)
    .baseCurrency(baseCurrency)
    .requiredAmount(requiredAmount)
    .coveredAmount(coveredAmount)
    .carryPerDay(carryPerDay)
    .allCashCarryPerDay(allCashCarryPerDay)
    .candidates(candidates)
    .allocation(allocation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)