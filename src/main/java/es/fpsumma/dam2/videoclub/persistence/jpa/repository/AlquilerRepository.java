package es.fpsumma.dam2.videoclub.persistence.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fpsumma.dam2.videoclub.persistence.jpa.entity.AlquilerEntity;

public interface AlquilerRepository extends JpaRepository<AlquilerEntity, Long> {
    
}
