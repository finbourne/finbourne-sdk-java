# com.finbourne.sdk.services.access.model.PointInTimeSpecification
classname PointInTimeSpecification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PointInTimeSpecification** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.sdk.services.access.model.PointInTimeSpecification;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of PointInTimeSpecification:
PointInTimeSpecification method = PointInTimeSpecification.UNDEFINED;
PointInTimeSpecification method = PointInTimeSpecification.NOW;
PointInTimeSpecification method = PointInTimeSpecification.FIRST_OF_MONTH;
PointInTimeSpecification method = PointInTimeSpecification.FIRST_BUSINESS_DAY_OF_THE_MONTH;
PointInTimeSpecification method = PointInTimeSpecification.LAST_DAY_OF_THE_MONTH;
PointInTimeSpecification method = PointInTimeSpecification.LAST_BUSINESS_DAY_OF_MONTH;
PointInTimeSpecification method = PointInTimeSpecification.FIRST_DAY_OF_YEAR;
PointInTimeSpecification method = PointInTimeSpecification.LAST_DAY_OF_YEAR;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)