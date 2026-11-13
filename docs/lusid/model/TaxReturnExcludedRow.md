# com.finbourne.sdk.services.lusid.model.TaxReturnExcludedRow
classname TaxReturnExcludedRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**reason** | **String** | Why the holding is outside the return. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.TaxReturnExcludedRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String holdingId = "example holdingId";
@javax.annotation.Nullable String instrumentId = "example instrumentId";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String portfolioCode = "example portfolioCode";
@javax.annotation.Nullable String reason = "example reason";


TaxReturnExcludedRow taxReturnExcludedRowInstance = new TaxReturnExcludedRow()
    .holdingId(holdingId)
    .instrumentId(instrumentId)
    .instrumentName(instrumentName)
    .portfolioCode(portfolioCode)
    .reason(reason);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)