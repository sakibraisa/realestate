/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estate.real_estate.dao;

import com.estate.real_estate.domain.PaymentMethod;
import java.util.List;

/**
 *
 * @author C6
 */
public interface InPaymentMethodDao {
    List<PaymentMethod> getAllObject();

    PaymentMethod getObjectById(int id);

    void addObject(PaymentMethod obj);

    void updateObject(PaymentMethod obj);

    void deleteObject(int id);

    boolean objectExists(PaymentMethod obj);
}
