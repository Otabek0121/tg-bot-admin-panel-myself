package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Achievement;

import java.util.UUID;

public interface AchievementRepository extends JpaRepository<Achievement, UUID> {
}