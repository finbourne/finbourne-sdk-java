# com.finbourne.sdk.services.lusid.model.PartnerStatement
classname PartnerStatement
A partner's statement: the figures of their position on the fund over a period, fingerprinted so a later  statement can be compared against it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statementId** | **String** | The identifier of the statement. | [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record the statement is for. | [default to String]
**periodStart** | [**OffsetDateTime**](OffsetDateTime.md) | The start of the statement period, exclusive. | [default to OffsetDateTime]
**periodEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The end of the statement period, inclusive. | [default to OffsetDateTime]
**navTypeCode** | **String** | The NAV type to produce the statement under. Defaults to the fund&#39;s primary NAV type. | [default to String]
**currency** | **String** | The currency of the statement. | [default to String]
**lines** | [**List&lt;PartnerStatementLine&gt;**](PartnerStatementLine.md) | The figures on the statement. | [default to List<PartnerStatementLine>]
**fingerprint** | **String** | A hash of the statement&#39;s content, so two statements can be told apart. | [default to String]
**producedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the statement was produced. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PartnerStatement;
import java.util.*;
import java.lang.System;
import java.net.URI;

String statementId = "example statementId";
ResourceId fundId = new ResourceId();
String investorRecordId = "example investorRecordId";
OffsetDateTime periodStart = OffsetDateTime.now();
OffsetDateTime periodEnd = OffsetDateTime.now();
String navTypeCode = "example navTypeCode";
String currency = "example currency";
List<PartnerStatementLine> lines = new List<PartnerStatementLine>();
String fingerprint = "example fingerprint";
OffsetDateTime producedAsAt = OffsetDateTime.now();


PartnerStatement partnerStatementInstance = new PartnerStatement()
    .statementId(statementId)
    .fundId(fundId)
    .investorRecordId(investorRecordId)
    .periodStart(periodStart)
    .periodEnd(periodEnd)
    .navTypeCode(navTypeCode)
    .currency(currency)
    .lines(lines)
    .fingerprint(fingerprint)
    .producedAsAt(producedAsAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)