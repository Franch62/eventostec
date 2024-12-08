package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;

import java.util.Date;
import java.util.UUID;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
