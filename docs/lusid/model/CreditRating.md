# com.finbourne.sdk.services.lusid.model.CreditRating
classname CreditRating
Object describing a credit rating,  which assesses the stability and credit worthiness of a legal entity  and hence its likelihood of defaulting on its outstanding obligations (typically debt).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ratingSource** | **String** | The provider of the credit rating, which will typically be an agency such as Moody&#39;s or Standard and Poor. | [default to String]
**rating** | **String** | The credit rating provided by the rating source. This would expected to be consistent with the rating scheme of that agency/source. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.CreditRating;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ratingSource = "example ratingSource";
String rating = "example rating";


CreditRating creditRatingInstance = new CreditRating()
    .ratingSource(ratingSource)
    .rating(rating);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)