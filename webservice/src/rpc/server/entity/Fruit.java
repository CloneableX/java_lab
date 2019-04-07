package com.clo.ws.rpc.server.entity;

/**
 * com.clo.ws.rpc.server.entity.Fruit
 *
 * @author Cloneable
 * @date 2019/4/5 15:47:05
 * @description
 */
public class Fruit {
    protected String name;
    protected Color color;

    public Fruit(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public enum Color {
        BLUE, YELLOW, RED
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
