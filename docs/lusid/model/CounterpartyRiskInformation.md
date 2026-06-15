# com.finbourne.sdk.services.lusid.model.CounterpartyRiskInformation
classname CounterpartyRiskInformation
In the event that the legal entity is a counterparty to an OTC transaction  (as signatory to a counterparty agreement such as an ISDA 2002 Master Agreement),  this information would be needed for calculations  such as Credit-Valuation-Adjustments and Debit-Valuation-Adjustments (CVA, DVA, XVA etc).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryOfRisk** | **String** | The country to which one would naturally ascribe risk, typically the legal entity&#39;s country of registration. This can be used to infer funding currency and related market data in the absence of a specific preference. | [default to String]
**creditRatings** | [**List&lt;CreditRating&gt;**](CreditRating.md) |  | [default to List<CreditRating>]
**industryClassifiers** | [**List&lt;IndustryClassifier&gt;**](IndustryClassifier.md) |  | [default to List<IndustryClassifier>]

```java
import com.finbourne.sdk.services.lusid.model.CounterpartyRiskInformation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String countryOfRisk = "example countryOfRisk";
List<CreditRating> creditRatings = new List<CreditRating>();
List<IndustryClassifier> industryClassifiers = new List<IndustryClassifier>();


CounterpartyRiskInformation counterpartyRiskInformationInstance = new CounterpartyRiskInformation()
    .countryOfRisk(countryOfRisk)
    .creditRatings(creditRatings)
    .industryClassifiers(industryClassifiers);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)