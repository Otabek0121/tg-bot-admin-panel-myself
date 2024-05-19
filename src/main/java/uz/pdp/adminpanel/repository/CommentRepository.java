package uz.pdp.adminpanel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.adminpanel.entity.Comment;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}