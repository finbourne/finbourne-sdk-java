# com.finbourne.sdk.services.lusid.model.BasketIdentifier
classname BasketIdentifier
Descriptive information that describes a particular basket of instruments. Most commonly required with a CDS Index or similarly defined instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **String** | Index set, e.g. iTraxx or CDX. | [default to String]
**name** | **String** | The index name within the set, e.g. \&quot;MAIN\&quot; or \&quot;Crossover\&quot;. | [default to String]
**region** | **String** | Applicable geographic country or region. Typically something like \&quot;Europe\&quot;, \&quot;Asia ex-Japan\&quot;, \&quot;Japan\&quot; or \&quot;Australia\&quot;. | [default to String]
**seriesId** | **Integer** | The series identifier. | [default to Integer]

```java
import com.finbourne.sdk.services.lusid.model.BasketIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String index = "example index";
String name = "example name";
String region = "example region";
Integer seriesId = new Integer("100.00");


BasketIdentifier basketIdentifierInstance = new BasketIdentifier()
    .index(index)
    .name(name)
    .region(region)
    .seriesId(seriesId);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)