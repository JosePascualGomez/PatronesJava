package org.example.behavioral.chainofresponsability;

public class Black implements ApprovalLoanChain{
    private ApprovalLoanChain next;
    @Override
    public void setNext(ApprovalLoanChain loan) {
        next = loan;
    }

    @Override
    public ApprovalLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if (totalLoan>50000){
            System.out.println("this is request of credit card is approval by Black card");
        }else{
            next.creditCardRequest(totalLoan);
        }
    }
}
