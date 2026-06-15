# com.finbourne.sdk.services.lusid.model.BucketingSchedule
classname BucketingSchedule
A schedule for dates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenor** | **String** | Rolling tenor | [optional] [default to String]

```java
import com.finbourne.sdk.services.lusid.model.BucketingSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String tenor = "example tenor";


BucketingSchedule bucketingScheduleInstance = new BucketingSchedule()
    .tenor(tenor);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)