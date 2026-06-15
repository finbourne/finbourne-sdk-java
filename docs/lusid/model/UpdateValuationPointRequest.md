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


UpdateValuationPointRequest updateValuationPointRequestInstance = new UpdateValuationPointRequest()
    .valuationPointCode(valuationPointCode)
    .variant(variant)
    .name(name)
    .properties(properties)
    .applyClearDown(applyClearDown)
    .updateInclusionDateNavAdjustments(updateInclusionDateNavAdjustments);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)