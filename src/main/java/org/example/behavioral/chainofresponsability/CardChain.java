package org.example.behavioral.chainofresponsability;

public class CardChain implements ApprovalLoanChain{
    private ApprovalLoanChain next;
    @Override
    public void setNext(ApprovalLoanChain loan) {
        next= loan;
    }

    @Override
    public ApprovalLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        Gold gold = new Gold();
        this.setNext(gold);

        Platinium platinium = new Platinium();
        gold.setNext(platinium);

        Black black = new Black();
        platinium.setNext(black);

        next.creditCardRequest(totalLoan);
    }
}
