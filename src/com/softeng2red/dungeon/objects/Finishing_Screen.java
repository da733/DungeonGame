package com.softeng2red.dungeon.objects;

import com.softeng2red.dungeon.framework.GameObject;
import com.softeng2red.dungeon.framework.ObjectId;
import com.softeng2red.dungeon.framework.Texture;
import com.softeng2red.dungeon.window.Game;

import java.awt.*;
import java.util.LinkedList;

// this class handles the position where finishing screen would be activated to appear
public class Finishing_Screen extends GameObject {

    public Finishing_Screen(float x, float y, ObjectId id) {
        super(x, y, id);
    }

    public void tick(LinkedList<GameObject> object) {

    }

    public void render(Graphics g) {
        // the picture of finishing screen is drew in HUD
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 32, 32);
    }

}
