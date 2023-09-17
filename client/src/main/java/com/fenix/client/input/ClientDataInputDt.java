package com.fenix.client.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDataInputDt {
    @NotBlank(message = "Id is mandatory")
    private String id;
    @NotBlank(message = "clientName is mandatory")
    private String clientName;
    @NotBlank(message = "contactMethodType is mandatory")
    private String contactMethodType;
    @NotBlank(message = "contactMethodValue is mandatory")
    private String contactMethodValue;
}
