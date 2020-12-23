package com.half.service.impl;

import com.half.dao.ItemMapper;
import com.half.domain.Item;
import com.half.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 17:17
 * @Version 1.0
 * @Description
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper mapper;
    @Override
    public Item findById(Integer id) {
        return mapper.findById(id);
    }
}
