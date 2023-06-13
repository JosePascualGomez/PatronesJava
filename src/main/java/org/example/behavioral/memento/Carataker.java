package org.example.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
    private List<ArticleMemento> states = new ArrayList<>();
    public void addArticleMemento(ArticleMemento articleMemento){
        states.add(articleMemento);
    }

    public ArticleMemento getArticleMemento(int index){
        return states.get(index);
    }
}
