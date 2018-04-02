/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.view.menu;

import cn.edu.hdu.tankbattle.util.MapUtils;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Class Description...
 *
 * @author chenpi
 * @since 2018/4/2 21:26
 */
public class CustomMapMenu extends JMenu {
    public CustomMapMenu(ActionListener listener) {
        super("自定义地图");
        MapUtils.getCustomFileList().forEach(s->{
            JMenuItem test = new JMenuItem(s);
            test.setActionCommand("customMap");
            test.addActionListener(listener);
            this.add(test);
        });

    }
}
