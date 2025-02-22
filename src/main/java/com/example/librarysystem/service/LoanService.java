/* 
package com.example.librarysystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarysystem.model.LoanRecord;
import com.example.librarysystem.repository.LoanRecordRepository;

@Service
public class LoanService {

    @Autowired
    private LoanRecordRepository loanRecordRepository;

    public void recordLoan(String phoneNumber, Long bookId) {
        LoanRecord loanRecord = new LoanRecord();
        loanRecord.setPhoneNumber(phoneNumber);
        loanRecord.setBookId(bookId);
        loanRecord.setLoanDate(LocalDateTime.now());
        loanRecordRepository.save(loanRecord);
    }

    public void recordReturn(Long recordId) {
        LoanRecord loanRecord = loanRecordRepository.findById(recordId).orElse(null);
        if (loanRecord != null) {
            loanRecord.setReturnDate(LocalDateTime.now());
            loanRecordRepository.save(loanRecord);
        }
    }
}
*/