# com.finbourne.sdk.services.lusid.model.PaymentDetailsReferenceResponse
classname PaymentDetailsReferenceResponse
Response representation of a Payment Details reference. Extends the request shape with  a system-populated relational dataset definition identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationalDatasetDefinitionId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**seriesScope** | **String** | The scope of the relational datapoint. May differ from the scope of the dataset definition. | [default to String]
**applicableEntity** | [**PaymentDetailsApplicableEntity**](PaymentDetailsApplicableEntity.md) |  | [default to PaymentDetailsApplicableEntity]
**seriesIdentifiers** | [**PaymentDetailsSeriesIdentifiers**](PaymentDetailsSeriesIdentifiers.md) |  | [default to PaymentDetailsSeriesIdentifiers]
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at date of the relational datapoint observation to retrieve. ISO 8601 datetime. | [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.PaymentDetailsReferenceResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId relationalDatasetDefinitionId = new ResourceId();
String seriesScope = "example seriesScope";
PaymentDetailsApplicableEntity applicableEntity = new PaymentDetailsApplicableEntity();
PaymentDetailsSeriesIdentifiers seriesIdentifiers = new PaymentDetailsSeriesIdentifiers();
OffsetDateTime effectiveDate = OffsetDateTime.now();
OffsetDateTime asAtDate = OffsetDateTime.now();


PaymentDetailsReferenceResponse paymentDetailsReferenceResponseInstance = new PaymentDetailsReferenceResponse()
    .relationalDatasetDefinitionId(relationalDatasetDefinitionId)
    .seriesScope(seriesScope)
    .applicableEntity(applicableEntity)
    .seriesIdentifiers(seriesIdentifiers)
    .effectiveDate(effectiveDate)
    .asAtDate(asAtDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)