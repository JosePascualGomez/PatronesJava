package org.example;

import org.example.behavioral.chainofresponsability.CardChain;
import org.example.behavioral.command.CreditCard;
import org.example.behavioral.command.CreditCardActivateCommand;
import org.example.behavioral.command.CreditCardDesactivateCommand;
import org.example.behavioral.command.CreditCardInvoker;
import org.example.behavioral.interpreter.AndExpression;
import org.example.behavioral.interpreter.Expression;
import org.example.behavioral.interpreter.OrExpression;
import org.example.behavioral.interpreter.TerminalExpression;
import org.example.behavioral.iterator.CardList;
import org.example.behavioral.iterator.Iterator;
import org.example.behavioral.iterator.List;
import org.example.behavioral.mediator.ConcreteColleage1;
import org.example.behavioral.mediator.ConcreteColleage2;
import org.example.behavioral.mediator.ConcreteMediator;
import org.example.behavioral.memento.Article;
import org.example.behavioral.memento.ArticleMemento;
import org.example.behavioral.memento.Carataker;
import org.example.behavioral.observer.*;
import org.example.behavioral.state.MobileAlertStateContext;
import org.example.behavioral.state.Silent;
import org.example.behavioral.state.Vibration;
import org.example.behavioral.strategy.CapitalStrategyTextFormatter;
import org.example.behavioral.strategy.Context;
import org.example.behavioral.strategy.LowerStrategyTextFormatter;
import org.example.behavioral.templatemethod.Paypal;
import org.example.behavioral.templatemethod.Visa;
import org.example.behavioral.visitor.*;
import org.example.creational.abstractfactory.AbstractFactory;
import org.example.creational.abstractfactory.FactoryProvider;
import org.example.creational.abstractfactory.FactoryType;
import org.example.creational.abstractfactory.cards.Card;
import org.example.creational.abstractfactory.cards.CardType;
import org.example.creational.abstractfactory.methods.Method;
import org.example.creational.abstractfactory.methods.MethodType;
import org.example.creational.factorymethod.Payment;
import org.example.creational.factorymethod.PaymentFactory;
import org.example.creational.factorymethod.PaymentType;
import org.example.creational.prototype.PrototypeCard;
import org.example.creational.prototype.PrototypeCardType;
import org.example.creational.prototype.PrototypeFactory;
import org.example.structural.bridge.ClassicCreditCard;
import org.example.structural.bridge.SecureCreditCard;
import org.example.structural.bridge.UnsecureCreditCard;
import org.example.structural.composite.AccountComponent;
import org.example.structural.composite.AccountComposite;
import org.example.structural.composite.CurrentAccount;
import org.example.structural.composite.SavingsAccount;
import org.example.structural.decorator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //creational
        testFactoryMethod();
        testAbstractFactory();
        testBuilder();
        testPrototype();
        testSingleton();

        //behavioral
        testChainOfResponsibility();
        testCommand();
        testIterator();
        testMediator();
        testMemento();
        testObserver();
        testState();
        testInterpreter();
        testStrategy();
        testTemplateMethod();
        testVisitor();

        //structural
        testAdapter();
        testBridge();
        testComposite();
        testDecorator();
    }
    //********************************structural********************************//
    private static void testDecorator(){
        org.example.structural.decorator.Credit gold = new Gold();
        org.example.structural.decorator.Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentDecorator(blackInternationalPayment);

        org.example.structural.decorator.Credit goldSecureInternational = new Gold();
        goldSecureInternational = new InternationalPaymentDecorator(goldSecureInternational);
        goldSecureInternational = new SecureDecorator(goldSecureInternational);

        System.out.println("-----card gold with configuration");
        gold.showCredit();

        System.out.println("-----card black with configuration");
        blackInternationalPayment.showCredit();

        System.out.println("-----card gold 2 with configuration");
        goldSecureInternational.showCredit();
    }
    private static void testComposite(){
        AccountComponent currentAccount = new CurrentAccount(1000.0, "Jose");
        AccountComponent savingsAccount = new SavingsAccount(2000.0,"Diana");

        AccountComposite accountComposite = new AccountComposite();
        accountComposite.addAccount(currentAccount);
        accountComposite.addAccount(savingsAccount);

        accountComposite.showAccountName();
        System.out.println(accountComposite.getAmount());
    };
    private static void testBridge(){
        org.example.structural.bridge.CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.makePayment();
        classic= new ClassicCreditCard(new SecureCreditCard());
        classic.makePayment();
    };
    private static void testAdapter(){
        org.example.structural.adapter.CreditCard creditCard = new org.example.structural.adapter.CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("Silver");

    }
    //********************************behavioral********************************//
    private static void testVisitor(){
        ElementOffer elementOffer= new GasolineOffer();
        elementOffer.accept(new BlackCreditCardVisitor());

        elementOffer = new FlightOffer();
        elementOffer.accept(new ClassicCreditCardVisitor());
    }
    private static void testTemplateMethod(){
        org.example.behavioral.templatemethod.Payment payment = new Visa();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    };
    private static void testStrategy(){
        Context context = new Context(new CapitalStrategyTextFormatter());
        context.publishText("This text will be converted to UPPERCASE through algorithm");

        context = new Context(new LowerStrategyTextFormatter());
        context.publishText("this text will be converted to LOWERCASE through algorithm");
    }
    private static void testInterpreter(){
        Expression zero = new TerminalExpression("0");
        Expression one = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(zero, one);
        Expression containsOneAndZero = new AndExpression(zero, one);

        System.out.println(containBoolean.interpret("zero"));
        System.out.println(containBoolean.interpret("0"));
        System.out.println(containsOneAndZero.interpret("0"));
        System.out.println(containsOneAndZero.interpret("0,1"));

    }
    private static void testState(){
        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.alert();
        context.setState(new Silent());
        context.alert();
        context.alert();
    }
    private static void testObserver(){
        Car car = new Car();
        Walker walker = new Walker();
        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.attach(car);
        messagePublisher.attach(walker);
        messagePublisher.notifyUpdate(new Semaphore(States.CAR_RED));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        messagePublisher.notifyUpdate(new Semaphore(States.GREEN_RED));

    }
    private static void testMemento(){
        Carataker carataker = new Carataker();
        Article article = new Article("José", "The memento is movie");
        article.setText(article.getText() + " of Gabo");
        System.out.println(article.getText());

        carataker.addArticleMemento(article.createMemento());
        article.setText(article.getText() + ", Starring Diana");

        System.out.println(article.getText());

        article.setText(article.getText() + " Wrong text");
        System.out.println(article.getText());

        carataker.addArticleMemento(article.createMemento());
        ArticleMemento memento1 = carataker.getArticleMemento(0);
        ArticleMemento memento2 = carataker.getArticleMemento(1);

        article.restoreArticleMemento(memento1);
        System.out.println(article.getText());

        article.restoreArticleMemento(memento2);
        System.out.println(article.getText());

        article.setText(article.getText() + " of year 2023");
        System.out.println(article.getText());
    }
    private static void testMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage1 user1 = new ConcreteColleage1(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hello! soy user1");
        user2.send("Hello user2, I'm user2");
    }
    private static void testIterator(){
        org.example.behavioral.iterator.Card[] cards = new org.example.behavioral.iterator.Card[5];
        cards[0] = new org.example.behavioral.iterator.Card("VISA");
        cards[1] = new org.example.behavioral.iterator.Card("AMEX");
        cards[2] = new org.example.behavioral.iterator.Card("MASTER CARD");
        cards[3] = new org.example.behavioral.iterator.Card("GOOGLE_CARD");
        cards[4] = new org.example.behavioral.iterator.Card("APPLE_CARD");

        List list = new CardList(cards);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            org.example.behavioral.iterator.Card card = (org.example.behavioral.iterator.Card) iterator.next();
            System.out.println(card.getType());
        }
    }
    private static void testCommand(){
        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDesactivate = new CreditCard();
        CreditCardInvoker invoker = new CreditCardInvoker();

        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("===============================");
        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDesactivate));
        invoker.run();
    }
    private static void testChainOfResponsibility(){
        CardChain cardChain = new CardChain();
        cardChain.creditCardRequest(100001);
    }


    //********************************creational********************************//
    private static void testFactoryMethod(){
        Payment payment =  PaymentFactory.buildPayment(PaymentType.GOOGLE_PAY);
        payment.doPayment();
    }
    private static void testAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory(FactoryType.CARDS.getValue());
        Card tarjeta = (Card) abstractFactory.create(CardType.VISA.getValue());

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory(FactoryType.METHODS.getValue());
        Method method = (Method) abstractFactory1.create(MethodType.DEBIT.getValue());

        System.out.println( "Card type " + tarjeta.getCardType() + ", number = " + tarjeta.getCardNumber() + "; with method " + method.doPayment());
    }
    private static void testBuilder(){
        org.example.creational.builder.Card card = new org.example.creational.builder.Card.CardBuilder("Visa",
                "010101 01")
                .name("Jose")
                .expires(2030)
                .credit(true)
                .build();
        System.out.println(card);

        org.example.creational.builder.Card card1 = new org.example.creational.builder.Card.CardBuilder("MasterCard",
                "00000 00 01 02")
                .name("Diana")
                .expires(2029)
                .credit(false)
                .build();
        System.out.println(card1);
    }

    private static void testPrototype(){
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa =PrototypeFactory.getInstance(PrototypeCardType.VISA.getValue());
            visa.getCard();

            PrototypeCard master = PrototypeFactory.getInstance(PrototypeCardType.MASTER.getValue());
            master.getCard();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    private static void testSingleton(){
        org.example.creational.singleton.Card.getINSTANCE().setCardNumber("123456");
        System.out.println(org.example.creational.singleton.Card.getINSTANCE().getCardNumber());

        org.example.creational.singleton.Card.getINSTANCE().setCardNumber("987654");
        System.out.println(org.example.creational.singleton.Card.getINSTANCE().getCardNumber());
    }
}