/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estate.real_estate.sevice;

import com.estate.real_estate.domain.User;
import java.util.List;

/**
 *
 * @author C6
 */
public interface InUserService {
    List<User> getAllObject();

    User getObjectById(int id);

    void addObject(User obj);

    void updateObject(User obj);

    void deleteObject(int id);
}
