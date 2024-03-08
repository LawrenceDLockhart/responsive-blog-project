package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/")
public class MainLayoutView extends VerticalLayout {
    private H2 viewTitle;
    public MainLayoutView() {
        var navbar =new HorizontalLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );
        add (
                viewTitle = new H2("Layout Example"),
                navbar,
                new TextField("Title"),
                new TextField("Name"),
                new TextField("Em")
        );
    }
}
