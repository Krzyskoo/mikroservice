package com.mikro.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private String name;
    private String lastname;
    private String email;
}
