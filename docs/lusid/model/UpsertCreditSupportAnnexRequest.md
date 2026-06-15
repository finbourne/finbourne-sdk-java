# com.finbourne.sdk.services.lusid.model.UpsertCreditSupportAnnexRequest
classname UpsertCreditSupportAnnexRequest
Credit Support Annex information. The interaction in terms of margining requirements between a set of trades for a given counterparty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creditSupportAnnex** | [**CreditSupportAnnex**](CreditSupportAnnex.md) |  | [optional] [default to CreditSupportAnnex]

```java
import com.finbourne.sdk.services.lusid.model.UpsertCreditSupportAnnexRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

CreditSupportAnnex creditSupportAnnex = new CreditSupportAnnex();


UpsertCreditSupportAnnexRequest upsertCreditSupportAnnexRequestInstance = new UpsertCreditSupportAnnexRequest()
    .creditSupportAnnex(creditSupportAnnex);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)