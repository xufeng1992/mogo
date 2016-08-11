package dao;

import java.util.List;
import model.userDo;
import model.userDoExample;
import org.apache.ibatis.annotations.Param;

public interface userDoMapper {
    int deleteByExample(userDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(userDo record);

    int insertSelective(userDo record);

    List<userDo> selectByExample(userDoExample example);

    userDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") userDo record, @Param("example") userDoExample example);

    int updateByExample(@Param("record") userDo record, @Param("example") userDoExample example);

    int updateByPrimaryKeySelective(userDo record);

    int updateByPrimaryKey(userDo record);
}