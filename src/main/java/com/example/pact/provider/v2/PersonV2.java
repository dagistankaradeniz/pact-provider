package com.example.pact.provider.v2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonV2 {
    private Integer id;
    private String name;
    private String socialSecurityNumber;
    private String address;
}
