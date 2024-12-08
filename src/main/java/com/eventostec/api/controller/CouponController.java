package com.eventostec.api.controller;

import com.eventostec.api.domain.coupon.Coupon;
import com.eventostec.api.domain.coupon.CouponRequestDTO;
import com.eventostec.api.domain.event.Event;
import com.eventostec.api.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;


    //euquefiz
//    @PostMapping
//    public ResponseEntity<Coupon> create(@RequestParam("discount") Integer discount,
//                                         @RequestParam("valid") Long valid,
//                                         @RequestParam("event") Event event){
//        CouponRequestDTO couponRequestDTO = new CouponRequestDTO(discount, valid, event);
//        Coupon newCoupon = this.couponService.createCoupon(couponRequestDTO);
//        return ResponseEntity.ok(newCoupon);
//    }

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> addCouponsToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data){
        Coupon coupons = couponService.addCouponToEvent(eventId, data);
        return ResponseEntity.ok(coupons);
    }

}
