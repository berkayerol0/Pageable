package com.berkayerol.Dto;

import lombok.Data;

@Data
public class DtoEmployee {

    private Long id;

    private String firstName;

    private String lastName;

    private DtoDepartment department;
}
