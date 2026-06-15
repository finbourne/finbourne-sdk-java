# com.finbourne.sdk.services.access.model.DateQuality
classname DateQuality

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateQuality** | [**String**](.md) | **** | [default to String]

```java
import com.finbourne.sdk.services.access.model.DateQuality;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of DateQuality:
DateQuality method = DateQuality.UNDEFINED;
DateQuality method = DateQuality.IS_FIRST_DAY_OF_ANY_MONTH;
DateQuality method = DateQuality.IS_LAST_DAY_OF_ANY_MONTH;
DateQuality method = DateQuality.IS_BUSINESS_DAY_OF_ANY_MONTH;
DateQuality method = DateQuality.IS_FIRST_DAY_OF_THE_CURRENT_MONTH;
DateQuality method = DateQuality.IS_LAST_DAY_OF_THE_CURRENT_MONTH;
DateQuality method = DateQuality.IS_BUSINESS_DAY_OF_THE_CURRENT_MONTH;
DateQuality method = DateQuality.IS_BEFORE_MIDDAY;
DateQuality method = DateQuality.IS_BEFORE5PM;
DateQuality method = DateQuality.IS_AFTER5PM;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)