/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.view.menu;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * GameMenu...
 *
 * @author chenpi
 * @since 2018/3/19 19:36
 */
public class GameMenu extends JMenu {
    public GameMenu(ActionListener listener) {
        //一级菜单，游戏
        super("游戏/Game");
        //二级菜单，开始
        JMenuItem gameStart = new JMenuItem("开始游戏");
        JMenuItem startAgain = new JMenuItem("重新开始");
        JMenuItem gameStop = new JMenuItem("暂停/恢复");
        JMenuItem gameExit = new JMenuItem("退出游戏");

        gameStart.setActionCommand("start");
        startAgain.setActionCommand("again");
        gameStop.setActionCommand("stop");
        gameExit.setActionCommand("exit");

        // 添加一系列的listener
        gameStart.addActionListener(listener);
        startAgain.addActionListener(listener);
        gameExit.addActionListener(listener);
        gameStop.addActionListener(listener);

        this.add(gameStart);
        this.add(startAgain);
        this.add(gameStop);
        this.add(gameExit);
    }
}