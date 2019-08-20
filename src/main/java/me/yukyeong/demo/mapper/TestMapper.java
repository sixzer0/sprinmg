package me.yukyeong.demo.mapper;

import me.yukyeong.demo.dto.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public List<Test> getAll() throws Exception;
}
