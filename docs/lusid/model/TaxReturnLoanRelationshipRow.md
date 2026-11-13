# com.finbourne.sdk.services.lusid.model.TaxReturnLoanRelationshipRow
classname TaxReturnLoanRelationshipRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**ledgerAmount** | **java.math.BigDecimal** | The loan relationship credit or debit recorded in the ledger. | [optional] [default to java.math.BigDecimal]
**upliftExcluded** | **java.math.BigDecimal** | The uplift excluded from the loan relationship figure. | [optional] [default to java.math.BigDecimal]
**netCreditDebit** | **java.math.BigDecimal** | The net loan relationship credit or debit, after the uplift is excluded. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnLoanRelationshipRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
java.math.BigDecimal ledgerAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal upliftExcluded = new java.math.BigDecimal("100.00");
java.math.BigDecimal netCreditDebit = new java.math.BigDecimal("100.00");


TaxReturnLoanRelationshipRow taxReturnLoanRelationshipRowInstance = new TaxReturnLoanRelationshipRow()
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .portfolioCode(portfolioCode)
    .ledgerAmount(ledgerAmount)
    .upliftExcluded(upliftExcluded)
    .netCreditDebit(netCreditDebit);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)