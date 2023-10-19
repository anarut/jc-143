package lesson11;

import lesson08.Runnable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main2 {

    public static void main(String[] args) {
        int a = 5;
        var staticClass = new lesson11.InnerClasses.StaticClass();

        InnerClasses innerClasses = new InnerClasses();
        var nonStaticClass = innerClasses.new NonStaticClass();

        var nonStaticClass1 = new InnerClasses().new NonStaticClass();
        {
            class A implements Runnable {
                public int x;
                private int y;

                @Override
                public void run() {

                }
            }

            A aa = new A();
            A aa1 = new A();
            A aa2 = new A();
        }

        InnerClasses innerClasses1 = new InnerClasses();
        innerClasses1.todo();

        System.out.println();
        InnerClasses anotherClass = new AnotherClass();
        anotherClass.todo();
//        anotherClass.ok();


        InnerClasses innerClasses2 = new InnerClasses() {
            @Override
            public void todo() {
                super.todo();
                System.out.println(" = 5");
                ok();
            }
            public void ok() {
                System.out.println("ok");
            }
        };
        innerClasses2.todo();
//        innerClasses2.ok();


        InnerClasses innerClasses3 = new InnerClasses() {

        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("slowpoke");
            }
        };

        runnable.run();

        Button button = new Button();
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("open browser");
//            }
//        });
        button.addActionListener(e -> System.out.println("open browser"));

        button.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        button.addMouseListener(new RunButtonMouseListener());


    }
}
