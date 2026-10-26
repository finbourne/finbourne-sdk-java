# com.finbourne.sdk.services.lusid.model.UpdateValuationPointRequest
classname UpdateValuationPointRequest
A definition for the period you wish to close

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | Unique code for the Valuation Point. | [default to String]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**applyClearDown** | **Boolean** | Defaults to null. Set to true if you want the closed period to have the clear down applied. | [optional] [default to Boolean]
**updateInclusionDateNavAdjustments** | **Boolean** | Defaults to null. Set to true if you have the required licence and want the InclusionDate property values to be used to determine whether items should be automatically included in the post close activities. | [optional] [default to Boolean]
**pricingMethodologyOverride** | [**PricingMethodologyOverrideRequest**](PricingMethodologyOverrideRequest.md) |  | [optional] [default to PricingMethodologyOverrideRequest]
**bucketSetSeeds** | [**List&lt;BucketSetSeedRequest&gt;**](BucketSetSeedRequest.md) | Defaults to null. The closing balances to seed for bucket sets at this estimate valuation point, at most one per bucket set. They replace the seeds this variant of the valuation point had, and none removes them. Null leaves them as they are. While the valuation point is an estimate, each seeded bucket set&#39;s flow bucket values are its seed; finalising the valuation point stores them, and the next valuation point opens from them. A bucket set can only be seeded when the previous final valuation point has no values for it. The seed is trusted input: it is not reconciled to the share class NAVs. | [optional] [default to List<BucketSetSeedRequest>]

```java
import com.finbourne.sdk.services.lusid.model.UpdateValuationPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String variant = "example variant";
@javax.annotation.Nullable String name = "example name";
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
@javax.annotation.Nullable Boolean applyClearDown = true;
@javax.annotation.Nullable Boolean updateInclusionDateNavAdjustments = true;
PricingMethodologyOverrideRequest pricingMethodologyOverride = new PricingMethodologyOverrideRequest();
@javax.annotation.Nullable List<BucketSetSeedRequest> bucketSetSeeds = new List<BucketSetSeedRequest>();


UpdateValuationPointRequest updateValuationPointRequestInstance = new UpdateValuationPointRequest()
    .valuationPointCode(valuationPointCode)
    .variant(variant)
    .name(name)
    .properties(properties)
    .applyClearDown(applyClearDown)
    .updateInclusionDateNavAdjustments(updateInclusionDateNavAdjustments)
    .pricingMethodologyOverride(pricingMethodologyOverride)
    .bucketSetSeeds(bucketSetSeeds);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)