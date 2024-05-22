package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.TypeService;

import java.util.UUID;

public interface ServiceRepository extends JpaRepository<TypeService, UUID> {
}