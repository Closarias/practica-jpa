package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.DirectorEntity;
import es.fpsumma.dam2.videoclub.persistence.jpa.entity.PeliculaEntity;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
    
    Optional<PeliculaEntity> findByNombreDirector(DirectorEntity directorPeli);

    List<PeliculaEntity> findByGeneroContainingIgnoreCase(String genero);

    
}
