package com.argo.user_commons.User.Roles.domain;



import com.argo.user_commons.User.Roles.domain.en.roles_enum;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "roles")
public class Roles implements Serializable {

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Enumerated(EnumType.STRING)
    @Column(unique = true,length = 10,name = "rol")
    private roles_enum rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public roles_enum getRol() {
        return rol;
    }

    public void setRol(roles_enum rol) {
        this.rol = rol;
    }
}
