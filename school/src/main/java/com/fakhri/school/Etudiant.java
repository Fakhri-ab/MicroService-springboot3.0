package com.fakhri.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Etudiant {
    private String firstname;
    private String lastname;
    private String email;
}
