# com.finbourne.sdk.services.lusid.model.RecResultCountByReviewStatus
classname RecResultCountByReviewStatus
Result counts broken down by review status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**required** | **Integer** | The number of results with review status Required. | [default to Integer]
**notRequired** | **Integer** | The number of results with review status Not Required. | [default to Integer]
**reviewed** | **Integer** | The number of results with review status Reviewed. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.RecResultCountByReviewStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer required = new Integer("100.00");
Integer notRequired = new Integer("100.00");
Integer reviewed = new Integer("100.00");


RecResultCountByReviewStatus recResultCountByReviewStatusInstance = new RecResultCountByReviewStatus()
    .required(required)
    .notRequired(notRequired)
    .reviewed(reviewed);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)