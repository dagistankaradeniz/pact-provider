package com.example.pact.provider.v1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private Integer id;
    private String name;
    private String ssn;
    private String address;
}
