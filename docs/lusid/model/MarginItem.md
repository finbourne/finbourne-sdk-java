# com.finbourne.sdk.services.lusid.model.MarginItem
classname MarginItem
One margin arrangement under an agreement, either variation or initial.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The stable key that margin calls and custodian accounts refer to this item by. Unique across the agreement&#39;s variation and initial margin. | [default to String]
**tradeFilter** | **String** | A filter selecting the trades this item covers. Required where the agreement has more than one margin item. | [optional] [default to String]
**settlement** | **String** | Whether margin is settled (Settled) or collateralised (Collateral). Optional. Available values: Collateral, Settled. | [optional] [default to String]
**legalMechanism** | **String** | How title to posted collateral is held. One of TitleTransfer or SecurityInterest. Optional. Available values: TitleTransfer, SecurityInterest. | [optional] [default to String]
**wePost** | [**PartyTerms**](PartyTerms.md) |  | [default to PartyTerms]
**theyPost** | [**PartyTerms**](PartyTerms.md) |  | [default to PartyTerms]
**eligibleCollateral** | [**EligibleCollateralReferences**](EligibleCollateralReferences.md) |  | [optional] [default to EligibleCollateralReferences]
**calculation** | [**MarginCalculation**](MarginCalculation.md) |  | [default to MarginCalculation]
**marginAccounts** | [**MarginAccounts**](MarginAccounts.md) |  | [optional] [default to MarginAccounts]

```java
import com.finbourne.sdk.services.lusid.model.MarginItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String code = "example code";
@javax.annotation.Nullable String tradeFilter = "example tradeFilter";
@javax.annotation.Nullable String settlement = "example settlement";
@javax.annotation.Nullable String legalMechanism = "example legalMechanism";
PartyTerms wePost = new PartyTerms();
PartyTerms theyPost = new PartyTerms();
EligibleCollateralReferences eligibleCollateral = new EligibleCollateralReferences();
MarginCalculation calculation = new MarginCalculation();
MarginAccounts marginAccounts = new MarginAccounts();


MarginItem marginItemInstance = new MarginItem()
    .code(code)
    .tradeFilter(tradeFilter)
    .settlement(settlement)
    .legalMechanism(legalMechanism)
    .wePost(wePost)
    .theyPost(theyPost)
    .eligibleCollateral(eligibleCollateral)
    .calculation(calculation)
    .marginAccounts(marginAccounts);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)