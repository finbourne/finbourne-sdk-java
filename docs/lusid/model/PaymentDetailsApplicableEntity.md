# com.finbourne.sdk.services.lusid.model.PaymentDetailsApplicableEntity
classname PaymentDetailsApplicableEntity
Identifies the LUSID entity that holds the payment details (e.g. an InvestorRecord or Portfolio).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the LUSID entity holding the payment details. e.g. \&quot;InvestorRecord\&quot;, \&quot;InvestmentAccount\&quot;, \&quot;Portfolio\&quot;. | [default to String]
**entityScope** | **String** | The scope of the entity. Optional, and narrows the match when supplied. Required for a Portfolio. | [optional] [default to String]
**identifierType** | **String** | The identifier type used to identify the entity. e.g. \&quot;lusidInvestmentAccountId\&quot;. | [default to String]
**identifierScope** | **String** | The scope of the identifier used to identify the entity. Optional, and narrows the match when supplied. | [optional] [default to String]
**identifierValue** | **String** | The identifier value for the entity. e.g. \&quot;LUID_00003DNL\&quot;. | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.PaymentDetailsApplicableEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

String entityType = "example entityType";
@javax.annotation.Nullable String entityScope = "example entityScope";
String identifierType = "example identifierType";
@javax.annotation.Nullable String identifierScope = "example identifierScope";
String identifierValue = "example identifierValue";


PaymentDetailsApplicableEntity paymentDetailsApplicableEntityInstance = new PaymentDetailsApplicableEntity()
    .entityType(entityType)
    .entityScope(entityScope)
    .identifierType(identifierType)
    .identifierScope(identifierScope)
    .identifierValue(identifierValue);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)