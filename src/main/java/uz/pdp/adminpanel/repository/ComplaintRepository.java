package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Complaint;

import java.util.UUID;

public interface ComplaintRepository extends JpaRepository<Complaint, UUID> {
}