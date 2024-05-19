package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Experience;

import java.util.UUID;

public interface ExperienceRepository extends JpaRepository<Experience, UUID> {
}