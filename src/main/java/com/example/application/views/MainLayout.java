package com.example.application.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;

public class MainLayout extends AppLayout {
    public MainLayout() {
        // Set the primary section to DRAWER to place the menu in the drawer
        setPrimarySection(Section.DRAWER);

        // Create the header content with the application name
        H1 appName = new H1("App Layout Example");

        // Create the navigation menu items using Tabs
        Tab profileTab = new Tab("Profile");
        Tab teamTab = new Tab("Team");

        Tabs menuTabs = new Tabs(profileTab, teamTab);

        // Handle menu item selection or navigation here
        menuTabs.addSelectedChangeListener(event -> {
            // Handle menu item selection logic
            Notification.show("Selected: " + event.getSelectedTab().getLabel());
        });
        var buttons = new FlexLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );
        buttons.setFlexDirection(FlexLayout.FlexDirection.ROW_REVERSE);

        var TextFields= new VerticalLayout(
                new TextField("Title"),
                new TextField("Name"),
                new TextField("Email")
        );
        // Add the header and menu components to the AppLayout
        addToNavbar(appName);
        addToNavbar(buttons);
        addToDrawer(menuTabs);
        addToDrawer(TextFields);
    }
}


