package com.github.juliherms.pethotel.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class BookingDTO {

    @NotBlank
    @Size(max = 30)
    private String petName;

    @NotBlank
    @Size(max = 70)
    private String breed;

    @NotBlank
    @Size(max = 100)
    private String responsible;

}
