// SCServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.entity.SC;
import com.example.demo.mapper.SCMapper;
import com.example.demo.service.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SCServiceImpl implements SCService {

    @Autowired
    private SCMapper scMapper;

    @Override
    public List<SC> findAll() {
        return scMapper.findAll();
    }

    @Override
    public SC findById(Integer id) {
        return scMapper.findById(id);
    }

    @Override
    public void save(SC sc) {
        scMapper.insert(sc);
    }

    @Override
    public void update(SC sc) {
        scMapper.update(sc);
    }

    @Override
    public void delete(Integer id) {
        scMapper.delete(id);
    }
}
