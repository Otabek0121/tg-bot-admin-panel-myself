package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Address;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}