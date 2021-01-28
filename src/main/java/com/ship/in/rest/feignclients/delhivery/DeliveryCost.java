package com.ship.in.rest.feignclients.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryCost {

    @JsonProperty("charge_DTO")
    public Integer chargeDTO;
    @JsonProperty("charge_DL")
    public Integer chargeDL;
    @JsonProperty("charge_ROV")
    public Integer chargeROV;
    @JsonProperty("charge_AWB")
    public Integer chargeAWB;
    @JsonProperty("zone")
    public String zone;
    @JsonProperty("charge_FOD")
    public Integer chargeFOD;
    @JsonProperty("charge_RTO")
    public Integer chargeRTO;
    @JsonProperty("gross_amount")
    public Integer grossAmount;
    @JsonProperty("charge_MPS")
    public Integer chargeMPS;
    @JsonProperty("charge_COD")
    public Integer chargeCOD;
    @JsonProperty("charge_WOD")
    public Integer chargeWOD;
    @JsonProperty("charge_INS")
    public Integer chargeINS;
    @JsonProperty("charge_FS")
    public Integer chargeFS;
    @JsonProperty("charge_CNC")
    public Integer chargeCNC;
    @JsonProperty("tax_data")
    public TaxData taxData;
    @JsonProperty("wt_rule_id")
    public Object wtRuleId;
    @JsonProperty("charged_weight")
    public Integer chargedWeight;
    @JsonProperty("total_amount")
    public Double totalAmount;

    @JsonProperty("deliveryType")
    public String deliveryType;

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TaxData {

        @JsonProperty("swacch_bharat_tax")
        public Integer swacchBharatTax;
        @JsonProperty("IGST")
        public Integer iGST;
        @JsonProperty("SGST")
        public Double sGST;
        @JsonProperty("service_tax")
        public Integer serviceTax;
        @JsonProperty("krishi_kalyan_cess")
        public Integer krishiKalyanCess;
        @JsonProperty("CGST")
        public Double cGST;

    }
}