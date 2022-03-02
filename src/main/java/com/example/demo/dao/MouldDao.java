
package com.example.demo.dao;


import com.example.demo.entity.MouldEntity;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MouldDao extends Mapper<MouldEntity> {

    @Select("select * from mould limit #{i},#{size}")
    List<MouldEntity> selectByLimit(int i, int size);
}
