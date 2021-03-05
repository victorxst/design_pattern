package com.example.design_pattern.pattern.behavioral.mediator;

public abstract class AbstractColleague {
    protected AbstractMediator abstractMediator;
    public AbstractColleague(AbstractMediator _abstractMediator){
        this.abstractMediator = _abstractMediator;
    }
}
