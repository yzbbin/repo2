package cn.xin11.dao;

import cn.xin11.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
