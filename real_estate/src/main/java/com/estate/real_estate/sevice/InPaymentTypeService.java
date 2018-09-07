/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estate.real_estate.sevice;

import com.estate.real_estate.domain.PaymentType;
import java.util.List;

/**
 *
 * @author C6
 */
public interface InPaymentTypeService {
    List<PaymentType> getAllObject();

    PaymentType getObjectById(int id);

    void addObject(PaymentType obj);

    void updateObject(PaymentType obj);

    void deleteObject(int id);
}
