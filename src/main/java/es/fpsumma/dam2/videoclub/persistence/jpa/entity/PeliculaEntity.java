package es.fpsumma.dam2.videoclub.persistence.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class PeliculaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String genero;

    @Column(name = "anio_estreno")
    private Integer anioEstreno;

    @Column
    private Float puntuacion;

    @Column(name = "director_id")
    private Long directorId;

    public PeliculaEntity(
        Long id, 
        String titulo, 
        String genero, 
        Integer anioEstreno, 
        Float puntuacion) {
            this.id = id;
            this.titulo = titulo;
            this.genero = genero;
            this.anioEstreno = anioEstreno;
            this.puntuacion = puntuacion;
    }

    public PeliculaEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Float puntuacion) {
        this.puntuacion = puntuacion;
    }
}
