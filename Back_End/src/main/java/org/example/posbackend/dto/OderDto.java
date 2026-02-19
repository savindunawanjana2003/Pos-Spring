package org.example.posbackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/15/26 7:21 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OderDto {
    @NotBlank
    private String oderId;

    @NotBlank
    private String custormerId;
    //    private List<OderDeatilesDto>oderDeatilesList;
    @NotBlank
    private String date;
}
