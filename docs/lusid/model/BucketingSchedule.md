# com.finbourne.sdk.services.lusid.model.BucketingSchedule
classname BucketingSchedule
A schedule for dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | Rolling tenor | [optional] [default to String]
**rollDirection** | **String** | Optional direction in which the bucketing dates are rolled out from the schedule tenor.  Supported string (enumeration) values are: [ForwardFromStart, BackwardFromEnd].  If absent (and StubType is also absent), the pre-existing date generation behaviour is used. Available values: ForwardFromStart, BackwardFromEnd. | [optional] [default to String]
**stubType** | **String** | Optional treatment of the irregular (stub) period when the window length is not an exact multiple of the tenor.  Supported string (enumeration) values are: [ShortStub, LongStub].  If absent (and RollDirection is also absent), the pre-existing date generation behaviour is used. Available values: ShortStub, LongStub. | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BucketingSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String tenor = "example tenor";
@javax.annotation.Nullable String rollDirection = "example rollDirection";
@javax.annotation.Nullable String stubType = "example stubType";


BucketingSchedule bucketingScheduleInstance = new BucketingSchedule()
    .tenor(tenor)
    .rollDirection(rollDirection)
    .stubType(stubType);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)