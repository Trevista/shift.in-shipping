package com.ship.in.rest.feignclients.delhivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderResponse {
    @JsonProperty("cash_pickups_count")
    public Integer cashPickupsCount;

    @JsonProperty("cod_count")
    public Object codCount;

    @JsonProperty("success")
    public Boolean success;

    @JsonProperty("package_count")
    public Object packageCount;

    @JsonProperty("upload_wbn")
    public String uploadWbn;

    @JsonProperty("replacement_count")
    public Integer replacementCount;

    @JsonProperty("cod_amount")
    public Object codAmount;

    @JsonProperty("prepaid_count")
    public Object prepaidCount;

    @JsonProperty("rmk")
    public String rmk;

    @JsonProperty("pickups_count")
    public Object pickupsCount;

    @JsonProperty("packages")
    public List<Object> packages;

    @JsonProperty("cash_pickups")
    public Integer cashPickups;
}
