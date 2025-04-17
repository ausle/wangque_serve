package com.asule.wangquemain.service;


import com.asule.wangquemain.entity.Magazine;
import com.asule.wangquemain.mapper.MagazineMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class IntoService {

    @Resource
    MagazineMapper magazineMapper;

    public Magazine listAll(long id) {
        return magazineMapper.selectByPrimaryKey(id);
    }

}
