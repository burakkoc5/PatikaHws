package PatikaDesktopApp.View;

import javax.swing.*;

import PatikaDesktopApp.Helper.Config;
import PatikaDesktopApp.Helper.Helper;

public class StudentGui extends JFrame{
    private JPanel wrapper;

    public StudentGui(){
        add(wrapper);
        setSize(600,600);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
