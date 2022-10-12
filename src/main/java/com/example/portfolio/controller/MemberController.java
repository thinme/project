package com.example.portfolio.controller;

import com.example.portfolio.dto.MemberDto;
import com.example.portfolio.entity.Member;
import com.example.portfolio.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    //회원등록및 수정

    @GetMapping("/member/insert")
    public String Insert(@RequestParam(value = "num", required = false) Integer num, Model model){
        //기존회원수정
        if(num != null){
            Member member = memberRepository.findById(num).orElse(null);
            model.addAttribute("memberDto", member);
            model.addAttribute("formTitle","Modification");
        }else{
            //신규
            model.addAttribute("memberDto",new MemberDto());
            model.addAttribute("formTitle", "Registration");
        }
        return "/member/insert";
    }
    @PostMapping("/member/insert")
    public String Insert(MemberDto memberDto, Model model) {
        try {
            //신규등록
            if (memberDto.getNum() == 0) {
                Member save = memberDto.toEntity();
                Member saved = memberRepository.save(save);
            } else {
                //수정
                int saved = memberRepository.updateMemberQuery(
                        memberDto.getNum(), memberDto.getName(), memberDto.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }
}
