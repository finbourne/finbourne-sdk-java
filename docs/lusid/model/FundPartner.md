# com.finbourne.sdk.services.lusid.model.FundPartner
classname FundPartner
A register line of a partnership fund: one partner's commitment and its capital balances at an effective date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The identifier of the investor record this register line belongs to. | [default to String]
**displayName** | **String** | The display name of the partner. | [optional] [default to String]
**commitmentLineId** | **String** | The identifier of the commitment (register) line. | [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the register line&#39;s capital-interest instrument. | [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**isVehicle** | **Boolean** | Whether the partner is a vehicle (for example a feeder or parallel fund) rather than an end investor. | [default to Boolean]
**partnerRole** | **String** | The role of the register line. Available values: GPRegister, LPInvestment. | [default to String]
**commitmentCurrency** | **String** | The currency of the partner&#39;s commitment. | [default to String]
**balances** | [**FundPartnerBalances**](FundPartnerBalances.md) |  | [default to FundPartnerBalances]
**shareOfCommitments** | **java.math.BigDecimal** | The partner&#39;s committed capital as a decimal fraction of the fund&#39;s total commitments. | [default to java.math.BigDecimal]
**admittedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date the partner was admitted, being the date of their first commitment. | [optional] [default to OffsetDateTime]
**totals** | [**FundPartnersTotals**](FundPartnersTotals.md) |  | [default to FundPartnersTotals]

```java
import com.finbourne.sdk.services.lusid.model.FundPartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorRecordId = "example investorRecordId";
@javax.annotation.Nullable String displayName = "example displayName";
String commitmentLineId = "example commitmentLineId";
String lusidInstrumentId = "example lusidInstrumentId";
ResourceId portfolioId = new ResourceId();
Boolean isVehicle = true;
String partnerRole = "example partnerRole";
String commitmentCurrency = "example commitmentCurrency";
FundPartnerBalances balances = new FundPartnerBalances();
java.math.BigDecimal shareOfCommitments = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable OffsetDateTime admittedOn = OffsetDateTime.now();
FundPartnersTotals totals = new FundPartnersTotals();


FundPartner fundPartnerInstance = new FundPartner()
    .investorRecordId(investorRecordId)
    .displayName(displayName)
    .commitmentLineId(commitmentLineId)
    .lusidInstrumentId(lusidInstrumentId)
    .portfolioId(portfolioId)
    .isVehicle(isVehicle)
    .partnerRole(partnerRole)
    .commitmentCurrency(commitmentCurrency)
    .balances(balances)
    .shareOfCommitments(shareOfCommitments)
    .admittedOn(admittedOn)
    .totals(totals);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)