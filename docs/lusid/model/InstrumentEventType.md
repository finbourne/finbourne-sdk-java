# com.finbourne.sdk.services.lusid.model.InstrumentEventType
classname InstrumentEventType
The individual event types.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstrumentEventType** | [**String**](.md) | **The individual event types.** | [default to String]

```java
import com.finbourne.sdk.services.lusid.model.InstrumentEventType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of InstrumentEventType:
InstrumentEventType method = InstrumentEventType.TRANSITION_EVENT;
InstrumentEventType method = InstrumentEventType.INFORMATIONAL_EVENT;
InstrumentEventType method = InstrumentEventType.OPEN_EVENT;
InstrumentEventType method = InstrumentEventType.CLOSE_EVENT;
InstrumentEventType method = InstrumentEventType.STOCK_SPLIT_EVENT;
InstrumentEventType method = InstrumentEventType.BOND_DEFAULT_EVENT;
InstrumentEventType method = InstrumentEventType.CASH_DIVIDEND_EVENT;
InstrumentEventType method = InstrumentEventType.AMORTISATION_EVENT;
InstrumentEventType method = InstrumentEventType.CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.EXERCISE_EVENT;
InstrumentEventType method = InstrumentEventType.RESET_EVENT;
InstrumentEventType method = InstrumentEventType.TRIGGER_EVENT;
InstrumentEventType method = InstrumentEventType.RAW_VENDOR_EVENT;
InstrumentEventType method = InstrumentEventType.INFORMATIONAL_ERROR_EVENT;
InstrumentEventType method = InstrumentEventType.BOND_COUPON_EVENT;
InstrumentEventType method = InstrumentEventType.DIVIDEND_REINVESTMENT_EVENT;
InstrumentEventType method = InstrumentEventType.ACCUMULATION_EVENT;
InstrumentEventType method = InstrumentEventType.BOND_PRINCIPAL_EVENT;
InstrumentEventType method = InstrumentEventType.DIVIDEND_OPTION_EVENT;
InstrumentEventType method = InstrumentEventType.MATURITY_EVENT;
InstrumentEventType method = InstrumentEventType.FX_FORWARD_SETTLEMENT_EVENT;
InstrumentEventType method = InstrumentEventType.EXPIRY_EVENT;
InstrumentEventType method = InstrumentEventType.SCRIP_DIVIDEND_EVENT;
InstrumentEventType method = InstrumentEventType.STOCK_DIVIDEND_EVENT;
InstrumentEventType method = InstrumentEventType.REVERSE_STOCK_SPLIT_EVENT;
InstrumentEventType method = InstrumentEventType.CAPITAL_DISTRIBUTION_EVENT;
InstrumentEventType method = InstrumentEventType.SPIN_OFF_EVENT;
InstrumentEventType method = InstrumentEventType.MERGER_EVENT;
InstrumentEventType method = InstrumentEventType.FUTURE_EXPIRY_EVENT;
InstrumentEventType method = InstrumentEventType.SWAP_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.SWAP_PRINCIPAL_EVENT;
InstrumentEventType method = InstrumentEventType.CREDIT_PREMIUM_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.CDS_CREDIT_EVENT;
InstrumentEventType method = InstrumentEventType.CDX_CREDIT_EVENT;
InstrumentEventType method = InstrumentEventType.MBS_COUPON_EVENT;
InstrumentEventType method = InstrumentEventType.MBS_PRINCIPAL_EVENT;
InstrumentEventType method = InstrumentEventType.BONUS_ISSUE_EVENT;
InstrumentEventType method = InstrumentEventType.MBS_PRINCIPAL_WRITE_OFF_EVENT;
InstrumentEventType method = InstrumentEventType.MBS_INTEREST_DEFERRAL_EVENT;
InstrumentEventType method = InstrumentEventType.MBS_INTEREST_SHORTFALL_EVENT;
InstrumentEventType method = InstrumentEventType.TENDER_EVENT;
InstrumentEventType method = InstrumentEventType.CALL_ON_INTERMEDIATE_SECURITIES_EVENT;
InstrumentEventType method = InstrumentEventType.INTERMEDIATE_SECURITIES_DISTRIBUTION_EVENT;
InstrumentEventType method = InstrumentEventType.OPTION_EXERCISE_PHYSICAL_EVENT;
InstrumentEventType method = InstrumentEventType.OPTION_EXERCISE_CASH_EVENT;
InstrumentEventType method = InstrumentEventType.PROTECTION_PAYOUT_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.TERM_DEPOSIT_INTEREST_EVENT;
InstrumentEventType method = InstrumentEventType.TERM_DEPOSIT_PRINCIPAL_EVENT;
InstrumentEventType method = InstrumentEventType.EARLY_REDEMPTION_EVENT;
InstrumentEventType method = InstrumentEventType.FUTURE_MARK_TO_MARKET_EVENT;
InstrumentEventType method = InstrumentEventType.ADJUST_GLOBAL_COMMITMENT_EVENT;
InstrumentEventType method = InstrumentEventType.CONTRACT_INITIALISATION_EVENT;
InstrumentEventType method = InstrumentEventType.DRAWDOWN_EVENT;
InstrumentEventType method = InstrumentEventType.LOAN_INTEREST_REPAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.UPDATE_DEPOSIT_AMOUNT_EVENT;
InstrumentEventType method = InstrumentEventType.LOAN_PRINCIPAL_REPAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.DEPOSIT_INTEREST_PAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.DEPOSIT_CLOSE_EVENT;
InstrumentEventType method = InstrumentEventType.LOAN_FACILITY_CONTRACT_ROLLOVER_EVENT;
InstrumentEventType method = InstrumentEventType.REPURCHASE_OFFER_EVENT;
InstrumentEventType method = InstrumentEventType.REPO_PARTIAL_CLOSURE_EVENT;
InstrumentEventType method = InstrumentEventType.REPO_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.FLEXIBLE_REPO_INTEREST_PAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.FLEXIBLE_REPO_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.FLEXIBLE_REPO_COLLATERAL_EVENT;
InstrumentEventType method = InstrumentEventType.CONVERSION_EVENT;
InstrumentEventType method = InstrumentEventType.FLEXIBLE_REPO_PARTIAL_CLOSURE_EVENT;
InstrumentEventType method = InstrumentEventType.FLEXIBLE_REPO_FULL_CLOSURE_EVENT;
InstrumentEventType method = InstrumentEventType.CAPLET_FLOORLET_CASH_FLOW_EVENT;
InstrumentEventType method = InstrumentEventType.EARLY_CLOSE_OUT_EVENT;
InstrumentEventType method = InstrumentEventType.DEPOSIT_ROLL_EVENT;
InstrumentEventType method = InstrumentEventType.CONSENT_EVENT;
InstrumentEventType method = InstrumentEventType.DRAWING_EVENT;
InstrumentEventType method = InstrumentEventType.CAPITAL_GAINS_DISTRIBUTION_EVENT;
InstrumentEventType method = InstrumentEventType.EXCHANGE_OFFER_EVENT;
InstrumentEventType method = InstrumentEventType.DUTCH_AUCTION_EVENT;
InstrumentEventType method = InstrumentEventType.WORTHLESS_EVENT;
InstrumentEventType method = InstrumentEventType.PUT_REDEMPTION_EVENT;
InstrumentEventType method = InstrumentEventType.LOAN_FACILITY_DELAYED_COMPENSATION_PAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.INTEREST_PAYMENT_EVENT;
InstrumentEventType method = InstrumentEventType.PRIORITY_ISSUE_EVENT;
InstrumentEventType method = InstrumentEventType.CLASS_ACTION_EVENT;
InstrumentEventType method = InstrumentEventType.BANKRUPTCY_EVENT;
InstrumentEventType method = InstrumentEventType.LIQUIDATION_PAYMENT_EVENT;
```


[Back to top](#) · [Back to API list](../../api_endpoints.md) · [Back to Model list](../../models.md) · [Back to README](../../../README.md)