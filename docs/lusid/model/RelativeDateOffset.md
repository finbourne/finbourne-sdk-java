# com.finbourne.sdk.services.lusid.model.RelativeDateOffset
classname RelativeDateOffset
Defines a date offset which is relative to some anchor date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | **Integer** | The number of days to add to the anchor date. | [default to Integer]
**businessDayConvention** | **String** | The adjustment type to apply to dates that fall upon a non-business day, e.g. modified following or following. Available values: NoAdjustment, None, Previous, P, Following, F, ModifiedPrevious, MP, ModifiedFollowing, MF, HalfMonthModifiedFollowing, Nearest, Invalid. | [default to String]
**dayType** | **String** | Indicates if consideration is given to whether a day is a good business day or not when calculating the offset date.    Default value: Business. Available values: Business, Calendar. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.RelativeDateOffset;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer days = new Integer("100.00");
String businessDayConvention = "example businessDayConvention";
@javax.annotation.Nullable String dayType = "example dayType";


RelativeDateOffset relativeDateOffsetInstance = new RelativeDateOffset()
    .days(days)
    .businessDayConvention(businessDayConvention)
    .dayType(dayType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)