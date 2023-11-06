package com.mpcortez.dsevento.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_participante")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private String email;

    @Setter(AccessLevel.NONE)
    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();
}
