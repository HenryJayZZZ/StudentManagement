// SCService.java
package com.example.demo.service;

import com.example.demo.entity.SC;
import java.util.List;

public interface SCService {
    List<SC> findAll();
    SC findById(Integer id);
    void save(SC sc);
    void update(SC sc);
    void delete(Integer id);
}
