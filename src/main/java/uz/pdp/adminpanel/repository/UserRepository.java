package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}