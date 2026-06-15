# com.finbourne.sdk.services.lusid.model.Bucket
classname Bucket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotId** | **String** | The identifier of the tax lot this bucket is for. | [optional] [default to String]
**movementName** | **String** | The name of the movement. | [optional] [default to String]
**holdingType** | **String** | The type of the holding. | [optional] [default to String]
**economicBucket** | **String** | The economic bucket. | [optional] [default to String]
**economicBucketComponent** | **String** | The economic bucket component. | [optional] [default to String]
**economicBucketVariant** | **String** | The economic bucket component. | [optional] [default to String]
**holdingSign** | **String** | The holding sign. | [optional] [default to String]
**local** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**base** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**units** | **java.math.BigDecimal** | The units. | [optional] [default to java.math.BigDecimal]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activity date of the bucket. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.Bucket;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String taxLotId = "example taxLotId";
@javax.annotation.Nullable String movementName = "example movementName";
@javax.annotation.Nullable String holdingType = "example holdingType";
@javax.annotation.Nullable String economicBucket = "example economicBucket";
@javax.annotation.Nullable String economicBucketComponent = "example economicBucketComponent";
@javax.annotation.Nullable String economicBucketVariant = "example economicBucketVariant";
@javax.annotation.Nullable String holdingSign = "example holdingSign";
CurrencyAndAmount local = new CurrencyAndAmount();
CurrencyAndAmount base = new CurrencyAndAmount();
java.math.BigDecimal units = new java.math.BigDecimal("100.00");
OffsetDateTime activityDate = OffsetDateTime.now();


Bucket bucketInstance = new Bucket()
    .taxLotId(taxLotId)
    .movementName(movementName)
    .holdingType(holdingType)
    .economicBucket(economicBucket)
    .economicBucketComponent(economicBucketComponent)
    .economicBucketVariant(economicBucketVariant)
    .holdingSign(holdingSign)
    .local(local)
    .base(base)
    .units(units)
    .activityDate(activityDate);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)