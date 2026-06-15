# com.finbourne.sdk.services.lusid.model.PortfolioResultDataKeyRule
classname PortfolioResultDataKeyRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resultKeyRuleType** | **String** | Available values: Invalid, ResultDataKeyRule, PortfolioResultDataKeyRule. | [default to String]
**supplier** | **String** | the result resource supplier (where the data comes from) | [default to String]
**dataScope** | **String** | which is the scope in which the data should be found | [default to String]
**documentCode** | **String** | document code that defines which document is desired | [default to String]
**quoteInterval** | **String** | Shorthand for the time interval used to select result data. This must be a dot-separated string              specifying a start and end date, for example &#39;5D.0D&#39; to look back 5 days from today (0 days ago). | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt predicate specification. | [optional] [default to OffsetDateTime]
**portfolioCode** | **String** |  | [optional] [default to String]
**portfolioScope** | **String** |  | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PortfolioResultDataKeyRule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String supplier = "example supplier";
String dataScope = "example dataScope";
String documentCode = "example documentCode";
@javax.annotation.Nullable String quoteInterval = "example quoteInterval";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
@javax.annotation.Nullable String portfolioScope = "example portfolioScope";


PortfolioResultDataKeyRule portfolioResultDataKeyRuleInstance = new PortfolioResultDataKeyRule()
    .supplier(supplier)
    .dataScope(dataScope)
    .documentCode(documentCode)
    .quoteInterval(quoteInterval)
    .asAt(asAt)
    .portfolioCode(portfolioCode)
    .portfolioScope(portfolioScope);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)