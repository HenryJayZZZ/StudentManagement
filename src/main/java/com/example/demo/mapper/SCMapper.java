// SCMapper.java
package com.example.demo.mapper;

import com.example.demo.entity.SC;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SCMapper {
    List<SC> findAll();
    SC findById(Integer id);
    void insert(SC sc);
    void update(SC sc);
    void delete(Integer id);
}
