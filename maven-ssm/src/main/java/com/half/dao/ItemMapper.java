package com.half.dao;

import com.half.domain.Item;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @Author Hui-min Lu
 * @Date 2020/12/22 17:01
 * @Version 1.0
 * @Description
 */
@Repository
public interface ItemMapper {

    @Results(
            id = "itemMap",value = {
            @Result(id = true ,column = "id",property = "id"),
            @Result(column ="name" ,property ="name" ),
            @Result(column = "price",property ="price" ),
            @Result(column="createtime"  ,property ="createTime" ),
            @Result(column = "detail",property ="detail" )}
    )
    @Select("select * from item where id=#{id} ")
    Item findById(Integer id);

}
