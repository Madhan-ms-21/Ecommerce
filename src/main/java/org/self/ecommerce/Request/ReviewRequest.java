package org.self.ecommerce.Request;

import lombok.Data;

@Data
public class ReviewRequest {
    private Long productId;
    private String review;
}
