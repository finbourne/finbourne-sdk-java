# com.finbourne.sdk.services.lusid.model.TaxClassification
classname TaxClassification
The UK life-company tax classification of one instrument at one effective and asAt point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**luid** | **String** | The LUSID instrument identifier of the classified instrument. | [default to String]
**instrumentName** | **String** | The name of the classified instrument. | [optional] [default to String]
**instrumentType** | **String** | The LUSID instrument type of the classified instrument, where known. | [optional] [default to String]
**withinBlagab** | **Boolean** | Whether the instrument is held within the basic life assurance and general annuity business of the fund. Absent when the input has not been set. | [optional] [default to Boolean]
**inputs** | [**TaxClassificationInputs**](TaxClassificationInputs.md) |  | [default to TaxClassificationInputs]
**treatmentOverride** | **String** | The user-supplied treatment leaf that replaces the system-derived one, if any. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [optional] [default to String]
**leaf** | **String** | The treatment leaf the decision tree arrived at. Absent when the instrument could not be classified. Available values: OutsideBlagab, LoanRelationship, IndexLinkedGilt, PrivateEquity, RealEstate, FinancialFuture, PooledDerivative, DerivativeProfitAndLoss, NonTransparentScheme, BondFund, TransparentScheme, StandardEquity, Exempt. | [optional] [default to String]
**treatment** | **String** | The tax treatment class implied by the leaf: ChargeableGains, LoanRelationship, Excluded or Unclassified. Available values: ChargeableGains, LoanRelationship, Excluded, Unclassified. | [default to String]
**status** | **String** | Classified, Overridden, Rejected or Unclassified. Available values: Classified, Overridden, Rejected, Unclassified. | [default to String]
**source** | **String** | Whether the leaf came from the System decision tree or a User override. Available values: System, User. | [default to String]
**ruleFired** | **String** | The name of the decision-tree rule that produced the leaf. | [default to String]
**trace** | [**List&lt;TaxClassificationDecisionStep&gt;**](TaxClassificationDecisionStep.md) | The ordered questions the decision tree asked and the answers it took, for audit. | [optional] [default to List<TaxClassificationDecisionStep>]
**exception** | [**TaxClassificationException**](TaxClassificationException.md) |  | [optional] [default to TaxClassificationException]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date the classification was evaluated at. | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time the classification was evaluated at. | [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.sdk.services.lusid.model.TaxClassification;
import java.util.*;
import java.lang.System;
import java.net.URI;

@javax.annotation.Nullable URI href = URI.create("http://example.com/href");
String luid = "example luid";
@javax.annotation.Nullable String instrumentName = "example instrumentName";
@javax.annotation.Nullable String instrumentType = "example instrumentType";
@javax.annotation.Nullable Boolean withinBlagab = true;
TaxClassificationInputs inputs = new TaxClassificationInputs();
@javax.annotation.Nullable String treatmentOverride = "example treatmentOverride";
@javax.annotation.Nullable String leaf = "example leaf";
String treatment = "example treatment";
String status = "example status";
String source = "example source";
String ruleFired = "example ruleFired";
@javax.annotation.Nullable List<TaxClassificationDecisionStep> trace = new List<TaxClassificationDecisionStep>();
TaxClassificationException exception = new TaxClassificationException();
OffsetDateTime effectiveAt = OffsetDateTime.now();
OffsetDateTime asAt = OffsetDateTime.now();
@javax.annotation.Nullable List<Link> links = new List<Link>();


TaxClassification taxClassificationInstance = new TaxClassification()
    .href(href)
    .luid(luid)
    .instrumentName(instrumentName)
    .instrumentType(instrumentType)
    .withinBlagab(withinBlagab)
    .inputs(inputs)
    .treatmentOverride(treatmentOverride)
    .leaf(leaf)
    .treatment(treatment)
    .status(status)
    .source(source)
    .ruleFired(ruleFired)
    .trace(trace)
    .exception(exception)
    .effectiveAt(effectiveAt)
    .asAt(asAt)
    .links(links);
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)