# com.finbourne.sdk.services.lusid.model.BucketSetShareClassDetails
classname BucketSetShareClassDetails
Identifying detail for the share class a bucket set node is for.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier for the share class&#39; instrument. Absent where the instrument has not been resolved. | [optional] [default to String]
**instrumentScope** | **String** | The scope in which the share class instrument lies. Absent where the instrument has not been resolved. | [optional] [default to String]
**shortCode** | **String** | The unique code within the fund for the share class. | [default to String]
**domCurrency** | **String** | The domestic currency declared for the share class. | [optional] [default to String]
**instrumentActive** | **Boolean** | Whether the share class&#39; instrument is active. | [default to Boolean]

```java
import com.finbourne.sdk.services.lusid.model.BucketSetShareClassDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable String lusidInstrumentId = "example lusidInstrumentId";
@javax.annotation.Nullable String instrumentScope = "example instrumentScope";
String shortCode = "example shortCode";
@javax.annotation.Nullable String domCurrency = "example domCurrency";
Boolean instrumentActive = true;


BucketSetShareClassDetails bucketSetShareClassDetailsInstance = new BucketSetShareClassDetails()
    .lusidInstrumentId(lusidInstrumentId)
    .instrumentScope(instrumentScope)
    .shortCode(shortCode)
    .domCurrency(domCurrency)
    .instrumentActive(instrumentActive);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)