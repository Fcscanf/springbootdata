package cn.fcsca.springbootdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * HelloController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 上午 11:04 2018-08-14
 */
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String, Object> map() {
        List<Map<String,Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list.get(0);
    }
}
