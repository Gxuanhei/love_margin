package com.example.love_margin.Mapper;


import com.example.love_margin.Entity.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {
    //增加信息
    @Insert("INSERT INTO test(name,age,sex,message,time,other)values(#{name},#{age},#{sex},#{message},#{time},#{other})")
    int addTest(Test t);

    //通过id进行删除信息
    @Delete("DELETE FROM test WHERE id=#{id}")
    int delete(int id);

    //通过id进行查询单条信息
    @Select("SELECT * FROM test WHERE id = #{id}")
    List<Test> select1(@Param("id") int id);

    //通过时间查询信息
    @Select("SELECT * FROM test WHERE time = #{time}")
    List<Test> select2(@Param("time") String time);

    //查询全表
    @Select("SELECT name,age,sex,time,other FROM test")
    String select3();

    //查询全表
    @Select("SELECT * FROM test")
    List<Test> select6();

    //根据id加一查询后十条数据
    @Select("select * from test where id >= #{id+1} order by id asc limit 10")
    List<Test> select4(@Param("id") int id);

    //根据id加一查询后x条数据
    @Select("select * from test where id >= #{id+1} order by id asc limit #{num}")
    List<Test> select5(@Param("id") int id,@Param("num") int num);

    //多条件查询
    @Select(" <script> SELECT *" +" WHERE " +
            "1+1"+
            " and s = #{pa.s}"+
            " <if test=\"#{pa.d} != null\">and uid = #{pa.d} </if> "+
            " <if test=\"#{pa.d} != null \">and brand_id = #{pa.d} </if> "+
            " <if test=\"#{pa.d1} != null \">and id limit #{pa.d1},#{pa.d2} </if> </script>")
    List<Test> selectManyKey (@Param("pa") Map<String, Object> pa);

    //模糊查询（关键字）
    @Select({"select * from test where concat(name,massage) like '%' || 'search_name' || '%' "})
    List<Test> selectKey(@Param("search_name") String search_name);


}