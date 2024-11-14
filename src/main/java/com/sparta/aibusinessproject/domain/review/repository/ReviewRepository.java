package com.sparta.aibusinessproject.domain.review.repository;

import com.sparta.aibusinessproject.domain.order.entity.Orders;
import com.sparta.aibusinessproject.domain.order.exception.OrderNotFoundException;
import com.sparta.aibusinessproject.domain.review.entity.Review;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, UUID> {

    default Review getById(UUID id) {
        return findById(id).orElseThrow(RuntimeException::new);
    }

}
