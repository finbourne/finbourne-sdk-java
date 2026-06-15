# com.finbourne.sdk.services.lusid.model.InvestorIdentifier
classname InvestorIdentifier
Identification of an Investor on the LUSID API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorType** | **String** | The type of the investor of the Investor Record. Available values: Person, LegalEntity, Nominee. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | Single identifier that should target the desired person or legal entity | [optional] [default to Map<String, String>]

```java
import com.finbourne.sdk.services.lusid.model.InvestorIdentifier;
import java.util.*;
import java.lang.System;
import java.net.URI;

String investorType = "example investorType";
@javax.annotation.Nullable Map<String, String> identifiers = new Map<String, String>();


InvestorIdentifier investorIdentifierInstance = new InvestorIdentifier()
    .investorType(investorType)
    .identifiers(identifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)