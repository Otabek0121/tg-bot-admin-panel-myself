package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Education;

import java.util.UUID;

public interface EducationRepository extends JpaRepository<Education, UUID> {
}