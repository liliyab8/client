package com.fenix.client.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDataInputDt {
    @NotBlank(message = "Id is mandatory")
    private String id;
    private String productName;
}
