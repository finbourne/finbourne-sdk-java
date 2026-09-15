# com.finbourne.sdk.services.lusid.model.UpsertCurrencyGroupRequest
classname UpsertCurrencyGroupRequest
Request body for creating or updating a currency group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the currency group. This uniquely identifies the currency group within the tenant. | [default to String]
**displayName** | **String** | The name of the currency group. | [default to String]
**description** | **String** | A description for the currency group. | [optional] [default to String]
**majorUnitCurrency** | **String** | The three-letter, case-sensitive currency code of the group&#39;s major unit, e.g. GBP for the sterling group. | [default to String]
**circulationDomain** | **String** | The domain in which the group&#39;s currencies circulate, e.g. an ISO 3166 country code. | [optional] [default to String]
**minorUnits** | [**List&lt;CurrencyGroupMinorUnit&gt;**](CurrencyGroupMinorUnit.md) | The minor unit currencies belonging to this currency group. | [optional] [default to List<CurrencyGroupMinorUnit>]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCurrencyGroupRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
String displayName = "example displayName";
@javax.annotation.Nullable String description = "example description";
String majorUnitCurrency = "example majorUnitCurrency";
@javax.annotation.Nullable String circulationDomain = "example circulationDomain";
@javax.annotation.Nullable List<CurrencyGroupMinorUnit> minorUnits = new List<CurrencyGroupMinorUnit>();


UpsertCurrencyGroupRequest upsertCurrencyGroupRequestInstance = new UpsertCurrencyGroupRequest()
    .code(code)
    .displayName(displayName)
    .description(description)
    .majorUnitCurrency(majorUnitCurrency)
    .circulationDomain(circulationDomain)
    .minorUnits(minorUnits);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)