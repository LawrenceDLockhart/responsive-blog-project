package com.example.application.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "combined", layout = MainLayout.class)
public class CombinedView extends VerticalLayout {
    public CombinedView() {
        add(new Text("This is the main content area."));
        Button button1 = new Button("Up", VaadinIcon.ARROW_UP.create());
        Button button2 = new Button("Down", VaadinIcon.ARROW_DOWN.create());
        Button button3 = new Button("Left", VaadinIcon.ARROW_LEFT.create());
        Button button4 = new Button("Right", VaadinIcon.ARROW_RIGHT.create());
        FormLayout formLayout = new FormLayout(button1, button2, button3, button4);
        add(formLayout);
    }
}
