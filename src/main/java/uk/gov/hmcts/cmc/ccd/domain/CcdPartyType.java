package uk.gov.hmcts.cmc.ccd.domain;

public enum CcdPartyType {
    INDIVIDUAL("Individual"),
    ORGANISATION("Organisation"),
    SOLE_TRADER("SoleTrader"),
    COMPANY("Company");

    private String value;

    CcdPartyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
