package com.ship.in.rest.feignclients.delhivery;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageSlipResponse {
    
    @JsonProperty("packages")
    public List<PackageSlip> packages;

    @JsonProperty("packages_found")
    public int packagesFound;
}
