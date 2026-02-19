package org.example.posbackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * --------------------------------------------
 * Author: Savindu Nawanjana
 * --------------------------------------------
 * Created: 2/14/26 3:07 PM
 * Project: SpringFramework74-main
 * --------------------------------------------
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItemDto {
//    private String itemId;

    @NotNull(message = "Item Id is mandatory...")
    private Long itemId;

    @NotBlank
    private String itemName;

    @NotNull(message = "Item qty is mandatory...")
    private String qty;

    @NotNull(message = "Item  price is mandatory...")
    private String price;
}
