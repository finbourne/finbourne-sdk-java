# com.finbourne.sdk.services.lusid.model.PartnerCapitalAccount
classname PartnerCapitalAccount
A partner's capital account statement (PCAP) over a reporting period, in the ILPA row order, with quarter-,  year- and inception-to-date columns and a memo block of commitment balances from the register.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner. | [default to String]
**currency** | **String** | The currency the capital account is expressed in, being the fund&#39;s base currency. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The exclusive start of the reporting period. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The inclusive end of the reporting period. | [default to OffsetDateTime]
**status** | **String** | Whether the figures are an Estimate or Final. Figures are Final only once a valuation point covering the period end has been finalised. | [default to String]
**rows** | [**List&lt;PartnerCapitalAccountRow&gt;**](PartnerCapitalAccountRow.md) | The capital account rows, from beginning capital through to ending capital, each with quarter-to-date, year-to-date and inception-to-date columns. | [default to List<PartnerCapitalAccountRow>]
**memo** | [**PartnerCapitalAccountMemo**](PartnerCapitalAccountMemo.md) |  | [default to PartnerCapitalAccountMemo]
**foots** | **Boolean** | Whether the ending capital agrees across the quarter-to-date, year-to-date and inception-to-date columns within tolerance. | [default to Boolean]
**footingDifference** | **java.math.BigDecimal** | The largest difference between the ending capital of any two columns. | [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.PartnerCapitalAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId fundId = new ResourceId();
String investorRecordId = "example investorRecordId";
String currency = "example currency";
OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
String status = "example status";
List<PartnerCapitalAccountRow> rows = new List<PartnerCapitalAccountRow>();
PartnerCapitalAccountMemo memo = new PartnerCapitalAccountMemo();
Boolean foots = true;
java.math.BigDecimal footingDifference = new java.math.BigDecimal("100.00");


PartnerCapitalAccount partnerCapitalAccountInstance = new PartnerCapitalAccount()
    .fundId(fundId)
    .investorRecordId(investorRecordId)
    .currency(currency)
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .status(status)
    .rows(rows)
    .memo(memo)
    .foots(foots)
    .footingDifference(footingDifference);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)