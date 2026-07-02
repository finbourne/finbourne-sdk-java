# com.finbourne.sdk.services.lusid.model.ResolveTenorsRequest
classname ResolveTenorsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**calendars** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [default to List<ResourceId>]
**spotDays** | **Integer** |  | [default to Integer]
**tenors** | **List&lt;String&gt;** |  | [default to List<String>]
**businessDayConvention** | **String** | Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [optional] [default to String]
**eomRule** | **String** |  | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]

```java
import com.finbourne.sdk.services.lusid.model.ResolveTenorsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime startDate = OffsetDateTime.now();
List<ResourceId> calendars = new List<ResourceId>();
Integer spotDays = new Integer("100.00");
List<String> tenors = new List<String>();
@javax.annotation.Nullable String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable String eomRule = "example eomRule";
@javax.annotation.Nullable OffsetDateTime asAt = OffsetDateTime.now();


ResolveTenorsRequest resolveTenorsRequestInstance = new ResolveTenorsRequest()
    .startDate(startDate)
    .calendars(calendars)
    .spotDays(spotDays)
    .tenors(tenors)
    .businessDayConvention(businessDayConvention)
    .eomRule(eomRule)
    .asAt(asAt);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)