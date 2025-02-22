/* 
package com.library.controller;

import com.library.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/recordLoan")
    public String recordLoan(@RequestParam String phoneNumber, @RequestParam Long bookId) {
        loanService.recordLoan(phoneNumber, bookId);
        return "借書紀錄已保存";
    }

    @PostMapping("/recordReturn")
    public String recordReturn(@RequestParam Long recordId) {
        loanService.recordReturn(recordId);
        return "還書紀錄已保存";
    }
}
*/