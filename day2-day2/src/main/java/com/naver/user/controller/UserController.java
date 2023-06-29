package com.naver.user.controller;
import com.naver.user.domain.entity.User;
import com.naver.user.domain.request.LoginRequest;
import com.naver.user.domain.request.SignupRequest;
import com.naver.user.domain.request.UpdateRequest;
import com.naver.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "/user/login";
    }
    @GetMapping("/signup")
    public String getSignup(){
        return "/user/signup";
    }
    @PostMapping("/login")
    public ModelAndView postLogin(
             @ModelAttribute LoginRequest request
            , ModelAndView mav
            , HttpSession session
          ){
//        if(idSave==null) idSave = false;
        User login = userService.login(request);
        if(login != null){
//            mav.addObject()
            session.setAttribute("id", login.getId());
            session.setAttribute("uname", login.getName());
            mav.setViewName("redirect:/main");
        }else {
            mav.setViewName("redirect:/user/login");
//            if(idSave)
//                mav.addObject("id",id);
        }

        return mav;
    }

    @PostMapping("/signup")
    public ModelAndView signup(
            @ModelAttribute SignupRequest request
            , ModelAndView mav
    ){
        if(userService.signup(request)){
            mav.setViewName("redirect:/user/login");
        }else {
            mav.setViewName("redirect:/user/signup");
        }
        return mav;
    }


    @GetMapping("/updateInfo")
    public ModelAndView updateInfo(ModelAndView mav){
        mav.setViewName("user/updateInfo");
        return mav;
    }

    @PostMapping("/updateInfo")
    public ModelAndView postUpdateInfo(@RequestParam String name, @RequestParam String password,HttpSession session, ModelAndView mav){
//        System.out.println(name);
//        System.out.println(password);
//        System.out.println(session.getAttribute("id"));

        UpdateRequest updateRequest = new UpdateRequest(name, password, (Integer) session.getAttribute("id"));
        userService.update(updateRequest);
//        mav.addObject("name", updateRequest.getName());
//        mav.addObject("password", updateRequest.getPassword());
        mav.setViewName("user/updateInfo");
        return mav;
    }
}
