package com.dkt.service;

import org.springframework.stereotype.Service;

public interface UserService {
    String findUser();
    void add();
    void delete(Integer integer);
    void update();
}
