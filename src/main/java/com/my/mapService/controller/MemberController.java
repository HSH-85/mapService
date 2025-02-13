package com.my.mapService.controller;

import com.my.mapService.dto.Member;
import com.my.mapService.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/members")

public class MemberController {
    @GetMapping("")
    @Autowired
    public String list(Model model) {

        MemberService service;
        // 전체 리스트 얻어오기


        return "/members/memberList";
    }

    @GetMapping("/new")
    public String newMembers() {
        // 신규회원가입하기 창 보이기
        return "/members/createMemberForm";
    }

    @PostMapping("/new")
    public String createMember(Member member) {
        // 1. 회원가입 창에서 보낸 자료를
        //    Member DTO 로 받는다.
        System.out.println(member);
        // 2. 받은 회원 정보를 서비스에 보내서
        //    맵에 저장한다.
        return "redirect:/members";
    }
}