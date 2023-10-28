package com.forms.formshandling.Model;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter  @Setter private String name;
    @Getter  @Setter private String email;
    @Getter  @Setter private String password;
    @Getter  @Setter private String dob;
    @Getter  @Setter private String gender;
    @Getter  @Setter private boolean scheme;
    @Getter  @Setter private String note;
    @Getter  @Setter private String location;
}
