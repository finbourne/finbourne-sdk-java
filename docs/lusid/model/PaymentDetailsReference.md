# com.finbourne.sdk.services.lusid.model.PaymentDetailsReference
classname PaymentDetailsReference
A pointer to a Payment Details relational dataset series for a payor or payee entity.  No PII is stored here — bank account details are resolved at read time from the referenced series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesScope** | **String** | The scope of the relational datapoint. May differ from the scope of the dataset definition. | [default to String]
**applicableEntity** | [**PaymentDetailsApplicableEntity**](PaymentDetailsApplicableEntity.md) |  | [default to PaymentDetailsApplicableEntity]
**seriesIdentifiers** | [**PaymentDetailsSeriesIdentifiers**](PaymentDetailsSeriesIdentifiers.md) |  | [default to PaymentDetailsSeriesIdentifiers]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PaymentDetailsReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String seriesScope = "example seriesScope";
PaymentDetailsApplicableEntity applicableEntity = new PaymentDetailsApplicableEntity();
PaymentDetailsSeriesIdentifiers seriesIdentifiers = new PaymentDetailsSeriesIdentifiers();
OffsetDateTime effectiveDate = OffsetDateTime.now();
OffsetDateTime asAtDate = OffsetDateTime.now();


PaymentDetailsReference paymentDetailsReferenceInstance = new PaymentDetailsReference()
    .seriesScope(seriesScope)
    .applicableEntity(applicableEntity)
    .seriesIdentifiers(seriesIdentifiers)
    .effectiveDate(effectiveDate)
    .asAtDate(asAtDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)