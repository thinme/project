package com.example.portfolio.controller;


import com.example.portfolio.dto.BoardDTO;
import com.example.portfolio.pageMaker.PageMaker;
import com.example.portfolio.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class SearchBoardController {

    @Autowired
    private BoardService bm;



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void list(PageMaker pm, Model model) throws Exception {
        //PageMaker [page=2, perPageNum=10, searchType=t, keyword=888, totalCount=0, startPage=0, endPage=0, prev=false, next=false]
        model.addAttribute("list",bm.listSearchCriteria(pm));
        pm.setTotalCount(bm.listSearchCount(pm));
        //model.addAttribute("pageMaker",pm);
        //return "board/list";
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public void writeGet() throws Exception {
        //return "/sboard/write";

    }
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String writePost(BoardDTO board, RedirectAttributes rttr) throws Exception {
        bm.write(board);
        //rttr.addAttribute("msg","success");
        rttr.addFlashAttribute("msg","success");
        return "redirect:/board/list";
    }
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public void read(@RequestParam("bno") int bno,PageMaker pm,Model model) throws Exception {
        System.out.println(pm);
        model.addAttribute(bm.read(bno));
       // return "/board/read";
    }
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam("bno") int bno,PageMaker pm,Model model,RedirectAttributes rttr) throws Exception {
        bm.remove(bno);

        rttr.addAttribute("page", pm.getPage());
        rttr.addAttribute("perPageNum", pm.getPerPageNum());
        rttr.addAttribute("searchType", pm.getSearchType());
        rttr.addAttribute("keyword", pm.getKeyword());

        rttr.addFlashAttribute("msg","success");
        return "redirect:/board/list";
    }

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public void modifyGet(@RequestParam("bno") int bno,PageMaker pm,Model model) throws Exception {
        System.out.println(pm);
        model.addAttribute(bm.read(bno));
    }
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public String modifyPost(BoardDTO board,PageMaker pm,Model model,RedirectAttributes rttr) throws Exception {
        bm.modify(board);
        System.out.println(pm);

        rttr.addAttribute("page", pm.getPage());
        rttr.addAttribute("perPageNum", pm.getPerPageNum());
        rttr.addAttribute("searchType", pm.getSearchType());

        rttr.addAttribute("keyword", pm.getKeyword());

        rttr.addFlashAttribute("msg","success");
        return "redirect:/board/list";
    }


}