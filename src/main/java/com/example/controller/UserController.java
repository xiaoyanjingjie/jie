package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {


    @Autowired
    private UserService userService;

   // @GetMapping(value = "/add")
   // @PostMapping("/add")
   // @RequestMapping(value = "/add" ,produces = {"application/json;charset=UTF-8"})

    @PostMapping(value = "/add")
    @ResponseBody
    public int addUser(User user){
      return userService.addUser(user);

    }

    @ResponseBody
    @PostMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
       return userService.findAllUser(pageNum,pageSize);
    }


}
