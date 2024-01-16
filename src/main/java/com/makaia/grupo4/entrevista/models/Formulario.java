package com.makaia.grupo4.entrevista.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Formulario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private float puntajeTestGorilla;

  @Column
  private String eneagrama;

  @Column
  private int cohorte;

  @Column
  private String background;

  @Column
  private String disponibilidadTiempo;

  @Column
  private String intereses;

  @Column
  private String cooperanteAliado;

  @OneToOne(mappedBy = "formulario")
  private Entrevista entrevistas;
}
