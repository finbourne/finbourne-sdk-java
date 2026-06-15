# com.finbourne.sdk.services.lusid.model.CreateValuationPointRequest
classname CreateValuationPointRequest
A definition for the period you wish to close.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | Unique code for the Valuation Point. | [default to String]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the diary entry. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The query time of the diary entry. Defaults to latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the diary entry. | [optional] [default to Map<String, Property>]
**applyClearDown** | **Boolean** | Defaults to false. Set to true if you want that the closed period to have the clear down applied. | [optional] [default to Boolean]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to QueryAsAt. | [optional] [default to OffsetDateTime]
**updateInclusionDateNavAdjustments** | **Boolean** | Defaults to false. Set to true if you have the required licence and want the InclusionDate property values to be used to determine whether items should be automatically included in the post close activities. | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.CreateValuationPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String valuationPointCode = "example valuationPointCode";
@javax.annotation.Nullable String variant = "example variant";
@javax.annotation.Nullable String name = "example name";
OffsetDateTime effectiveAt = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime queryAsAt = OffsetDateTime.now();
@javax.annotation.Nullable Map<String, Property> properties = new Map<String, Property>();
Boolean applyClearDown = true;
@javax.annotation.Nullable OffsetDateTime holdingsAsAtOverride = OffsetDateTime.now();
@javax.annotation.Nullable OffsetDateTime valuationsAsAtOverride = OffsetDateTime.now();
Boolean updateInclusionDateNavAdjustments = true;


CreateValuationPointRequest createValuationPointRequestInstance = new CreateValuationPointRequest()
    .valuationPointCode(valuationPointCode)
    .variant(variant)
    .name(name)
    .effectiveAt(effectiveAt)
    .queryAsAt(queryAsAt)
    .properties(properties)
    .applyClearDown(applyClearDown)
    .holdingsAsAtOverride(holdingsAsAtOverride)
    .valuationsAsAtOverride(valuationsAsAtOverride)
    .updateInclusionDateNavAdjustments(updateInclusionDateNavAdjustments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)