package PatikaDesktopApp.View;

import javax.swing.*;

import PatikaDesktopApp.Helper.Helper;

public class EducatorGui extends JFrame{
    private JPanel wrapper;

    public EducatorGui(){
        add(wrapper);
        setSize(600,600);
        setLocation(PatikaDesktopApp.Helper.Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(PatikaDesktopApp.Helper.Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}