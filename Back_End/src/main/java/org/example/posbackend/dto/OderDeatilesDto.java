package org.example.posbackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 7:56 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class OderDeatilesDto {

    private String oderDeatilesId;
    @NotBlank
    private String oderId;
    @NotBlank
    private String itemId;
    @NotBlank
    private String qty;
    @NotBlank
    private String totlePrice;
}
