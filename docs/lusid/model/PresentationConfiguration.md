# com.finbourne.sdk.services.lusid.model.PresentationConfiguration
classname PresentationConfiguration
How partner capital is presented on statements and the valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contributionsReceivableNetted** | **Boolean** |  | [optional] [default to Boolean]
**separateNoticeDueReceiptDates** | **Boolean** |  | [optional] [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.PresentationConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable Boolean contributionsReceivableNetted = true;
@javax.annotation.Nullable Boolean separateNoticeDueReceiptDates = true;


PresentationConfiguration presentationConfigurationInstance = new PresentationConfiguration()
    .contributionsReceivableNetted(contributionsReceivableNetted)
    .separateNoticeDueReceiptDates(separateNoticeDueReceiptDates);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)