package org.example.behavioral.chainofresponsability;

public interface ApprovalLoanChain {
    void setNext(ApprovalLoanChain loan);
    ApprovalLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
