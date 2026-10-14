# com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliation
classname FundPartnerUnfundedReconciliation
The unfunded commitment statement of one partner over a period: the register's opening unfunded, the booked  activity that moves it, the closing unfunded that implies, and the register's own closing unfunded it is checked against.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the statement is for. | [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**currency** | **String** | The currency of every amount on the statement, being the commitment currency of the register line. | [default to String]
**periodFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime the statement opens at. | [default to OffsetDateTime]
**periodTo** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime the statement closes at. | [default to OffsetDateTime]
**openingUnfunded** | **java.math.BigDecimal** | The unfunded commitment at the opening datetime, from the register. | [default to java.math.BigDecimal]
**contributionsInsideCommitment** | **java.math.BigDecimal** | Capital called inside the commitment over the period, which reduces unfunded. Contributions outside the commitment, such as equalisation interest, are listed but do not count here. | [default to java.math.BigDecimal]
**recallableDistributions** | **java.math.BigDecimal** | Distributions over the period returned as recallable, which restore unfunded. | [default to java.math.BigDecimal]
**expiredRecallable** | **java.math.BigDecimal** | Recallable distributions whose recall deadline passed in the period without being recalled, which reduce unfunded. | [default to java.math.BigDecimal]
**commitmentChanges** | **java.math.BigDecimal** | Changes to the commitment over the period, which move unfunded one for one. | [default to java.math.BigDecimal]
**transfers** | **java.math.BigDecimal** | Commitment transferred in or out over the period, which moves unfunded one for one. | [default to java.math.BigDecimal]
**closingUnfunded** | **java.math.BigDecimal** | Opening unfunded less contributions inside the commitment, plus recallable distributions, less expired recallable, plus or minus commitment changes and transfers. | [default to java.math.BigDecimal]
**registerUnfunded** | **java.math.BigDecimal** | The unfunded commitment at the closing datetime, from the register. | [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | Closing unfunded less the register&#39;s unfunded at the closing datetime. Zero when the statement ties. | [default to java.math.BigDecimal]
**ties** | **Boolean** | Whether the closing unfunded equals the register&#39;s unfunded at the closing datetime. | [default to Boolean]
**lines** | [**List&lt;FundPartnerUnfundedReconciliationLine&gt;**](FundPartnerUnfundedReconciliationLine.md) | Every booked allocation to the partner over the period, in event date order, with the ILPA transaction type each is reported under and its effect on unfunded. | [default to List<FundPartnerUnfundedReconciliationLine>]

```java
import com.finbourne.sdk.services.lusid.model.FundPartnerUnfundedReconciliation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
ResourceId fundId = new ResourceId();
String currency = "example currency";
OffsetDateTime periodFrom = OffsetDateTime.now();
OffsetDateTime periodTo = OffsetDateTime.now();
java.math.BigDecimal openingUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal contributionsInsideCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal recallableDistributions = new java.math.BigDecimal("100.00");
java.math.BigDecimal expiredRecallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal commitmentChanges = new java.math.BigDecimal("100.00");
java.math.BigDecimal transfers = new java.math.BigDecimal("100.00");
java.math.BigDecimal closingUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal registerUnfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal difference = new java.math.BigDecimal("100.00");
Boolean ties = true;
List<FundPartnerUnfundedReconciliationLine> lines = new List<FundPartnerUnfundedReconciliationLine>();


FundPartnerUnfundedReconciliation fundPartnerUnfundedReconciliationInstance = new FundPartnerUnfundedReconciliation()
    .investorRecordId(investorRecordId)
    .fundId(fundId)
    .currency(currency)
    .periodFrom(periodFrom)
    .periodTo(periodTo)
    .openingUnfunded(openingUnfunded)
    .contributionsInsideCommitment(contributionsInsideCommitment)
    .recallableDistributions(recallableDistributions)
    .expiredRecallable(expiredRecallable)
    .commitmentChanges(commitmentChanges)
    .transfers(transfers)
    .closingUnfunded(closingUnfunded)
    .registerUnfunded(registerUnfunded)
    .difference(difference)
    .ties(ties)
    .lines(lines);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)