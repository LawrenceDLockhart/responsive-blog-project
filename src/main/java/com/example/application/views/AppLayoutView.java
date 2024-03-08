package com.example.application.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@Route("applayout")
public class AppLayoutView extends AppLayout {
    public AppLayoutView() {
        // Set the primary section to DRAWER to place the menu in the drawer
        setPrimarySection(Section.DRAWER);

        // Create the header content with the application name
        H1 appName = new H1("App Layout View Example");

        // Create the navigation menu items using Tabs
        Tab profileTab = new Tab("Profile");
        Tab teamTab = new Tab("Team");

        Tabs menuTabs = new Tabs(profileTab, teamTab);

        // Handle menu item selection or navigation here
        menuTabs.addSelectedChangeListener(event -> {
            // Handle menu item selection logic
            Notification.show("Selected: " + event.getSelectedTab().getLabel());
        });

        // Add the header and menu components to the AppLayout
        addToNavbar(appName);
        addToDrawer(menuTabs);
    }
}
