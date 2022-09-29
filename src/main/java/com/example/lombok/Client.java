package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String name;
    @Getter
    private BigDecimal salary;

}
