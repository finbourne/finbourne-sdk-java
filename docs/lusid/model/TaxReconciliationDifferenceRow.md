# com.finbourne.sdk.services.lusid.model.TaxReconciliationDifferenceRow
classname TaxReconciliationDifferenceRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**category** | **String** | The reconciliation category. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**comparedAmount** | **java.math.BigDecimal** | The amount on the side being reconciled from. | [optional] [default to java.math.BigDecimal]
**taxAmount** | **java.math.BigDecimal** | The amount on the tax side. | [optional] [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxReconciliationDifferenceRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String category = "example category";
java.math.BigDecimal comparedAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal taxAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal difference = new java.math.BigDecimal("100.00");
@javax.annotation.Nullable String explanation = "example explanation";


TaxReconciliationDifferenceRow taxReconciliationDifferenceRowInstance = new TaxReconciliationDifferenceRow()
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .category(category)
    .comparedAmount(comparedAmount)
    .taxAmount(taxAmount)
    .difference(difference)
    .explanation(explanation);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)