# com.finbourne.sdk.services.lusid.model.FundTerms
classname FundTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versions** | [**List&lt;FundTermsVersion&gt;**](FundTermsVersion.md) |  | [default to List<FundTermsVersion>]

```java
import com.finbourne.sdk.services.lusid.model.FundTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FundTermsVersion> versions = new List<FundTermsVersion>();


FundTerms fundTermsInstance = new FundTerms()
    .versions(versions);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)